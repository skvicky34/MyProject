package com.cts.healthcare.integration.service;

import javax.xml.datatype.XMLGregorianCalendar;

import com.cts.healthcare.integration.domain.Authorization;
import com.cts.healthcare.integration.domain.Member;

public interface MemberService {
	
	public Member getMember(Long id);
	
	public Member getSubscriber(String id,String groupId,String memberSuffix,XMLGregorianCalendar asOfDate) ;

	public Authorization getUtilization(String id,XMLGregorianCalendar utilFromDate,XMLGregorianCalendar utilToDate,String reviewType);
		
}
