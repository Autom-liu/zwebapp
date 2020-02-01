package com.scnu.zwebapp.baseinfo.mapper;

import com.scnu.zwebapp.baseinfo.bean.Account;
import com.scnu.zwebapp.baseinfo.bean.AccountExample;
import com.scnu.zwebapp.common.service.Mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountMapper extends Mapper<Account> {
    long countByExample(AccountExample example);

    int deleteByExample(AccountExample example);

    List<Account> selectByExample(AccountExample example);

    int updateByExampleSelective(@Param("record") Account record, @Param("example") AccountExample example);

    int updateByExample(@Param("record") Account record, @Param("example") AccountExample example);
}