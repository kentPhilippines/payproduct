package com.payProject.manage.mapper;

import com.payProject.manage.entity.AccountFee;
import com.payProject.manage.entity.AccountFeeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AccountFeeMapper {
    int countByExample(AccountFeeExample example);

    int deleteByExample(AccountFeeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AccountFee record);

    int insertSelective(AccountFee record);

    List<AccountFee> selectByExample(AccountFeeExample example);

    AccountFee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AccountFee record, @Param("example") AccountFeeExample example);

    int updateByExample(@Param("record") AccountFee record, @Param("example") AccountFeeExample example);

    int updateByPrimaryKeySelective(AccountFee record);

    int updateByPrimaryKey(AccountFee record);
}