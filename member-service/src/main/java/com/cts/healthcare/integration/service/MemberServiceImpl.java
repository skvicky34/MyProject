package com.cts.healthcare.integration.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.cts.healthcare.integration.client.WebServiceConnector;
import com.cts.healthcare.integration.controller.MemberServiceController;
import com.cts.healthcare.integration.domain.Member;
import com.trizetto.fxi.isl.fawsvcinpgetmember_v3.ArrayOfRECMEME;
import com.trizetto.fxi.isl.fawsvcinpgetmember_v3.Config;
import com.trizetto.fxi.isl.fawsvcinpgetmember_v3.GetMemberV3MemberKey;
import com.trizetto.fxi.isl.fawsvcinpgetmember_v3.GetMemberV3MemberKeyResponse;
import com.trizetto.fxi.isl.fawsvcinpgetmember_v3.GetMemberV3SubscriberId;
import com.trizetto.fxi.isl.fawsvcinpgetmember_v3.GetMemberV3SubscriberIdResponse;
import com.trizetto.fxi.isl.fawsvcinpgetmember_v3.RECMEME;

@Service("HeaderService")
public class MemberServiceImpl implements MemberService 
{
	
	@Autowired
	@Qualifier("WebServiceConnector")
	private WebServiceConnector webServiceConnector;
	
	@Value("${facet.service.member.wsdl}")
	private String facetMemberWsdlUrl;
	
	/*@Value("${facet.service.claim.serviceLine.wsdl}")
	private String facetServLineWsdlUrl;*/
	
	@Value("${facet.service.member.memNameSpace}")
	private String facetMemberNameSpace;
	
	@Value("${facet.service.member.subNameSpace}")
	private String facetSubNameSpace;
	
	/*@Value("${facet.service.claim.serviceLine.nameSpace}")
	private String facetServLineNameSpace;*/
	
	@Value("${facet.config.identity}")
	private String facetIdentity;
	
	@Value("${facet.config.region}")
	private String facetRegion;
	
	@Value("${facet.memberId.page}")
	private int pages;
	
	@Value("${facet.memberId.size}")
	private int pageSize;
	
	@Value("${facet.memberId.skipRows}")
	private int skipRows;
	
	private final static Logger logger = LoggerFactory.getLogger(MemberServiceController.class);
	
	/**
	*
	* API method to retrieve Member Info
	**/
	@Override
	public Member getMember(Long id)
	{
		logger.info("in Service Method getMember()");
		GetMemberV3MemberKey request = new GetMemberV3MemberKey();
		Config config = new Config();
		Member member = new Member();
		
		config.setFacetsIdentity(facetIdentity);
		config.setRegion(facetRegion);
		request.setPMEMECK(id);
		request.setPConfig(config);
		    
		GetMemberV3MemberKeyResponse  getMemberV3MemberKeyResponse = (GetMemberV3MemberKeyResponse) webServiceConnector.callWebService(facetMemberWsdlUrl, request, facetMemberNameSpace);
		    if(getMemberV3MemberKeyResponse != null) {
		    	ArrayOfRECMEME recMemeArray = getMemberV3MemberKeyResponse.getGetMemberV3MemberKeyResult().getMEMECOLL();
		    	if(recMemeArray != null)
		    	{
			    	List<RECMEME> recMemeList = recMemeArray.getRECMEME();
			    	
			    	for(RECMEME recMeme : recMemeList) {
			    		member.setPatientId(Long.valueOf(recMeme.getMEMERECORDNO()));
			    		member.setFirstName(recMeme.getMEMEFIRSTNAME());
			    		member.setLastName(recMeme.getMEMELASTNAME());
			    		member.setDateOfBirth(convertXMLGCToString(recMeme.getMEMEBIRTHDT()));
			    		member.setGenderCode(recMeme.getMEMESEX());
			    		member.setMedicaidNumber(recMeme.getMEMEMEDCDNO());
			    		member.setSocialSecurityNumber(recMeme.getMEMESSN());
			    		member.setMedicareNumber(recMeme.getMEMEHICN());
			    		member.setHealthInsuranceClaimNumber(recMeme.getMEMEHICN());
			    		member.setEffectiveDate(convertXMLGCToString(recMeme.getMEMEELIGDT()));
			    		member.setEffectiveToDate(convertXMLGCToString(recMeme.getMEMEORIGEFFDT()));
			    		member.setInsurerRelation(recMeme.getMEMEREL());
			    		
			    		String address = recMeme.getSBADADDR1MAIL() + " " + recMeme.getSBADADDR2MAIL() + " " + recMeme.getSBADADDR3MAIL();
			    		member.setAddress(address);
			    		member.setCity(recMeme.getSBADCITYMAIL());
			    		member.setState(recMeme.getSBADSTATEMAIL());
			    		member.setZip(recMeme.getSBADZIPMAIL());
	
			    	
			    	}
		    	}
		    }
		    return member;
	}

