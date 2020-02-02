package com.scnu.zwebapp.flow.service;

import java.util.List;

import com.scnu.zwebapp.common.service.IService;
import com.scnu.zwebapp.common.vo.PageVO;
import com.scnu.zwebapp.flow.bean.Other;
import com.scnu.zwebapp.flow.dto.OtherDTO;
import com.scnu.zwebapp.flow.query.OtherQuery;
import com.scnu.zwebapp.flow.vo.OtherVO;

/**
 * if your service don't need this method  you can remove it manually
 */
public interface OtherService extends IService<Other, OtherDTO, OtherVO> {
	
	PageVO<OtherVO> queryPage(OtherQuery query);
	
	List<OtherVO> queryList(OtherQuery query);
	
}
