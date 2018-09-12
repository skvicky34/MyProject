package com.cts.healthcare.integration.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

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

import com.cts.healthcare.integration.domain.Member;
import com.cts.healthcare.integration.service.MemberService;

@RestController
@RequestMapping("/")
public class MemberHeaderController {

	private RestTemplate restTemplate;
	
	private String URL_MEMBERINFO;
	private String URL_SUBSCRIBERINFO;
	

	@Autowired
	MemberService claimService;

	MemberHeaderController(@Value("${member.service.endpoint.memberinfo}") String URL_MEMBERINFO,
			@Value("${member.service.endpoint.subscriberinfo}") String URL_SUBSCRIBERINFO) {
		this.URL_MEMBERINFO = URL_MEMBERINFO;
		this.URL_SUBSCRIBERINFO = URL_SUBSCRIBERINFO;
		this.restTemplate = new RestTemplate();
	}


	
	@RequestMapping(value = "/member", method = RequestMethod.GET)
	public Member getMember() {
		Member m = new Member();
		m.setFirstName("Test");
		return m;
	}
	
	@RequestMapping(value = "/members/{memberId}", method = RequestMethod.GET)
	public Member getMemberInfo(@PathVariable("memberId") String memberId) {
		 
		
		ParameterizedTypeReference<Resource<Member>> responseType = new ParameterizedTypeReference<Resource<Member>>() {
		};
		
		ResponseEntity<Resource<Member>> response = restTemplate.exchange(
				this.URL_MEMBERINFO, HttpMethod.GET, null,responseType, memberId);
				//RequestEntity.get(URI.create(this.URL_CLAIMINFO)).accept(MediaTypes.HAL_JSON).build(), inHeader);
		assert response != null;
		if (response.getStatusCode() == HttpStatus.OK) {
			Member outHeader = response.getBody().getContent();
			assert outHeader != null;
			return outHeader;
		}
		return new Member();
	}
	
	@RequestMapping(value = "/members/subscriber/{subscriberId}", method = RequestMethod.GET)
	public Member getSubscriberInfo(@PathVariable("subscriberId") String subscriberId,
			@RequestParam(name = "groupId", required = true) String groupId,
			@RequestParam(name = "memberSuffix", required = true) String memberSuffix,
			@RequestParam(name = "asOfDate", required = true) String asOfDate) {
		 
		
		ParameterizedTypeReference<Resource<Member>> responseType = new ParameterizedTypeReference<Resource<Member>>() {
		};
		
		    
		ResponseEntity<Resource<Member>> response = restTemplate.exchange(
				this.URL_SUBSCRIBERINFO, HttpMethod.GET, null,responseType, subscriberId, groupId,memberSuffix,asOfDate);
				//RequestEntity.get(URI.create(this.URL_CLAIMINFO)).accept(MediaTypes.HAL_JSON).build(), inHeader);
		assert response != null;
		if (response.getStatusCode() == HttpStatus.OK) {
			Member outHeader = response.getBody().getContent();
			assert outHeader != null;
			return outHeader;
		}
		return new Member();

	}
}