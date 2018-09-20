package com.cts.healthcare.integration.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

import com.cts.healthcare.integration.client.WebServiceConnector;
import com.cts.healthcare.integration.config.ClaimProperty;
import com.cts.healthcare.integration.domain.Claim;
import com.cts.healthcare.integration.domain.ClaimCob;
import com.cts.healthcare.integration.domain.ClaimDiagnosis;
import com.cts.healthcare.integration.domain.ClaimHeader;
import com.cts.healthcare.integration.domain.ClaimMembers;
import com.cts.healthcare.integration.domain.ClaimProvider;
import com.cts.healthcare.integration.domain.ClaimServiceLine;
import com.trizetto.fxi.isl.fawsvcinplistclaim_v11.ArrayOfRECCLCL;
import com.trizetto.fxi.isl.fawsvcinplistclaim_v11.Config;
import com.trizetto.fxi.isl.fawsvcinplistclaim_v11.ListClaimV11ClaimId;
import com.trizetto.fxi.isl.fawsvcinplistclaim_v11.ListClaimV11ClaimIdResponse;
import com.trizetto.fxi.isl.fawsvcinplistclaim_v11.RECCLCL;
import com.trizetto.fxi.isl.fawsvcinplistclaimcdml_v9.ArrayOfRECCDML;
import com.trizetto.fxi.isl.fawsvcinplistclaimcdml_v9.ListClaimCDMLV9ClaimId;
import com.trizetto.fxi.isl.fawsvcinplistclaimcdml_v9.ListClaimCDMLV9ClaimIdResponse;
import com.trizetto.fxi.isl.fawsvcinplistclaimcdml_v9.RECCDML;

@Service("claimService")
@EnableConfigurationProperties(ClaimProperty.class)

public class ClaimHeaderServiceImpl implements ClaimService {

	public static final Logger LOGGER = LoggerFactory.getLogger(ClaimHeaderServiceImpl.class);

	private WebServiceConnector webServiceConnector;
	private ClaimProperty claimProperty;

	public ClaimHeaderServiceImpl(WebServiceConnector webServiceConnector, ClaimProperty claimProperty) {
		this.webServiceConnector = webServiceConnector;
		this.claimProperty = claimProperty;
	}
	
	@Override
	public String getInfo() {
		return "Claim Header Service.";
	}

	/**
	 * Method to get claim based on the parts
	 * 
	 * @param id
	 * @param partArray
	 * @return
	 */
	public Map<String, Object> getClaimParts(String claimId, String[] partArray) {
		LOGGER.info("in ClaimHeaderServiceImpl getClaimParts() method");
		Map<String, Object> claimPartsMap = new LinkedHashMap<>();
		if (partArray != null) {

			for (String partType : partArray) {
				if ("header".equalsIgnoreCase(partType)) {
					claimPartsMap.put(partType, getClaim(claimId).getClaimHeader());
				} else if ("servicelines".equalsIgnoreCase(partType)) {
					claimPartsMap.put(partType, getClaimServiceLine(claimId));
				} else if ("cob".equalsIgnoreCase(partType)) {
					claimPartsMap.put(partType, getClaim(claimId).getClaimCob());
				}
			}
		}
		return claimPartsMap;

	}

	/**
	 *
	 * API method to retrieve Claim info
	 * 
	 **/
	public Claim getClaim(String claimId) {

		LOGGER.info("in ClaimHeaderServiceImpl getClaim() method");
		ListClaimV11ClaimId listClaimV11ClaimIdRequest = new ListClaimV11ClaimId();
		Config config = new Config();

		config.setFacetsIdentity(claimProperty.getConfigIdentity());
		config.setRegion(claimProperty.getConfigRegion());
		listClaimV11ClaimIdRequest.setPCLCLID(claimId);
		listClaimV11ClaimIdRequest.setPPAGE(claimProperty.getPages());
		listClaimV11ClaimIdRequest.setPPAGESIZE(claimProperty.getPageSize());
		listClaimV11ClaimIdRequest.setPSKIPROWS(claimProperty.getSkipRows());
		listClaimV11ClaimIdRequest.setPConfig(config);

		ListClaimV11ClaimIdResponse listClaimV11ClaimIdResponse = (ListClaimV11ClaimIdResponse) webServiceConnector
				.callWebService(claimProperty.getHeaderWsdl(), listClaimV11ClaimIdRequest,
						claimProperty.getHeaderNameSpace());
		Claim claim = setClaimValues(listClaimV11ClaimIdResponse);

		return claim;

	}

