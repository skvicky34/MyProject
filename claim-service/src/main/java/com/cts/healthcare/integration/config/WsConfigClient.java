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
	    marshaller.setContextPaths( "com.trizetto.fxi.isl" , "com.trizetto.fxi.isl.fawsvcinplistclaim_v11", "com.trizetto.fxi.isl.fawsvcinplistclaimcdml_v9");
	    return marshaller;
	  }
	
	
	  @Bean("WebServiceConnector")
	  public WebServiceConnector webServiceConnector(Jaxb2Marshaller marshaller) {
		  WebServiceConnector client = new WebServiceConnector();
	    client.setMarshaller(marshaller);
	    client.setUnmarshaller(marshaller);
	    return client;
	  } 
	
}
