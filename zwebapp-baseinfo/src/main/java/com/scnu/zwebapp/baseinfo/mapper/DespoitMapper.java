package com.scnu.zwebapp.baseinfo.mapper;

import com.scnu.zwebapp.baseinfo.bean.Despoit;
import com.scnu.zwebapp.baseinfo.bean.DespoitExample;
import com.scnu.zwebapp.common.service.Mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DespoitMapper extends Mapper<Despoit> {
    long countByExample(DespoitExample example);

    int deleteByExample(DespoitExample example);

    List<Despoit> selectByExample(DespoitExample example);

    int updateByExampleSelective(@Param("record") Despoit record, @Param("example") DespoitExample example);

    int updateByExample(@Param("record") Despoit record, @Param("example") DespoitExample example);
}