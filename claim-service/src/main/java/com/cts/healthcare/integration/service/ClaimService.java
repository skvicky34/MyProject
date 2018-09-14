package com.cts.healthcare.integration.service;

import java.util.List;

import com.cts.healthcare.integration.domain.Claim;
import com.cts.healthcare.integration.domain.ClaimCob;
import com.cts.healthcare.integration.domain.ClaimServiceLine;

public interface ClaimService {
	
	public String getInfo();
	
	public Claim getClaim(String id, String parts);
	
	public Claim getClaimHeader(String id) ;
	
	public List<ClaimServiceLine> getClaimServiceLine(String id);

	public ClaimCob getClaimCob(String id);

		
}
