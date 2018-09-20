package com.cts.healthcare.integration.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.healthcare.integration.domain.Claim;
import com.cts.healthcare.integration.domain.ClaimCob;
import com.cts.healthcare.integration.domain.ClaimServiceLine;
import com.cts.healthcare.integration.service.ClaimService;

@Controller
@RequestMapping("/")
public class ClaimHeaderRestController {

	public static final Logger LOGGER = LoggerFactory.getLogger(ClaimHeaderRestController.class);

	private final ClaimService claimService;
	
	public ClaimHeaderRestController(ClaimService claimService) {
		this.claimService = claimService;
	}

	@RequestMapping("/headerserviceinfo")
	public ResponseEntity<String> getInfo() {
		return new ResponseEntity<String>(claimService.getInfo(), HttpStatus.OK);
	}

	/**
	 *
	 * API method to retrieve claim info
	 **/
	@RequestMapping("/claims/{claimid}")
	public ResponseEntity<Map<String, Object>> getClaimParts(@PathVariable("claimid") String id,
			@RequestParam(name = "parts", required = false) String[] parts) {
		LOGGER.info("in ClaimHeaderRestController getClaimParts() method");
		return new ResponseEntity<Map<String, Object>>(claimService.getClaimParts(id, parts), HttpStatus.OK);
	}

	/**
	 *
	 * API method to retrieve claim header
	 **/
	@RequestMapping("/claims/{claimid}/header")
	public ResponseEntity<Claim> getClaimHeader(@PathVariable("claimid") String id) {
		LOGGER.info("in ClaimHeaderRestController getClaimHeader() method");
		return new ResponseEntity<Claim>(claimService.getClaimHeader(id), HttpStatus.OK);
	}

	/**
	 *
	 * API method to retrieve claim service line
	 **/
	@RequestMapping("/claims/{claimid}/servicelines")
	public ResponseEntity<List<ClaimServiceLine>> getServiceLine(@PathVariable("claimid") String id) {
		LOGGER.info("in ClaimHeaderRestController getServiceLine() method");
		return new ResponseEntity<List<ClaimServiceLine>>(claimService.getClaimServiceLine(id), HttpStatus.OK);
	}

	/**
	 * Method to get the Claim COB for the given ClaimId
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/claims/{claimid}/cob")
	public ResponseEntity<ClaimCob> getCob(@PathVariable("claimid") String id) {
		LOGGER.info("in ClaimHeaderRestController getCob() method");
		return new ResponseEntity<ClaimCob>(claimService.getClaimCob(id), HttpStatus.OK);
	}
}