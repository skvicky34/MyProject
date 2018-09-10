package com.cts.healthcare.integration.domain;

import java.math.BigDecimal;

public class ClaimCob {
	
	private BigDecimal otherPayerAllowable;
	private BigDecimal otherPayerPaid;
	private String serviceLine;
	private String otherPayerId;
	private String otherPayerCoinInsurance;
	private String otherPayerCopay;
	private String otherPayerDeduct;
	private String medicarePay;
	private String medicareApplied;
	
	public BigDecimal getOtherPayerAllowable() {
		return otherPayerAllowable;
	}
	public void setOtherPayerAllowable(BigDecimal otherPayerAllowable) {
		this.otherPayerAllowable = otherPayerAllowable;
	}
	public BigDecimal getOtherPayerPaid() {
		return otherPayerPaid;
	}
	public void setOtherPayerPaid(BigDecimal otherPayerPaid) {
		this.otherPayerPaid = otherPayerPaid;
	}
	public String getServiceLine() {
		return serviceLine;
	}
	public void setServiceLine(String serviceLine) {
		this.serviceLine = serviceLine;
	}
	public String getOtherPayerId() {
		return otherPayerId;
	}
	public void setOtherPayerId(String otherPayerId) {
		this.otherPayerId = otherPayerId;
	}
	public String getOtherPayerCoinInsurance() {
		return otherPayerCoinInsurance;
	}
	public void setOtherPayerCoinInsurance(String otherPayerCoinInsurance) {
		this.otherPayerCoinInsurance = otherPayerCoinInsurance;
	}
	public String getOtherPayerCopay() {
		return otherPayerCopay;
	}
	public void setOtherPayerCopay(String otherPayerCopay) {
		this.otherPayerCopay = otherPayerCopay;
	}
	public String getOtherPayerDeduct() {
		return otherPayerDeduct;
	}
	public void setOtherPayerDeduct(String otherPayerDeduct) {
		this.otherPayerDeduct = otherPayerDeduct;
	}
	public String getMedicarePay() {
		return medicarePay;
	}
	public void setMedicarePay(String medicarePay) {
		this.medicarePay = medicarePay;
	}
	public String getMedicareApplied() {
		return medicareApplied;
	}
	public void setMedicareApplied(String medicareApplied) {
		this.medicareApplied = medicareApplied;
	}
	
	
	
	

}
