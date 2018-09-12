package com.cts.healthcare.integration.service;



import org.springframework.stereotype.Service;

import com.cts.healthcare.integration.domain.Member;


@Service
public class MemberService {

//@Autowired
//Claim claim;
	
	public Member getMemberInfo(String memberId,String type)
	{
		Member member = new Member();
		//member.setMemberId(memberId);
		return member;
	}
	


	

}
