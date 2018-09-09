package com.cts.healthcare.integration.service;

import com.cts.healthcare.integration.domain.Claim;
import com.cts.healthcare.integration.domain.ClaimCob;
import com.cts.healthcare.integration.domain.ClaimDiagnosis;
import com.cts.healthcare.integration.domain.ClaimHeader;
import com.cts.healthcare.integration.domain.ClaimServiceLine;

public interface ClaimService {
	public String getInfo();
	
	public Claim getClaim(String id, String partArray);
	
	public ClaimHeader getClaimHeader(String id) ;
	
	public ClaimServiceLine getClaimServiceLine(String id);

	public ClaimDiagnosis getClaimDiagnosis(String id);

	public ClaimCob getClaimCob(String id);	
		
}
