package com.cts.healthcare.integration.domain;

import java.util.List;

public class Claim {

	private String claimId;
	
	private List<String> parts;
	private ClaimHeader claimHeader;
	private ClaimServiceLine claimServiceLine;
	private ClaimDiagnosis claimDiagnosis;
	private ClaimCob claimCob;
	private ClaimMembers claimMembers;
	private ClaimProvider claimProvider;
	
	
	public ClaimMembers getClaimMembers() {
		return claimMembers;
	}
	public void setClaimMembers(ClaimMembers claimMembers) {
		this.claimMembers = claimMembers;
	}
	public ClaimProvider getClaimProvider() {
		return claimProvider;
	}
	public void setClaimProvider(ClaimProvider claimProvider) {
		this.claimProvider = claimProvider;
	}
	public ClaimServiceLine getClaimServiceLine() {
		return claimServiceLine;
	}
	public void setClaimServiceLine(ClaimServiceLine claimServiceLine) {
		this.claimServiceLine = claimServiceLine;
	}
	public ClaimDiagnosis getClaimDiagnosis() {
		return claimDiagnosis;
	}
	public void setClaimDiagnosis(ClaimDiagnosis claimDiagnosis) {
		this.claimDiagnosis = claimDiagnosis;
	}
	public ClaimCob getClaimCob() {
		return claimCob;
	}
	public void setClaimCob(ClaimCob claimCob) {
		this.claimCob = claimCob;
	}
	public String getClaimId() {
		return claimId;
	}
	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}
	public List<String> getParts() {
		return parts;
	}
	public void setParts(List<String> parts) {
		this.parts = parts;
	}
	public ClaimHeader getClaimHeader() {
		return claimHeader;
	}
	public void setClaimHeader(ClaimHeader claimHeader) {
		this.claimHeader = claimHeader;
	}
	
	
}
