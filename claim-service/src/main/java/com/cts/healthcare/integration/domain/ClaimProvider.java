package com.cts.healthcare.integration.domain;

public class ClaimProvider {

	private String billingProviderId;
	private String renderingProviderId;
	private String attendingProviderId;
	private String operatingProviderId;
	private String OperatingProviderNPI;
	private String OperatingProviderTaxID;
	private String referingProviderNPI;
	private String referingProviderTaxID;
	private String serviceFacilityProviderID;
	private String serviceFacilityNPI;
	private String serviceFacilityTaxID;
	
	
	public String getBillingProviderId() {
		return billingProviderId;
	}
	public void setBillingProviderId(String billingProviderId) {
		this.billingProviderId = billingProviderId;
	}
	public String getRenderingProviderId() {
		return renderingProviderId;
	}
	public void setRenderingProviderId(String renderingProviderId) {
		this.renderingProviderId = renderingProviderId;
	}
	public String getAttendingProviderId() {
		return attendingProviderId;
	}
	public void setAttendingProviderId(String attendingProviderId) {
		this.attendingProviderId = attendingProviderId;
	}
	public String getOperatingProviderId() {
		return operatingProviderId;
	}
	public void setOperatingProviderId(String operatingProviderId) {
		this.operatingProviderId = operatingProviderId;
	}
	public String getOperatingProviderNPI() {
		return OperatingProviderNPI;
	}
	public void setOperatingProviderNPI(String operatingProviderNPI) {
		OperatingProviderNPI = operatingProviderNPI;
	}
	public String getOperatingProviderTaxID() {
		return OperatingProviderTaxID;
	}
	public void setOperatingProviderTaxID(String operatingProviderTaxID) {
		OperatingProviderTaxID = operatingProviderTaxID;
	}
	public String getReferingProviderNPI() {
		return referingProviderNPI;
	}
	public void setReferingProviderNPI(String referingProviderNPI) {
		this.referingProviderNPI = referingProviderNPI;
	}
	public String getReferingProviderTaxID() {
		return referingProviderTaxID;
	}
	public void setReferingProviderTaxID(String referingProviderTaxID) {
		this.referingProviderTaxID = referingProviderTaxID;
	}
	public String getServiceFacilityProviderID() {
		return serviceFacilityProviderID;
	}
	public void setServiceFacilityProviderID(String serviceFacilityProviderID) {
		this.serviceFacilityProviderID = serviceFacilityProviderID;
	}
	public String getServiceFacilityNPI() {
		return serviceFacilityNPI;
	}
	public void setServiceFacilityNPI(String serviceFacilityNPI) {
		this.serviceFacilityNPI = serviceFacilityNPI;
	}
	public String getServiceFacilityTaxID() {
		return serviceFacilityTaxID;
	}
	public void setServiceFacilityTaxID(String serviceFacilityTaxID) {
		this.serviceFacilityTaxID = serviceFacilityTaxID;
	}
	
	
}
