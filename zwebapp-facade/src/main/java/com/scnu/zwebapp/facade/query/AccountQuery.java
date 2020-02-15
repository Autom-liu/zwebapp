package com.scnu.zwebapp.facade.query;

import com.scnu.zwebapp.common.query.PageQuery;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class AccountQuery extends PageQuery {

	private static final long serialVersionUID = 1L;
	
	private String accSysType;
	
	private String accUserType;
	
	private Boolean accHasChild;
	
	private Boolean accCanPay;
	
	private Boolean accCanTransfer;

}
