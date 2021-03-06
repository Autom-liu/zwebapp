package com.scnu.zwebapp.common.service;

import tk.mybatis.mapper.additional.idlist.SelectByIdListMapper;
import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.ids.DeleteByIdsMapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

public interface Mapper<T> extends
							BaseMapper<T>,
							SelectByIdListMapper<T, Integer>,
							InsertListMapper<T>,
							DeleteByIdsMapper<T> {

}
