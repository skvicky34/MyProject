package com.cts.healthcare.integration.service;

import com.cts.healthcare.integration.domain.Claim;
import com.cts.healthcare.integration.domain.ClaimCob;
import com.cts.healthcare.integration.domain.ClaimDiagnosis;
import com.cts.healthcare.integration.domain.ClaimHeader;
import com.cts.healthcare.integration.domain.ClaimServiceLine;

public interface ClaimService {
	public String getInfo();
	
	public Claim getClaim(int id);
	
	public ClaimHeader getClaimHeader(int id) ;
	
	public ClaimServiceLine getClaimServiceLine(int id);

	public ClaimDiagnosis getClaimDiagnosis(int id);

	public ClaimCob getClaimCob(int id);	
		
}
