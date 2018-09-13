package com.cts.healthcare.integration.domain;

import java.math.BigDecimal;
import java.util.Date;

public class ClaimServiceLine {
	
	private String claimId;
	private int lineNumber;
	private String serviceToDate;
	private String serviceFromDate;
	private String placeOfService;
	private String conditionCode;
	private String procedureCodes;
	private String serviceLineRevenueCode;
	private String status;
	private String allPendCodes;
	private String paidDate;
	private String operator;
	private String transactionDate;
	private BigDecimal chargeAmount;
	private BigDecimal totalClaimAllowedAmount;
	private int nonCoveredChargeAmount;
	private BigDecimal patientPaidAmount;
	private BigDecimal deductibleAmount;
	private BigDecimal coinsuranceAmount;
	private BigDecimal CopayAmount;
	private BigDecimal discountAmount;
	private BigDecimal riskAmt;
	private String fundAmt;
	private String promptPay;
	private String interestAmount;
	private String savingAmount;
	private String benefitCode;
	private String payServiceCode;
	private String conditionReferalIndicator;
	private String treatmentType;
	private String serviceModifiers;
	private String priorAuthorization;
	private String causeOfillness;
	private String anesthesiaUnitCount;
	private String minutes;
	private int units;
	private String DRGCode;
	private String nationalDrugUnitCount;
	private String NDCBaseMeasure;
	private String NDCPrice;
	private String NDCPrescriptionQualifier;
	private String prescriptionNumber;
	private String prescriptionDate;
	private String suppNote;
	private String serviceNotes;
	private String feeSchedule;
	private ClaimDiagnosis claimDiagnosis;
	
	
	
	
	
