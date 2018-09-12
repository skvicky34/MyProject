package com.cts.healthcare.integration.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.cts.healthcare.integration.client.WebServiceConnector;
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
 
 
 

@Service("HeaderService")
public class ClaimHeaderServiceImpl implements ClaimService 
{
	
	@Autowired
	@Qualifier("WebServiceConnector")
	private WebServiceConnector webServiceConnector;
	
	@Value("${facet.service.claim.header.wsdl}")
	private String facetHeaderWsdlUrl;
	
	@Value("${facet.service.claim.serviceLine.wsdl}")
	private String facetServLineWsdlUrl;
	
	@Value("${facet.service.claim.header.nameSpace}")
	private String facetHeaderNameSpace;
	
	@Value("${facet.service.claim.serviceLine.nameSpace}")
	private String facetServLineNameSpace;
	
	@Value("${facet.config.identity}")
	private String facetIdentity;
	
	@Value("${facet.config.region}")
	private String facetRegion;
	
	@Value("${facet.claimId.page}")
	private int pages;
	
	@Value("${facet.claimId.size}")
	private int pageSize;
	
	@Value("${facet.claimId.skipRows}")
	private int skipRows;
	
	@Override
	public String getInfo() {
		return "Claim Header Service.";
	}
	
	@Override
	public Claim getClaim(String id, String partArray)
	{
		ListClaimV11ClaimId request = new ListClaimV11ClaimId();
		Config config = new Config();
		Claim claim = new Claim();
		ClaimHeader claimHeader = new ClaimHeader();
		ClaimMembers claimMember = new ClaimMembers();
		ClaimCob claimCob = new ClaimCob();
		ClaimProvider claimProvider = new ClaimProvider();
		
		config.setFacetsIdentity(facetIdentity);
		config.setRegion(facetRegion);
		request.setPCLCLID(id);
		request.setPPAGE(pages);
		request.setPPAGESIZE(pageSize);
		request.setPSKIPROWS(skipRows);
		request.setPConfig(config);
		 
		ListClaimV11ClaimIdResponse  response = (ListClaimV11ClaimIdResponse) webServiceConnector.callWebService(facetHeaderWsdlUrl, request, facetHeaderNameSpace);
		    if(response != null) {
		    	ArrayOfRECCLCL recClclArray = response.getListClaimV11ClaimIdResult().getCLCLCOLL();
		    	List<RECCLCL> recClclList = recClclArray.getRECCLCL();
		    	
		    	for(RECCLCL recClcl : recClclList) {
		    	
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
		    	claimHeader.setReceivedDate(convertXMLGCToDate(recClcl.getCLCLRECDDT()));
		    	claimHeader.setCarrier(recClcl.getCSCSID());
		    	claimHeader.setAdmissionDate(convertXMLGCToDate(recClcl.getCLHPADMDT()));
		    	claimHeader.setDischargedDate(convertXMLGCToDate(recClcl.getCLHPDCDT()));
		    	claimHeader.setStatementFromDate(convertXMLGCToDate(recClcl.getCLHPSTAMENTFRDT()));
		    	claimHeader.setStatementToDate(convertXMLGCToDate(recClcl.getCLHPSTAMENTTODT()));
		    	claimHeader.setClassId(recClcl.getCSCSID());
		    	claimHeader.setClassPlanId(recClcl.getCSPIID());
		    	claimHeader.setProductId(recClcl.getPDPDID());
		    	claimHeader.setProductType(recClcl.getPDDSPRODTYPE());
		    	claimHeader.setProductCategory(recClcl.getCSPDCAT());
		    	claimHeader.setBusinessCategory(recClcl.getPDDSMCTRBCAT());
		    	claimHeader.setNetworkId(recClcl.getNWNWID());

		    	claimMember.setMemberId(recClcl.getMEMECK());
		    	claimMember.setGroupId(recClcl.getGRGRCK());
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
		    return claim;
	}
	
	@Override
	public List<ClaimServiceLine> getClaimServiceLine(String id) {

		ListClaimCDMLV9ClaimId request = new ListClaimCDMLV9ClaimId();
		com.trizetto.fxi.isl.fawsvcinplistclaimcdml_v9.Config config = new com.trizetto.fxi.isl.fawsvcinplistclaimcdml_v9.Config();
		
		ClaimMembers claimMember;
		ClaimServiceLine claimServLine;
		ClaimDiagnosis claimDiagnosis;
		ClaimProvider claimProvider;
		List<ClaimServiceLine> servLineList = new ArrayList<>();
		config.setFacetsIdentity(facetIdentity);
		request.setPCLCLID(id);
		request.setPPAGE(pages);
		request.setPPAGESIZE(pageSize);
		request.setPSKIPROWS(skipRows);
		request.setPConfig(config);
		   
		
		ListClaimCDMLV9ClaimIdResponse  response = (ListClaimCDMLV9ClaimIdResponse)webServiceConnector.callWebService(facetServLineWsdlUrl, request, facetServLineNameSpace);
		 if(response != null) {
		    	ArrayOfRECCDML recCdmlArray = response.getListClaimCDMLV9ClaimIdResult().getCDMLCOLL();
		    	List<RECCDML> recCdmlList = recCdmlArray.getRECCDML();
		    	for(RECCDML recCdml : recCdmlList) {
		    		
		    		claimMember = new ClaimMembers();
		    		claimServLine = new ClaimServiceLine();
		    		claimDiagnosis = new ClaimDiagnosis();
		    		claimProvider = new ClaimProvider();
		    		
		    		claimServLine.setClaimId(recCdml.getCLCLID());
		    		claimServLine.setLineNumber(recCdml.getCDMLSEQNO());
		    		claimServLine.setConditionCode(recCdml.getIPCDID());		    		
		    		claimServLine.setServiceFromDate(convertXMLGCToDate(recCdml.getCDMLFROMDT()));
		    		claimServLine.setServiceToDate(convertXMLGCToDate(recCdml.getCDMLTODT()));
		    		//claimServLine.setStatus(recCdml.getcdmlc);
		    		claimServLine.setChargeAmount(recCdml.getCDMLCHGAMT());
		    		claimServLine.setTotalClaimAllowedAmount(recCdml.getCDMLALLOW());
		    		claimServLine.setUnits(recCdml.getCDMLUNITS());
		    		claimServLine.setNonCoveredChargeAmount(recCdml.getCDMLUNITSALLOW());
		    		claimServLine.setConditionReferalIndicator(recCdml.getCDMLREFIND());
		    		claimServLine.setPatientPaidAmount(recCdml.getCDMLPAIDAMT());
		    		claimServLine.setDeductibleAmount(recCdml.getCDMLDEDAMT());
		    		claimServLine.setCopayAmount(recCdml.getCDMLCOPAYAMT());
		    		claimServLine.setCoinsuranceAmount(recCdml.getCDMLCOINSAMT());
		    		claimServLine.setPlaceOfService(recCdml.getPSCDID()!=null ? recCdml.getPSCDID() : "" 
		    					+recCdml.getPSCDDESC() !=null ? recCdml.getPSCDDESC() : "");
		    		claimServLine.setRiskAmt(recCdml.getCDMLRISKWHAMT());
		    		claimServLine.setDiscountAmount(recCdml.getCDMLDISCAMT());
		    		claimProvider.setRenderingProviderId(recCdml.getPRPRID());
		    		claimDiagnosis.setDiagnosisCodeVersion(recCdml.getIDCDID());
		    		claimMember.setSubscriberId(recCdml.getSBSBID());
		    		claimMember.setMemberSuffix(recCdml.getMEMESFX());
		    		claimServLine.setClaimDiagnosis(claimDiagnosis);
		    		
		    		servLineList.add(claimServLine);
		    	}
		 }
		return servLineList;
	}

	@Override
	public ClaimDiagnosis getClaimDiagnosis(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClaimCob getClaimCob(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public ClaimHeader getClaimHeader(String id) {
		return null;
	}
	 
	
	public Date convertXMLGCToDate(XMLGregorianCalendar xmlDate)
	{
		Date date =null;
		if(xmlDate!= null) {
			 TimeZone timeZone = TimeZone.getDefault();
			 DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSS z");
			 df.setTimeZone(timeZone);
		        Date date1 =  xmlDate.toGregorianCalendar().getTime();
		       
		        String dateString = df.format(date1);
		        System.out.println(dateString);
		        try {
					date = df.parse(dateString);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        
		}
		return date;
	} 
}
