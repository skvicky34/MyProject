package com.cts.healthcare.integration.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

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

import com.cts.healthcare.integration.domain.Member;
import com.cts.healthcare.integration.service.MemberService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
public class MemberServiceController {


	@Autowired
	@Qualifier("HeaderService")
	private MemberService headerService;

	private final static Logger logger = LoggerFactory.getLogger(MemberServiceController.class);

	/**
	*
	* API method to retrieve Member Info
	**/
	@RequestMapping("/members/{memberId}")
	public ResponseEntity<Member> getMember(@PathVariable("memberId") Long id) {
		logger.info("in Service Controller getMember()");
		ObjectMapper mapper = new ObjectMapper();
		Member member = new Member();
		try {
			mapper.writeValueAsString(member);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}		
		return new ResponseEntity<Member>(headerService.getMember(id), HttpStatus.OK);
	}
	
	/**
	*
	* API method to retrieve Subscriber Info
	**/
	@RequestMapping("/members/subscriber/{subscriberId}")
	public ResponseEntity<Member> getSubscriber(@PathVariable("subscriberId") Long id,
			@RequestParam(name="groupId", required=true) String groupId,
			@RequestParam(name="memberSuffix", required=true) String memberSuffix,
			@RequestParam(name="asOfDate", required=true) String asOfDate) {	
		logger.info("in Service Controller getSubscriber()");
		ObjectMapper mapper = new ObjectMapper();
		Member member = new Member();
		try {
			mapper.writeValueAsString(member);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}		
		return new ResponseEntity<Member>(headerService.getSubscriber(id,groupId,memberSuffix,convertStringToXMLGC(asOfDate)), HttpStatus.OK);
	}
	
	/**
	*
	* Utility method to convert from String to XMLGregorianCalendar format
	**/
	public XMLGregorianCalendar convertStringToXMLGC(String strDate)
	{
		DateFormat format = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		XMLGregorianCalendar xmlGregCal = null;
		try {
			date = format.parse(strDate);
			GregorianCalendar cal = new GregorianCalendar();
			cal.setTime(date);

			xmlGregCal =  DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return xmlGregCal;
	}
	
}