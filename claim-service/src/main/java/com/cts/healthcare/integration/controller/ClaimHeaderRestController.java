package com.cts.healthcare.integration.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.healthcare.integration.domain.Claim;
import com.cts.healthcare.integration.domain.ClaimCob;
import com.cts.healthcare.integration.domain.ClaimDiagnosis;
import com.cts.healthcare.integration.domain.ClaimServiceLine;
import com.cts.healthcare.integration.service.ClaimService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping("/")
public class ClaimHeaderRestController {

	public static final Logger logger = LoggerFactory.getLogger(ClaimHeaderRestController.class);

	@Autowired
	@Qualifier("HeaderService")
	private ClaimService headerService;

	@RequestMapping("/serviceinfo")
	public ResponseEntity<String> getInfo() {
		return new ResponseEntity<String>(headerService.getInfo(), HttpStatus.OK);
	}

	/**
	*
	* API method to  retrieve claim info
	**/
	@RequestMapping("/claims/{claimid}")
	public ResponseEntity<Claim> getClaim(@PathVariable("claimid") String id, @RequestParam(name="parts", required=false) String parts) {	
		logger.info("Called Service getClaim() method" );
		ObjectMapper mapper = new ObjectMapper();
		Claim claim = new Claim();
		try {
			mapper.writeValueAsString(claim);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}		
		return new ResponseEntity<Claim>(headerService.getClaim(id, parts), HttpStatus.OK);
	}
	
	/**
	*
	* API method to  retrieve claim header
	**/
	@RequestMapping("/claims/{claimid}/header")
	public ResponseEntity<Claim> getClaimHeader(@PathVariable("claimid") String id) {
		logger.info("Called Service getClaimHeader() method" );
		return new ResponseEntity<Claim>(headerService.getClaim(id, ""), HttpStatus.OK);
	}
	
	/**
	*
	* API method to  retrieve claim service line
	**/
	@RequestMapping("/claims/{claimid}/servicelines")
	public ResponseEntity<List<ClaimServiceLine>> getServiceLine(@PathVariable("claimid") String id) {	
		logger.info("Called Service getServiceLine() method" );
		return new ResponseEntity<List<ClaimServiceLine>>(headerService.getClaimServiceLine(id), HttpStatus.OK);
	}
	
	@RequestMapping("/claims/{claimid}/diagnosis")
	public ResponseEntity<ClaimDiagnosis> getDiagnosis(@PathVariable("claimid") String id) {				
		return new ResponseEntity<ClaimDiagnosis>(headerService.getClaimDiagnosis(id), HttpStatus.OK);
	}
	
	@RequestMapping("/claims/{claimid}/cob")
	public ResponseEntity<ClaimCob> getCob(@PathVariable("claimid") String id) {				
		return new ResponseEntity<ClaimCob>(headerService.getClaimCob(id), HttpStatus.OK);
	}
}