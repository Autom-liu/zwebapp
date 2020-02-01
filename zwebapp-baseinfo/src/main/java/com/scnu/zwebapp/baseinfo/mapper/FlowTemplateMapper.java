package com.scnu.zwebapp.baseinfo.mapper;

import com.scnu.zwebapp.baseinfo.bean.FlowTemplate;
import com.scnu.zwebapp.baseinfo.bean.FlowTemplateExample;
import com.scnu.zwebapp.common.service.Mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlowTemplateMapper extends Mapper<FlowTemplate> {
    long countByExample(FlowTemplateExample example);

    int deleteByExample(FlowTemplateExample example);

    List<FlowTemplate> selectByExample(FlowTemplateExample example);

    int updateByExampleSelective(@Param("record") FlowTemplate record, @Param("example") FlowTemplateExample example);

    int updateByExample(@Param("record") FlowTemplate record, @Param("example") FlowTemplateExample example);
}