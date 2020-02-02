package com.scnu.zwebapp.flow.mapper;

import com.scnu.zwebapp.common.service.Mapper;
import com.scnu.zwebapp.flow.bean.AccountFlow;
import com.scnu.zwebapp.flow.bean.AccountFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountFlowMapper extends Mapper<AccountFlow> {
    long countByExample(AccountFlowExample example);

    int deleteByExample(AccountFlowExample example);

    List<AccountFlow> selectByExample(AccountFlowExample example);

    int updateByExampleSelective(@Param("record") AccountFlow record, @Param("example") AccountFlowExample example);

    int updateByExample(@Param("record") AccountFlow record, @Param("example") AccountFlowExample example);
}