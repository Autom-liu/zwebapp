package com.scnu.zwebapp.baseinfo.mapper;

import com.scnu.zwebapp.baseinfo.bean.Category;
import com.scnu.zwebapp.baseinfo.bean.CategoryExample;
import com.scnu.zwebapp.common.service.Mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CategoryMapper extends Mapper<Category> {
    long countByExample(CategoryExample example);

    int deleteByExample(CategoryExample example);

    List<Category> selectByExample(CategoryExample example);

    int updateByExampleSelective(@Param("record") Category record, @Param("example") CategoryExample example);

    int updateByExample(@Param("record") Category record, @Param("example") CategoryExample example);
}