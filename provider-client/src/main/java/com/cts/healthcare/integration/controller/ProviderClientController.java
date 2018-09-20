package com.cts.healthcare.integration.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

@RestController
@RequestMapping("/")
public class ProviderClientController 
{

	public static final Logger LOGGER = LoggerFactory.getLogger(ProviderClientController.class);

	private RestTemplate restTemplate;
	private String URL_PROVIDERINFO;
	private String URL_MULTIPLEPROVIDERINFO;

	ProviderClientController(@Value("${provider.service.endpoint.providerinfo}") String URL_PROVIDERINFO,
			@Value("${provider.service.endpoint.multipleproviderinfo}") String URL_MULTIPLEPROVIDERINFO) {
		this.URL_PROVIDERINFO = URL_PROVIDERINFO;
		this.URL_MULTIPLEPROVIDERINFO = URL_MULTIPLEPROVIDERINFO;
		this.restTemplate = new RestTemplate();
	}

	/**
	 *
	 * API method to retrieve Provider info
	 **/
	@RequestMapping(value = "/providers/{providerId}", method = RequestMethod.GET)
	public Provider getProvider(@PathVariable("providerId") String providerId) 
	{
		LOGGER.info("in ProviderClientController getProvider(");
		ParameterizedTypeReference<Resource<Provider>> responseType = new ParameterizedTypeReference<Resource<Provider>>() {
		};
		ResponseEntity<Resource<Provider>> response = restTemplate.exchange(this.URL_PROVIDERINFO, HttpMethod.GET, null,
				responseType, providerId);
		// RequestEntity.get(URI.create(this.URL_PROVIDERINFO)).accept(MediaTypes.HAL_JSON).build(), responseType);
		assert response != null;
		if (response.getStatusCode() == HttpStatus.OK) {
			Provider outHeader = response.getBody().getContent();
			assert outHeader != null;
			return outHeader;
		}
		return new Provider();
	}

	/**
	 *
	 * API method to retrieve multiple Providers info
	 **/
	@RequestMapping(value = "/providers", method = RequestMethod.GET)
	public Map<String, Provider> getMultipleProviders(
			@RequestParam(name = "identifiers", required = false) String[] identifiers) 
	{

		LOGGER.info("in ProviderClientController getMultipleProvider(");

		ParameterizedTypeReference<Map<String, Provider>> responseType = new ParameterizedTypeReference<Map<String, Provider>>() {
		};
		List<String> providerIdList = new ArrayList<String>();
		if (identifiers != null) {
			for (String id : identifiers)
				providerIdList.add(id);
		}

		ResponseEntity<Map<String, Provider>> response = restTemplate.exchange(this.URL_MULTIPLEPROVIDERINFO,
				HttpMethod.GET, null, responseType, providerIdList);
		// RequestEntity.get(URI.create(this.URL_CLAIMINFO)).accept(MediaTypes.HAL_JSON).build(), inHeader);
		assert response != null;

		if (response.getStatusCode() == HttpStatus.OK) {
			Map<String, Provider> outHeader = response.getBody();
			assert outHeader != null;
			return outHeader;
		}
		return new LinkedHashMap<String, Provider>();

	}

}
