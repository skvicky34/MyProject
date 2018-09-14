package com.cts.healthcare.integration.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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
	    	if(recprovArray!= null && recprovArray.getRECPROV()!=null) {
		    	List<RECPROV> recprovList = recprovArray.getRECPROV();
		    	for (RECPROV recProv : recprovList) {
		    	
		    	provider.setProviderId(recProv.getPRPRID());
		    	provider.setProviderType(recProv.getPRPRMCTRTYPE());
		    	provider.setSpecialityCode(recProv.getPRCFMCTRSPEC());
		    	provider.setSpecialityCodeDesc(recProv.getPRCFMCTRSPECDESC());
		    	provider.setEffectiveToDate(convertXMLGCToString(recProv.getPRPRTERMDT()));
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
	public Map<String,Provider> getMultipleProviders(String idList)
	{
		logger.info("in Service Impl getMultipleProvider()");
		Map<String,Provider> providerMap = new LinkedHashMap<String,Provider>();
		String[] idArray = idList.split(",");	
		StringBuffer idString = null;
		for(String id : idArray) {
			idString = new StringBuffer(id.trim().replaceAll("[\\[\\]]", ""));
			Provider provider = getProvider(idString.toString());			
		    if(provider.getProviderId()!=null)
		    {
		    	providerMap.put(idString.toString(), provider);
		    }
		    else
		    {
		    	providerMap.put(idString.toString(), null);
		    }
		}
		return providerMap;
	    
	}

	
	public String convertXMLGCToString(XMLGregorianCalendar xmlDate)
	{
		 String dateString =null;
         Date date = null;
         if(xmlDate!= null) {
                DateFormat df = new SimpleDateFormat("yyyyMMdd");
              date =  xmlDate.toGregorianCalendar().getTime();
              dateString = df.format(date);
         }
         return dateString;
	} 
	 

	 
}
