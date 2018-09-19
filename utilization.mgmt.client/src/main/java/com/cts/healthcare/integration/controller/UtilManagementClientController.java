package com.cts.healthcare.integration.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

import com.cts.healthcare.integration.domain.Authorization;
import com.cts.healthcare.integration.service.UtilManagementService;

@RestController
@RequestMapping("/")
public class UtilManagementClientController {

	private RestTemplate restTemplate;
	private String URL_UTILINFO;
	

	@Autowired
	UtilManagementService utilManagementService;

	public static final Logger LOGGER = LoggerFactory.getLogger(UtilManagementClientController.class);
	
	UtilManagementClientController(@Value("${utilization.service.endpoint.utilizationinfo}") String URL_UTILINFO){
		this.URL_UTILINFO = URL_UTILINFO;
		this.restTemplate = new RestTemplate();
	}


	/**
	*
	* API method to retrieve Provider info
	**/
	@RequestMapping(value = "/util/{authId}", method = RequestMethod.GET)
	public Authorization getUtilization(@PathVariable("providerId") String providerId,
			@RequestParam(name = "utilFromDate", required = false) String utilFromDate,
			@RequestParam(name = "utilToDate", required = false) String utilToDate) {
		LOGGER.info("in Client Controller getUtilization()");
		ParameterizedTypeReference<Resource<Authorization>> responseType = new ParameterizedTypeReference<Resource<Authorization>>() {
		};
		ResponseEntity<Resource<Authorization>> response = restTemplate.exchange(
				this.URL_UTILINFO, HttpMethod.GET, null,responseType,providerId);
				//RequestEntity.get(URI.create(this.URL_PROVIDERINFO)).accept(MediaTypes.HAL_JSON).build(), responseType);
		assert response != null;
		if (response.getStatusCode() == HttpStatus.OK) {
			Authorization outHeader = response.getBody().getContent();
			assert outHeader != null;
			return outHeader;
		}
		return new Authorization();
	}

	

	
	
	
}
