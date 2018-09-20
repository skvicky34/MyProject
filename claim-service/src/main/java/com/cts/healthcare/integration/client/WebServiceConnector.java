package com.cts.healthcare.integration.client;

import java.io.IOException;

import javax.xml.transform.TransformerException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapMessage;

public class WebServiceConnector extends WebServiceGatewaySupport

{
	public static final Logger LOGGER = LoggerFactory.getLogger(WebServiceConnector.class);
	
	
	/**
	 * Method to consume SOAP endpoint
	 * 
	 * @param url
	 * @param request
	 * @param nameSpace
	 * @return
	 */
	public Object callWebService(String url, Object request, String nameSpace) {
		LOGGER.info(" in WebServiceConnector callWebService method");
		Object response = getWebServiceTemplate().marshalSendAndReceive(url, request, new WebServiceMessageCallback() {
			@Override
			public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
				((SoapMessage) message).setSoapAction(nameSpace);
			}
		});
		return response;
	}

}
