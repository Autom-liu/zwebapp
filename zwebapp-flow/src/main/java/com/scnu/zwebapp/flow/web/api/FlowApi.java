package com.scnu.zwebapp.flow.web.api;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scnu.zwebapp.common.enums.ErrorEnum;
import com.scnu.zwebapp.common.enums.FlowRecordTypeEnum;
import com.scnu.zwebapp.common.vo.IResult;
import com.scnu.zwebapp.common.vo.Result;
import com.scnu.zwebapp.common.web.annotation.CommonRequestBody;
import com.scnu.zwebapp.facade.dto.AccountFlowDTO;
import com.scnu.zwebapp.facade.interfaces.AccountFlowService;

@RestController
@RequestMapping("/flow")
public class FlowApi {
	
	@Autowired
	private AccountFlowService flowService;

	@PostMapping("/add")
	public IResult add(@Valid @CommonRequestBody AccountFlowDTO flowDto) {
		FlowRecordTypeEnum flowRecordType = flowDto.getFlowRecordType();
		if(FlowRecordTypeEnum.INCOME.equals(flowRecordType)) {
			flowService.insertIncomeFlow(flowDto);
		} else if(FlowRecordTypeEnum.OUTCOME.equals(flowRecordType)) {
			flowService.insertOutcomeFlow(flowDto);
		} else if(FlowRecordTypeEnum.TRANSFER.equals(flowRecordType)) {
			flowService.insertTransferFlow(flowDto);
		} else if(FlowRecordTypeEnum.RECHARAGE.equals(flowRecordType)) {
			flowService.insertRechargeFlow(flowDto);
		} else {
			return IResult.error(ErrorEnum.ERRCODE_0101);
		}
		
		return Result.success(null);
	}
	
}
