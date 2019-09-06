package com.payProject.manage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payProject.config.common.Constant.Common;
import com.payProject.manage.entity.AccountEntity;
import com.payProject.manage.entity.AccountEntityExample;
import com.payProject.manage.entity.AccountEntityExample.Criteria;
import com.payProject.manage.entity.AccountFee;
import com.payProject.manage.entity.AccountFeeExample;
import com.payProject.manage.entity.AccountInfo;
import com.payProject.manage.entity.AccountInfoExample;
import com.payProject.manage.mapper.AccountFeeMapper;
import com.payProject.manage.mapper.AccountInfoMapper;
import com.payProject.manage.mapper.AccountMapper;
import com.payProject.manage.service.AccountService;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	AccountMapper accountDao;
	@Autowired
	AccountInfoMapper accountInfoDao;
	@Autowired
	AccountFeeMapper accountFeeDao;
	@Override
	public List<AccountEntity> findPageAccountByAccount(AccountEntity account) {
		AccountEntityExample example = new AccountEntityExample();
		Criteria criteria = example.createCriteria();
		if(StrUtil.isNotBlank(account.getAccountId()))
			criteria.andAccountIdEqualTo(account.getAccountId());
		if(StrUtil.isNotBlank(account.getAccountName()))
			criteria.andAccountNameEqualTo(account.getAccountName());
		List<AccountEntity> selectByExample = accountDao.selectByExample(example);
		return selectByExample;
	}
	@Override
	public boolean addAccount(AccountEntity entity) {
		int insertSelective = accountDao.insertSelective(entity);
		return insertSelective > 0 && insertSelective < 2;
	}
	@Override
	public boolean addAccountInfo(AccountInfo entityInfo) {
		int insertSelective = accountInfoDao.insertSelective(entityInfo);
		return insertSelective > 0 && insertSelective < 2;
	}
	@Override
	public AccountEntity findAccountByNo() {
		AccountEntityExample example = new AccountEntityExample();
		Criteria criteria = example.createCriteria();
		example.setOrderByClause("createTime DESC");
		List<AccountEntity> selectByExample = accountDao.selectByExample(example);
		if(CollUtil.isNotEmpty(selectByExample))
			return CollUtil.getFirst(selectByExample);
		return null;
	}
	@Override
	public AccountEntity findAccountByAccountId(String accountId) {
		AccountEntityExample example = new AccountEntityExample();
		Criteria criteria = example.createCriteria();
		criteria.andAccountIdEqualTo(accountId);
		List<AccountEntity> selectByExample = accountDao.selectByExample(example);
		if(CollUtil.isNotEmpty(selectByExample))
			return CollUtil.getFirst(selectByExample);
		return null;
	}
	@Override
	public AccountInfo findAccountInfoByNo(String accountId) {
		AccountInfoExample example = new AccountInfoExample();
		com.payProject.manage.entity.AccountInfoExample.Criteria criteria = example.createCriteria();
		criteria.andAccountIdEqualTo(accountId);
		List<AccountInfo> selectByExample = accountInfoDao.selectByExample(example);
		if(CollUtil.isNotEmpty(selectByExample))
			return CollUtil.getFirst(selectByExample);
		return null;
	}
	@Override
	public boolean upDataAccountIsAgant(String accountId, String isAgant) {
		AccountInfoExample example = new AccountInfoExample();
		com.payProject.manage.entity.AccountInfoExample.Criteria criteria = example.createCriteria();
		criteria.andAccountIdEqualTo(accountId);
		AccountInfo entityInfo = new AccountInfo();
		entityInfo.setIsAgant(Integer.valueOf(isAgant));
		entityInfo.setCreateTime(null);
		int updateByExampleSelective = accountInfoDao.updateByExampleSelective(entityInfo, example);
		return updateByExampleSelective > 0 && updateByExampleSelective < 2;
	}
	@Override
	public boolean deleteAccount(String accountId) {
		AccountInfoExample example = new AccountInfoExample();
		com.payProject.manage.entity.AccountInfoExample.Criteria criteria = example.createCriteria();
		criteria.andAccountIdEqualTo(accountId);
		int deleteByExample = accountInfoDao.deleteByExample(example);
		AccountEntityExample example1 = new AccountEntityExample();
		Criteria criteria1 = example1.createCriteria();
		criteria1.andAccountIdEqualTo(accountId);
		int deleteByExample2 = accountDao.deleteByExample(example1);
		if(deleteByExample > 0  && deleteByExample < 2 && deleteByExample2 >0 && deleteByExample2 < 2 )
			return true;
		return false;
	}
	@Override
	public List<AccountFee> findPageAccountFeeByAccountFee(AccountFee accountFee) {
		AccountFeeExample example  = new AccountFeeExample();
		com.payProject.manage.entity.AccountFeeExample.Criteria criteria = example.createCriteria();
		if(StrUtil.isNotBlank(accountFee.getAccountId()))
			criteria.andAccountIdEqualTo(accountFee.getAccountId());
		if(StrUtil.isNotBlank(accountFee.getAccountChannel()))
			criteria.andAccountChannelEqualTo(accountFee.getAccountChannel());
		if(StrUtil.isNotBlank(accountFee.getChannelProduct()))
			criteria.andChannelProductEqualTo(accountFee.getChannelProduct());
		List<AccountFee> selectByExample = accountFeeDao.selectByExample(example);
		return selectByExample;
	}
	@Override
	public Boolean addAccountFee(AccountFee account) {
		int insertSelective = accountFeeDao.insertSelective(account);
		return insertSelective > 0 && insertSelective < 2 ;
	}
	@Override
	public List<AccountEntity> findAccountIdLike(AccountEntity account) {
		AccountEntityExample example = new AccountEntityExample();
		Criteria criteria = example.createCriteria();
		if(StrUtil.isNotBlank(account.getAccountId()))
			criteria.andAccountIdLike(account.getAccountId());
		List<AccountEntity> selectByExample = accountDao.selectByExample(example);
		return selectByExample;
	}
	@Override
	public List<AccountEntity> findAccountAll() {
		AccountEntityExample example = new AccountEntityExample();
		Criteria criteria = example.createCriteria();
		List<AccountEntity> selectByExample = accountDao.selectByExample(example);
		return selectByExample;
	}
	@Override
	public AccountFee findAccountFeeByAll(String accountChannel, String accountId, String channelProduct,
			Integer integer) {
		AccountFeeExample example  = new AccountFeeExample();
		com.payProject.manage.entity.AccountFeeExample.Criteria criteria = example.createCriteria();
		if(StrUtil.isNotBlank(accountId))
			criteria.andAccountIdEqualTo(accountId);
		if(StrUtil.isNotBlank(accountChannel))
			criteria.andAccountChannelEqualTo(accountChannel);
		if(StrUtil.isNotBlank(channelProduct))
			criteria.andChannelProductEqualTo(channelProduct);
		//仅存在唯一一条使用的费率，其他则为自动切换
		if(null != integer)
			criteria.andFeeStautusEqualTo(Common.ACCOUNT_FEE_STUSTA1());
		List<AccountFee> selectByExample = accountFeeDao.selectByExample(example);
		if(CollUtil.isNotEmpty(selectByExample)) 
			return CollUtil.getFirst(selectByExample);
		return null;
	}
	@Override
	public Boolean deleteAccountFee(AccountFee account) {
		int deleteByPrimaryKey = accountFeeDao.deleteByPrimaryKey(account.getId());
		return deleteByPrimaryKey > 0 && deleteByPrimaryKey < 2;
	}
	@Override
	public AccountFee findAccountFeeById(Integer id) {
		AccountFeeExample example  = new AccountFeeExample();
		com.payProject.manage.entity.AccountFeeExample.Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		List<AccountFee> selectByExample = accountFeeDao.selectByExample(example);
		return CollUtil.getFirst(selectByExample);
	}
	@Override
	public Boolean updataAccountFee(AccountFee account) {
		AccountFeeExample example  = new AccountFeeExample();
		com.payProject.manage.entity.AccountFeeExample.Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(account.getId());
		int updateByExampleSelective = accountFeeDao.updateByExampleSelective(account, example);
		return updateByExampleSelective > 0 && updateByExampleSelective < 2;
	}
	@Override
	public Boolean updataAccount(AccountEntity account) {
		AccountEntityExample example  = new AccountEntityExample();
		AccountEntityExample.Criteria criteria = example.createCriteria();
		criteria.andAccountIdEqualTo(account.getAccountId());
		int updateByExampleSelective = accountDao.updateByExampleSelective(account, example);
		return updateByExampleSelective > 0 && updateByExampleSelective < 2;
	}
}
