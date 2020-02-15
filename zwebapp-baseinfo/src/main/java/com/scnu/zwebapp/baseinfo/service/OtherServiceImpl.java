package com.scnu.zwebapp.baseinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scnu.zwebapp.baseinfo.bean.Other;
import com.scnu.zwebapp.baseinfo.bean.OtherExample;
import com.scnu.zwebapp.baseinfo.mapper.OtherExtMapper;
import com.scnu.zwebapp.baseinfo.mapper.OtherMapper;
import com.scnu.zwebapp.common.enums.ErrorEnum;
import com.scnu.zwebapp.common.exception.BizException;
import com.scnu.zwebapp.common.proxy.CriteriaProxy;
import com.scnu.zwebapp.common.service.BaseService;
import com.scnu.zwebapp.common.util.DataUtils;
import com.scnu.zwebapp.common.vo.PageVO;
import com.scnu.zwebapp.facade.dto.OtherDTO;
import com.scnu.zwebapp.facade.enums.OtrTypeEnum;
import com.scnu.zwebapp.facade.interfaces.OtherService;
import com.scnu.zwebapp.facade.query.OtherQuery;
import com.scnu.zwebapp.facade.vo.OtherVO;

@Service
public class OtherServiceImpl extends BaseService<Other, OtherDTO, OtherVO> implements OtherService {

	@Autowired
	private OtherMapper mapper;
	
	private OtherExtMapper otherExtMapper;
	
	@Override
	public int increaseUseTime(Integer id) {
		return otherExtMapper.increaseUseTime(id);
	}



	@Override
	public int insert(OtherDTO dto) {
		String otrType = dto.getOtrType();
		OtrTypeEnum otrTypeEnum = DataUtils.getEnumByCode(otrType, OtrTypeEnum.class);
		if(otrTypeEnum == null) {
			throw new BizException(ErrorEnum.ERRCODE_0019);
		}
		Other bean = DataUtils.copyBean(dto, Other.class);
		bean.setOtrUseTime(0);
		return mapper.insert(bean);
	}



	@Override
	public PageVO<OtherVO> queryPage(OtherQuery query) {
		
		OtherExample example = new ExampleProxy();
		
		super.handlePageOrder(query, true, example);
		
		example.createCriteria().andOtrTypeEqualTo(query.getOtrType());
		
		List<Other> others = mapper.selectByExample(example);
		
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
