package com.cts.healthcare.integration.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

public class ClaimHeader {
	private String claimId;
	private String type;
	private BigDecimal totalClaimChargeAmount;
	private XMLGregorianCalendar statementFromDate;
	private XMLGregorianCalendar statementToDate;
	private XMLGregorianCalendar admissionDate;
	private XMLGregorianCalendar receivedDate;
	private String crossReferenceClaimNumber;
	private String businessType;
	private String carrier;
	private String specialProgramIndicator;
	private String frequencyCode;
	private String DRGCode;
	private String billType;
	private String principalDiagnosis;
	private String admissionSourceCode;
	private String admissionTypeCode;
	private String admissionTime;
	private XMLGregorianCalendar dischargedDate;
	private String dischargeHour;
	private String patientDischargeFacilityTypeCode;
	private String claimSubmissionType;
	public String getClaimId() {
		return claimId;
	}
	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public BigDecimal getTotalClaimChargeAmount() {
		return totalClaimChargeAmount;
	}
	public void setTotalClaimChargeAmount(BigDecimal totalClaimChargeAmount) {
		this.totalClaimChargeAmount = totalClaimChargeAmount;
	}
	public XMLGregorianCalendar getStatementFromDate() {
		return statementFromDate;
	}
	public void setStatementFromDate(XMLGregorianCalendar statementFromDate) {
		this.statementFromDate = statementFromDate;
	}
	public XMLGregorianCalendar getStatementToDate() {
		return statementToDate;
	}
	public void setStatementToDate(XMLGregorianCalendar statementToDate) {
		this.statementToDate = statementToDate;
	}
	public XMLGregorianCalendar getAdmissionDate() {
		return admissionDate;
	}
	public void setAdmissionDate(XMLGregorianCalendar admissionDate) {
		this.admissionDate = admissionDate;
	}
	public XMLGregorianCalendar getReceivedDate() {
		return receivedDate;
	}
	public void setReceivedDate(XMLGregorianCalendar receivedDate) {
		this.receivedDate = receivedDate;
	}
	public String getCrossReferenceClaimNumber() {
		return crossReferenceClaimNumber;
	}
	public void setCrossReferenceClaimNumber(String crossReferenceClaimNumber) {
		this.crossReferenceClaimNumber = crossReferenceClaimNumber;
	}
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public String getSpecialProgramIndicator() {
		return specialProgramIndicator;
	}
	public void setSpecialProgramIndicator(String specialProgramIndicator) {
		this.specialProgramIndicator = specialProgramIndicator;
	}
	public String getFrequencyCode() {
		return frequencyCode;
	}
	public void setFrequencyCode(String frequencyCode) {
		this.frequencyCode = frequencyCode;
	}
	public String getDRGCode() {
		return DRGCode;
	}
	public void setDRGCode(String dRGCode) {
		DRGCode = dRGCode;
	}
	public String getBillType() {
		return billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}
	public String getPrincipalDiagnosis() {
		return principalDiagnosis;
	}
	public void setPrincipalDiagnosis(String principalDiagnosis) {
		this.principalDiagnosis = principalDiagnosis;
	}
	public String getAdmissionSourceCode() {
		return admissionSourceCode;
	}
	public void setAdmissionSourceCode(String admissionSourceCode) {
		this.admissionSourceCode = admissionSourceCode;
	}
	public String getAdmissionTypeCode() {
		return admissionTypeCode;
	}
	public void setAdmissionTypeCode(String admissionTypeCode) {
		this.admissionTypeCode = admissionTypeCode;
	}
	public String getAdmissionTime() {
		return admissionTime;
	}
	public void setAdmissionTime(String admissionTime) {
		this.admissionTime = admissionTime;
	}
	public XMLGregorianCalendar getDischargedDate() {
		return dischargedDate;
	}
	public void setDischargedDate(XMLGregorianCalendar dischargedDate) {
		this.dischargedDate = dischargedDate;
	}
	public String getDischargeHour() {
		return dischargeHour;
	}
	public void setDischargeHour(String dischargeHour) {
		this.dischargeHour = dischargeHour;
	}
	public String getPatientDischargeFacilityTypeCode() {
		return patientDischargeFacilityTypeCode;
	}
	public void setPatientDischargeFacilityTypeCode(String patientDischargeFacilityTypeCode) {
		this.patientDischargeFacilityTypeCode = patientDischargeFacilityTypeCode;
	}
	public String getClaimSubmissionType() {
		return claimSubmissionType;
	}
	public void setClaimSubmissionType(String claimSubmissionType) {
		this.claimSubmissionType = claimSubmissionType;
	}
	
	 


}
