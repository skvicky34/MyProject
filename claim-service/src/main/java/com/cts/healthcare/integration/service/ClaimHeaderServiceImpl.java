package com.cts.healthcare.integration.service;

import org.springframework.stereotype.Service;
import com.cts.healthcare.integration.domain.Claim;
import com.cts.healthcare.integration.domain.ClaimCob;
import com.cts.healthcare.integration.domain.ClaimDiagnosis;
import com.cts.healthcare.integration.domain.ClaimHeader;
import com.cts.healthcare.integration.domain.ClaimServiceLine;

@Service("HeaderService")
public class ClaimHeaderServiceImpl implements ClaimService {
	@Override
	public String getInfo() {
		return "Claim Header Service.";
	}
	
	@Override
	public Claim getClaim(int id)
	{
		return new Claim();
	}
	
	@Override
	public ClaimHeader getClaimHeader(int id) {
		return null;
	}


	@Override
	public ClaimServiceLine getClaimServiceLine(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClaimDiagnosis getClaimDiagnosis(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClaimCob getClaimCob(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
