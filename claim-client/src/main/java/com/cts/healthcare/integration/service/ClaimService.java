/*package com.cts.healthcare.integration.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.cts.healthcare.integration.domain.Claim;
import com.cts.healthcare.integration.domain.ClaimCob;
import com.cts.healthcare.integration.domain.ClaimDiagnosis;
import com.cts.healthcare.integration.domain.ClaimHeader;
import com.cts.healthcare.integration.domain.ClaimMembers;
import com.cts.healthcare.integration.domain.ClaimProvider;
import com.cts.healthcare.integration.domain.ClaimServiceLine;


@Service
public class ClaimService {

	
	public Claim getClaimInfo(String claimId, List<String> parts)
	{
		Claim claim = new Claim();
		claim.setClaimId(claimId);
		claim.setParts(parts);
		return claim;
	}
	

	public ClaimHeader getClaimHeader(String claimId)
	{	
		Claim clm = new Claim();
		clm.setClaimId(claimId);
		return new ClaimHeader();
	}
	
	public ClaimServiceLine getClaimServiceLine(String claimId)
	{	
		Claim clm = new Claim();
		clm.setClaimId(claimId);
		return new ClaimServiceLine();
	}
	
	public ClaimDiagnosis getClaimDiagnosis(String claimId)
	{	
		Claim clm = new Claim();
		clm.setClaimId(claimId);
		return new ClaimDiagnosis();
	}
	
	public ClaimCob getClaimCob(String claimId)
	{	
		Claim clm = new Claim();
		clm.setClaimId(claimId);
		return new ClaimCob();
	}
	
	public ClaimMembers getClaimMembers(String claimId, List<String> parts)
	{	
		Claim clm = new Claim();
		clm.setClaimId(claimId);
		clm.setParts(parts);
		return new ClaimMembers();
	}
	
	public ClaimProvider getClaimProvider(String claimId, List<String> parts)
	{	
		Claim clm = new Claim();
		clm.setClaimId(claimId);
		clm.setParts(parts);
		return new ClaimProvider();
	}
	

}
*/