package com.cts.healthcare.integration.domain;

import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

public class Member {

	private Long patientId;
	private String lastName;
	private String firstName;
	private Date dateOfBirth;
	private String genderCode;
	private long mothersMedicaidId;
	private String medicaidNumber;
	private String socialSecurityNumber;
	private String medicareNumber;
	private long caseNumber;
	private String healthInsuranceClaimNumber;
	private Date effectiveDate;
	private Date effectiveToDate;
	private String carrier;
	private String memberClass;
	private String insurerRelation;
	private String address;
	private String city;
	private String state;
	private String zip;
	
	public Long getPatientId() {
		return patientId;
	}
	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGenderCode() {
		return genderCode;
	}
	public void setGenderCode(String genderCode) {
		this.genderCode = genderCode;
	}
	public long getMothersMedicaidId() {
		return mothersMedicaidId;
	}
	public void setMothersMedicaidId(long mothersMedicaidId) {
		this.mothersMedicaidId = mothersMedicaidId;
	}
	public String getMedicaidNumber() {
		return medicaidNumber;
	}
	public void setMedicaidNumber(String medicaidNumber) {
		this.medicaidNumber = medicaidNumber;
	}
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public String getMedicareNumber() {
		return medicareNumber;
	}
	public void setMedicareNumber(String medicareNumber) {
		this.medicareNumber = medicareNumber;
	}
	public long getCaseNumber() {
		return caseNumber;
	}
	public void setCaseNumber(long caseNumber) {
		this.caseNumber = caseNumber;
	}
	public String getHealthInsuranceClaimNumber() {
		return healthInsuranceClaimNumber;
	}
	public void setHealthInsuranceClaimNumber(String healthInsuranceClaimNumber) {
		this.healthInsuranceClaimNumber = healthInsuranceClaimNumber;
	}
	public Date getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public Date getEffectiveToDate() {
		return effectiveToDate;
	}
	public void setEffectiveToDate(Date effectiveToDate) {
		this.effectiveToDate = effectiveToDate;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public String getMemberClass() {
		return memberClass;
	}
	public void setMemberClass(String memberClass) {
		this.memberClass = memberClass;
	}
	public String getInsurerRelation() {
		return insurerRelation;
	}
	public void setInsurerRelation(String insurerRelation) {
		this.insurerRelation = insurerRelation;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
}
