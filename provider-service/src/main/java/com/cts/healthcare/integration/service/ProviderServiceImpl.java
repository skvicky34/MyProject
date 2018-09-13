package com.cts.healthcare.integration.service;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

import com.cts.healthcare.integration.client.WebServiceConnector;
import com.cts.healthcare.integration.config.ProviderProperty;
import com.cts.healthcare.integration.controller.ProviderRestController;
import com.cts.healthcare.integration.domain.Provider;
import com.trizetto.fxi.isl.fawsvcinpgetprovider_v2.ArrayOfRECPROV;
import com.trizetto.fxi.isl.fawsvcinpgetprovider_v2.Config;
import com.trizetto.fxi.isl.fawsvcinpgetprovider_v2.GetProviderV2ProviderId;
import com.trizetto.fxi.isl.fawsvcinpgetprovider_v2.GetProviderV2ProviderIdResponse;
import com.trizetto.fxi.isl.fawsvcinpgetprovider_v2.RECPROV;


@Service("providerService")
@EnableConfigurationProperties(ProviderProperty.class)
public class ProviderServiceImpl implements ProviderService 
{
	
	@Autowired
	@Qualifier("WebServiceConnector")
	private WebServiceConnector webServiceConnector;
	
	@Autowired
	private ProviderProperty providerProperty; 
	
	private final static Logger logger = LoggerFactory.getLogger(ProviderRestController.class);
	
	/**
	*
	* API method to retrieve Provider Info
	**/
	@Override
	public Provider getProvider(String id) {
		
		
		logger.info("in Service Impl getProvider()");
		GetProviderV2ProviderId getProviderV2ProviderIdRequest = new GetProviderV2ProviderId();
		Config config = new Config();
		Provider provider = new Provider();
		
		config.setFacetsIdentity(providerProperty.getConfigIdentity());
		config.setRegion(providerProperty.getConfigRegion());
		getProviderV2ProviderIdRequest.setPPRPRID(id);
		getProviderV2ProviderIdRequest.setPConfig(config);
		
		GetProviderV2ProviderIdResponse response = (GetProviderV2ProviderIdResponse) webServiceConnector.callWebService(providerProperty.getProviderWsdl(), getProviderV2ProviderIdRequest, providerProperty.getProviderNameSpace());
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
	public LinkedHashMap<String,Provider> getMultipleProviders(String identifiers)
	{
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
