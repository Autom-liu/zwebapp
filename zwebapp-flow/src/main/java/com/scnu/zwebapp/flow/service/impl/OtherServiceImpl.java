package com.scnu.zwebapp.flow.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scnu.zwebapp.common.proxy.CriteriaProxy;
import com.scnu.zwebapp.common.service.BaseService;
import com.scnu.zwebapp.common.vo.PageVO;
import com.scnu.zwebapp.flow.bean.Other;
import com.scnu.zwebapp.flow.bean.OtherExample;
import com.scnu.zwebapp.flow.dto.OtherDTO;
import com.scnu.zwebapp.flow.mapper.OtherMapper;
import com.scnu.zwebapp.flow.query.OtherQuery;
import com.scnu.zwebapp.flow.service.OtherService;
import com.scnu.zwebapp.flow.vo.OtherVO;

@Service
public class OtherServiceImpl extends BaseService<Other, OtherDTO, OtherVO> implements OtherService {

	@Autowired
	private OtherMapper otherMapper;
	
	@Override
	public PageVO<OtherVO> queryPage(OtherQuery query) {
		
		OtherExample example = new ExampleProxy();
		
		super.handlePageOrder(query, false, example);
		
		// TODO Here build the condition you want
		
		List<Other> others = otherMapper.selectByExample(example);
		
		return super.handlePageResult(others);
	}
	

	@Override
	public List<OtherVO> queryList(OtherQuery query) {
		query.setPageFlag(false);
		PageVO<OtherVO> pageVO = this.queryPage(query);
		return pageVO.getData();
	}

	private class ExampleProxy extends OtherExample {
		// 静态代理一下
		public Criteria createCriteria() {
			return (Criteria) CriteriaProxy.getInstance(super.createCriteria());
		}
		
		public Criteria or() {
			return (Criteria) CriteriaProxy.getInstance(super.or());
		}
		
	}
}
