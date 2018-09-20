package com.cts.healthcare.integration.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Configuration
@ConfigurationProperties(prefix = "claim.service.endpoint")
@Setter
@Getter
@ToString
public class ClaimClientProperty {

	private String serviceInfo;
	private String claimInfo;
	private String claimHeader;
	private String claimServiceline;
	private String claimCob;
	
	
	public String getServiceInfo() {
		return serviceInfo;
	}
	public void setServiceInfo(String serviceInfo) {
		this.serviceInfo = serviceInfo;
	}
	public String getClaimInfo() {
		return claimInfo;
	}
	public void setClaimInfo(String claimInfo) {
		this.claimInfo = claimInfo;
	}
	public String getClaimHeader() {
		return claimHeader;
	}
	public void setClaimHeader(String claimHeader) {
		this.claimHeader = claimHeader;
	}
	public String getClaimServiceline() {
		return claimServiceline;
	}
	public void setClaimServiceline(String claimServiceline) {
		this.claimServiceline = claimServiceline;
	}
	public String getClaimCob() {
		return claimCob;
	}
	public void setClaimCob(String claimCob) {
		this.claimCob = claimCob;
	}
	
	

}
