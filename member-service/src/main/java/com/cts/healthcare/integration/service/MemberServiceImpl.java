package com.cts.healthcare.integration.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.bouncycastle.crypto.tls.ServerOnlyTlsAuthentication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

import com.cts.healthcare.integration.client.WebServiceConnector;
import com.cts.healthcare.integration.config.MemberProperty;
import com.cts.healthcare.integration.domain.Authorization;
import com.cts.healthcare.integration.domain.Member;
import com.trizetto.fxi.isl.fawsvcinpgetmember_v3.ArrayOfRECMEME;
import com.trizetto.fxi.isl.fawsvcinpgetmember_v3.Config;
import com.trizetto.fxi.isl.fawsvcinpgetmember_v3.GetMemberV3MemberKey;
import com.trizetto.fxi.isl.fawsvcinpgetmember_v3.GetMemberV3MemberKeyResponse;
import com.trizetto.fxi.isl.fawsvcinpgetmember_v3.GetMemberV3SubscriberId;
import com.trizetto.fxi.isl.fawsvcinpgetmember_v3.GetMemberV3SubscriberIdResponse;
import com.trizetto.fxi.isl.fawsvcinpgetmember_v3.RECMEME;
import com.trizetto.fxi.isl.fawsvcinpsearchumumsv_v4.ArrayOfRECUMSV;
import com.trizetto.fxi.isl.fawsvcinpsearchumumsv_v4.RECRESP;
import com.trizetto.fxi.isl.fawsvcinpsearchumumsv_v4.RECUMSV;
import com.trizetto.fxi.isl.fawsvcinpsearchumumsv_v4.SearchUmUMSVV4MemberKey;
import com.trizetto.fxi.isl.fawsvcinpsearchumumsv_v4.SearchUmUMSVV4MemberKeyResponse;

@Service("memberService")
@EnableConfigurationProperties(MemberProperty.class)
public class MemberServiceImpl implements MemberService {
	private final static Logger LOGGER = LoggerFactory.getLogger(MemberServiceImpl.class);

	private WebServiceConnector webServiceConnector;
	private MemberProperty memberProperty;

	public MemberServiceImpl(WebServiceConnector webServiceConnector, MemberProperty memberProperty) {
		this.webServiceConnector = webServiceConnector;
		this.memberProperty = memberProperty;
	}

	/**
	 *
	 * API method to retrieve Member Info
	 **/
	@Override
	public Member getMember(Long id) {
		LOGGER.info("in MemberServiceImpl getMember()");
		GetMemberV3MemberKey getMemberV3MemberKeyRequest = new GetMemberV3MemberKey();
		Config config = new Config();

		config.setFacetsIdentity(memberProperty.getConfigIdentity());
		config.setRegion(memberProperty.getConfigRegion());
		getMemberV3MemberKeyRequest.setPMEMECK(id);
		getMemberV3MemberKeyRequest.setPConfig(config);

		GetMemberV3MemberKeyResponse getMemberV3MemberKeyResponse = (GetMemberV3MemberKeyResponse) webServiceConnector
				.callWebService(memberProperty.getMemberWsdl(), getMemberV3MemberKeyRequest,
						memberProperty.getMemberNameSpace());
		Member member = setMembers(getMemberV3MemberKeyResponse);
		return member;
	}

	/**
	 *
	 * API method to retrieve Subscriber Info
	 **/
	@Override
	public Member getSubscriber(String id, String groupId, String memberSuffix, XMLGregorianCalendar asOfDate) {

		LOGGER.info("in MemberServiceImpl getSubscriber()");
		GetMemberV3SubscriberId getMemberV3SubscriberIdRequest = new GetMemberV3SubscriberId();
		Config config = new Config();

		config.setFacetsIdentity(memberProperty.getConfigIdentity());
		config.setRegion(memberProperty.getConfigRegion());
		getMemberV3SubscriberIdRequest.setPMEMESFX(memberSuffix);
		getMemberV3SubscriberIdRequest.setPASOFDT(asOfDate);
		getMemberV3SubscriberIdRequest.setPGRGRID(groupId);
		getMemberV3SubscriberIdRequest.setPSBSBID(id);
		getMemberV3SubscriberIdRequest.setPConfig(config);

		GetMemberV3SubscriberIdResponse getMemberV3SubscriberIdResponse = (GetMemberV3SubscriberIdResponse) webServiceConnector
				.callWebService(memberProperty.getMemberWsdl(), getMemberV3SubscriberIdRequest,
						memberProperty.getSubscrNameSpace());

		Member member = setSubscriber(getMemberV3SubscriberIdResponse);

		return member;

	}

