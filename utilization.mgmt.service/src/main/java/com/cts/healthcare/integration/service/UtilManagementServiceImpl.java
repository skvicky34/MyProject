package com.cts.healthcare.integration.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

import com.cts.healthcare.integration.client.WebServiceConnector;
import com.cts.healthcare.integration.config.UtilProperty;
import com.cts.healthcare.integration.controller.UtilManagementRestController;
import com.cts.healthcare.integration.domain.Authorization;
import com.trizetto.fxi.isl.fawsvcinpgetprovider_v2.ArrayOfRECPROV;
import com.trizetto.fxi.isl.fawsvcinpgetprovider_v2.RECPROV;
import com.trizetto.fxi.isl.fawsvcinpsearchumumsv_v4.Config;
import com.trizetto.fxi.isl.fawsvcinpsearchumumsv_v4.SearchUmUMSVV4MemberKey;
import com.trizetto.fxi.isl.fawsvcinpsearchumumsv_v4.SearchUmUMSVV4MemberKeyResponse;


@Service("providerService")
@EnableConfigurationProperties(UtilProperty.class)
public class UtilManagementServiceImpl implements UtilManagementService 
{
	
	@Autowired
	@Qualifier("WebServiceConnector")
	private WebServiceConnector webServiceConnector;
		
	@Autowired
	private UtilProperty utilProperty; 
	
	private final static Logger LOGGER = LoggerFactory.getLogger(UtilManagementRestController.class);
	
	/**
	*
	* API method to retrieve Provider Info
	**/
	public Authorization getUtilization(String id,String utilFromDate,String utilToDate) {
		
		
		LOGGER.info("in Service Impl getUtilization()");
		SearchUmUMSVV4MemberKey getProviderV2ProviderIdRequest = new SearchUmUMSVV4MemberKey();
		Config config = new Config();
		Authorization authorization = new Authorization();
		
		config.setFacetsIdentity(utilProperty.getConfigIdentity());
		config.setRegion(utilProperty.getConfigRegion());
		getProviderV2ProviderIdRequest.setPMEMECK(Long.parseLong(id));
		getProviderV2ProviderIdRequest.setPUMSVFROMDT(utilFromDate);
		getProviderV2ProviderIdRequest.setPUMSVTODT(utilFromDate);
		getProviderV2ProviderIdRequest.setPConfig(config);
		
		SearchUmUMSVV4MemberKeyResponse response = (SearchUmUMSVV4MemberKeyResponse) webServiceConnector.callWebService(providerProperty.getProviderWsdl(), getProviderV2ProviderIdRequest, providerProperty.getProviderNameSpace());
	    if(response != null) {
	    	
	    	ArrayOfRECPROV recprovArray = response.getProviderV2ProviderIdResult().getPROVCOLL();
	    	if(recprovArray!= null && recprovArray.getRECPROV()!=null) {
		    	List<RECPROV> recprovList = recprovArray.getRECPROV();
		    	for (RECPROV recProv : recprovList) {
		    	
		    	
		    	
		    	}
	    	}
	    }
	    return authorization;
	}

	

	
	private String convertXMLGCToString(XMLGregorianCalendar xmlDate)
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
