package com.cts.healthcare.integration.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.healthcare.integration.domain.Authorization;
import com.cts.healthcare.integration.domain.Member;
import com.cts.healthcare.integration.service.MemberService;

@Controller
@RequestMapping("/")
public class MemberServiceController {

	private final static Logger LOGGER = LoggerFactory.getLogger(MemberServiceController.class);

	private final MemberService memberService;

	public MemberServiceController(MemberService memberService) {
		this.memberService = memberService;
	}

	/**
	 *
	 * API method to retrieve Member Info
	 **/
	@RequestMapping("/members/{memberId}")
	public ResponseEntity<Member> getMember(@PathVariable("memberId") Long id) {
		LOGGER.info("in MemberServiceController getMember()");
		return new ResponseEntity<Member>(memberService.getMember(id), HttpStatus.OK);
	}

	/**
	 *
	 * API method to retrieve Subscriber Info
	 **/
	@RequestMapping("/members/subscriber/{subscriberId}")
	public ResponseEntity<Member> getSubscriber(@PathVariable("subscriberId") String id,
			@RequestParam(name = "groupId", required = true) String groupId,
			@RequestParam(name = "memberSuffix", required = true) String memberSuffix,
			@RequestParam(name = "asOfDate", required = true) String asOfDate) {
		LOGGER.info("in MemberServiceController getSubscriber()");
		return new ResponseEntity<Member>(
				memberService.getSubscriber(id, groupId, memberSuffix, convertStringToXMLGC(asOfDate,"yyyyMMdd")), HttpStatus.OK);
	}

	/**
	 *
	 * API method to retrieve Utilization Info
	 **/
	@RequestMapping("/members/{memberId}/auth")
	public ResponseEntity<Authorization> getUtilization(@PathVariable("memberId") String memberId,
			@RequestParam(name = "fromDate", required = true) String utilFromDate,
			@RequestParam(name = "toDate", required = true) String utilToDate,
			@RequestParam(name = "reviewType", required = false) String reviewType) {
		LOGGER.info("in MemberServiceController getUtilization()");

		return new ResponseEntity<Authorization>(memberService.getUtilization(memberId,
				convertStringToXMLGC(utilFromDate,"yyyy-MM-dd"), convertStringToXMLGC(utilToDate,"yyyy-MM-dd"), reviewType), HttpStatus.OK);
	}

	/**
	 *
	 * Utility method to convert from String to XMLGregorianCalendar format
	 **/
	private XMLGregorianCalendar convertStringToXMLGC(String strDate,String dateFormat) {
		LOGGER.info("in MemberServiceController convertStringToXMLGC()");

		DateFormat format = new SimpleDateFormat(dateFormat);
		Date date = new Date();
		XMLGregorianCalendar xmlGregCal = null;
		try {
			date = format.parse(strDate);
			GregorianCalendar cal = new GregorianCalendar();
			cal.setTime(date);

			xmlGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}

		return xmlGregCal;
	}

}