	/**
	 *
	 * Utility method to convert XMLGregorianCalendar date to String type
	 **/
	private String convertXMLGCToString(XMLGregorianCalendar xmlDate) {
		LOGGER.info("in MemberServiceImpl convertXMLGCToString()");
		String dateString = null;
		Date date = null;
		if (xmlDate != null) {
			DateFormat df = new SimpleDateFormat("yyyyMMdd");
			date = xmlDate.toGregorianCalendar().getTime();
			dateString = df.format(date);
		}
		return dateString;
	}

	/**
	 * Method to set the Member values from SOAP
	 * 
	 * @param getMemberV3MemberKeyResponse
	 * @return
	 */

	private Member setMembers(GetMemberV3MemberKeyResponse getMemberV3MemberKeyResponse) {
		LOGGER.info("in MemberServiceImpl setMembers() method");
		Member member = new Member();
		if (getMemberV3MemberKeyResponse != null) {
			ArrayOfRECMEME recMemeArray = getMemberV3MemberKeyResponse.getGetMemberV3MemberKeyResult().getMEMECOLL();
			if (recMemeArray != null && recMemeArray.getRECMEME() != null) {
				List<RECMEME> recMemeList = recMemeArray.getRECMEME();

				for (RECMEME recMeme : recMemeList) {
					member.setPatientId(recMeme.getMEMERECORDNO());
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

					String address = recMeme.getSBADADDR1MAIL() != null ? recMeme.getSBADADDR1MAIL()
							: "" + " " + recMeme.getSBADADDR2MAIL() != null ? recMeme.getSBADADDR2MAIL()
									: "" + " " + recMeme.getSBADADDR3MAIL() != null ? recMeme.getSBADADDR3MAIL() : "";
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
	 * Method to set the Subscriber values from SOAP
	 * 
	 * @param getMemberV3SubscriberIdResponse
	 * @return
	 */

	private Member setSubscriber(GetMemberV3SubscriberIdResponse getMemberV3SubscriberIdResponse) {
		LOGGER.info("in MemberServiceImpl setSubscriber() method");
		Member member = new Member();
		if (getMemberV3SubscriberIdResponse != null) {
			ArrayOfRECMEME recMemeArray = getMemberV3SubscriberIdResponse.getGetMemberV3SubscriberIdResult()
					.getMEMECOLL();
			if (recMemeArray != null && recMemeArray.getRECMEME() != null) {
				List<RECMEME> recMemeList = recMemeArray.getRECMEME();
				for (RECMEME recMeme : recMemeList) {
					member.setPatientId(recMeme.getSBSBID());
					member.setFirstName(recMeme.getSBSBFIRSTNAME());
					member.setLastName(recMeme.getSBSBLASTNAME());
					if (recMeme.getSBSBMEMEBIRTHDT() != null) {
						member.setDateOfBirth(convertXMLGCToString(recMeme.getSBSBMEMEBIRTHDT()));
					}

					member.setGenderCode(recMeme.getSBSBMEMESEX());
					member.setMedicaidNumber(recMeme.getMEMEMEDCDNO());
					member.setSocialSecurityNumber(recMeme.getMEMESSN());
					member.setMedicareNumber(recMeme.getMEMEHICN());
					member.setHealthInsuranceClaimNumber(recMeme.getMEMEHICN());
					if (recMeme.getMEMEELIGDT() != null) {
						member.setEffectiveDate(convertXMLGCToString(recMeme.getMEMEELIGDT()));
					}
					if (recMeme.getMEMEORIGEFFDT() != null) {
						member.setEffectiveToDate(convertXMLGCToString(recMeme.getMEMEORIGEFFDT()));
					}

					String address = recMeme.getSBADADDR1MAIL() != null ? recMeme.getSBADADDR1MAIL()
							: "" + recMeme.getSBADADDR2MAIL() != null ? recMeme.getSBADADDR2MAIL()
									: "" + recMeme.getSBADADDR3MAIL() != null ? recMeme.getSBADADDR3MAIL() : "";
					member.setAddress(address);
					member.setCity(recMeme.getSBADCITYMAIL());
					member.setState(recMeme.getSBADSTATEMAIL());
					member.setZip(recMeme.getSBADZIPMAIL());
				}
			}
		}

		return member;
	}

	private Authorization setUtilization(SearchUmUMSVV4MemberKeyResponse searchUmUMSVV4MemberKeyResponse) {
		Authorization authorization = new Authorization();
		if (searchUmUMSVV4MemberKeyResponse != null) {
			ArrayOfRECUMSV recUmsvArray = searchUmUMSVV4MemberKeyResponse.getSearchUmUMSVV4MemberKeyResult()
					.getUMSVCOLL();

			if (recUmsvArray != null && recUmsvArray.getRECUMSV() != null) {
				List<RECUMSV> recUmsvList = recUmsvArray.getRECUMSV();
				for (RECUMSV recUmsv : recUmsvList) {

					authorization.setPriorAuth(recUmsv.getUMSVAUTHIND());
					authorization.setAuthType(recUmsv.getUMSVAUTHIND());
					authorization.setReferringProvider(recUmsv.getUMSVPRPRIDREQ());
					authorization.setAuthProvider(recUmsv.getUMSVPREAUTHPROV());

					authorization.setProcedureCode(recUmsv.getIPCDID());
					authorization.setProcedureDesc(recUmsv.getIPCDDESC());
					authorization.setDiagnosisCode(recUmsv.getUMSVIDCDIDPRI());
					authorization.setDiagnosisDesc(recUmsv.getUMSVIDCDIDPRIDESC());
					authorization.setApprovalAmt(recUmsv.getUMSVAMTALLOW().toString());
					authorization.setReqStartDate(convertXMLGCToString(recUmsv.getUMSVFROMDT()));
					authorization.setReqEndDate(convertXMLGCToString(recUmsv.getUMSVTODT()));

				}
			}
		}
		return authorization;
	}

	/**
	 *
	 * API method to retrieve Utilization Info
	 **/
	@Override
	public Authorization getUtilization(String id, XMLGregorianCalendar utilFromDate, XMLGregorianCalendar utilToDate,
			String reviewType) {
		LOGGER.info("in MemberServiceImpl getUtilization()");
		SearchUmUMSVV4MemberKey getSearchUmUMSVV4MemberKeyRequest = new SearchUmUMSVV4MemberKey();
		com.trizetto.fxi.isl.fawsvcinpsearchumumsv_v4.Config config = new com.trizetto.fxi.isl.fawsvcinpsearchumumsv_v4.Config();
		Authorization authorization = new Authorization();

		config.setFacetsIdentity(memberProperty.getConfigIdentity());
		config.setRegion(memberProperty.getConfigRegion());
		
		getSearchUmUMSVV4MemberKeyRequest.setPMEMECK(Long.parseLong(id));
		getSearchUmUMSVV4MemberKeyRequest.setPUMSVFROMDT(utilFromDate);
		getSearchUmUMSVV4MemberKeyRequest.setPUMSVTODT(utilToDate);
		getSearchUmUMSVV4MemberKeyRequest.setPConfig(config);
		getSearchUmUMSVV4MemberKeyRequest.setPPAGE(memberProperty.getPages());
		getSearchUmUMSVV4MemberKeyRequest.setPPAGESIZE(memberProperty.getPageSize());
		getSearchUmUMSVV4MemberKeyRequest.setPSKIPROWS(memberProperty.getSkipRows());
		getSearchUmUMSVV4MemberKeyRequest.setPREVIEWTYPE(reviewType);
		SearchUmUMSVV4MemberKeyResponse searchUmUMSVV4MemberKeyResponse = (SearchUmUMSVV4MemberKeyResponse) webServiceConnector
				.callWebService(memberProperty.getUtilizationWsdl(), getSearchUmUMSVV4MemberKeyRequest,
						memberProperty.getUtilizationNameSpace());

		authorization = setUtilization(searchUmUMSVV4MemberKeyResponse);
		return authorization;
	}
}