	public String getClaimId() {
		return claimId;
	}
	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}
	public int getLineNumber() {
		return lineNumber;
	}
	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	public String getServiceToDate() {
		return serviceToDate;
	}
	public void setServiceToDate(String serviceToDate) {
		this.serviceToDate = serviceToDate;
	}
	public String getServiceFromDate() {
		return serviceFromDate;
	}
	public void setServiceFromDate(String serviceFromDate) {
		this.serviceFromDate = serviceFromDate;
	}
	public String getPlaceOfService() {
		return placeOfService;
	}
	public void setPlaceOfService(String placeOfService) {
		this.placeOfService = placeOfService;
	}
	public String getConditionCode() {
		return conditionCode;
	}
	public void setConditionCode(String conditionCode) {
		this.conditionCode = conditionCode;
	}
	public String getProcedureCodes() {
		return procedureCodes;
	}
	public void setProcedureCodes(String procedureCodes) {
		this.procedureCodes = procedureCodes;
	}
	public String getServiceLineRevenueCode() {
		return serviceLineRevenueCode;
	}
	public void setServiceLineRevenueCode(String serviceLineRevenueCode) {
		this.serviceLineRevenueCode = serviceLineRevenueCode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAllPendCodes() {
		return allPendCodes;
	}
	public void setAllPendCodes(String allPendCodes) {
		this.allPendCodes = allPendCodes;
	}
	public String getPaidDate() {
		return paidDate;
	}
	public void setPaidDate(String paidDate) {
		this.paidDate = paidDate;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public BigDecimal getChargeAmount() {
		return chargeAmount;
	}
	public void setChargeAmount(BigDecimal chargeAmount) {
		this.chargeAmount = chargeAmount;
	}
	public BigDecimal getTotalClaimAllowedAmount() {
		return totalClaimAllowedAmount;
	}
	public void setTotalClaimAllowedAmount(BigDecimal totalClaimAllowedAmount) {
		this.totalClaimAllowedAmount = totalClaimAllowedAmount;
	}
	public int getNonCoveredChargeAmount() {
		return nonCoveredChargeAmount;
	}
	public void setNonCoveredChargeAmount(int nonCoveredChargeAmount) {
		this.nonCoveredChargeAmount = nonCoveredChargeAmount;
	}
	public BigDecimal getPatientPaidAmount() {
		return patientPaidAmount;
	}
	public void setPatientPaidAmount(BigDecimal patientPaidAmount) {
		this.patientPaidAmount = patientPaidAmount;
	}
	public BigDecimal getDeductibleAmount() {
		return deductibleAmount;
	}
	public void setDeductibleAmount(BigDecimal deductibleAmount) {
		this.deductibleAmount = deductibleAmount;
	}
	public BigDecimal getCoinsuranceAmount() {
		return coinsuranceAmount;
	}
	public void setCoinsuranceAmount(BigDecimal coinsuranceAmount) {
		this.coinsuranceAmount = coinsuranceAmount;
	}
	public BigDecimal getCopayAmount() {
		return CopayAmount;
	}
	public void setCopayAmount(BigDecimal copayAmount) {
		CopayAmount = copayAmount;
	}
	public BigDecimal getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(BigDecimal discountAmount) {
		this.discountAmount = discountAmount;
	}
	public BigDecimal getRiskAmt() {
		return riskAmt;
	}
	public void setRiskAmt(BigDecimal riskAmt) {
		this.riskAmt = riskAmt;
	}
	public String getFundAmt() {
		return fundAmt;
	}
	public void setFundAmt(String fundAmt) {
		this.fundAmt = fundAmt;
	}
	public String getPromptPay() {
		return promptPay;
	}
	public void setPromptPay(String promptPay) {
		this.promptPay = promptPay;
	}
	public String getInterestAmount() {
		return interestAmount;
	}
	public void setInterestAmount(String interestAmount) {
		this.interestAmount = interestAmount;
	}
	public String getSavingAmount() {
		return savingAmount;
	}
	public void setSavingAmount(String savingAmount) {
		this.savingAmount = savingAmount;
	}
	public String getBenefitCode() {
		return benefitCode;
	}
	public void setBenefitCode(String benefitCode) {
		this.benefitCode = benefitCode;
	}
	public String getPayServiceCode() {
		return payServiceCode;
	}
	public void setPayServiceCode(String payServiceCode) {
		this.payServiceCode = payServiceCode;
	}
	public String getConditionReferalIndicator() {
		return conditionReferalIndicator;
	}
	public void setConditionReferalIndicator(String conditionReferalIndicator) {
		this.conditionReferalIndicator = conditionReferalIndicator;
	}
	public String getTreatmentType() {
		return treatmentType;
	}
	public void setTreatmentType(String treatmentType) {
		this.treatmentType = treatmentType;
	}
	public String getServiceModifiers() {
		return serviceModifiers;
	}
	public void setServiceModifiers(String serviceModifiers) {
		this.serviceModifiers = serviceModifiers;
	}
	public String getPriorAuthorization() {
		return priorAuthorization;
	}
	public void setPriorAuthorization(String priorAuthorization) {
		this.priorAuthorization = priorAuthorization;
	}
	public String getCauseOfillness() {
		return causeOfillness;
	}
	public void setCauseOfillness(String causeOfillness) {
		this.causeOfillness = causeOfillness;
	}
	public String getAnesthesiaUnitCount() {
		return anesthesiaUnitCount;
	}
	public void setAnesthesiaUnitCount(String anesthesiaUnitCount) {
		this.anesthesiaUnitCount = anesthesiaUnitCount;
	}
	public String getMinutes() {
		return minutes;
	}
	public void setMinutes(String minutes) {
		this.minutes = minutes;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public String getDRGCode() {
		return DRGCode;
	}
	public void setDRGCode(String dRGCode) {
		DRGCode = dRGCode;
	}
	public String getNationalDrugUnitCount() {
		return nationalDrugUnitCount;
	}
	public void setNationalDrugUnitCount(String nationalDrugUnitCount) {
		this.nationalDrugUnitCount = nationalDrugUnitCount;
	}
	public String getNDCBaseMeasure() {
		return NDCBaseMeasure;
	}
	public void setNDCBaseMeasure(String nDCBaseMeasure) {
		NDCBaseMeasure = nDCBaseMeasure;
	}
	public String getNDCPrice() {
		return NDCPrice;
	}
	public void setNDCPrice(String nDCPrice) {
		NDCPrice = nDCPrice;
	}
	public String getNDCPrescriptionQualifier() {
		return NDCPrescriptionQualifier;
	}
	public void setNDCPrescriptionQualifier(String nDCPrescriptionQualifier) {
		NDCPrescriptionQualifier = nDCPrescriptionQualifier;
	}
	public String getPrescriptionNumber() {
		return prescriptionNumber;
	}
	public void setPrescriptionNumber(String prescriptionNumber) {
		this.prescriptionNumber = prescriptionNumber;
	}
	public String getPrescriptionDate() {
		return prescriptionDate;
	}
	public void setPrescriptionDate(String prescriptionDate) {
		this.prescriptionDate = prescriptionDate;
	}
	public String getSuppNote() {
		return suppNote;
	}
	public void setSuppNote(String suppNote) {
		this.suppNote = suppNote;
	}
	public String getServiceNotes() {
		return serviceNotes;
	}
	public void setServiceNotes(String serviceNotes) {
		this.serviceNotes = serviceNotes;
	}
	public String getFeeSchedule() {
		return feeSchedule;
	}
	public void setFeeSchedule(String feeSchedule) {
		this.feeSchedule = feeSchedule;
	}
	public ClaimDiagnosis getClaimDiagnosis() {
		return claimDiagnosis;
	}
	public void setClaimDiagnosis(ClaimDiagnosis claimDiagnosis) {
		this.claimDiagnosis = claimDiagnosis;
	}
		
}