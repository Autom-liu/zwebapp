package com.scnu.zwebapp.facade.query;

import com.scnu.zwebapp.common.query.PageQuery;
import com.scnu.zwebapp.facade.enums.OtherOrderEnum;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class OtherQuery extends PageQuery {

	private static final long serialVersionUID = 1L;
	
	private String otrType;
	
	private OtherOrderEnum orderBy;

}
