package com.cts.healthcare.integration.client;

import java.io.IOException;

import javax.xml.transform.TransformerException;

import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapMessage;


public class WebServiceConnector extends WebServiceGatewaySupport 

{
	
	/*@Value("${facet.service.claim.header.nameSpace}")
	private String facetHeaderNameSpace;
	
	@Value("${facet.service.claim.serviceLine.nameSpace}")
	private String facetServLineNameSpace;*/
	
	public Object callWebService(String url, Object request, String nameSpace)
	{
		 
					
			Object response = (Object) getWebServiceTemplate().
					marshalSendAndReceive(url , request,	new WebServiceMessageCallback() {
						@Override
						public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
							((SoapMessage)message).setSoapAction(nameSpace);
						}
					});
		return response;
	}
}
