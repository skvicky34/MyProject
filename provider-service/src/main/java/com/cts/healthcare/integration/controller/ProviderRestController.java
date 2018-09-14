package com.cts.healthcare.integration.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.healthcare.integration.domain.Provider;
import com.cts.healthcare.integration.service.ProviderService;

@Controller
@RequestMapping("/")
public class ProviderRestController {

	public static final Logger logger = LoggerFactory.getLogger(ProviderRestController.class);

	@Autowired
	private ProviderService providerService;

	
	/**
	*
	* API method to retrieve Provider Info
	**/
	@RequestMapping("/providers/{providerId}")
	public ResponseEntity<Provider> getProvider(@PathVariable("providerId") String id) 
	{	
		logger.info("in Service Controller getProvider()");
		 	
		return new ResponseEntity<Provider>(providerService.getProvider(id), HttpStatus.OK);
	}
	
	/**
	*
	* API method to retrieve Multiple provider Info
	**/
	@RequestMapping("/providers")
	public ResponseEntity<Map<String,Provider>> getMultipleProviders(@RequestParam("identifiers") String identifiers)
	{		
		logger.info("in Service Controller getMultipleProviders()");
		
		return new ResponseEntity<Map<String,Provider>>(providerService.getMultipleProviders(identifiers), HttpStatus.OK);
	}
	
	
}