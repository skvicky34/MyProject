package com.cts.healthcare.integration.domain;

public class ClaimDiagnosis {

	private String diagnosisCodeVersion;
	private String diagnosisDescription;

	public String getDiagnosisCodeVersion() {
		return diagnosisCodeVersion;
	}

	public void setDiagnosisCodeVersion(String diagnosisCodeVersion) {
		this.diagnosisCodeVersion = diagnosisCodeVersion;
	}

	public String getDiagnosisDescription() {
		return diagnosisDescription;
	}

	public void setDiagnosisDescription(String diagnosisDescription) {
		this.diagnosisDescription = diagnosisDescription;
	}

}
