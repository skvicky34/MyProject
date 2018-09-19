package com.cts.healthcare.integration.controller;

import java.net.URI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cts.healthcare.integration.domain.Appeal;

@RestController
@RequestMapping("/")
public class AppealClientController {

	private final static Logger logger = LoggerFactory.getLogger(AppealClientController.class);
	private RestTemplate restTemplate;
	private String URL_APPEAL;
				
	AppealClientController(@Value("${claim.header.service.endpoint.serviceinfo}") String URL_APPEAL) {
		this.URL_APPEAL = URL_APPEAL;
		this.restTemplate = new RestTemplate();
	}

	@RequestMapping(value = "/appeal", method = RequestMethod.GET)
	public Appeal getClaim() {
			logger.info("Called Client getClaim() method" );
			ParameterizedTypeReference<Resource<Appeal>> responseType = new ParameterizedTypeReference<Resource<Appeal>>() {
			};
			ResponseEntity<Resource<Appeal>> response = restTemplate.exchange(
					RequestEntity.get(URI.create(this.URL_APPEAL)).accept(MediaTypes.HAL_JSON).build(), responseType);
			assert response != null;
			if (response.getStatusCode() == HttpStatus.OK) {
				Appeal outHeader = response.getBody().getContent();
				assert outHeader != null;
				return outHeader;
			}
			return new Appeal();
		}
	
}
