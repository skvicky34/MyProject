package com.cts.healthcare.integration.service;

import javax.xml.datatype.XMLGregorianCalendar;

import com.cts.healthcare.integration.domain.Member;

public interface MemberService {
	
	public Member getMember(Long id);
	
	public Member getSubscriber(Long id,String groupId,String memberSuffix,XMLGregorianCalendar asOfDate) ;

		
}
