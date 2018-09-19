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

import com.cts.healthcare.integration.domain.Authorization;
import com.cts.healthcare.integration.service.UtilManagementService;

@Controller
@RequestMapping("/")
public class UtilManagementRestController {

	public static final Logger LOGGER = LoggerFactory.getLogger(UtilManagementRestController.class);

	@Autowired
	private UtilManagementService utilManagementService;

	
	/**
	*
	* API method to retrieve Utilization Info
	**/
	@RequestMapping("/utilization/{authId}")
	public ResponseEntity<Authorization> getUtilization(@PathVariable("authId") String id,
			@RequestParam(name = "utilFromDate", required = false) String utilFromDate,
			@RequestParam(name = "utilToDate", required = false) String utilToDate) 
	{	
		LOGGER.info("in Service Controller getUtilization()");
		 	
		return new ResponseEntity<Authorization>(utilManagementService.getUtilization(id,utilFromDate,utilToDate), HttpStatus.OK);
	}
	
	
	
	
}