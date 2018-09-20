package com.cts.healthcare.integration.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.Resource;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cts.healthcare.integration.config.ClaimClientProperty;
import com.cts.healthcare.integration.domain.Claim;
import com.cts.healthcare.integration.domain.ClaimCob;
import com.cts.healthcare.integration.domain.ClaimHeader;
import com.cts.healthcare.integration.domain.ClaimServiceLine;

@RestController
@RequestMapping("/")
@EnableConfigurationProperties(ClaimClientProperty.class)
public class ClaimHeaderController {

	private final static Logger LOGGER = LoggerFactory.getLogger(ClaimHeaderController.class);

	private final RestTemplate restTemplate;
	private ClaimClientProperty claimClientProperty;

	public ClaimHeaderController( ClaimClientProperty claimClientProperty) {
		this.restTemplate = new RestTemplate();
		this.claimClientProperty = claimClientProperty;
	}

	@RequestMapping(value = "/headerserviceinfo", method = RequestMethod.GET)
	public String getServiceInfo() {
		LOGGER.info("Called Client serviceInfo() method");
		return restTemplate.getForObject(claimClientProperty.getServiceInfo(), String.class);
	}

	/**
	 * Method to get the claim details
	 * 
	 * @return
	 */
	@RequestMapping(value = "/claims", method = RequestMethod.GET)
	public ClaimHeader getClaim() {
		LOGGER.info(" in ClaimHeaderController getClaim() method");
		ParameterizedTypeReference<Resource<ClaimHeader>> responseType = new ParameterizedTypeReference<Resource<ClaimHeader>>() {
		};
		ResponseEntity<Resource<ClaimHeader>> response = restTemplate.exchange(
				RequestEntity.get(URI.create(claimClientProperty.getClaimInfo())).accept(MediaTypes.HAL_JSON).build(),
				responseType);
		assert response != null;
		if (response.getStatusCode() == HttpStatus.OK) {
			ClaimHeader outHeader = response.getBody().getContent();
			assert outHeader != null;
			return outHeader;
		}
		return new ClaimHeader();
	}

	/**
	 *
	 * API method to retrieve claim
	 **/
	@RequestMapping(value = "/claims/{claimId}", method = RequestMethod.GET)
	public Map<String, Object> getClaimInfo(@PathVariable("claimId") String claimId,
			@RequestParam(name = "parts", required = false) String[] partsArray) {

		LOGGER.info("in ClaimHeaderController getClaimInfo() method");
		ParameterizedTypeReference<Map<String, Object>> responseType = new ParameterizedTypeReference<Map<String, Object>>() {
		};

		List<String> partList = new ArrayList<String>();
		if (partsArray != null) {
			for (String part : partsArray)
				partList.add(part);
		}
		ResponseEntity<Map<String, Object>> response = restTemplate.exchange(claimClientProperty.getClaimInfo(),
				HttpMethod.GET, null, responseType, claimId, partList);
		assert response != null;
		if (response.getStatusCode() == HttpStatus.OK) {
			Map<String, Object> outHeader = response.getBody();
			assert outHeader != null;
			return outHeader;
		}
		return new LinkedHashMap<String, Object>();

	}

	/**
	 *
	 * API method to retrieve claim header
	 **/
	@RequestMapping(value = "/claims/{claimId}/header", method = RequestMethod.GET)
	public Claim getClaimHeader(@PathVariable("claimId") String claimId) {
		LOGGER.info("in ClaimHeaderController getClaimHeader() method");
		ParameterizedTypeReference<Resource<Claim>> responseType = new ParameterizedTypeReference<Resource<Claim>>() {
		};
		ResponseEntity<Resource<Claim>> response = restTemplate.exchange(claimClientProperty.getClaimHeader(),
				HttpMethod.GET, null, responseType, claimId);
		assert response != null;
		if (response.getStatusCode() == HttpStatus.OK) {
			Claim outHeader = response.getBody().getContent();
			assert outHeader != null;
			return outHeader;
		}
		return new Claim();
	}

	/**
	 *
	 * API method to retrieve claim service line
	 **/
	@RequestMapping(value = "/claims/{claimId}/servicelines", method = RequestMethod.GET)
	public List<ClaimServiceLine> getClaimServiceLine(@PathVariable("claimId") String claimId) {
		LOGGER.info(" in ClaimHeaderController getClaimServiceLine() method");
		List<ClaimServiceLine> claimServList = new ArrayList<>();
		ParameterizedTypeReference<List<ClaimServiceLine>> responseType = new ParameterizedTypeReference<List<ClaimServiceLine>>() {
		};
		ResponseEntity<List<ClaimServiceLine>> response = restTemplate
				.exchange(claimClientProperty.getClaimServiceline(), HttpMethod.GET, null, responseType, claimId);
		assert response != null;
		if (response.getStatusCode() == HttpStatus.OK) {
			List<ClaimServiceLine> outHeader = response.getBody();
			assert outHeader != null;
			return outHeader;
		}
		return claimServList;

	}

	/**
	 *
	 * API method to retrieve claim COB
	 **/
	@RequestMapping(value = "/claims/{claimId}/cob", method = RequestMethod.GET)
	public ClaimCob getClaimCob(@PathVariable("claimId") String claimId) {
		LOGGER.info(" in ClaimHeaderController getClaimCob() method");
		return restTemplate.getForObject(claimClientProperty.getClaimCob(), ClaimCob.class, claimId);
	}

}
