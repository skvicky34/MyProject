package com.cts.healthcare.integration.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("facet")
public class MemberProperty {
	
	private String memberWsdl;	
	private String memberNameSpace;	
	private String subscrNameSpace;
	private String utilizationWsdl;	
	private String utilizationNameSpace;	
	private String configIdentity;	
	private String configRegion;	
	private int pages;	
	private int pageSize;	
	private int skipRows;
	
	
	public String getMemberWsdl() {
		return memberWsdl;
	}
	public void setMemberWsdl(String memberWsdl) {
		this.memberWsdl = memberWsdl;
	}
	public String getMemberNameSpace() {
		return memberNameSpace;
	}
	public void setMemberNameSpace(String memberNameSpace) {
		this.memberNameSpace = memberNameSpace;
	}
	public String getSubscrNameSpace() {
		return subscrNameSpace;
	}
	public void setSubscrNameSpace(String subscrNameSpace) {
		this.subscrNameSpace = subscrNameSpace;
	}
	public String getUtilizationWsdl() {
		return utilizationWsdl;
	}
	public void setUtilizationWsdl(String utilizationWsdl) {
		this.utilizationWsdl = utilizationWsdl;
	}
	public String getUtilizationNameSpace() {
		return utilizationNameSpace;
	}
	public void setUtilizationNameSpace(String utilizationNameSpace) {
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
