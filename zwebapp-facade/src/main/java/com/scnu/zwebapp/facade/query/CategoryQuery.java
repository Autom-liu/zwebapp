package com.scnu.zwebapp.facade.query;

import com.scnu.zwebapp.common.enums.FlowRecordTypeEnum;
import com.scnu.zwebapp.common.query.PageQuery;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class CategoryQuery extends PageQuery {

	private static final long serialVersionUID = 1L;
	
	private FlowRecordTypeEnum cateType;

}
