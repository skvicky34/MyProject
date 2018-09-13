package com.cts.healthcare.integration.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.cts.healthcare.integration.client.WebServiceConnector;
import com.cts.healthcare.integration.controller.ProviderRestController;
import com.cts.healthcare.integration.domain.Provider;
import com.trizetto.fxi.isl.fawsvcinpgetprovider_v2.ArrayOfRECPROV;
import com.trizetto.fxi.isl.fawsvcinpgetprovider_v2.Config;
import com.trizetto.fxi.isl.fawsvcinpgetprovider_v2.GetProviderV2ProviderId;
import com.trizetto.fxi.isl.fawsvcinpgetprovider_v2.GetProviderV2ProviderIdResponse;
import com.trizetto.fxi.isl.fawsvcinpgetprovider_v2.RECPROV;


@Service("HeaderService")
public class ProviderServiceImpl implements ProviderService 
{
	
	@Autowired
	@Qualifier("WebServiceConnector")
	private WebServiceConnector webServiceConnector;
	
	@Value("${facet.service.provider.wsdl}")
	private String facetHeaderWsdlUrl;
	
	/*@Value("${facet.service.claim.serviceLine.wsdl}")
	private String facetServLineWsdlUrl;*/
	
	@Value("${facet.service.provider.nameSpace}")
	private String facetHeaderNameSpace;
	
	/*@Value("${facet.service.claim.serviceLine.nameSpace}")
	private String facetServLineNameSpace;*/
	
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
	
	private final static Logger logger = LoggerFactory.getLogger(ProviderRestController.class);
	
	/**
	*
	* API method to retrieve Provider Info
	**/
	@Override
	public Provider getProvider(String id) {
		// TODO Auto-generated method stub
		
		
		logger.info("in Service Impl getProvider()");
		GetProviderV2ProviderId request = new GetProviderV2ProviderId();
		Config config = new Config();
		Provider provider = new Provider();
		
		config.setFacetsIdentity(facetIdentity);
		config.setRegion(facetRegion);
		request.setPPRPRID(id);
		request.setPConfig(config);
		
		GetProviderV2ProviderIdResponse response = (GetProviderV2ProviderIdResponse) webServiceConnector.callWebService(facetHeaderWsdlUrl, request, facetHeaderNameSpace);
	    if(response != null) {
	    	
	    	ArrayOfRECPROV recprovArray = response.getGetProviderV2ProviderIdResult().getPROVCOLL();
	    	if(recprovArray.getRECPROV()!=null) {
		    	List<RECPROV> recprovList = recprovArray.getRECPROV();
		    	for (RECPROV recProv : recprovList) {
		    	
		    	provider.setProviderId(recProv.getPRPRID());
		    	provider.setProviderType(recProv.getPRPRMCTRTYPE());
		    	provider.setSpecialityCode(recProv.getPRCFMCTRSPEC());
		    	provider.setSpecialityCodeDesc(recProv.getPRCFMCTRSPECDESC());
		    	provider.setEffectiveToDate(convertXMLGCToDate(recProv.getPRPRTERMDT()));
		    	provider.setPracticeNum(recProv.getPRADPRACTICEIND());
		    	provider.setNpi(recProv.getPRPRNPI());
		    	//provider.setFedTaxId(rp.getMCTNID);
		    	provider.setFirstName(recProv.getPRPRNAME());
		    	provider.setWorkAdd1(recProv.getPRADADDR1());
		    	provider.setWorkAdd2(recProv.getPRADADDR2());
		    	provider.setCity(recProv.getPRADCITY());
		    	provider.setState(recProv.getPRADSTATE());
		    	provider.setPostalCode(recProv.getPRADZIP());
		    	
		    	}
	    	}
	    }
	    return provider;
	}

	/**
	*
	* API method to retrieve Multiple provider Info
	**/
	@Override
	public LinkedHashMap<String,Provider> getMultipleProviders(String identifiers) {
		// TODO Auto-generated method stub
		logger.info("in Service Impl getMultipleProvider()");
		LinkedHashMap<String,Provider> providerMap = new LinkedHashMap<String,Provider>();
		String[] idArray = identifiers.split(",");
		for(String id : idArray) {
			Provider provider = getProvider(id);
		    if(provider.getProviderId()!=null)
		    {
		    	providerMap.put(id, provider);
		    }
		    else
		    {
		    	providerMap.put(id, null);
		    }
		    //providers.add(provider);
		}
		return providerMap;
	    
	}

	
	public Date convertXMLGCToDate(XMLGregorianCalendar xmlDate)
	{
		Date date =null;
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-ddThh:mm:ss.SSZ");
		if(xmlDate!= null) {
			XMLGregorianCalendar xmlCalendar = xmlDate;
			date = xmlCalendar.toGregorianCalendar().getTime();
			//date = sdf.format(date);
		}
		return date;
	} 
	 

	 
}
