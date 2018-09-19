package com.cts.healthcare.integration.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Authorization {
	
	private String priorAuth;
	private String authType;
	private String referringProvider;
	private String authProvider;
	private String procedureCode;
	private String procedureDesc;
	private String diagnosisCode;
	private String diagnosisDesc;
	private String approvalAmt;
	private String reqStartDate;
	private String reqEndDate;
	
}
