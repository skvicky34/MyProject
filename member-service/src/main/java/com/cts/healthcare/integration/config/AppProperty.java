/*package com.cts.healthcare.integration.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties("facet")
public class AppProperty {
	
	@Value("${service.claim.wsdl}")
	private String wsdlUrl;
	@Value("${service.claim.nameSpace}")
	private String nameSpace;
	@Value("${config.identity}")
	private String identity;
	@Value("${config.region}")
	private String region;
	@Value("${claimId.page}")
	private int page;
	@Value("${claimId.size}")
	private int pageSize;
	@Value("${claimId.skipRows}")
	private int skipRows;
	public String getWsdlUrl() {
		return wsdlUrl;
	}
	public void setWsdlUrl(String wsdlUrl) {
		this.wsdlUrl = wsdlUrl;
	}
	public String getNameSpace() {
		return nameSpace;
	}
	public void setNameSpace(String nameSpace) {
		this.nameSpace = nameSpace;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getSkipRows() {
		return skipRows;
	}
	public void setSkipRows(int skipRows) {
		this.skipRows = skipRows;
	}
	
	
	
	

}
*/