package com.cts.healthcare.integration.service;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.xml.transform.TransformerException;

import org.springframework.stereotype.Service;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.cts.healthcare.integration.domain.Claim;
import com.cts.healthcare.integration.domain.ClaimCob;
import com.cts.healthcare.integration.domain.ClaimDiagnosis;
import com.cts.healthcare.integration.domain.ClaimHeader;
import com.cts.healthcare.integration.domain.ClaimServiceLine;
import com.trizetto.fxi.isl.fawsvcinplistclaim_v11.ArrayOfRECCLCL;
import com.trizetto.fxi.isl.fawsvcinplistclaim_v11.Config;
import com.trizetto.fxi.isl.fawsvcinplistclaim_v11.ListClaimV11ClaimId;
import com.trizetto.fxi.isl.fawsvcinplistclaim_v11.ListClaimV11ClaimIdResponse;
import com.trizetto.fxi.isl.fawsvcinplistclaim_v11.RECCLCL;

//@Service("HeaderService")
public class ClaimHeaderServiceImpl extends WebServiceGatewaySupport implements ClaimService 
{
		
	@Override
	public String getInfo() {
		return "Claim Header Service.";
	}
	
	@Override
	public Claim getClaim(String id)
	{
		ListClaimV11ClaimId request = new ListClaimV11ClaimId();
		 Config config = new Config();
		    config.setFacetsIdentity("SVCAGENT");
		    config.setRegion("Facets550");
		Claim claim = new Claim();
		ClaimHeader claimHeader = new ClaimHeader();
		    request.setPCLCLID(id);
		    request.setPPAGE(1);
		    request.setPPAGESIZE(10);
		    request.setPSKIPROWS(0);
		    request.setPConfig(config);
		   
		    
		    
		    /*ListClaimV11ClaimIdResponse response = (ListClaimV11ClaimIdResponse) getWebServiceTemplate().
		    		marshalSendAndReceive(request);*/
		   
		    
		   ListClaimV11ClaimIdResponse response = (ListClaimV11ClaimIdResponse) getWebServiceTemplate().
		    		marshalSendAndReceive("http://abn-ode-app-037.ode.trizetto.com/FacetsWebServiceLibrary/FaWsvcInpListClaim_v11.asmx", request,	new WebServiceMessageCallback() {
								
								@Override
								public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
									
									((SoapMessage)message).setSoapAction("http://trizetto.com/fxi/isl/FaWsvcInpListClaim_v11/ListClaim_v11_ClaimId");
									
								}
							});
		    if(response != null) {
		    	ArrayOfRECCLCL recclclArray = response.getListClaimV11ClaimIdResult().getCLCLCOLL();
		    	List<RECCLCL> recclclList = recclclArray.getRECCLCL();
		    	Iterator it =  recclclList.iterator();
		    	while(it.hasNext()) {
		    		RECCLCL rr = (RECCLCL) it.next();
		    	
		    	claim.setClaimId(rr.getCLCLID());
		    	claimHeader.setClaimId(rr.getCLCLID());
		    	claimHeader.setType(rr.getCLCLCLTYPE());
		    	claimHeader.setTotalClaimChargeAmount(rr.getCLCLTOTCHG());
		    	claimHeader.setClaimSubmissionType(rr.getCLCLCLSUBTYPE());
		    	claim.setClaimHeader(claimHeader);
		    	 
		    	
		    	}
		    }else {
		    	System.out.println(" Error in getting claim id ");
		    }
		    
		    return claim;
		 
	}
	
	@Override
	public ClaimHeader getClaimHeader(int id) {
		return null;
	}


	@Override
	public ClaimServiceLine getClaimServiceLine(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClaimDiagnosis getClaimDiagnosis(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClaimCob getClaimCob(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
