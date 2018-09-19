package com.cts.healthcare.integration.service;

import java.util.Map;

import com.cts.healthcare.integration.domain.Authorization;

public interface UtilManagementService {
	
	public Authorization getUtilization(String id,String utilFromDate,String utilToDate);
	
	

		
}
