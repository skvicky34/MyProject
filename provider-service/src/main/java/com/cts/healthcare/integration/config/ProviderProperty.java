package com.cts.healthcare.integration.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("facet")
public class ProviderProperty {
	
	private String providerWsdl;	
	private String providerNameSpace;	
	private String configIdentity;	
	private String configRegion;	
	private int pages;	
	private int pageSize;	
	private int skipRows;
	
	
	public String getProviderWsdl() {
		return providerWsdl;
	}
	public void setProviderWsdl(String providerWsdl) {
		this.providerWsdl = providerWsdl;
	}
	public String getProviderNameSpace() {
		return providerNameSpace;
	}
	public void setProviderNameSpace(String providerNameSpace) {
		this.providerNameSpace = providerNameSpace;
	}
	public String getConfigIdentity() {
		return configIdentity;
	}
	public void setConfigIdentity(String configIdentity) {
		this.configIdentity = configIdentity;
	}
	public String getConfigRegion() {
		return configRegion;
	}
	public void setConfigRegion(String configRegion) {
		this.configRegion = configRegion;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
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