	/**
	*
	* API method to retrieve Subscriber Info
	**/
	@Override
	public Member getSubscriber(Long id,String groupId,String memberSuffix,XMLGregorianCalendar asOfDate) {

		logger.info("in Service Method getSubscriber()");
		GetMemberV3SubscriberId request = new GetMemberV3SubscriberId();
		Config config = new Config();
		Member member = new Member();
		
		config.setFacetsIdentity(facetIdentity);
		config.setRegion(facetRegion);
		request.setPMEMESFX(memberSuffix);
		request.setPASOFDT(asOfDate);
		request.setPGRGRID(groupId);
		request.setPSBSBID(id.toString());
		request.setPConfig(config);
		
		
		GetMemberV3SubscriberIdResponse  getMemberV3SubscriberIdResponse = (GetMemberV3SubscriberIdResponse) webServiceConnector.callWebService(facetMemberWsdlUrl, request, facetSubNameSpace);
	    if(getMemberV3SubscriberIdResponse != null) {
	    	ArrayOfRECMEME recMemeArray = getMemberV3SubscriberIdResponse.getGetMemberV3SubscriberIdResult().getMEMECOLL();
	    	if(recMemeArray!=null)
	    	{
		    	List<RECMEME> recMemeList = recMemeArray.getRECMEME();
	    		for(RECMEME recMeme : recMemeList) {	    	
		    		member.setPatientId(Long.valueOf(recMeme.getSBSBID()));
		    		member.setFirstName(recMeme.getSBSBFIRSTNAME());
		    		member.setLastName(recMeme.getSBSBLASTNAME());
		    		if(recMeme.getSBSBMEMEBIRTHDT()!=null)
		    		{
		    			member.setDateOfBirth(convertXMLGCToString(recMeme.getSBSBMEMEBIRTHDT()));
		    		}
		    		
		    		member.setGenderCode(recMeme.getSBSBMEMESEX());
		    		member.setMedicaidNumber(recMeme.getMEMEMEDCDNO());
		    		member.setSocialSecurityNumber(recMeme.getMEMESSN());
		    		member.setMedicareNumber(recMeme.getMEMEHICN());
		    		member.setHealthInsuranceClaimNumber(recMeme.getMEMEHICN());
		    		if(recMeme.getMEMEELIGDT()!=null)
		    		{
		    		member.setEffectiveDate(convertXMLGCToString(recMeme.getMEMEELIGDT()));
		    		}
		    		if(recMeme.getMEMEORIGEFFDT()!=null)
		    		{
		    		member.setEffectiveToDate(convertXMLGCToString(recMeme.getMEMEORIGEFFDT()));
		    		}
		    		
		    		String address = recMeme.getSBADADDR1MAIL() + " " 
		    						+ (recMeme.getSBADADDR2MAIL()!=null?recMeme.getSBADADDR2MAIL():"")
		    						+ (recMeme.getSBADADDR3MAIL()!=null?recMeme.getSBADADDR3MAIL():"") ;
		    		member.setAddress(address);
		    		member.setCity(recMeme.getSBADCITYMAIL());
		    		member.setState(recMeme.getSBADSTATEMAIL());
		    		member.setZip(recMeme.getSBADZIPMAIL());
		    	}
	    	}
	    }
		
		return member;
		
	} 
	
	/**
	*
	* Utility method to convert XMLGregorianCalendar date to String type
	**/
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
