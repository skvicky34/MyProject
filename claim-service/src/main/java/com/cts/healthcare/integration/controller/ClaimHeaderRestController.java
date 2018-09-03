package com.cts.healthcare.integration.controller;

import java.net.URI;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.healthcare.integration.domain.Claim;
import com.cts.healthcare.integration.domain.ClaimCob;
import com.cts.healthcare.integration.domain.ClaimDiagnosis;
import com.cts.healthcare.integration.domain.ClaimHeader;
import com.cts.healthcare.integration.domain.ClaimMembers;
import com.cts.healthcare.integration.domain.ClaimProvider;
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

	@RequestMapping("/claims/{claimid}")
	public ResponseEntity<Claim> getClaim(@PathVariable("claimid") Integer id, @RequestParam(name="parts", required=false) String parts) {		
		ObjectMapper mapper = new ObjectMapper();
		Claim claim = new Claim();
		try {
			mapper.writeValueAsString(claim);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}		
		return new ResponseEntity<Claim>(claim, HttpStatus.OK);
	}
	
	@RequestMapping("/claims/{claimid}/header")
	public ResponseEntity<ClaimHeader> getClaimHeader(@PathVariable("claimid") Integer id) {				
		return new ResponseEntity<ClaimHeader>(headerService.getClaimHeader(id), HttpStatus.OK);
	}
	
	@RequestMapping("/claims/{claimid}/serviceline")
	public ResponseEntity<ClaimServiceLine> getServiceLine(@PathVariable("claimid") Integer id) {			
		return new ResponseEntity<ClaimServiceLine>(headerService.getClaimServiceLine(id), HttpStatus.OK);
	}
	
	@RequestMapping("/claims/{claimid}/diagnosis")
	public ResponseEntity<ClaimDiagnosis> getDiagnosis(@PathVariable("claimid") Integer id) {				
		return new ResponseEntity<ClaimDiagnosis>(headerService.getClaimDiagnosis(id), HttpStatus.OK);
	}
	
	@RequestMapping("/claims/{claimid}/cob")
	public ResponseEntity<ClaimCob> getCob(@PathVariable("claimid") Integer id) {				
		return new ResponseEntity<ClaimCob>(headerService.getClaimCob(id), HttpStatus.OK);
	}
}