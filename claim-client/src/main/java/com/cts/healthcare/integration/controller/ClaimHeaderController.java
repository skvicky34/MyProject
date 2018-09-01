package com.cts.healthcare.integration.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cts.healthcare.integration.domain.Claim;
import com.cts.healthcare.integration.domain.ClaimCob;
import com.cts.healthcare.integration.domain.ClaimDiagnosis;
import com.cts.healthcare.integration.domain.ClaimHeader;
import com.cts.healthcare.integration.domain.ClaimMembers;
import com.cts.healthcare.integration.domain.ClaimProvider;
import com.cts.healthcare.integration.domain.ClaimServiceLine;
import com.cts.healthcare.integration.service.ClaimService;

@RestController
@RequestMapping("/")
public class ClaimHeaderController {

	private RestTemplate restTemplate = new RestTemplate();
	private String URL_SERVICEINFO;
	private String URL_HEADERINFO;

	@Autowired
	ClaimService claimService;

	ClaimHeaderController(@Value("${claim.header.service.endpoint.serviceinfo}") String URL_SERVICEINFO,
			@Value("${claim.header.service.endpoint.headerinfo}") String URL_HEADERINFO) {
		this.URL_SERVICEINFO = URL_SERVICEINFO;
		this.URL_HEADERINFO = URL_HEADERINFO;
	}

	@RequestMapping(value = "/headerserviceinfo", method = RequestMethod.GET)
	public String getServiceInfo() {
		return restTemplate.getForObject(URL_SERVICEINFO, String.class);
	}

	@RequestMapping(value = "/claim", method = RequestMethod.GET)
	public ClaimHeader getClaim() {
		ParameterizedTypeReference<Resource<ClaimHeader>> inHeader = new ParameterizedTypeReference<Resource<ClaimHeader>>() {
		};
		ResponseEntity<Resource<ClaimHeader>> response = restTemplate.exchange(
				RequestEntity.get(URI.create(this.URL_HEADERINFO)).accept(MediaTypes.HAL_JSON).build(), inHeader);
		assert response != null;
		if (response.getStatusCode() == HttpStatus.OK) {
			ClaimHeader outHeader = response.getBody().getContent();
			assert outHeader != null;
			return outHeader;
		}
		return new ClaimHeader();
	}

	@RequestMapping(value = "/claims/{claimId}", method = RequestMethod.GET)
	public Claim getClaimInfo(@PathVariable("claimId") String claimId,
			@RequestParam(name = "parts", required = false) List<String> parts) {
		return claimService.getClaimInfo(claimId, parts);

	}

	@RequestMapping(value = "/claims/{claimId}/header", method = RequestMethod.GET)
	public ClaimHeader getClaimHeader(@PathVariable("claimId") String claimId) {
		return claimService.getClaimHeader(claimId);
	}

	@RequestMapping(value = "/claims/{claimId}/serviceline", method = RequestMethod.GET)
	public ClaimServiceLine getClaimServiceLine(@PathVariable("claimId") String claimId) {
		return claimService.getClaimServiceLine(claimId);
	}
	
	@RequestMapping(value = "/claims/{claimId}/diagnosis", method = RequestMethod.GET)
	public ClaimDiagnosis getClaimDiagnosis(@PathVariable("claimId") String claimId) {
		return claimService.getClaimDiagnosis(claimId);
	}
	
	@RequestMapping(value = "/claims/{claimId}/cob", method = RequestMethod.GET)
	public ClaimCob getClaimCob(@PathVariable("claimId") String claimId) {
		return claimService.getClaimCob(claimId);
	}
	
	@RequestMapping(value = "/claims/{claimId}/members", method = RequestMethod.GET)
	public ClaimMembers getClaimMembers(@PathVariable("claimId") String claimId, @RequestParam(name = "parts", required = false) List<String> parts) {
		return claimService.getClaimMembers(claimId,parts);
	}
	
	@RequestMapping(value = "/claims/{claimId}/providers", method = RequestMethod.GET)
	public ClaimProvider getClaimProviders(@PathVariable("claimId") String claimId, @RequestParam(name = "parts", required = false) List<String> parts) {
		return claimService.getClaimProvider(claimId, parts);
	}
	
}
