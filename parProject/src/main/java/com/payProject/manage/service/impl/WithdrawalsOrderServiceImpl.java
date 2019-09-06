package com.payProject.manage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payProject.manage.entity.WithdrawalsOrderEntity;
import com.payProject.manage.entity.WithdrawalsOrderEntityExample;
import com.payProject.manage.entity.WithdrawalsOrderEntityExample.Criteria;
import com.payProject.manage.mapper.WithdrawalsOrderMapper;
import com.payProject.manage.service.WithdrawalsOrderService;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
@Service
public class WithdrawalsOrderServiceImpl implements WithdrawalsOrderService {

	@Autowired
	WithdrawalsOrderMapper withdrawalsOrderDao;
	@Override
	public List<WithdrawalsOrderEntity> findPageWithdrawalsByWithdrawals(WithdrawalsOrderEntity withdrawalsOrder) {
		WithdrawalsOrderEntityExample example  = new WithdrawalsOrderEntityExample();
		Criteria criteria = example.createCriteria();
		if(StrUtil.isNotBlank(withdrawalsOrder.getOrderId()))
			criteria.andOrderIdEqualTo(withdrawalsOrder.getOrderId());
		if(StrUtil.isNotBlank(withdrawalsOrder.getAssociatedId()))
			criteria.andAssociatedIdEqualTo(withdrawalsOrder.getAssociatedId());
		if(StrUtil.isNotBlank(withdrawalsOrder.getBankCard()))
			criteria.andBankCardEqualTo(withdrawalsOrder.getBankCard());
		if(StrUtil.isNotBlank(withdrawalsOrder.getOrderAccount()))
			criteria.andOrderAccountEqualTo(withdrawalsOrder.getOrderAccount());
		if( null != withdrawalsOrder.getOrderStatus())
			criteria.andOrderStatusEqualTo(withdrawalsOrder.getOrderStatus());
		if(StrUtil.isNotBlank(withdrawalsOrder.getTime())) {
			String data = StrUtil.subPre(withdrawalsOrder.getTime(),10);
			String data1 = StrUtil.subSuf(withdrawalsOrder.getTime(),12);
			criteria.andCreateTimeBetween(DateUtil.parse(data), DateUtil.parse(data1));
			} 
		List<WithdrawalsOrderEntity> selectByExample = withdrawalsOrderDao.selectByExample(example);
		return selectByExample;
	}

}
