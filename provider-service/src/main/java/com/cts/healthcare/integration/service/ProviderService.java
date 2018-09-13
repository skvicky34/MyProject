package com.cts.healthcare.integration.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import com.cts.healthcare.integration.domain.Provider;

public interface ProviderService {
	
	public Provider getProvider(String id);
	
	public LinkedHashMap<String,Provider> getMultipleProviders(String parts) ;
	
	

		
}
