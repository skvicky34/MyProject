package com.cts.healthcare.integration.client;

import java.io.IOException;

import javax.xml.transform.TransformerException;

import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapMessage;

import com.trizetto.fxi.isl.fawsvcinplistclaim_v11.ListClaimV11ClaimId;
import com.trizetto.fxi.isl.fawsvcinplistclaim_v11.ListClaimV11ClaimIdResponse;

public class WebServiceConnector extends WebServiceGatewaySupport 

{
	
	/*@Value("${facet.service.claim.header.nameSpace}")
	private String facetHeaderNameSpace;
	
	@Value("${facet.service.claim.serviceLine.nameSpace}")
	private String facetServLineNameSpace;*/
	
	public Object callWebService(String url, ListClaimV11ClaimId request, String nameSpace)
	{
		 
					
			ListClaimV11ClaimIdResponse response = (ListClaimV11ClaimIdResponse) getWebServiceTemplate().
					marshalSendAndReceive(url , request,	new WebServiceMessageCallback() {
						@Override
						public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
							((SoapMessage)message).setSoapAction(nameSpace);
						}
					});
		return response;
	}
}
