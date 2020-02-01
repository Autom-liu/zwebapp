package com.scnu.zwebapp.baseinfo.mapper;

import com.scnu.zwebapp.baseinfo.bean.Other;
import com.scnu.zwebapp.baseinfo.bean.OtherExample;
import com.scnu.zwebapp.common.service.Mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OtherMapper extends Mapper<Other> {
    long countByExample(OtherExample example);

    int deleteByExample(OtherExample example);

    List<Other> selectByExample(OtherExample example);

    int updateByExampleSelective(@Param("record") Other record, @Param("example") OtherExample example);

    int updateByExample(@Param("record") Other record, @Param("example") OtherExample example);
}