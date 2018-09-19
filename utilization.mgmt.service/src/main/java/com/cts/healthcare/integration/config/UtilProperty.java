package com.cts.healthcare.integration.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("facet")
public class UtilProperty {
	
	private String utilizationWsdl;	
	private String utilizationNameSpace;	
	private String configIdentity;	
	private String configRegion;	
	private int pages;	
	private int pageSize;	
	private int skipRows;
	
	
	public String getUtilizationWsdl() {
		return utilizationWsdl;
	}
	public void setProviderWsdl(String utilizationWsdl) {
		this.utilizationWsdl = utilizationWsdl;
	}
	public String getUtilizationNameSpace() {
		return utilizationNameSpace;
	}
	public void setProviderNameSpace(String utilizationNameSpace) {
		this.utilizationNameSpace = utilizationNameSpace;
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
