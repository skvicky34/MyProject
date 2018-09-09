package com.cts.healthcare.integration.service;

import java.util.Iterator;
import java.util.List;

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
		
		config.setFacetsIdentity(facetIdentity);
		config.setRegion(facetRegion);
		request.setPCLCLID(id);
		request.setPPAGE(pages);
		request.setPPAGESIZE(pageSize);
		request.setPSKIPROWS(skipRows);
		request.setPConfig(config);
		    
		ListClaimV11ClaimIdResponse  response = (ListClaimV11ClaimIdResponse) webServiceConnector.callWebService(facetHeaderWsdlUrl, request, facetHeaderNameSpace);
		    if(response != null) {
		    	ArrayOfRECCLCL recclclArray = response.getListClaimV11ClaimIdResult().getCLCLCOLL();
		    	List<RECCLCL> recclclList = recclclArray.getRECCLCL();
		    	Iterator<RECCLCL> it =  recclclList.iterator();
		    	while(it.hasNext()) {
		    		RECCLCL rr = (RECCLCL) it.next();
		    	
		    	claim.setClaimId(rr.getCLCLID());
		    	claimHeader.setClaimId(rr.getCLCLID());
		    	claimHeader.setType(rr.getCLCLCLTYPE());
		    	claimHeader.setTotalClaimChargeAmount(rr.getCLCLTOTCHG());
		    	claimHeader.setClaimSubmissionType(rr.getCLCLCLSUBTYPE());
		    	claimHeader.setReceivedDate(rr.getCLCLRECDDT());
		    	claimHeader.setTotalClaimChargeAmount(rr.getCLCLTOTCHG());
		    	claimHeader.setCarrier(rr.getCSCSID());
		    	claimHeader.setAdmissionDate(rr.getCLHPADMDT());
		    	claimHeader.setDischargedDate(rr.getCLHPDCDT());
		    	claimHeader.setStatementFromDate(rr.getCLHPSTAMENTFRDT());
		    	claimHeader.setStatementToDate(rr.getCLHPSTAMENTTODT());
		    	claimMember.setMemberId(rr.getMEMECK());
		    	claimMember.setGroupId(rr.getGRGRCK());
		    	claimMember.setSubscriberId(rr.getSBSBCK());
		    	claimMember.setMemberSuffix(rr.getMEMESFX());
		    	ClaimProvider claimProvider = new ClaimProvider();
		    	claimProvider.setBillingProviderId(rr.getCLCLPAYPRIND());
		    	claimProvider.setRenderingProviderId(rr.getPRPRID());
		    	
		    	ClaimCob claimCob = new ClaimCob();
		    	claimCob.setOtherPayerPaid(rr.getCLCBCOBAMT());
		    	claimCob.setOtherPayerAllowable(rr.getCLCBCOBALLOW());
		    	claim.setClaimHeader(claimHeader);
		    	claim.setClaimMembers(claimMember);
		    	claim.setClaimCob(claimCob);
		    	claim.setClaimProvider(claimProvider);
		    	
		    	}
		    }else {
		    	System.out.println(" Error in getting claim id ");
		    }
		    
		    return claim;
		 
	}
	
	@Override
	public ClaimHeader getClaimHeader(String id) {
		return null;
	}


	@Override
	public ClaimServiceLine getClaimServiceLine(String id) {

		ListClaimV11ClaimId request = new ListClaimV11ClaimId();
		Config config = new Config();
		Claim claim = new Claim();
		ClaimHeader claimHeader = new ClaimHeader();
		ClaimMembers claimMember = new ClaimMembers();
		
		config.setFacetsIdentity(facetIdentity);
		config.setRegion(facetRegion);
		request.setPCLCLID(id);
		request.setPPAGE(pages);
		request.setPPAGESIZE(pageSize);
		request.setPSKIPROWS(skipRows);
		request.setPConfig(config);
		    
		ListClaimV11ClaimIdResponse  response = (ListClaimV11ClaimIdResponse) webServiceConnector.callWebService(facetHeaderWsdlUrl, request, facetServLineNameSpace);
		    
		
		return null;
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
}
