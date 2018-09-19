package com.cts.healthcare.integration.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.cts.healthcare.integration.client.WebServiceConnector;

@Configuration
public class WsConfigClient {

	@Bean
	  public Jaxb2Marshaller marshaller() {
	    Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
	    marshaller.setContextPath("com.trizetto.fxi.isl.fawsvcinpsearchumumsv_v4");
	    return marshaller;
	  }
	
	
	  @Bean("WebServiceConnector")
	  public WebServiceConnector webServiceConnector(Jaxb2Marshaller marshaller) {
		  WebServiceConnector client = new WebServiceConnector();
	    ///client.setDefaultUri("http://abn-ode-app-037.ode.trizetto.com/FacetsWebServiceLibrary/FaWsvcInpListClaim_v11.asmx");
	    client.setMarshaller(marshaller);
	    client.setUnmarshaller(marshaller);
	    return client;
	  } 
	
}
