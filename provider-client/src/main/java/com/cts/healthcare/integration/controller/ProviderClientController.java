package com.cts.healthcare.integration.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.Resource;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cts.healthcare.integration.domain.Provider;
import com.cts.healthcare.integration.service.ProviderService;

@RestController
@RequestMapping("/")
public class ProviderClientController {

	private RestTemplate restTemplate;
	private String URL_PROVIDERINFO;
	private String URL_MULTIPLEPROVIDERINFO;
	

	@Autowired
	ProviderService providerService;

	ProviderClientController(@Value("${provider.service.endpoint.providerinfo}") String URL_PROVIDERINFO,
			@Value("${provider.service.endpoint.multipleproviderinfo}") String URL_MULTIPLEPROVIDERINFO) {
		this.URL_PROVIDERINFO = URL_PROVIDERINFO;
		this.URL_MULTIPLEPROVIDERINFO = URL_MULTIPLEPROVIDERINFO;
		this.restTemplate = new RestTemplate();
	}


	@RequestMapping(value = "/providers/{providerId}", method = RequestMethod.GET)
	public Provider getProvider(@PathVariable("providerId") String providerId) {
		ParameterizedTypeReference<Resource<Provider>> responseType = new ParameterizedTypeReference<Resource<Provider>>() {
		};
		ResponseEntity<Resource<Provider>> response = restTemplate.exchange(
				this.URL_PROVIDERINFO, HttpMethod.GET, null,responseType,providerId);
				//RequestEntity.get(URI.create(this.URL_PROVIDERINFO)).accept(MediaTypes.HAL_JSON).build(), responseType);
		assert response != null;
		if (response.getStatusCode() == HttpStatus.OK) {
			Provider outHeader = response.getBody().getContent();
			assert outHeader != null;
			return outHeader;
		}
		return new Provider();
	}

	@RequestMapping(value = "/providers", method = RequestMethod.GET)
	public LinkedHashMap<String,Provider> getMultipleProviders(
			@RequestParam(name = "identifiers", required = false) String[] identifiers) {
		 
		
		ParameterizedTypeReference<LinkedHashMap<String,Provider>> responseType = new ParameterizedTypeReference<LinkedHashMap<String,Provider>>() {
		};
		
		List<String> identifierList = new ArrayList<String>();
//		String identifierList = "";
		if(identifiers != null) {
			for(String id : identifiers)
				identifierList.add(id);
//		 identifierList = Arrays.toString(identifiers);
		}
		//params.put("claimId", claimId);
	    
		ResponseEntity<LinkedHashMap<String,Provider>> response = restTemplate.exchange(
				this.URL_MULTIPLEPROVIDERINFO, HttpMethod.GET, null,responseType, identifierList);
				//RequestEntity.get(URI.create(this.URL_CLAIMINFO)).accept(MediaTypes.HAL_JSON).build(), inHeader);
		assert response != null;
		
		if (response.getStatusCode() == HttpStatus.OK) {
			LinkedHashMap<String,Provider> outHeader = response.getBody();
			assert outHeader != null;
			return outHeader;
		}
		return new LinkedHashMap<String,Provider>();

	}

	
	
	
}
