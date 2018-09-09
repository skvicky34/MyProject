package com.cts.healthcare.integration.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cts.healthcare.integration.domain.Claim;
import com.cts.healthcare.integration.domain.ClaimCob;
import com.cts.healthcare.integration.domain.ClaimDiagnosis;
import com.cts.healthcare.integration.domain.ClaimHeader;
import com.cts.healthcare.integration.domain.ClaimServiceLine;
import com.cts.healthcare.integration.service.ClaimService;

@RestController
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
	
	@RequestMapping("/claimservice")
	public ResponseEntity<Claim> getInfo1() {
		String parts=null;
		return new ResponseEntity<Claim>(headerService.getClaim("112360000400", parts), HttpStatus.OK);
	}

	@RequestMapping("/claims/{claimId}")
	public ResponseEntity<Claim> getClaim(@PathVariable("claimId") String claimId, @RequestParam(name="parts", required=false) String partList) {		
		 	System.out.println("partList :: "+ partList);
		 	//for(String p : partList)System.out.println(" ------ " + p);
		return new ResponseEntity<Claim>(headerService.getClaim(claimId, partList), HttpStatus.OK);
	}
	
	@RequestMapping("/claims/{claimId}/header")
	public ResponseEntity<ClaimHeader> getClaimHeader(@PathVariable("claimId") String claimId) {				
		return new ResponseEntity<ClaimHeader>(headerService.getClaimHeader(claimId), HttpStatus.OK);
	}
	
	@RequestMapping("/claims/{claimId}/serviceline")
	public ResponseEntity<ClaimServiceLine> getServiceLine(@PathVariable("claimId") String claimId) {			
		return new ResponseEntity<ClaimServiceLine>(headerService.getClaimServiceLine(claimId), HttpStatus.OK);
	}
	
	@RequestMapping("/claims/{claimId}/diagnosis")
	public ResponseEntity<ClaimDiagnosis> getDiagnosis(@PathVariable("claimId") String id) {				
		return new ResponseEntity<ClaimDiagnosis>(headerService.getClaimDiagnosis(id), HttpStatus.OK);
	}
	
	@RequestMapping("/claims/{claimId}/cob")
	public ResponseEntity<ClaimCob> getCob(@PathVariable("claimId") String id) {				
		return new ResponseEntity<ClaimCob>(headerService.getClaimCob(id), HttpStatus.OK);
	}
}