	/**
	 *
	 * API method to retrieve Claim service line
	 **/
	@Override
	public List<ClaimServiceLine> getClaimServiceLine(String claimId) {

		LOGGER.info("in ClaimHeaderServiceImpl getClaimServiceLine() method");
		ListClaimCDMLV9ClaimId listClaimCDMLV9ClaimIdRequest = new ListClaimCDMLV9ClaimId();
		com.trizetto.fxi.isl.fawsvcinplistclaimcdml_v9.Config config = new com.trizetto.fxi.isl.fawsvcinplistclaimcdml_v9.Config();

		config.setFacetsIdentity(claimProperty.getConfigIdentity());
		listClaimCDMLV9ClaimIdRequest.setPCLCLID(claimId);
		listClaimCDMLV9ClaimIdRequest.setPPAGE(claimProperty.getPages());
		listClaimCDMLV9ClaimIdRequest.setPPAGESIZE(claimProperty.getPageSize());
		listClaimCDMLV9ClaimIdRequest.setPSKIPROWS(claimProperty.getSkipRows());
		listClaimCDMLV9ClaimIdRequest.setPConfig(config);

		ListClaimCDMLV9ClaimIdResponse listClaimCDMLV9ClaimIdResponse = (ListClaimCDMLV9ClaimIdResponse) webServiceConnector
				.callWebService(claimProperty.getServLineWsdl(), listClaimCDMLV9ClaimIdRequest,
						claimProperty.getServLineNameSpace());
		List<ClaimServiceLine> serviceLineList = setServiceLines(listClaimCDMLV9ClaimIdResponse);
		return serviceLineList;
	}

	/**
	 * 
	 * Method to get the Claim Header details
	 * 
	 */
	public Claim getClaimHeader(String id) {
		LOGGER.info("in ClaimHeaderServiceImpl getClaimHeader() method");
		Claim claim = getClaim(id);
		claim.setClaimCob(null);
		return claim;
	}

	/**
	 * 
	 * Method to get the Claim COB details
	 * 
	 */
	public ClaimCob getClaimCob(String id) {
		LOGGER.info("in ClaimHeaderServiceImpl getClaimCob() method");
		Claim claim = getClaim(id);
		return claim.getClaimCob();
	}

	/**
	 *
	 * Utility method to convert XMLGregorianCalendar date to String type
	 **/
	private String convertXMLGCToString(XMLGregorianCalendar xmlDate) {
		LOGGER.info("in ClaimHeaderServiceImpl convertXMLGCToString() method");
		String dateString = null;
		Date date = null;
		if (xmlDate != null) {
			DateFormat df = new SimpleDateFormat("yyyyMMdd'T'hhmmss.SSS z");
			date = xmlDate.toGregorianCalendar().getTime();
			dateString = df.format(date);
		}
		return dateString;
	}

	/**
	 * Method to set the serviceline values from SOAP
	 * 
	 * @param listClaimCDMLV9ClaimIdResponse
	 * @return
	 */
	private List<ClaimServiceLine> setServiceLines(ListClaimCDMLV9ClaimIdResponse listClaimCDMLV9ClaimIdResponse) {
		LOGGER.info("in ClaimHeaderServiceImpl setServiceLines() method");
		ClaimMembers claimMember;
		ClaimServiceLine claimServLine;
		ClaimDiagnosis claimDiagnosis;
		ClaimProvider claimProvider;
		List<ClaimServiceLine> servLineList = new ArrayList<>();
		if (listClaimCDMLV9ClaimIdResponse != null) {
			ArrayOfRECCDML recCdmlArray = listClaimCDMLV9ClaimIdResponse.getListClaimCDMLV9ClaimIdResult()
					.getCDMLCOLL();
			if (recCdmlArray != null && recCdmlArray.getRECCDML() != null) {
				List<RECCDML> recCdmlList = recCdmlArray.getRECCDML();
				for (RECCDML recCdml : recCdmlList) {

					claimMember = new ClaimMembers();
					claimServLine = new ClaimServiceLine();
					claimDiagnosis = new ClaimDiagnosis();
					claimProvider = new ClaimProvider();

					claimServLine.setClaimId(recCdml.getCLCLID());
					claimServLine.setLineNumber(recCdml.getCDMLSEQNO());
					claimServLine.setConditionCode(recCdml.getIPCDID());
					claimServLine.setServiceFromDate(convertXMLGCToString(recCdml.getCDMLFROMDT()));
					claimServLine.setServiceToDate(convertXMLGCToString(recCdml.getCDMLTODT()));
					// claimServLine.setStatus(recCdml.getcdmlc);
					claimServLine.setChargeAmount(recCdml.getCDMLCHGAMT());
					claimServLine.setTotalClaimAllowedAmount(recCdml.getCDMLALLOW());
					claimServLine.setUnits(recCdml.getCDMLUNITS());
					claimServLine.setNonCoveredChargeAmount(recCdml.getCDMLUNITSALLOW());
					claimServLine.setConditionReferalIndicator(recCdml.getCDMLREFIND());
					claimServLine.setPatientPaidAmount(recCdml.getCDMLPAIDAMT());
					claimServLine.setDeductibleAmount(recCdml.getCDMLDEDAMT());
					claimServLine.setCopayAmount(recCdml.getCDMLCOPAYAMT());
					claimServLine.setCoinsuranceAmount(recCdml.getCDMLCOINSAMT());
					claimServLine.setPlaceOfService(recCdml.getPSCDID() != null ? recCdml.getPSCDID()
							: "" + recCdml.getPSCDDESC() != null ? recCdml.getPSCDDESC() : "");
					claimServLine.setRiskAmt(recCdml.getCDMLRISKWHAMT());
					claimServLine.setDiscountAmount(recCdml.getCDMLDISCAMT());
					claimServLine.setProcedureCodes(recCdml.getIPCDID());
					claimServLine.setServiceLineRevenueCode(recCdml.getRCRCID());
					claimProvider.setRenderingProviderId(recCdml.getPRPRID());
					claimDiagnosis.setDiagnosisCodeVersion(recCdml.getIDCDID());
					claimMember.setSubscriberId(recCdml.getSBSBID());
					claimMember.setMemberSuffix(recCdml.getMEMESFX());
					claimServLine.setClaimDiagnosis(claimDiagnosis);

					servLineList.add(claimServLine);
				}
			}
		}
		return servLineList;
	}

