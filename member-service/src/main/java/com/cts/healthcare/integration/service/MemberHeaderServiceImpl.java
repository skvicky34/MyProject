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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.cts.healthcare.integration.client.WebServiceConnector;
import com.cts.healthcare.integration.domain.Member;
import com.trizetto.fxi.isl.fawsvcinpgetmember_v3.ArrayOfRECMEME;
import com.trizetto.fxi.isl.fawsvcinpgetmember_v3.Config;
import com.trizetto.fxi.isl.fawsvcinpgetmember_v3.GetMemberV3MemberKey;
import com.trizetto.fxi.isl.fawsvcinpgetmember_v3.GetMemberV3MemberKeyResponse;
import com.trizetto.fxi.isl.fawsvcinpgetmember_v3.GetMemberV3SubscriberId;
import com.trizetto.fxi.isl.fawsvcinpgetmember_v3.GetMemberV3SubscriberIdResponse;
import com.trizetto.fxi.isl.fawsvcinpgetmember_v3.RECMEME;

@Service("HeaderService")
public class MemberHeaderServiceImpl implements MemberService 
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
	
	
	@Override
	public Member getMember(Long id)
	{
		GetMemberV3MemberKey request = new GetMemberV3MemberKey();
		Config config = new Config();
		Member member = new Member();
		
		config.setFacetsIdentity(facetIdentity);
		config.setRegion(facetRegion);
		request.setPMEMECK(id);
		request.setPConfig(config);
		    
		GetMemberV3MemberKeyResponse  response = (GetMemberV3MemberKeyResponse) webServiceConnector.callWebService(facetMemberWsdlUrl, request, facetMemberNameSpace);
		    if(response != null) {
		    	ArrayOfRECMEME recmemeArray = response.getGetMemberV3MemberKeyResult().getMEMECOLL();
		    	List<RECMEME> recmemeList = recmemeArray.getRECMEME();
		    	Iterator<RECMEME> it =  recmemeList.iterator();
		    	for(RECMEME rr : recmemeList) {
		    		member.setPatientId(Long.valueOf(rr.getMEMERECORDNO()));
		    		member.setFirstName(rr.getMEMEFIRSTNAME());
		    		member.setLastName(rr.getMEMELASTNAME());
		    		member.setDateOfBirth(convertXMLGCToDate(rr.getMEMEBIRTHDT()));
		    		member.setGenderCode(rr.getMEMESEX());
		    		member.setMedicaidNumber(rr.getMEMEMEDCDNO());
		    		member.setSocialSecurityNumber(rr.getMEMESSN());
		    		member.setMedicareNumber(rr.getMEMEHICN());
		    		member.setHealthInsuranceClaimNumber(rr.getMEMEHICN());
		    		member.setEffectiveDate(convertXMLGCToDate(rr.getMEMEELIGDT()));
		    		member.setEffectiveToDate(convertXMLGCToDate(rr.getMEMEORIGEFFDT()));
		    		member.setInsurerRelation(rr.getMEMEREL());
		    		
		    		String address = rr.getSBADADDR1MAIL() + " " + rr.getSBADADDR2MAIL() + " " + rr.getSBADADDR3MAIL();
		    		member.setAddress(address);
		    		member.setCity(rr.getSBADCITYMAIL());
		    		member.setState(rr.getSBADSTATEMAIL());
		    		member.setZip(rr.getSBADZIPMAIL());

		    	
		    	}
		    }else {
		    	System.out.println(" Error in getting member ");
		    }
		    
		    return member;
		 
	}

	@Override
	public Member getSubscriber(Long id,String groupId,String memberSuffix,XMLGregorianCalendar asOfDate) {


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
		
		
		GetMemberV3SubscriberIdResponse  response = (GetMemberV3SubscriberIdResponse) webServiceConnector.callWebService(facetMemberWsdlUrl, request, facetSubNameSpace);
	    if(response != null) {
	    	ArrayOfRECMEME recmemeArray = response.getGetMemberV3SubscriberIdResult().getMEMECOLL();
	    	List<RECMEME> recmemeList = recmemeArray.getRECMEME();
    		for(RECMEME rr : recmemeList) {	    	
	    		member.setPatientId(Long.valueOf(rr.getSBSBID()));
	    		member.setFirstName(rr.getSBSBFIRSTNAME());
	    		member.setLastName(rr.getSBSBLASTNAME());
	    		if(rr.getSBSBMEMEBIRTHDT()!=null)
	    		{
	    			member.setDateOfBirth(convertXMLGCToDate(rr.getSBSBMEMEBIRTHDT()));
	    		}
	    		
	    		member.setGenderCode(rr.getSBSBMEMESEX());
	    		member.setMedicaidNumber(rr.getMEMEMEDCDNO());
	    		member.setSocialSecurityNumber(rr.getMEMESSN());
	    		member.setMedicareNumber(rr.getMEMEHICN());
	    		member.setHealthInsuranceClaimNumber(rr.getMEMEHICN());
	    		if(rr.getMEMEELIGDT()!=null)
	    		{
	    		member.setEffectiveDate(convertXMLGCToDate(rr.getMEMEELIGDT()));
	    		}
	    		if(rr.getMEMEORIGEFFDT()!=null)
	    		{
	    		member.setEffectiveToDate(convertXMLGCToDate(rr.getMEMEORIGEFFDT()));
	    		}
	    		
	    		String address = rr.getSBADADDR1MAIL() + " " 
	    						+ (rr.getSBADADDR2MAIL()==null?"":" "  + rr.getSBADADDR2MAIL())
	    						+ (rr.getSBADADDR3MAIL()==null?"":" " +rr.getSBADADDR3MAIL()) ;
	    		member.setAddress(address);
	    		member.setCity(rr.getSBADCITYMAIL());
	    		member.setState(rr.getSBADSTATEMAIL());
	    		member.setZip(rr.getSBADZIPMAIL());
	    	}
	    }else {
	    	System.out.println(" Error in getting member ");
	    }
		
		return member;
		
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
