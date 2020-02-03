package com.scnu.zwebapp.baseinfo.query;

import com.scnu.zwebapp.baseinfo.enums.OtherOrderEnum;
import com.scnu.zwebapp.common.query.PageQuery;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class OtherQuery extends PageQuery {

	private static final long serialVersionUID = 1L;
	
	private String otrType;
	
	private OtherOrderEnum orderBy;

}
