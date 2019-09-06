package com.payProject.manage.contorller;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.payProject.config.common.PageResult;
import com.payProject.config.common.AutocompleteResult;
import com.payProject.config.common.Constant.Common;
import com.payProject.config.exception.OtherErrors;
import com.payProject.config.exception.ParamException;
import com.payProject.config.common.JsonResult;
import com.payProject.manage.entity.AccountEntity;
import com.payProject.manage.entity.AccountFee;
import com.payProject.manage.entity.AccountInfo;
import com.payProject.manage.entity.Channel;
import com.payProject.manage.entity.PayType;
import com.payProject.manage.service.AccountService;
import com.payProject.manage.service.ChannelService;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;

@Controller
@RequestMapping("/manage/account")
public class AccountContorller<E> {
	Logger log = LoggerFactory.getLogger(ChannelContorller.class);
	@Autowired
	AccountService accountServiceImpl;
	@Autowired
	ChannelService channelServiceImpl;
	@RequestMapping("/accountShow")
	public String accountlShow( ){
		return "/manage/account/accountList";
	}
	@RequestMapping("/accountFeeAdd")
	public String accountFeeAdd(Model m){
		List<AccountEntity> accountList = accountServiceImpl.findAccountAll();
		List<Channel> channelList  = channelServiceImpl.findChannelByAll();
		List<PayType> payList  = channelServiceImpl.findPayTypeByAll();
		List acco =new  ArrayList();
		List chan =new  ArrayList();
		List payt =new  ArrayList();
		for( AccountEntity entity : accountList ) {
			AutocompleteResult acc = new AutocompleteResult();
			acc.setName(entity.getAccountName());
			acc.setPinyin(entity.getAccountId());
			acco.add(acc);
		}
		for( Channel entity : channelList ) {
			AutocompleteResult cha = new AutocompleteResult();
			cha.setName(entity.getChannelName());
			cha.setPinyin(entity.getChannelNo());
			chan.add(cha);
		}
		for( PayType entity : payList ) {
			AutocompleteResult pay = new AutocompleteResult();
			pay.setName(entity.getPayTypeName());
			pay.setPinyin(entity.getPayTypeNo());
			payt.add(pay);
		}
		m.addAttribute("channelList",JSONUtil.toJsonPrettyStr( chan));
		m.addAttribute("payList", JSONUtil.toJsonPrettyStr(payt));
		m.addAttribute("accountList", JSONUtil.toJsonPrettyStr(acco));
		return "/manage/account/accountFeeAdd";
	}
	@RequestMapping("/accountFee")
	public String accountFee(Model m  ){
		List<Channel> channelList  = channelServiceImpl.findChannelByAll();
		List<PayType> payList  = channelServiceImpl.findPayTypeByAll();
		m.addAttribute("channelList", channelList);
		m.addAttribute("payList", payList);
		return "/manage/account/accountFee";
	}
	@ResponseBody
	@RequestMapping("/accountList")
	public PageResult<AccountEntity> accountList(AccountEntity account,String page,String limit){
		log.info("查询商户请求参数"+account.toString());
		 PageHelper.startPage(Integer.valueOf(page), Integer.valueOf(limit));
		 List<AccountEntity> list = accountServiceImpl.findPageAccountByAccount(account);
		 PageInfo<AccountEntity> pageInfo = new PageInfo<AccountEntity>(list);
		 PageResult<AccountEntity> pageR = new PageResult<AccountEntity>();
			pageR.setData(pageInfo.getList());
			pageR.setCode("0");
			pageR.setCount(String.valueOf(pageInfo.getTotal()));
			log.info("商户列表响应结果集"+pageR.toString());
		return pageR;
	}
	/**
	 * <p>一键生成商户号逻辑:</p>
	 * <li>1,生成商户基本信息</li>
	 * <li>2,生成详细信息</li>
	 * @return
	 * @throws Exception 
	 */
	@ResponseBody
	@RequestMapping("/accountlAdd")
	@Transactional
	public JsonResult accountlAdd() throws Exception{
		String accountId = createAccount();
		Map<String, String> createKey = createKey();
		String privateKey = createKey.get(Common.ACCOUNT_PRIAVTEKEY());
		String publicKey = createKey.get(Common.ACCOUNT_PUBLICKEY());
		String accountName = Common.ACCOUNTNAME();
		AccountEntity entity  = new AccountEntity(); 
		entity.setAccountName(accountName);
		entity.setAccountId(accountId);
		boolean flag = accountServiceImpl.addAccount(entity);
		AccountInfo entityInfo = new AccountInfo();
		entityInfo.setAccountId(accountId);
		entityInfo.setAppKey(privateKey);
		entityInfo.setAppDesKey(publicKey);
		boolean flag1 = false;
		if(flag)
			  flag1 = accountServiceImpl.addAccountInfo(entityInfo);
		if(flag && flag1) 
			return JsonResult.buildSuccessMessage("生成用户成功，请填充 用户其他信息");
		throw new OtherErrors("用户生成失败");
			
	}
	private String createAccount() {
		AccountEntity account = accountServiceImpl.findAccountByNo();
		String name = "";
		if(ObjectUtil.isNotNull(account))
			name = account.getAccountId();
		if(StrUtil.isBlankIfStr(name))
			name = Common.ACCOUNT_NAME() + Common.ACCOUNT_NAME_SUF();
		String subSuf = StrUtil.subSuf(name,Common.ACCOUNT_NAME().length());
		Integer valueOf = Integer.valueOf(subSuf);
		return Common.ACCOUNT_NAME() + ++valueOf;
	
	}
	private Map<String,String> createKey() throws Exception {
		// 生成密钥对
        KeyPair keyPair = getKeyPair();
        String privateKey = new String(Base64.encodeBase64(keyPair.getPrivate().getEncoded()));
        String publicKey = new String(Base64.encodeBase64(keyPair.getPublic().getEncoded()));
        log.info("创建用户私钥:" + privateKey);
        log.info("创建用户公钥:" + publicKey);
        System.out.println("私钥:" + privateKey);
        System.out.println("公钥:" + publicKey);
        Map map = new HashMap();
        map.put(Common.ACCOUNT_PRIAVTEKEY(),privateKey);
        map.put(Common.ACCOUNT_PUBLICKEY(),publicKey);
		return map;
	}
	/**
     * <p>获取密钥对</p>
     * @return 密钥对
     */
    public static KeyPair getKeyPair() throws Exception {
        KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
        generator.initialize(Common.ACCOUNT_KEY_SIZE());
        return generator.generateKeyPair();
    }
    @RequestMapping("/accountEditShow")
    public String accountEditShow(String accountId,Model m ) {
    	if(StrUtil.isBlank(accountId))
    		throw new ParamException("获取商户accountId失败");
    	AccountEntity account  = accountServiceImpl.findAccountByAccountId(accountId);
    	AccountInfo entity  =  accountServiceImpl.findAccountInfoByNo(accountId);
    	m.addAttribute("entity", account);
    	m.addAttribute("bean", entity);
		return "/manage/account/accountlUpdata";
    }
	@ResponseBody
    @RequestMapping("/upDataIsAgant")
	@Transactional
    public JsonResult upDataIsAgant(String accountId,String isAgant,Model m ) {
		boolean  flag = accountServiceImpl.upDataAccountIsAgant(accountId,isAgant);
		if("1".contentEquals(isAgant)) {
			if(flag) {
				return JsonResult.buildSuccessMessage("代理商功能关闭");
			}
		}else {
			if(flag) {
			return JsonResult.buildSuccessMessage("代理商功能打开");
			}
		}
		return JsonResult.buildFailResult("功能故障");
    }
	@ResponseBody
    @RequestMapping("/accountDel")
	@Transactional
    public JsonResult accountDel(String accountId,Model m ) {
		boolean  flag = accountServiceImpl.deleteAccount(accountId);
		if(flag) {
			return JsonResult.buildSuccessMessage("删除成功");
		}else {
			 throw new OtherErrors("删除商户异常");
		}
    }
	@ResponseBody
	@RequestMapping("/accountFeeList")
	public PageResult<AccountFee> accountFeeList(AccountFee accountFee,String page,String limit){
		log.info("查询商户费率请求参数"+accountFee.toString());
		 PageHelper.startPage(Integer.valueOf(page), Integer.valueOf(limit));
		 List<AccountFee> list = accountServiceImpl.findPageAccountFeeByAccountFee(accountFee);
		 PageInfo<AccountFee> pageInfo = new PageInfo<AccountFee>(list);
		 PageResult<AccountFee> pageR = new PageResult<AccountFee>();
			pageR.setData(pageInfo.getList());
			pageR.setCode("0");
			pageR.setCount(String.valueOf(pageInfo.getTotal()));
			log.info("商户费率列表响应结果集"+pageR.toString());
		return pageR;
	}
	@ResponseBody
	@RequestMapping("/addaccountFee")
	@Transactional
	public JsonResult addaccountFee(AccountFee account) throws Exception{
		if(StrUtil.isBlank(account.getAccountId()))
			throw new ParamException("增加费率异常");
		AccountFee entity  = accountServiceImpl.findAccountFeeByAll(account.getAccountChannel(),account.getAccountId(),account.getChannelProduct(),account.getFeeStautus());
		if(ObjectUtil.isNotNull(entity))
			throw new OtherErrors("当前商户费率添加重复，请修改费率状态，仅存在唯一一条启用费率");
		Boolean flag = accountServiceImpl.addAccountFee(account);
	if(flag)	
		return JsonResult.buildSuccessMessage("商户费率增加成功");
	throw new OtherErrors("增加用户失败");
	}
	
