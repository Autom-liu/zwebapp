package com.scnu.zwebapp.baseinfo.service;

import java.util.List;

import com.scnu.zwebapp.common.service.IService;
import com.scnu.zwebapp.common.vo.PageVO;
import com.scnu.zwebapp.baseinfo.bean.Other;
import com.scnu.zwebapp.baseinfo.dto.OtherDTO;
import com.scnu.zwebapp.baseinfo.query.OtherQuery;
import com.scnu.zwebapp.baseinfo.vo.OtherVO;

/**
 * if your service don't need this method  you can remove it manually
 */
public interface OtherService extends IService<Other, OtherDTO, OtherVO> {
	
	PageVO<OtherVO> queryPage(OtherQuery query);
	
	List<OtherVO> queryList(OtherQuery query);
	
	/**
	 * 增加使用次数
	 * @param id
	 * @return
	 */
	int increaseUseTime(Integer id);
	
}
