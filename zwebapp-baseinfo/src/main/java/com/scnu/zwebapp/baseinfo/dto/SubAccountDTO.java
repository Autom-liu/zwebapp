package com.scnu.zwebapp.baseinfo.dto;

import javax.validation.constraints.NotEmpty;

public class SubAccountDTO {

	@NotEmpty(message = "子账户名称不能为空")
	private String accName;
	
	private String accIcon;
	
	private String accRemark;
	
	@NotEmpty(message = "子账户缺少权限配置")
	private boolean accCanPay;
	
	@NotEmpty(message = "子账户缺少权限配置")
	private boolean accCanTransfer;

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAccIcon() {
		return accIcon;
	}

	public void setAccIcon(String accIcon) {
		this.accIcon = accIcon;
	}

	public String getAccRemark() {
		return accRemark;
	}

	public void setAccRemark(String accRemark) {
		this.accRemark = accRemark;
	}

	public boolean isAccCanPay() {
		return accCanPay;
	}

	public void setAccCanPay(boolean accCanPay) {
		this.accCanPay = accCanPay;
	}

	public boolean isAccCanTransfer() {
		return accCanTransfer;
	}

	public void setAccCanTransfer(boolean accCanTransfer) {
		this.accCanTransfer = accCanTransfer;
	}
	
}