	@ResponseBody
	@RequestMapping("/accountFeeDel")
	@Transactional
	public JsonResult accountFeeDel(AccountFee account) throws Exception{
		if(null == account.getId())
			throw new ParamException("无法确定唯一费率，数据传输有误");
		Boolean flag = accountServiceImpl.deleteAccountFee(account);
	if(flag)	
		return JsonResult.buildSuccessMessage("商户费率删除成功");
	throw new OtherErrors("删除失败");
	}
	
	
	
	@RequestMapping("/accountFeeEditShow")
	public String accountFeeEditShow(Integer id,Model m){
		if(null == id)
			throw new ParamException("无法确定唯一费率，数据传输有误");
		AccountFee accountFee = accountServiceImpl.findAccountFeeById(id);
		m.addAttribute("accountFee", accountFee);
		return "/manage/account/accountFeeEditShow";
	}
	
	
	
	@ResponseBody
	@RequestMapping("/accountFeeEdit")
	@Transactional
	public JsonResult accountFeeEdit(AccountFee account) throws Exception{
		if(StrUtil.isBlank(account.getAccountChannel()) || StrUtil.isBlank(account.getAccountId())||  StrUtil.isBlank(account.getChannelProduct()) )
			throw new ParamException("无法确定唯一费率，数据传输有误");
		account.setCreateTime(null);
		Boolean flag = accountServiceImpl.updataAccountFee(account);
	if(flag)	
		return JsonResult.buildSuccessMessage("商户费率修改成功");
	throw new OtherErrors("修改失败");
	}
	@ResponseBody
	@RequestMapping("/accountEdit")
	@Transactional
	public JsonResult accountEdit(AccountEntity  account) throws Exception{
		if(StrUtil.isBlank(account.getAccountId())  )
			throw new ParamException("无法确定唯一账户，数据传输有误");
		account.setCreateTime(null);
		Boolean flag = accountServiceImpl.updataAccount(account);
	if(flag)	
		return JsonResult.buildSuccessMessage("商户账户修改成功");
	throw new OtherErrors("修改失败");
	}
	
	
	
}
