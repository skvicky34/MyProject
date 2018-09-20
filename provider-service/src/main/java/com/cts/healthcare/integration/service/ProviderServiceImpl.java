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
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

import com.cts.healthcare.integration.client.WebServiceConnector;
import com.cts.healthcare.integration.config.ProviderProperty;
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
	private final static Logger LOGGER = LoggerFactory.getLogger(ProviderServiceImpl.class);

	private WebServiceConnector webServiceConnector;
	private ProviderProperty providerProperty;

	public ProviderServiceImpl(WebServiceConnector webServiceConnector, ProviderProperty providerProperty) {
		this.webServiceConnector = webServiceConnector;
		this.providerProperty = providerProperty;
	}

	/**
	 *
	 * API method to retrieve Provider Info
	 **/
	public Provider getProvider(String id) 
	{
		LOGGER.info("in ProviderServiceImpl getProvider()");
		GetProviderV2ProviderId getProviderV2ProviderIdRequest = new GetProviderV2ProviderId();
		Config config = new Config();

		config.setFacetsIdentity(providerProperty.getConfigIdentity());
		config.setRegion(providerProperty.getConfigRegion());
		getProviderV2ProviderIdRequest.setPPRPRID(id);
		getProviderV2ProviderIdRequest.setPConfig(config);

		GetProviderV2ProviderIdResponse getProviderV2ProviderIdResponse = (GetProviderV2ProviderIdResponse) webServiceConnector
				.callWebService(providerProperty.getProviderWsdl(), getProviderV2ProviderIdRequest,
						providerProperty.getProviderNameSpace());
		Provider provider = setProvider(getProviderV2ProviderIdResponse);

		return provider;
	}

	/**
	 *
	 * API method to retrieve Multiple provider Info
	 **/
	public Map<String, Provider> getMultipleProviders(String[] providerIdArray) 
	{
		LOGGER.info("in ProviderServiceImpl getMultipleProvider()");
		Map<String, Provider> providerMap = new LinkedHashMap<String, Provider>();
		for (String providerId : providerIdArray) {
			Provider provider = getProvider(providerId);
			if (provider.getProviderId() != null) {
				providerMap.put(providerId, provider);
			} else {
				providerMap.put(providerId, null);
			}
		}
		return providerMap;

	}

	/**
	 * Method to convert date to String
	 * 
	 * @param xmlDate
	 * @return
	 */
	private String convertXMLGCToString(XMLGregorianCalendar xmlDate) 
	{
		LOGGER.info("in ProviderServiceImpl convertXMLGCToString()");
		String dateString = null;
		Date date = null;
		if (xmlDate != null) {
			DateFormat df = new SimpleDateFormat("yyyyMMdd");
			date = xmlDate.toGregorianCalendar().getTime();
			dateString = df.format(date);
		}
		return dateString;
	}

	private Provider setProvider(GetProviderV2ProviderIdResponse getProviderV2ProviderIdResponse) 
	{
		LOGGER.info("in ProviderServiceImpl setProvider()");
		Provider provider = new Provider();
		if (getProviderV2ProviderIdResponse != null) {

			ArrayOfRECPROV recprovArray = getProviderV2ProviderIdResponse.getGetProviderV2ProviderIdResult().getPROVCOLL();
			if (recprovArray != null && recprovArray.getRECPROV() != null) {
				List<RECPROV> recprovList = recprovArray.getRECPROV();
				for (RECPROV recProv : recprovList) {

					provider.setProviderId(recProv.getPRPRID());
					provider.setProviderType(recProv.getPRPRMCTRTYPE());
					provider.setSpecialityCode(recProv.getPRCFMCTRSPEC());
					provider.setSpecialityCodeDesc(recProv.getPRCFMCTRSPECDESC());
					provider.setEffectiveToDate(convertXMLGCToString(recProv.getPRPRTERMDT()));
					provider.setPracticeNum(recProv.getPRADPRACTICEIND());
					provider.setNpi(recProv.getPRPRNPI());
					// provider.setFedTaxId(rp.getMCTNID);
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

}