	/**
	 * Method to set the claim values from SOAP
	 * 
	 * @param listClaimV11ClaimIdResponse
	 * @return
	 */
	private Claim setClaimValues(ListClaimV11ClaimIdResponse listClaimV11ClaimIdResponse) {
		LOGGER.info("in ClaimHeaderServiceImpl setClaimValues() method");
		Claim claim = new Claim();
		ClaimHeader claimHeader = new ClaimHeader();
		ClaimMembers claimMember = new ClaimMembers();
		ClaimCob claimCob = new ClaimCob();
		ClaimProvider claimProvider = new ClaimProvider();

		if (listClaimV11ClaimIdResponse != null) {
			ArrayOfRECCLCL recClclArray = listClaimV11ClaimIdResponse.getListClaimV11ClaimIdResult().getCLCLCOLL();
			if (recClclArray != null && recClclArray.getRECCLCL() != null) {
				List<RECCLCL> recClclList = recClclArray.getRECCLCL();
				for (RECCLCL recClcl : recClclList) {

					claim.setClaimId(recClcl.getCLCLID());
					claimHeader.setClaimId(recClcl.getCLCLID());
					claimHeader.setType(recClcl.getCLCLCLTYPE());
					claimHeader.setSubType(recClcl.getCLCLCLSUBTYPE());
					claimHeader.setClaimStatus(recClcl.getCLCLCURSTS());
					claimHeader.setCode(recClcl.getCLSTMCTRREAS());
					claimHeader.setDescription(recClcl.getCLSTMCTRREASDESC());
					claimHeader.setTotalPayableAmount(recClcl.getCLCLTOTPAYABLE());
					claimHeader.setTotalClaimChargeAmount(recClcl.getCLCLTOTCHG());
					claimHeader.setClaimSubmissionType(recClcl.getCLCLCLSUBTYPE());
					claimHeader.setReceivedDate(convertXMLGCToString(recClcl.getCLCLRECDDT()));
					claimHeader.setCarrier(recClcl.getCSCSID());
					claimHeader.setAdmissionDate(convertXMLGCToString(recClcl.getCLHPADMDT()));
					claimHeader.setDischargedDate(convertXMLGCToString(recClcl.getCLHPDCDT()));
					claimHeader.setStatementFromDate(convertXMLGCToString(recClcl.getCLHPSTAMENTFRDT()));
					claimHeader.setStatementToDate(convertXMLGCToString(recClcl.getCLHPSTAMENTTODT()));
					claimHeader.setClassId(recClcl.getCSCSID());
					claimHeader.setClassPlanId(recClcl.getCSPIID());
					claimHeader.setProductId(recClcl.getPDPDID());
					claimHeader.setProductType(recClcl.getPDDSPRODTYPE());
					claimHeader.setProductCategory(recClcl.getCSPDCAT());
					claimHeader.setBusinessCategory(recClcl.getPDDSMCTRBCAT());
					claimHeader.setNetworkId(recClcl.getNWNWID());
					claimHeader.setDischargeHour(recClcl.getCLHPDCHOURCD());

					claimMember.setMemberId(recClcl.getMEMECK());
					claimMember.setGroupId(recClcl.getGRGRID());
					claimMember.setSubscriberId(recClcl.getSBSBID());
					claimMember.setMemberSuffix(recClcl.getMEMESFX());

					claimProvider.setBillingProviderId(recClcl.getCLCLPAYEEPRID());
					claimProvider.setRenderingProviderId(recClcl.getPRPRID());
					claimProvider.setOperatingProviderNPI(recClcl.getCLHPPRPROPNPI());
					claimProvider.setOperatingProviderTaxID(recClcl.getCLHPPRPROPTAX());
					claimProvider.setReferingProviderTaxID(recClcl.getCLMFPRPRFATAX());
					claimProvider.setServiceFacilityProviderID(recClcl.getCLMFPRPRIDFAC());
					claimProvider.setServiceFacilityTaxID(recClcl.getCLMFPRPRFATAX());

					claimCob.setOtherPayerPaid(recClcl.getCLCBCOBAMT());
					claimCob.setOtherPayerAllowable(recClcl.getCLCBCOBALLOW());
					claim.setClaimHeader(claimHeader);
					claim.setClaimMembers(claimMember);
					claim.setClaimCob(claimCob);
					claim.setClaimProvider(claimProvider);
				}
			}
		}
		return claim;
	}
}
