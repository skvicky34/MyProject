package com.cts.healthcare.integration.domain;

import java.math.BigDecimal;
import java.util.Date;

public class ClaimHeader {
	
	private String claimId;
	private String type;
	private String subType;
	private String claimStatus;
	private String code;
	private String description;
	private BigDecimal totalPayableAmount;
	private BigDecimal totalClaimChargeAmount;
	private Date statementFromDate;
	private Date statementToDate;
	private Date admissionDate;
	private Date receivedDate;
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
	private Date dischargedDate;
	private String dischargeHour;
	private String patientDischargeFacilityTypeCode;
	private String claimSubmissionType;
	private String classId;
	private String classPlanId;
	private String productId;
	private String productType;
	private String productCategory;
	private String businessCategory;
	private String networkId;
	
	
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
	public String getSubType() {
		return subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}
	public String getClaimStatus() {
		return claimStatus;
	}
	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getTotalPayableAmount() {
		return totalPayableAmount;
	}
	public void setTotalPayableAmount(BigDecimal totalPayableAmount) {
		this.totalPayableAmount = totalPayableAmount;
	}
	public BigDecimal getTotalClaimChargeAmount() {
		return totalClaimChargeAmount;
	}
	public void setTotalClaimChargeAmount(BigDecimal totalClaimChargeAmount) {
		this.totalClaimChargeAmount = totalClaimChargeAmount;
	}
	public Date getStatementFromDate() {
		return statementFromDate;
	}
	public void setStatementFromDate(Date statementFromDate) {
		this.statementFromDate = statementFromDate;
	}
	public Date getStatementToDate() {
		return statementToDate;
	}
	public void setStatementToDate(Date statementToDate) {
		this.statementToDate = statementToDate;
	}
	public Date getAdmissionDate() {
		return admissionDate;
	}
	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}
	public Date getReceivedDate() {
		return receivedDate;
	}
	public void setReceivedDate(Date receivedDate) {
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
	public Date getDischargedDate() {
		return dischargedDate;
	}
	public void setDischargedDate(Date dischargedDate) {
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
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public String getClassPlanId() {
		return classPlanId;
	}
	public void setClassPlanId(String classPlanId) {
		this.classPlanId = classPlanId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public String getBusinessCategory() {
		return businessCategory;
	}
	public void setBusinessCategory(String businessCategory) {
		this.businessCategory = businessCategory;
	}
	public String getNetworkId() {
		return networkId;
	}
	public void setNetworkId(String networkId) {
		this.networkId = networkId;
	}
	

}
