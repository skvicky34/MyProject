package com.cts.healthcare.integration.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="facet")

public class ClaimProperty {
	private String headerWsdl;
	private String servLineWsdl;
	private String headerNameSpace;
	private String servLineNameSpace;
	private String configIdentity;
	private String configRegion;
	private int pages;
	private int pageSize;
	private int skipRows;
	

	public String getHeaderWsdl() {
		return headerWsdl;
	}

	public void setHeaderWsdl(String headerWsdl) {
		this.headerWsdl = headerWsdl;
	}

	public String getServLineWsdl() {
		return servLineWsdl;
	}

	public void setServLineWsdl(String servLineWsdl) {
		this.servLineWsdl = servLineWsdl;
	}

	public String getHeaderNameSpace() {
		return headerNameSpace;
	}

	public void setHeaderNameSpace(String headerNameSpace) {
		this.headerNameSpace = headerNameSpace;
	}

	public String getServLineNameSpace() {
		return servLineNameSpace;
	}

	public void setServLineNameSpace(String servLineNameSpace) {
		this.servLineNameSpace = servLineNameSpace;
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

