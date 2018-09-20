package com.cts.healthcare.integration.service;

import java.util.Map;

import com.cts.healthcare.integration.domain.Provider;

public interface ProviderService {
	
	public Provider getProvider(String id);
	
	public Map<String,Provider> getMultipleProviders(String[] providerIdArray) ;
	
	

		
}
