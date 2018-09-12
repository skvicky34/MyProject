
package com.trizetto.fxi.isl.fawsvcinplistclaimcdml_v9;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for REC_CDML complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REC_CDML"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://trizetto.com/fxi/isl/FaWsvcInpListClaimCDML_v9}RecordBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CLCL_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDML_SEQ_NO" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MEME_CK" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="RCRC_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SESE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SESE_RULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PSCD_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IPCD_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IDCD_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IDCD_ID_REL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDML_ROOM_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDML_FROM_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CDML_TO_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CDML_CHG_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CDML_OOP_CALC_BASE" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CDML_CONSIDER_CHG" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CDML_ALLOW" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CDML_UNITS" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CDML_UNITS_ALLOW" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CDML_CAP_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDML_REF_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDML_PC_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDML_PAID_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CDML_DED_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CDML_COPAY_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CDML_COINS_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CDML_DISALL_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CDML_DISALL_EXCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PN_DISALL_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="PN_DISALL_EXCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SE_DISALL_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="SE_DISALL_EXCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LT_DISALL_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="LT_DISALL_EXCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RW_DISALL_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="RW_DISALL_EXCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UM_DISALL_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="UM_DISALL_EXCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CE_DISALL_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CE_DISALL_EXCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DS_DISALL_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="DS_DISALL_EXCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SP_DISALL_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="SP_DISALL_EXCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PI_DISALL_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="PI_DISALL_EXCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PC_DISALL_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="PC_DISALL_EXCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SD_DISALL_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="SD_DISALL_EXCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDML_EOB_EXCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IPCD_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RCRC_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SEDS_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IDCD_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PSCD_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDML_ROOM_TYPE_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDML_REF_IND_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDML_PC_IND_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDML_CAP_IND_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DISALL_EXCD_TEXT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DISALL_EXCD_TEXT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DISALL_EXCD_HC_STAT_CAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DISALL_EXCD_HC_STAT_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DISALL_EXCD_HC_ADJ_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PN_DISALL_EXCD_TEXT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PN_DISALL_EXCD_TEXT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PN_DISALL_EXCD_HC_STAT_CAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PN_DISALL_EXCD_HC_STAT_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PN_DISALL_EXCD_HC_ADJ_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SE_DISALL_EXCD_TEXT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SE_DISALL_EXCD_TEXT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SE_DISALL_EXCD_HC_STAT_CAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SE_DISALL_EXCD_HC_STAT_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SE_DISALL_EXCD_HC_ADJ_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LT_DISALL_EXCD_TEXT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LT_DISALL_EXCD_TEXT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LT_DISALL_EXCD_HC_STAT_CAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LT_DISALL_EXCD_HC_STAT_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LT_DISALL_EXCD_HC_ADJ_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RW_DISALL_EXCD_TEXT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RW_DISALL_EXCD_TEXT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RW_DISALL_EXCD_HC_STAT_CAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RW_DISALL_EXCD_HC_STAT_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RW_DISALL_EXCD_HC_ADJ_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UM_DISALL_EXCD_TEXT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UM_DISALL_EXCD_TEXT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UM_DISALL_EXCD_HC_STAT_CAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UM_DISALL_EXCD_HC_STAT_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UM_DISALL_EXCD_HC_ADJ_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CE_DISALL_EXCD_TEXT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CE_DISALL_EXCD_TEXT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CE_DISALL_EXCD_HC_STAT_CAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CE_DISALL_EXCD_HC_STAT_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CE_DISALL_EXCD_HC_ADJ_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DS_DISALL_EXCD_TEXT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DS_DISALL_EXCD_TEXT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DS_DISALL_EXCD_HC_STAT_CAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DS_DISALL_EXCD_HC_STAT_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DS_DISALL_EXCD_HC_ADJ_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SP_DISALL_EXCD_TEXT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SP_DISALL_EXCD_TEXT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SP_DISALL_EXCD_HC_STAT_CAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SP_DISALL_EXCD_HC_STAT_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SP_DISALL_EXCD_HC_ADJ_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PC_DISALL_EXCD_TEXT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PC_DISALL_EXCD_TEXT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PC_DISALL_EXCD_HC_STAT_CAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PC_DISALL_EXCD_HC_STAT_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PC_DISALL_EXCD_HC_ADJ_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PI_DISALL_EXCD_TEXT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PI_DISALL_EXCD_TEXT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PI_DISALL_EXCD_HC_STAT_CAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PI_DISALL_EXCD_HC_STAT_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PI_DISALL_EXCD_HC_ADJ_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SD_DISALL_EXCD_TEXT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SD_DISALL_EXCD_TEXT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SD_DISALL_EXCD_HC_STAT_CAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SD_DISALL_EXCD_HC_STAT_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SD_DISALL_EXCD_HC_ADJ_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EOB_EXCD_TEXT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EOB_EXCD_TEXT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EOB_EXCD_HC_STAT_CAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EOB_EXCD_HC_STAT_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EOB_EXCD_HC_ADJ_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRPR_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRPR_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRPR_NPI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDML_RISK_WH_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CDML_PR_PYMT_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CDML_SB_PYMT_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CDML_UMREF_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDML_REFSV_SEQ_NO" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CDML_UMAUTH_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDML_AUTHSV_SEQ_NO" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="GRGR_CK" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="SBSB_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SBIH_SBSB_ID_ORIG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MEME_SFX" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MEME_LAST_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MEME_FIRST_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MEME_MID_INIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MEME_REL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MEME_REL_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRPR_ENTITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDML_TOT_PA_LIAB" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CDML_DIS_PA_LIAB" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CDHL_CONSIDER_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CDHL_NONCONSDR_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CDHL_DISALL_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="EXCD_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EXCD_ID_TEXT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EXCD_ID_TEXT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EXCD_ID_EXCD_HC_STAT_CAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EXCD_ID_EXCD_HC_STAT_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EXCD_ID_EXCD_HC_ADJ_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDHL_PAID_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CDHL_SB_PYMT_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CDHL_PR_PYMT_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="LOBD_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LOBD_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDHL_HSA_PCS_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDHL_HSA_PCS_IND_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDMF_EXPNS_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CDMF_PAID_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CDMF_DISALL_EXCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDMF_DISALL_EXCD_TEXT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDMF_DISALL_EXCD_TEXT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDMF_DISALL_EXCD_HC_STAT_CAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDMF_DISALL_EXCD_HC_STAT_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDMF_DISALL_EXCD_HC_ADJ_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SESE_FSA_REIMB_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SESE_FSA_REIMB_IND_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLST_STS_DTM" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="MCRL_MEME_CREL_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MCRL_CREL_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSD_PRPR_ID_REND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSD_PRPR_ID_REND_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSD_PRPR_RE_NPI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSD_PRPR_RE_TAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSD_SVC_AREA_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSD_SVC_AREA_IND_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSD_MED_AMB_ZIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DFSC_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DFSC_ID_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSD_DOFR_RISK_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSD_DOFR_RISK_IND_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSD_DOFR_RISK_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSD_DOFR_RISK_ID_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSD_DOFR_DELG_CL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSD_DOFR_DELG_CL_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSD_DOFR_CL_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSD_DOFR_CL_ID_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSD_DOFR_DELG_UM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSD_DOFR_DELG_UM_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSD_DOFR_UM_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSD_DOFR_UM_ID_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSD_LINE_GRP_PTR" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CDSD_HIER_VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSD_VALUE_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CDSD_STOPLOSS_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CDSD_NET_VALUE_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CDPE_PRPR_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDPE_NPI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDPE_TAX_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EAPG_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EAPG_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EAPM_PAY_METH_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EAPM_PAY_METH_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRCF_MCTR_SPEC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRCF_MCTR_SPEC_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSD_SURCH_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="SCPA_SURCH_PCT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CDSD_MCTR_REAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSD_MCTR_REAS_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VBBD_RULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VBBD_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSD_VBB_EXCD_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSD_VBB_EXCD_ID_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IDCD_ID_SUB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IDCD_ID_SUB_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IDCD_ID_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IDCD_ID_TRANS_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDML_DISC_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="SCPA_EXCD_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SCPA_EXCD_ID_TEXT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SCPA_EXCD_ID_TEXT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSD_FAM_IND" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CDSD_FAM_IND_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDML_IPCD_MOD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDML_IPCD_MOD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDML_IPCD_MOD4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDML_CLMD_TYPE2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDML_CLMD_TYPE3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDML_CLMD_TYPE4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDML_CLMD_TYPE5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDML_CLMD_TYPE6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDML_CLMD_TYPE7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDML_CLMD_TYPE8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSD_PBA_BUND_IND_NVL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSD_PBA_BUND_TYPE_NVL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSP_CL_NTWK_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSP_SC_CL_NET_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LTLT_PFX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LTLT_PFX_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSP_SC_LTLT_PFX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSP_LTLT_PFX_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DEDE_PFX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DEDE_PFX_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSP_SC_DEDE_PFX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSP_SC_DEDE_PFX_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSP_PRICE_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CDSP_SC_PRICE_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="SEPY_PFX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SEPY_PFX_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSP_SC_SEPY_PFX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSP_SC_SEPY_PFX_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSP_SC_SESE_RULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSP_ALLOW_AMT" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CDSP_SC_ALLOW_AMT" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CDSP_DED_AMT" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CDSP_SC_DED_AMT" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CDSP_DED_ACCUM_NO" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CDSP_SC_DED_ACC_NO" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CDSP_COPAY_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CDSP_SC_COPAY_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CDSP_COINS_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CDSP_SC_COINS_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CDSP_UNITS_ALLOW" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CDSP_SC_UNITS_ALLOW" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CDSP_PAID_AMT" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CDSP_SC_PAID_AMT" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CDSP_DISALL_AMT" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CDSP_SC_DISALL_AMT" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CDSP_DISALL_EXCD_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSP_DISALL_EXCD_TEXT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSP_DISALL_EXCD_TEXT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSP_SC_DIS_EXCD_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSP_SC_DISALL_EXCD_TEXT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSP_SC_DISALL_EXCD_TEXT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSP_SEPY_EXP_CAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSP_SC_SP_EXP_CAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSP_SEPY_ACCT_CAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSP_SC_SP_ACT_CAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSP_EOB_EXCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSP_EOB_EXCD_TEXT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSP_EOB_DISALL_EXCD_TEXT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSP_SC_EOB_EXCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSP_SC_EOB_EXCD_TEXT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSP_SC_EOB_DISALL_EXCD_TEXT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="APCD_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSP_SC_APCD_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="APSI_STS_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSP_SC_APSI_STS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDSP_UNITS_APLY" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CDSP_SC_UNITS_APLY" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CDSP_AMT_APLY" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CDSP_SC_AMT_APLY" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="EHBD_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EHBD_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDNP_COLL" type="{http://trizetto.com/fxi/isl/FaWsvcInpListClaimCDML_v9}ArrayOfREC_CDNP" minOccurs="0"/&gt;
 *         &lt;element name="CDLM_COLL" type="{http://trizetto.com/fxi/isl/FaWsvcInpListClaimCDML_v9}ArrayOfREC_CDLM" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REC_CDML", propOrder = {
    "clclid",
    "cdmlseqno",
    "memeck",
    "rcrcid",
    "seseid",
    "seserule",
    "pscdid",
    "ipcdid",
    "idcdid",
    "idcdidrel",
    "cdmlroomtype",
    "cdmlfromdt",
    "cdmltodt",
    "cdmlchgamt",
    "cdmloopcalcbase",
    "cdmlconsiderchg",
    "cdmlallow",
    "cdmlunits",
    "cdmlunitsallow",
    "cdmlcapind",
    "cdmlrefind",
    "cdmlpcind",
    "cdmlpaidamt",
    "cdmldedamt",
    "cdmlcopayamt",
    "cdmlcoinsamt",
    "cdmldisallamt",
    "cdmldisallexcd",
    "pndisallamt",
    "pndisallexcd",
    "sedisallamt",
    "sedisallexcd",
    "ltdisallamt",
    "ltdisallexcd",
    "rwdisallamt",
    "rwdisallexcd",
    "umdisallamt",
    "umdisallexcd",
    "cedisallamt",
    "cedisallexcd",
    "dsdisallamt",
    "dsdisallexcd",
    "spdisallamt",
    "spdisallexcd",
    "pidisallamt",
    "pidisallexcd",
    "pcdisallamt",
    "pcdisallexcd",
    "sddisallamt",
    "sddisallexcd",
    "cdmleobexcd",
    "ipcddesc",
    "rcrcdesc",
    "sedsdesc",
    "idcddesc",
    "pscddesc",
    "cdmlroomtypedesc",
    "cdmlrefinddesc",
    "cdmlpcinddesc",
    "cdmlcapinddesc",
    "disallexcdtext1",
    "disallexcdtext2",
    "disallexcdhcstatcat",
    "disallexcdhcstatcd",
    "disallexcdhcadjcd",
    "pndisallexcdtext1",
    "pndisallexcdtext2",
    "pndisallexcdhcstatcat",
    "pndisallexcdhcstatcd",
    "pndisallexcdhcadjcd",
    "sedisallexcdtext1",
    "sedisallexcdtext2",
    "sedisallexcdhcstatcat",
    "sedisallexcdhcstatcd",
    "sedisallexcdhcadjcd",
    "ltdisallexcdtext1",
    "ltdisallexcdtext2",
    "ltdisallexcdhcstatcat",
    "ltdisallexcdhcstatcd",
    "ltdisallexcdhcadjcd",
    "rwdisallexcdtext1",
    "rwdisallexcdtext2",
    "rwdisallexcdhcstatcat",
    "rwdisallexcdhcstatcd",
    "rwdisallexcdhcadjcd",
    "umdisallexcdtext1",
    "umdisallexcdtext2",
    "umdisallexcdhcstatcat",
    "umdisallexcdhcstatcd",
    "umdisallexcdhcadjcd",
    "cedisallexcdtext1",
    "cedisallexcdtext2",
    "cedisallexcdhcstatcat",
    "cedisallexcdhcstatcd",
    "cedisallexcdhcadjcd",
    "dsdisallexcdtext1",
    "dsdisallexcdtext2",
    "dsdisallexcdhcstatcat",
    "dsdisallexcdhcstatcd",
    "dsdisallexcdhcadjcd",
    "spdisallexcdtext1",
    "spdisallexcdtext2",
    "spdisallexcdhcstatcat",
    "spdisallexcdhcstatcd",
    "spdisallexcdhcadjcd",
    "pcdisallexcdtext1",
    "pcdisallexcdtext2",
    "pcdisallexcdhcstatcat",
    "pcdisallexcdhcstatcd",
    "pcdisallexcdhcadjcd",
    "pidisallexcdtext1",
    "pidisallexcdtext2",
    "pidisallexcdhcstatcat",
    "pidisallexcdhcstatcd",
    "pidisallexcdhcadjcd",
    "sddisallexcdtext1",
    "sddisallexcdtext2",
    "sddisallexcdhcstatcat",
    "sddisallexcdhcstatcd",
    "sddisallexcdhcadjcd",
    "eobexcdtext1",
    "eobexcdtext2",
    "eobexcdhcstatcat",
    "eobexcdhcstatcd",
    "eobexcdhcadjcd",
    "prprid",
    "prprname",
    "prprnpi",
    "cdmlriskwhamt",
    "cdmlprpymtamt",
    "cdmlsbpymtamt",
    "cdmlumrefid",
    "cdmlrefsvseqno",
    "cdmlumauthid",
    "cdmlauthsvseqno",
    "grgrck",
    "sbsbid",
    "sbihsbsbidorig",
    "memesfx",
    "memelastname",
    "memefirstname",
    "mememidinit",
    "memerel",
    "memereldesc",
    "prprentity",
    "cdmltotpaliab",
    "cdmldispaliab",
    "cdhlconsideramt",
    "cdhlnonconsdramt",
    "cdhldisallamt",
    "excdid",
    "excdidtext1",
    "excdidtext2",
    "excdidexcdhcstatcat",
    "excdidexcdhcstatcd",
    "excdidexcdhcadjcd",
    "cdhlpaidamt",
    "cdhlsbpymtamt",
    "cdhlprpymtamt",
    "lobdid",
    "lobdname",
    "cdhlhsapcsind",
    "cdhlhsapcsinddesc",
    "cdmfexpnsamt",
    "cdmfpaidamt",
    "cdmfdisallexcd",
    "cdmfdisallexcdtext1",
    "cdmfdisallexcdtext2",
    "cdmfdisallexcdhcstatcat",
    "cdmfdisallexcdhcstatcd",
    "cdmfdisallexcdhcadjcd",
    "sesefsareimbind",
    "sesefsareimbinddesc",
    "clststsdtm",
    "mcrlmemecrelcd",
    "mcrlcreldesc",
    "cdsdprpridrend",
    "cdsdprpridrendname",
    "cdsdprprrenpi",
    "cdsdprprretax",
    "cdsdsvcareaind",
    "cdsdsvcareainddesc",
    "cdsdmedambzip",
    "dfscid",
    "dfsciddesc",
    "cdsddofrriskind",
    "cdsddofrriskinddesc",
    "cdsddofrriskid",
    "cdsddofrriskidname",
    "cdsddofrdelgcl",
    "cdsddofrdelgcldesc",
    "cdsddofrclid",
    "cdsddofrclidname",
    "cdsddofrdelgum",
    "cdsddofrdelgumdesc",
    "cdsddofrumid",
    "cdsddofrumidname",
    "cdsdlinegrpptr",
    "cdsdhiervalue",
    "cdsdvalueamt",
    "cdsdstoplossamt",
    "cdsdnetvalueamt",
    "cdpeprprid",
    "cdpenpi",
    "cdpetaxid",
    "eapgid",
    "eapgdesc",
    "eapmpaymethind",
    "eapmpaymethdesc",
    "prcfmctrspec",
    "prcfmctrspecdesc",
    "cdsdsurchamt",
    "scpasurchpct",
    "cdsdmctrreas",
    "cdsdmctrreasdesc",
    "vbbdrule",
    "vbbddesc",
    "cdsdvbbexcdid",
    "cdsdvbbexcdiddesc",
    "idcdidsub",
    "idcdidsubdesc",
    "idcdidtrans",
    "idcdidtransdesc",
    "cdmldiscamt",
    "scpaexcdid",
    "scpaexcdidtext1",
    "scpaexcdidtext2",
    "cdsdfamind",
    "cdsdfaminddesc",
    "cdmlipcdmod2",
    "cdmlipcdmod3",
    "cdmlipcdmod4",
    "cdmlclmdtype2",
    "cdmlclmdtype3",
    "cdmlclmdtype4",
    "cdmlclmdtype5",
    "cdmlclmdtype6",
    "cdmlclmdtype7",
    "cdmlclmdtype8",
    "cdsdpbabundindnvl",
    "cdsdpbabundtypenvl",
    "cdspclntwkind",
    "cdspscclnetind",
    "ltltpfx",
    "ltltpfxdesc",
    "cdspscltltpfx",
    "cdspltltpfxdesc",
    "dedepfx",
    "dedepfxdesc",
    "cdspscdedepfx",
    "cdspscdedepfxdesc",
    "cdsppriceamt",
    "cdspscpriceamt",
    "sepypfx",
    "sepypfxdesc",
    "cdspscsepypfx",
    "cdspscsepypfxdesc",
    "cdspscseserule",
    "cdspallowamt",
    "cdspscallowamt",
    "cdspdedamt",
    "cdspscdedamt",
    "cdspdedaccumno",
    "cdspscdedaccno",
    "cdspcopayamt",
    "cdspsccopayamt",
    "cdspcoinsamt",
    "cdspsccoinsamt",
    "cdspunitsallow",
    "cdspscunitsallow",
    "cdsppaidamt",
    "cdspscpaidamt",
    "cdspdisallamt",
    "cdspscdisallamt",
    "cdspdisallexcdid",
    "cdspdisallexcdtext1",
    "cdspdisallexcdtext2",
    "cdspscdisexcdid",
    "cdspscdisallexcdtext1",
    "cdspscdisallexcdtext2",
    "cdspsepyexpcat",
    "cdspscspexpcat",
    "cdspsepyacctcat",
    "cdspscspactcat",
    "cdspeobexcd",
    "cdspeobexcdtext1",
    "cdspeobdisallexcdtext2",
    "cdspsceobexcd",
    "cdspsceobexcdtext1",
    "cdspsceobdisallexcdtext2",
    "apcdid",
    "cdspscapcdid",
    "apsistsind",
    "cdspscapsists",
    "cdspunitsaply",
    "cdspscunitsaply",
    "cdspamtaply",
    "cdspscamtaply",
    "ehbdid",
    "ehbddesc",
    "cdnpcoll",
    "cdlmcoll"
})
public class RECCDML
    extends RecordBase
{

    @XmlElement(name = "CLCL_ID")
    protected String clclid;
    @XmlElement(name = "CDML_SEQ_NO", required = true, type = Integer.class, nillable = true)
    protected Integer cdmlseqno;
    @XmlElement(name = "MEME_CK", required = true, type = Long.class, nillable = true)
    protected Long memeck;
    @XmlElement(name = "RCRC_ID")
    protected String rcrcid;
    @XmlElement(name = "SESE_ID")
    protected String seseid;
    @XmlElement(name = "SESE_RULE")
    protected String seserule;
    @XmlElement(name = "PSCD_ID")
    protected String pscdid;
    @XmlElement(name = "IPCD_ID")
    protected String ipcdid;
    @XmlElement(name = "IDCD_ID")
    protected String idcdid;
    @XmlElement(name = "IDCD_ID_REL")
    protected String idcdidrel;
    @XmlElement(name = "CDML_ROOM_TYPE")
    protected String cdmlroomtype;
    @XmlElement(name = "CDML_FROM_DT", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cdmlfromdt;
    @XmlElement(name = "CDML_TO_DT", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cdmltodt;
    @XmlElement(name = "CDML_CHG_AMT", required = true, nillable = true)
    protected BigDecimal cdmlchgamt;
    @XmlElement(name = "CDML_OOP_CALC_BASE", required = true, nillable = true)
    protected BigDecimal cdmloopcalcbase;
    @XmlElement(name = "CDML_CONSIDER_CHG", required = true, nillable = true)
    protected BigDecimal cdmlconsiderchg;
    @XmlElement(name = "CDML_ALLOW", required = true, nillable = true)
    protected BigDecimal cdmlallow;
    @XmlElement(name = "CDML_UNITS", required = true, type = Integer.class, nillable = true)
    protected Integer cdmlunits;
    @XmlElement(name = "CDML_UNITS_ALLOW", required = true, type = Integer.class, nillable = true)
    protected Integer cdmlunitsallow;
    @XmlElement(name = "CDML_CAP_IND")
    protected String cdmlcapind;
    @XmlElement(name = "CDML_REF_IND")
    protected String cdmlrefind;
    @XmlElement(name = "CDML_PC_IND")
    protected String cdmlpcind;
    @XmlElement(name = "CDML_PAID_AMT", required = true, nillable = true)
    protected BigDecimal cdmlpaidamt;
    @XmlElement(name = "CDML_DED_AMT", required = true, nillable = true)
    protected BigDecimal cdmldedamt;
    @XmlElement(name = "CDML_COPAY_AMT", required = true, nillable = true)
    protected BigDecimal cdmlcopayamt;
    @XmlElement(name = "CDML_COINS_AMT", required = true, nillable = true)
    protected BigDecimal cdmlcoinsamt;
    @XmlElement(name = "CDML_DISALL_AMT", required = true, nillable = true)
    protected BigDecimal cdmldisallamt;
    @XmlElement(name = "CDML_DISALL_EXCD")
    protected String cdmldisallexcd;
    @XmlElement(name = "PN_DISALL_AMT", required = true, nillable = true)
    protected BigDecimal pndisallamt;
    @XmlElement(name = "PN_DISALL_EXCD")
    protected String pndisallexcd;
    @XmlElement(name = "SE_DISALL_AMT", required = true, nillable = true)
    protected BigDecimal sedisallamt;
    @XmlElement(name = "SE_DISALL_EXCD")
    protected String sedisallexcd;
    @XmlElement(name = "LT_DISALL_AMT", required = true, nillable = true)
    protected BigDecimal ltdisallamt;
    @XmlElement(name = "LT_DISALL_EXCD")
    protected String ltdisallexcd;
    @XmlElement(name = "RW_DISALL_AMT", required = true, nillable = true)
    protected BigDecimal rwdisallamt;
    @XmlElement(name = "RW_DISALL_EXCD")
    protected String rwdisallexcd;
    @XmlElement(name = "UM_DISALL_AMT", required = true, nillable = true)
    protected BigDecimal umdisallamt;
    @XmlElement(name = "UM_DISALL_EXCD")
    protected String umdisallexcd;
    @XmlElement(name = "CE_DISALL_AMT", required = true, nillable = true)
    protected BigDecimal cedisallamt;
    @XmlElement(name = "CE_DISALL_EXCD")
    protected String cedisallexcd;
    @XmlElement(name = "DS_DISALL_AMT", required = true, nillable = true)
    protected BigDecimal dsdisallamt;
    @XmlElement(name = "DS_DISALL_EXCD")
    protected String dsdisallexcd;
    @XmlElement(name = "SP_DISALL_AMT", required = true, nillable = true)
    protected BigDecimal spdisallamt;
    @XmlElement(name = "SP_DISALL_EXCD")
    protected String spdisallexcd;
    @XmlElement(name = "PI_DISALL_AMT", required = true, nillable = true)
    protected BigDecimal pidisallamt;
    @XmlElement(name = "PI_DISALL_EXCD")
    protected String pidisallexcd;
    @XmlElement(name = "PC_DISALL_AMT", required = true, nillable = true)
    protected BigDecimal pcdisallamt;
    @XmlElement(name = "PC_DISALL_EXCD")
    protected String pcdisallexcd;
    @XmlElement(name = "SD_DISALL_AMT", required = true, nillable = true)
    protected BigDecimal sddisallamt;
    @XmlElement(name = "SD_DISALL_EXCD")
    protected String sddisallexcd;
    @XmlElement(name = "CDML_EOB_EXCD")
    protected String cdmleobexcd;
    @XmlElement(name = "IPCD_DESC")
    protected String ipcddesc;
    @XmlElement(name = "RCRC_DESC")
    protected String rcrcdesc;
    @XmlElement(name = "SEDS_DESC")
    protected String sedsdesc;
    @XmlElement(name = "IDCD_DESC")
    protected String idcddesc;
    @XmlElement(name = "PSCD_DESC")
    protected String pscddesc;
    @XmlElement(name = "CDML_ROOM_TYPE_DESC")
    protected String cdmlroomtypedesc;
    @XmlElement(name = "CDML_REF_IND_DESC")
    protected String cdmlrefinddesc;
    @XmlElement(name = "CDML_PC_IND_DESC")
    protected String cdmlpcinddesc;
    @XmlElement(name = "CDML_CAP_IND_DESC")
    protected String cdmlcapinddesc;
    @XmlElement(name = "DISALL_EXCD_TEXT1")
    protected String disallexcdtext1;
    @XmlElement(name = "DISALL_EXCD_TEXT2")
    protected String disallexcdtext2;
    @XmlElement(name = "DISALL_EXCD_HC_STAT_CAT")
    protected String disallexcdhcstatcat;
    @XmlElement(name = "DISALL_EXCD_HC_STAT_CD")
    protected String disallexcdhcstatcd;
    @XmlElement(name = "DISALL_EXCD_HC_ADJ_CD")
    protected String disallexcdhcadjcd;
    @XmlElement(name = "PN_DISALL_EXCD_TEXT1")
    protected String pndisallexcdtext1;
    @XmlElement(name = "PN_DISALL_EXCD_TEXT2")
    protected String pndisallexcdtext2;
    @XmlElement(name = "PN_DISALL_EXCD_HC_STAT_CAT")
    protected String pndisallexcdhcstatcat;
    @XmlElement(name = "PN_DISALL_EXCD_HC_STAT_CD")
    protected String pndisallexcdhcstatcd;
    @XmlElement(name = "PN_DISALL_EXCD_HC_ADJ_CD")
    protected String pndisallexcdhcadjcd;
    @XmlElement(name = "SE_DISALL_EXCD_TEXT1")
    protected String sedisallexcdtext1;
    @XmlElement(name = "SE_DISALL_EXCD_TEXT2")
    protected String sedisallexcdtext2;
    @XmlElement(name = "SE_DISALL_EXCD_HC_STAT_CAT")
    protected String sedisallexcdhcstatcat;
    @XmlElement(name = "SE_DISALL_EXCD_HC_STAT_CD")
    protected String sedisallexcdhcstatcd;
    @XmlElement(name = "SE_DISALL_EXCD_HC_ADJ_CD")
    protected String sedisallexcdhcadjcd;
    @XmlElement(name = "LT_DISALL_EXCD_TEXT1")
    protected String ltdisallexcdtext1;
    @XmlElement(name = "LT_DISALL_EXCD_TEXT2")
    protected String ltdisallexcdtext2;
    @XmlElement(name = "LT_DISALL_EXCD_HC_STAT_CAT")
    protected String ltdisallexcdhcstatcat;
    @XmlElement(name = "LT_DISALL_EXCD_HC_STAT_CD")
    protected String ltdisallexcdhcstatcd;
    @XmlElement(name = "LT_DISALL_EXCD_HC_ADJ_CD")
    protected String ltdisallexcdhcadjcd;
    @XmlElement(name = "RW_DISALL_EXCD_TEXT1")
    protected String rwdisallexcdtext1;
    @XmlElement(name = "RW_DISALL_EXCD_TEXT2")
    protected String rwdisallexcdtext2;
    @XmlElement(name = "RW_DISALL_EXCD_HC_STAT_CAT")
    protected String rwdisallexcdhcstatcat;
    @XmlElement(name = "RW_DISALL_EXCD_HC_STAT_CD")
    protected String rwdisallexcdhcstatcd;
    @XmlElement(name = "RW_DISALL_EXCD_HC_ADJ_CD")
    protected String rwdisallexcdhcadjcd;
    @XmlElement(name = "UM_DISALL_EXCD_TEXT1")
    protected String umdisallexcdtext1;
    @XmlElement(name = "UM_DISALL_EXCD_TEXT2")
    protected String umdisallexcdtext2;
    @XmlElement(name = "UM_DISALL_EXCD_HC_STAT_CAT")
    protected String umdisallexcdhcstatcat;
    @XmlElement(name = "UM_DISALL_EXCD_HC_STAT_CD")
    protected String umdisallexcdhcstatcd;
    @XmlElement(name = "UM_DISALL_EXCD_HC_ADJ_CD")
    protected String umdisallexcdhcadjcd;
    @XmlElement(name = "CE_DISALL_EXCD_TEXT1")
    protected String cedisallexcdtext1;
    @XmlElement(name = "CE_DISALL_EXCD_TEXT2")
    protected String cedisallexcdtext2;
    @XmlElement(name = "CE_DISALL_EXCD_HC_STAT_CAT")
    protected String cedisallexcdhcstatcat;
    @XmlElement(name = "CE_DISALL_EXCD_HC_STAT_CD")
    protected String cedisallexcdhcstatcd;
    @XmlElement(name = "CE_DISALL_EXCD_HC_ADJ_CD")
    protected String cedisallexcdhcadjcd;
    @XmlElement(name = "DS_DISALL_EXCD_TEXT1")
    protected String dsdisallexcdtext1;
    @XmlElement(name = "DS_DISALL_EXCD_TEXT2")
    protected String dsdisallexcdtext2;
    @XmlElement(name = "DS_DISALL_EXCD_HC_STAT_CAT")
    protected String dsdisallexcdhcstatcat;
    @XmlElement(name = "DS_DISALL_EXCD_HC_STAT_CD")
    protected String dsdisallexcdhcstatcd;
    @XmlElement(name = "DS_DISALL_EXCD_HC_ADJ_CD")
    protected String dsdisallexcdhcadjcd;
    @XmlElement(name = "SP_DISALL_EXCD_TEXT1")
    protected String spdisallexcdtext1;
    @XmlElement(name = "SP_DISALL_EXCD_TEXT2")
    protected String spdisallexcdtext2;
    @XmlElement(name = "SP_DISALL_EXCD_HC_STAT_CAT")
    protected String spdisallexcdhcstatcat;
    @XmlElement(name = "SP_DISALL_EXCD_HC_STAT_CD")
    protected String spdisallexcdhcstatcd;
    @XmlElement(name = "SP_DISALL_EXCD_HC_ADJ_CD")
    protected String spdisallexcdhcadjcd;
    @XmlElement(name = "PC_DISALL_EXCD_TEXT1")
    protected String pcdisallexcdtext1;
    @XmlElement(name = "PC_DISALL_EXCD_TEXT2")
    protected String pcdisallexcdtext2;
    @XmlElement(name = "PC_DISALL_EXCD_HC_STAT_CAT")
    protected String pcdisallexcdhcstatcat;
    @XmlElement(name = "PC_DISALL_EXCD_HC_STAT_CD")
    protected String pcdisallexcdhcstatcd;
    @XmlElement(name = "PC_DISALL_EXCD_HC_ADJ_CD")
    protected String pcdisallexcdhcadjcd;
    @XmlElement(name = "PI_DISALL_EXCD_TEXT1")
    protected String pidisallexcdtext1;
    @XmlElement(name = "PI_DISALL_EXCD_TEXT2")
    protected String pidisallexcdtext2;
    @XmlElement(name = "PI_DISALL_EXCD_HC_STAT_CAT")
    protected String pidisallexcdhcstatcat;
    @XmlElement(name = "PI_DISALL_EXCD_HC_STAT_CD")
    protected String pidisallexcdhcstatcd;
    @XmlElement(name = "PI_DISALL_EXCD_HC_ADJ_CD")
    protected String pidisallexcdhcadjcd;
    @XmlElement(name = "SD_DISALL_EXCD_TEXT1")
    protected String sddisallexcdtext1;
    @XmlElement(name = "SD_DISALL_EXCD_TEXT2")
    protected String sddisallexcdtext2;
    @XmlElement(name = "SD_DISALL_EXCD_HC_STAT_CAT")
    protected String sddisallexcdhcstatcat;
    @XmlElement(name = "SD_DISALL_EXCD_HC_STAT_CD")
    protected String sddisallexcdhcstatcd;
    @XmlElement(name = "SD_DISALL_EXCD_HC_ADJ_CD")
    protected String sddisallexcdhcadjcd;
    @XmlElement(name = "EOB_EXCD_TEXT1")
    protected String eobexcdtext1;
    @XmlElement(name = "EOB_EXCD_TEXT2")
    protected String eobexcdtext2;
    @XmlElement(name = "EOB_EXCD_HC_STAT_CAT")
    protected String eobexcdhcstatcat;
    @XmlElement(name = "EOB_EXCD_HC_STAT_CD")
    protected String eobexcdhcstatcd;
    @XmlElement(name = "EOB_EXCD_HC_ADJ_CD")
    protected String eobexcdhcadjcd;
    @XmlElement(name = "PRPR_ID")
    protected String prprid;
    @XmlElement(name = "PRPR_NAME")
    protected String prprname;
    @XmlElement(name = "PRPR_NPI")
    protected String prprnpi;
    @XmlElement(name = "CDML_RISK_WH_AMT", required = true, nillable = true)
    protected BigDecimal cdmlriskwhamt;
    @XmlElement(name = "CDML_PR_PYMT_AMT", required = true, nillable = true)
    protected BigDecimal cdmlprpymtamt;
    @XmlElement(name = "CDML_SB_PYMT_AMT", required = true, nillable = true)
    protected BigDecimal cdmlsbpymtamt;
    @XmlElement(name = "CDML_UMREF_ID")
    protected String cdmlumrefid;
    @XmlElement(name = "CDML_REFSV_SEQ_NO", required = true, type = Integer.class, nillable = true)
    protected Integer cdmlrefsvseqno;
    @XmlElement(name = "CDML_UMAUTH_ID")
    protected String cdmlumauthid;
    @XmlElement(name = "CDML_AUTHSV_SEQ_NO", required = true, type = Integer.class, nillable = true)
    protected Integer cdmlauthsvseqno;
    @XmlElement(name = "GRGR_CK", required = true, type = Long.class, nillable = true)
    protected Long grgrck;
    @XmlElement(name = "SBSB_ID")
    protected String sbsbid;
    @XmlElement(name = "SBIH_SBSB_ID_ORIG")
    protected String sbihsbsbidorig;
    @XmlElement(name = "MEME_SFX", required = true, type = Integer.class, nillable = true)
    protected Integer memesfx;
    @XmlElement(name = "MEME_LAST_NAME")
    protected String memelastname;
    @XmlElement(name = "MEME_FIRST_NAME")
    protected String memefirstname;
    @XmlElement(name = "MEME_MID_INIT")
    protected String mememidinit;
    @XmlElement(name = "MEME_REL")
    protected String memerel;
    @XmlElement(name = "MEME_REL_DESC")
    protected String memereldesc;
    @XmlElement(name = "PRPR_ENTITY")
    protected String prprentity;
    @XmlElement(name = "CDML_TOT_PA_LIAB", required = true, nillable = true)
    protected BigDecimal cdmltotpaliab;
    @XmlElement(name = "CDML_DIS_PA_LIAB", required = true, nillable = true)
    protected BigDecimal cdmldispaliab;
    @XmlElement(name = "CDHL_CONSIDER_AMT", required = true, nillable = true)
    protected BigDecimal cdhlconsideramt;
    @XmlElement(name = "CDHL_NONCONSDR_AMT", required = true, nillable = true)
    protected BigDecimal cdhlnonconsdramt;
    @XmlElement(name = "CDHL_DISALL_AMT", required = true, nillable = true)
    protected BigDecimal cdhldisallamt;
    @XmlElement(name = "EXCD_ID")
    protected String excdid;
    @XmlElement(name = "EXCD_ID_TEXT1")
    protected String excdidtext1;
    @XmlElement(name = "EXCD_ID_TEXT2")
    protected String excdidtext2;
    @XmlElement(name = "EXCD_ID_EXCD_HC_STAT_CAT")
    protected String excdidexcdhcstatcat;
    @XmlElement(name = "EXCD_ID_EXCD_HC_STAT_CD")
    protected String excdidexcdhcstatcd;
    @XmlElement(name = "EXCD_ID_EXCD_HC_ADJ_CD")
    protected String excdidexcdhcadjcd;
    @XmlElement(name = "CDHL_PAID_AMT", required = true, nillable = true)
    protected BigDecimal cdhlpaidamt;
    @XmlElement(name = "CDHL_SB_PYMT_AMT", required = true, nillable = true)
    protected BigDecimal cdhlsbpymtamt;
    @XmlElement(name = "CDHL_PR_PYMT_AMT", required = true, nillable = true)
    protected BigDecimal cdhlprpymtamt;
    @XmlElement(name = "LOBD_ID")
    protected String lobdid;
    @XmlElement(name = "LOBD_NAME")
    protected String lobdname;
    @XmlElement(name = "CDHL_HSA_PCS_IND")
    protected String cdhlhsapcsind;
    @XmlElement(name = "CDHL_HSA_PCS_IND_DESC")
    protected String cdhlhsapcsinddesc;
    @XmlElement(name = "CDMF_EXPNS_AMT", required = true, nillable = true)
    protected BigDecimal cdmfexpnsamt;
    @XmlElement(name = "CDMF_PAID_AMT", required = true, nillable = true)
    protected BigDecimal cdmfpaidamt;
    @XmlElement(name = "CDMF_DISALL_EXCD")
    protected String cdmfdisallexcd;
    @XmlElement(name = "CDMF_DISALL_EXCD_TEXT1")
    protected String cdmfdisallexcdtext1;
    @XmlElement(name = "CDMF_DISALL_EXCD_TEXT2")
    protected String cdmfdisallexcdtext2;
    @XmlElement(name = "CDMF_DISALL_EXCD_HC_STAT_CAT")
    protected String cdmfdisallexcdhcstatcat;
    @XmlElement(name = "CDMF_DISALL_EXCD_HC_STAT_CD")
    protected String cdmfdisallexcdhcstatcd;
    @XmlElement(name = "CDMF_DISALL_EXCD_HC_ADJ_CD")
    protected String cdmfdisallexcdhcadjcd;
    @XmlElement(name = "SESE_FSA_REIMB_IND")
    protected String sesefsareimbind;
    @XmlElement(name = "SESE_FSA_REIMB_IND_DESC")
    protected String sesefsareimbinddesc;
    @XmlElement(name = "CLST_STS_DTM", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clststsdtm;
    @XmlElement(name = "MCRL_MEME_CREL_CD")
    protected String mcrlmemecrelcd;
    @XmlElement(name = "MCRL_CREL_DESC")
    protected String mcrlcreldesc;
    @XmlElement(name = "CDSD_PRPR_ID_REND")
    protected String cdsdprpridrend;
    @XmlElement(name = "CDSD_PRPR_ID_REND_NAME")
    protected String cdsdprpridrendname;
    @XmlElement(name = "CDSD_PRPR_RE_NPI")
    protected String cdsdprprrenpi;
    @XmlElement(name = "CDSD_PRPR_RE_TAX")
    protected String cdsdprprretax;
    @XmlElement(name = "CDSD_SVC_AREA_IND")
    protected String cdsdsvcareaind;
    @XmlElement(name = "CDSD_SVC_AREA_IND_DESC")
    protected String cdsdsvcareainddesc;
    @XmlElement(name = "CDSD_MED_AMB_ZIP")
    protected String cdsdmedambzip;
    @XmlElement(name = "DFSC_ID")
    protected String dfscid;
    @XmlElement(name = "DFSC_ID_DESC")
    protected String dfsciddesc;
    @XmlElement(name = "CDSD_DOFR_RISK_IND")
    protected String cdsddofrriskind;
    @XmlElement(name = "CDSD_DOFR_RISK_IND_DESC")
    protected String cdsddofrriskinddesc;
    @XmlElement(name = "CDSD_DOFR_RISK_ID")
    protected String cdsddofrriskid;
    @XmlElement(name = "CDSD_DOFR_RISK_ID_NAME")
    protected String cdsddofrriskidname;
    @XmlElement(name = "CDSD_DOFR_DELG_CL")
    protected String cdsddofrdelgcl;
    @XmlElement(name = "CDSD_DOFR_DELG_CL_DESC")
    protected String cdsddofrdelgcldesc;
    @XmlElement(name = "CDSD_DOFR_CL_ID")
    protected String cdsddofrclid;
    @XmlElement(name = "CDSD_DOFR_CL_ID_NAME")
    protected String cdsddofrclidname;
    @XmlElement(name = "CDSD_DOFR_DELG_UM")
    protected String cdsddofrdelgum;
    @XmlElement(name = "CDSD_DOFR_DELG_UM_DESC")
    protected String cdsddofrdelgumdesc;
    @XmlElement(name = "CDSD_DOFR_UM_ID")
    protected String cdsddofrumid;
    @XmlElement(name = "CDSD_DOFR_UM_ID_NAME")
    protected String cdsddofrumidname;
    @XmlElement(name = "CDSD_LINE_GRP_PTR", required = true, type = Integer.class, nillable = true)
    protected Integer cdsdlinegrpptr;
    @XmlElement(name = "CDSD_HIER_VALUE")
    protected String cdsdhiervalue;
    @XmlElement(name = "CDSD_VALUE_AMT", required = true, nillable = true)
    protected BigDecimal cdsdvalueamt;
    @XmlElement(name = "CDSD_STOPLOSS_AMT", required = true, nillable = true)
    protected BigDecimal cdsdstoplossamt;
    @XmlElement(name = "CDSD_NET_VALUE_AMT", required = true, nillable = true)
    protected BigDecimal cdsdnetvalueamt;
    @XmlElement(name = "CDPE_PRPR_ID")
    protected String cdpeprprid;
    @XmlElement(name = "CDPE_NPI")
    protected String cdpenpi;
    @XmlElement(name = "CDPE_TAX_ID")
    protected String cdpetaxid;
    @XmlElement(name = "EAPG_ID")
    protected String eapgid;
    @XmlElement(name = "EAPG_DESC")
    protected String eapgdesc;
    @XmlElement(name = "EAPM_PAY_METH_IND")
    protected String eapmpaymethind;
    @XmlElement(name = "EAPM_PAY_METH_DESC")
    protected String eapmpaymethdesc;
    @XmlElement(name = "PRCF_MCTR_SPEC")
    protected String prcfmctrspec;
    @XmlElement(name = "PRCF_MCTR_SPEC_DESC")
    protected String prcfmctrspecdesc;
    @XmlElement(name = "CDSD_SURCH_AMT", required = true, nillable = true)
    protected BigDecimal cdsdsurchamt;
    @XmlElement(name = "SCPA_SURCH_PCT", required = true, nillable = true)
    protected BigDecimal scpasurchpct;
    @XmlElement(name = "CDSD_MCTR_REAS")
    protected String cdsdmctrreas;
    @XmlElement(name = "CDSD_MCTR_REAS_DESC")
    protected String cdsdmctrreasdesc;
    @XmlElement(name = "VBBD_RULE")
    protected String vbbdrule;
    @XmlElement(name = "VBBD_DESC")
    protected String vbbddesc;
    @XmlElement(name = "CDSD_VBB_EXCD_ID")
    protected String cdsdvbbexcdid;
    @XmlElement(name = "CDSD_VBB_EXCD_ID_DESC")
    protected String cdsdvbbexcdiddesc;
    @XmlElement(name = "IDCD_ID_SUB")
    protected String idcdidsub;
    @XmlElement(name = "IDCD_ID_SUB_DESC")
    protected String idcdidsubdesc;
    @XmlElement(name = "IDCD_ID_TRANS")
    protected String idcdidtrans;
    @XmlElement(name = "IDCD_ID_TRANS_DESC")
    protected String idcdidtransdesc;
    @XmlElement(name = "CDML_DISC_AMT", required = true, nillable = true)
    protected BigDecimal cdmldiscamt;
    @XmlElement(name = "SCPA_EXCD_ID")
    protected String scpaexcdid;
    @XmlElement(name = "SCPA_EXCD_ID_TEXT1")
    protected String scpaexcdidtext1;
    @XmlElement(name = "SCPA_EXCD_ID_TEXT2")
    protected String scpaexcdidtext2;
    @XmlElement(name = "CDSD_FAM_IND", required = true, type = Integer.class, nillable = true)
    protected Integer cdsdfamind;
    @XmlElement(name = "CDSD_FAM_IND_DESC")
    protected String cdsdfaminddesc;
    @XmlElement(name = "CDML_IPCD_MOD2")
    protected String cdmlipcdmod2;
    @XmlElement(name = "CDML_IPCD_MOD3")
    protected String cdmlipcdmod3;
    @XmlElement(name = "CDML_IPCD_MOD4")
    protected String cdmlipcdmod4;
    @XmlElement(name = "CDML_CLMD_TYPE2")
    protected String cdmlclmdtype2;
    @XmlElement(name = "CDML_CLMD_TYPE3")
    protected String cdmlclmdtype3;
    @XmlElement(name = "CDML_CLMD_TYPE4")
    protected String cdmlclmdtype4;
    @XmlElement(name = "CDML_CLMD_TYPE5")
    protected String cdmlclmdtype5;
    @XmlElement(name = "CDML_CLMD_TYPE6")
    protected String cdmlclmdtype6;
    @XmlElement(name = "CDML_CLMD_TYPE7")
    protected String cdmlclmdtype7;
    @XmlElement(name = "CDML_CLMD_TYPE8")
    protected String cdmlclmdtype8;
    @XmlElement(name = "CDSD_PBA_BUND_IND_NVL")
    protected String cdsdpbabundindnvl;
    @XmlElement(name = "CDSD_PBA_BUND_TYPE_NVL")
    protected String cdsdpbabundtypenvl;
    @XmlElement(name = "CDSP_CL_NTWK_IND")
    protected String cdspclntwkind;
    @XmlElement(name = "CDSP_SC_CL_NET_IND")
    protected String cdspscclnetind;
    @XmlElement(name = "LTLT_PFX")
    protected String ltltpfx;
    @XmlElement(name = "LTLT_PFX_DESC")
    protected String ltltpfxdesc;
    @XmlElement(name = "CDSP_SC_LTLT_PFX")
    protected String cdspscltltpfx;
    @XmlElement(name = "CDSP_LTLT_PFX_DESC")
    protected String cdspltltpfxdesc;
    @XmlElement(name = "DEDE_PFX")
    protected String dedepfx;
    @XmlElement(name = "DEDE_PFX_DESC")
    protected String dedepfxdesc;
    @XmlElement(name = "CDSP_SC_DEDE_PFX")
    protected String cdspscdedepfx;
    @XmlElement(name = "CDSP_SC_DEDE_PFX_DESC")
    protected String cdspscdedepfxdesc;
    @XmlElement(name = "CDSP_PRICE_AMT", required = true, nillable = true)
    protected BigDecimal cdsppriceamt;
    @XmlElement(name = "CDSP_SC_PRICE_AMT", required = true, nillable = true)
    protected BigDecimal cdspscpriceamt;
    @XmlElement(name = "SEPY_PFX")
    protected String sepypfx;
    @XmlElement(name = "SEPY_PFX_DESC")
    protected String sepypfxdesc;
    @XmlElement(name = "CDSP_SC_SEPY_PFX")
    protected String cdspscsepypfx;
    @XmlElement(name = "CDSP_SC_SEPY_PFX_DESC")
    protected String cdspscsepypfxdesc;
    @XmlElement(name = "CDSP_SC_SESE_RULE")
    protected String cdspscseserule;
    @XmlElement(name = "CDSP_ALLOW_AMT", required = true, type = Integer.class, nillable = true)
    protected Integer cdspallowamt;
    @XmlElement(name = "CDSP_SC_ALLOW_AMT", required = true, type = Integer.class, nillable = true)
    protected Integer cdspscallowamt;
    @XmlElement(name = "CDSP_DED_AMT", required = true, type = Integer.class, nillable = true)
    protected Integer cdspdedamt;
    @XmlElement(name = "CDSP_SC_DED_AMT", required = true, type = Integer.class, nillable = true)
    protected Integer cdspscdedamt;
    @XmlElement(name = "CDSP_DED_ACCUM_NO", required = true, type = Integer.class, nillable = true)
    protected Integer cdspdedaccumno;
    @XmlElement(name = "CDSP_SC_DED_ACC_NO", required = true, type = Integer.class, nillable = true)
    protected Integer cdspscdedaccno;
    @XmlElement(name = "CDSP_COPAY_AMT", required = true, nillable = true)
    protected BigDecimal cdspcopayamt;
    @XmlElement(name = "CDSP_SC_COPAY_AMT", required = true, nillable = true)
    protected BigDecimal cdspsccopayamt;
    @XmlElement(name = "CDSP_COINS_AMT", required = true, nillable = true)
    protected BigDecimal cdspcoinsamt;
    @XmlElement(name = "CDSP_SC_COINS_AMT", required = true, nillable = true)
    protected BigDecimal cdspsccoinsamt;
    @XmlElement(name = "CDSP_UNITS_ALLOW", required = true, type = Integer.class, nillable = true)
    protected Integer cdspunitsallow;
    @XmlElement(name = "CDSP_SC_UNITS_ALLOW", required = true, type = Integer.class, nillable = true)
    protected Integer cdspscunitsallow;
    @XmlElement(name = "CDSP_PAID_AMT", required = true, type = Integer.class, nillable = true)
    protected Integer cdsppaidamt;
    @XmlElement(name = "CDSP_SC_PAID_AMT", required = true, type = Integer.class, nillable = true)
    protected Integer cdspscpaidamt;
    @XmlElement(name = "CDSP_DISALL_AMT", required = true, type = Integer.class, nillable = true)
    protected Integer cdspdisallamt;
    @XmlElement(name = "CDSP_SC_DISALL_AMT", required = true, type = Integer.class, nillable = true)
    protected Integer cdspscdisallamt;
    @XmlElement(name = "CDSP_DISALL_EXCD_ID")
    protected String cdspdisallexcdid;
    @XmlElement(name = "CDSP_DISALL_EXCD_TEXT1")
    protected String cdspdisallexcdtext1;
    @XmlElement(name = "CDSP_DISALL_EXCD_TEXT2")
    protected String cdspdisallexcdtext2;
    @XmlElement(name = "CDSP_SC_DIS_EXCD_ID")
    protected String cdspscdisexcdid;
    @XmlElement(name = "CDSP_SC_DISALL_EXCD_TEXT1")
    protected String cdspscdisallexcdtext1;
    @XmlElement(name = "CDSP_SC_DISALL_EXCD_TEXT2")
    protected String cdspscdisallexcdtext2;
    @XmlElement(name = "CDSP_SEPY_EXP_CAT")
    protected String cdspsepyexpcat;
    @XmlElement(name = "CDSP_SC_SP_EXP_CAT")
    protected String cdspscspexpcat;
    @XmlElement(name = "CDSP_SEPY_ACCT_CAT")
    protected String cdspsepyacctcat;
    @XmlElement(name = "CDSP_SC_SP_ACT_CAT")
    protected String cdspscspactcat;
    @XmlElement(name = "CDSP_EOB_EXCD")
    protected String cdspeobexcd;
    @XmlElement(name = "CDSP_EOB_EXCD_TEXT1")
    protected String cdspeobexcdtext1;
    @XmlElement(name = "CDSP_EOB_DISALL_EXCD_TEXT2")
    protected String cdspeobdisallexcdtext2;
    @XmlElement(name = "CDSP_SC_EOB_EXCD")
    protected String cdspsceobexcd;
    @XmlElement(name = "CDSP_SC_EOB_EXCD_TEXT1")
    protected String cdspsceobexcdtext1;
    @XmlElement(name = "CDSP_SC_EOB_DISALL_EXCD_TEXT2")
    protected String cdspsceobdisallexcdtext2;
    @XmlElement(name = "APCD_ID")
    protected String apcdid;
    @XmlElement(name = "CDSP_SC_APCD_ID")
    protected String cdspscapcdid;
    @XmlElement(name = "APSI_STS_IND")
    protected String apsistsind;
    @XmlElement(name = "CDSP_SC_APSI_STS")
    protected String cdspscapsists;
    @XmlElement(name = "CDSP_UNITS_APLY", required = true, type = Integer.class, nillable = true)
    protected Integer cdspunitsaply;
    @XmlElement(name = "CDSP_SC_UNITS_APLY", required = true, type = Integer.class, nillable = true)
    protected Integer cdspscunitsaply;
    @XmlElement(name = "CDSP_AMT_APLY", required = true, nillable = true)
    protected BigDecimal cdspamtaply;
    @XmlElement(name = "CDSP_SC_AMT_APLY", required = true, nillable = true)
    protected BigDecimal cdspscamtaply;
    @XmlElement(name = "EHBD_ID")
    protected String ehbdid;
    @XmlElement(name = "EHBD_DESC")
    protected String ehbddesc;
    @XmlElement(name = "CDNP_COLL")
    protected ArrayOfRECCDNP cdnpcoll;
    @XmlElement(name = "CDLM_COLL")
    protected ArrayOfRECCDLM cdlmcoll;

    /**
     * Gets the value of the clclid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLCLID() {
        return clclid;
    }

    /**
     * Sets the value of the clclid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLCLID(String value) {
        this.clclid = value;
    }

    /**
     * Gets the value of the cdmlseqno property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCDMLSEQNO() {
        return cdmlseqno;
    }

    /**
     * Sets the value of the cdmlseqno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCDMLSEQNO(Integer value) {
        this.cdmlseqno = value;
    }

    /**
     * Gets the value of the memeck property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMEMECK() {
        return memeck;
    }

    /**
     * Sets the value of the memeck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMEMECK(Long value) {
        this.memeck = value;
    }

    /**
     * Gets the value of the rcrcid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCRCID() {
        return rcrcid;
    }

    /**
     * Sets the value of the rcrcid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCRCID(String value) {
        this.rcrcid = value;
    }

    /**
     * Gets the value of the seseid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSESEID() {
        return seseid;
    }

    /**
     * Sets the value of the seseid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSESEID(String value) {
        this.seseid = value;
    }

    /**
     * Gets the value of the seserule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSESERULE() {
        return seserule;
    }

    /**
     * Sets the value of the seserule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSESERULE(String value) {
        this.seserule = value;
    }

    /**
     * Gets the value of the pscdid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSCDID() {
        return pscdid;
    }

    /**
     * Sets the value of the pscdid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSCDID(String value) {
        this.pscdid = value;
    }

    /**
     * Gets the value of the ipcdid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPCDID() {
        return ipcdid;
    }

    /**
     * Sets the value of the ipcdid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPCDID(String value) {
        this.ipcdid = value;
    }

    /**
     * Gets the value of the idcdid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDCDID() {
        return idcdid;
    }

    /**
     * Sets the value of the idcdid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDCDID(String value) {
        this.idcdid = value;
    }

    /**
     * Gets the value of the idcdidrel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDCDIDREL() {
        return idcdidrel;
    }

    /**
     * Sets the value of the idcdidrel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDCDIDREL(String value) {
        this.idcdidrel = value;
    }

    /**
     * Gets the value of the cdmlroomtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDMLROOMTYPE() {
        return cdmlroomtype;
    }

    /**
     * Sets the value of the cdmlroomtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDMLROOMTYPE(String value) {
        this.cdmlroomtype = value;
    }

    /**
     * Gets the value of the cdmlfromdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCDMLFROMDT() {
        return cdmlfromdt;
    }

    /**
     * Sets the value of the cdmlfromdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCDMLFROMDT(XMLGregorianCalendar value) {
        this.cdmlfromdt = value;
    }

    /**
     * Gets the value of the cdmltodt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCDMLTODT() {
        return cdmltodt;
    }

    /**
     * Sets the value of the cdmltodt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCDMLTODT(XMLGregorianCalendar value) {
        this.cdmltodt = value;
    }

    /**
     * Gets the value of the cdmlchgamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDMLCHGAMT() {
        return cdmlchgamt;
    }

    /**
     * Sets the value of the cdmlchgamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDMLCHGAMT(BigDecimal value) {
        this.cdmlchgamt = value;
    }

    /**
     * Gets the value of the cdmloopcalcbase property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDMLOOPCALCBASE() {
        return cdmloopcalcbase;
    }

    /**
     * Sets the value of the cdmloopcalcbase property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDMLOOPCALCBASE(BigDecimal value) {
        this.cdmloopcalcbase = value;
    }

    /**
     * Gets the value of the cdmlconsiderchg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDMLCONSIDERCHG() {
        return cdmlconsiderchg;
    }

    /**
     * Sets the value of the cdmlconsiderchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDMLCONSIDERCHG(BigDecimal value) {
        this.cdmlconsiderchg = value;
    }

    /**
     * Gets the value of the cdmlallow property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDMLALLOW() {
        return cdmlallow;
    }

    /**
     * Sets the value of the cdmlallow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDMLALLOW(BigDecimal value) {
        this.cdmlallow = value;
    }

    /**
     * Gets the value of the cdmlunits property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCDMLUNITS() {
        return cdmlunits;
    }

    /**
     * Sets the value of the cdmlunits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCDMLUNITS(Integer value) {
        this.cdmlunits = value;
    }

    /**
     * Gets the value of the cdmlunitsallow property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCDMLUNITSALLOW() {
        return cdmlunitsallow;
    }

    /**
     * Sets the value of the cdmlunitsallow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCDMLUNITSALLOW(Integer value) {
        this.cdmlunitsallow = value;
    }

    /**
     * Gets the value of the cdmlcapind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDMLCAPIND() {
        return cdmlcapind;
    }

    /**
     * Sets the value of the cdmlcapind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDMLCAPIND(String value) {
        this.cdmlcapind = value;
    }

    /**
     * Gets the value of the cdmlrefind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDMLREFIND() {
        return cdmlrefind;
    }

    /**
     * Sets the value of the cdmlrefind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDMLREFIND(String value) {
        this.cdmlrefind = value;
    }

    /**
     * Gets the value of the cdmlpcind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDMLPCIND() {
        return cdmlpcind;
    }

    /**
     * Sets the value of the cdmlpcind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDMLPCIND(String value) {
        this.cdmlpcind = value;
    }

    /**
     * Gets the value of the cdmlpaidamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDMLPAIDAMT() {
        return cdmlpaidamt;
    }

    /**
     * Sets the value of the cdmlpaidamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDMLPAIDAMT(BigDecimal value) {
        this.cdmlpaidamt = value;
    }

    /**
     * Gets the value of the cdmldedamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDMLDEDAMT() {
        return cdmldedamt;
    }

    /**
     * Sets the value of the cdmldedamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDMLDEDAMT(BigDecimal value) {
        this.cdmldedamt = value;
    }

    /**
     * Gets the value of the cdmlcopayamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDMLCOPAYAMT() {
        return cdmlcopayamt;
    }

    /**
     * Sets the value of the cdmlcopayamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDMLCOPAYAMT(BigDecimal value) {
        this.cdmlcopayamt = value;
    }

    /**
     * Gets the value of the cdmlcoinsamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDMLCOINSAMT() {
        return cdmlcoinsamt;
    }

    /**
     * Sets the value of the cdmlcoinsamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDMLCOINSAMT(BigDecimal value) {
        this.cdmlcoinsamt = value;
    }

    /**
     * Gets the value of the cdmldisallamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDMLDISALLAMT() {
        return cdmldisallamt;
    }

    /**
     * Sets the value of the cdmldisallamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDMLDISALLAMT(BigDecimal value) {
        this.cdmldisallamt = value;
    }

    /**
     * Gets the value of the cdmldisallexcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDMLDISALLEXCD() {
        return cdmldisallexcd;
    }

    /**
     * Sets the value of the cdmldisallexcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDMLDISALLEXCD(String value) {
        this.cdmldisallexcd = value;
    }

    /**
     * Gets the value of the pndisallamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPNDISALLAMT() {
        return pndisallamt;
    }

    /**
     * Sets the value of the pndisallamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPNDISALLAMT(BigDecimal value) {
        this.pndisallamt = value;
    }

    /**
     * Gets the value of the pndisallexcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNDISALLEXCD() {
        return pndisallexcd;
    }

    /**
     * Sets the value of the pndisallexcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNDISALLEXCD(String value) {
        this.pndisallexcd = value;
    }

    /**
     * Gets the value of the sedisallamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSEDISALLAMT() {
        return sedisallamt;
    }

    /**
     * Sets the value of the sedisallamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSEDISALLAMT(BigDecimal value) {
        this.sedisallamt = value;
    }

    /**
     * Gets the value of the sedisallexcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEDISALLEXCD() {
        return sedisallexcd;
    }

    /**
     * Sets the value of the sedisallexcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEDISALLEXCD(String value) {
        this.sedisallexcd = value;
    }

    /**
     * Gets the value of the ltdisallamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLTDISALLAMT() {
        return ltdisallamt;
    }

    /**
     * Sets the value of the ltdisallamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLTDISALLAMT(BigDecimal value) {
        this.ltdisallamt = value;
    }

    /**
     * Gets the value of the ltdisallexcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLTDISALLEXCD() {
        return ltdisallexcd;
    }

    /**
     * Sets the value of the ltdisallexcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLTDISALLEXCD(String value) {
        this.ltdisallexcd = value;
    }

    /**
     * Gets the value of the rwdisallamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRWDISALLAMT() {
        return rwdisallamt;
    }

    /**
     * Sets the value of the rwdisallamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRWDISALLAMT(BigDecimal value) {
        this.rwdisallamt = value;
    }

    /**
     * Gets the value of the rwdisallexcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRWDISALLEXCD() {
        return rwdisallexcd;
    }

    /**
     * Sets the value of the rwdisallexcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRWDISALLEXCD(String value) {
        this.rwdisallexcd = value;
    }

    /**
     * Gets the value of the umdisallamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUMDISALLAMT() {
        return umdisallamt;
    }

    /**
     * Sets the value of the umdisallamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUMDISALLAMT(BigDecimal value) {
        this.umdisallamt = value;
    }

    /**
     * Gets the value of the umdisallexcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUMDISALLEXCD() {
        return umdisallexcd;
    }

    /**
     * Sets the value of the umdisallexcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUMDISALLEXCD(String value) {
        this.umdisallexcd = value;
    }

    /**
     * Gets the value of the cedisallamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCEDISALLAMT() {
        return cedisallamt;
    }

    /**
     * Sets the value of the cedisallamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCEDISALLAMT(BigDecimal value) {
        this.cedisallamt = value;
    }

    /**
     * Gets the value of the cedisallexcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEDISALLEXCD() {
        return cedisallexcd;
    }

    /**
     * Sets the value of the cedisallexcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEDISALLEXCD(String value) {
        this.cedisallexcd = value;
    }

    /**
     * Gets the value of the dsdisallamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDSDISALLAMT() {
        return dsdisallamt;
    }

    /**
     * Sets the value of the dsdisallamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDSDISALLAMT(BigDecimal value) {
        this.dsdisallamt = value;
    }

    /**
     * Gets the value of the dsdisallexcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSDISALLEXCD() {
        return dsdisallexcd;
    }

    /**
     * Sets the value of the dsdisallexcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSDISALLEXCD(String value) {
        this.dsdisallexcd = value;
    }

    /**
     * Gets the value of the spdisallamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSPDISALLAMT() {
        return spdisallamt;
    }

    /**
     * Sets the value of the spdisallamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSPDISALLAMT(BigDecimal value) {
        this.spdisallamt = value;
    }

    /**
     * Gets the value of the spdisallexcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPDISALLEXCD() {
        return spdisallexcd;
    }

    /**
     * Sets the value of the spdisallexcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPDISALLEXCD(String value) {
        this.spdisallexcd = value;
    }

    /**
     * Gets the value of the pidisallamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPIDISALLAMT() {
        return pidisallamt;
    }

    /**
     * Sets the value of the pidisallamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPIDISALLAMT(BigDecimal value) {
        this.pidisallamt = value;
    }

    /**
     * Gets the value of the pidisallexcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIDISALLEXCD() {
        return pidisallexcd;
    }

    /**
     * Sets the value of the pidisallexcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIDISALLEXCD(String value) {
        this.pidisallexcd = value;
    }

    /**
     * Gets the value of the pcdisallamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPCDISALLAMT() {
        return pcdisallamt;
    }

    /**
     * Sets the value of the pcdisallamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPCDISALLAMT(BigDecimal value) {
        this.pcdisallamt = value;
    }

    /**
     * Gets the value of the pcdisallexcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCDISALLEXCD() {
        return pcdisallexcd;
    }

    /**
     * Sets the value of the pcdisallexcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCDISALLEXCD(String value) {
        this.pcdisallexcd = value;
    }

    /**
     * Gets the value of the sddisallamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSDDISALLAMT() {
        return sddisallamt;
    }

    /**
     * Sets the value of the sddisallamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSDDISALLAMT(BigDecimal value) {
        this.sddisallamt = value;
    }

    /**
     * Gets the value of the sddisallexcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDDISALLEXCD() {
        return sddisallexcd;
    }

    /**
     * Sets the value of the sddisallexcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDDISALLEXCD(String value) {
        this.sddisallexcd = value;
    }

    /**
     * Gets the value of the cdmleobexcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDMLEOBEXCD() {
        return cdmleobexcd;
    }

    /**
     * Sets the value of the cdmleobexcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDMLEOBEXCD(String value) {
        this.cdmleobexcd = value;
    }

    /**
     * Gets the value of the ipcddesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPCDDESC() {
        return ipcddesc;
    }

    /**
     * Sets the value of the ipcddesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPCDDESC(String value) {
        this.ipcddesc = value;
    }

    /**
     * Gets the value of the rcrcdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCRCDESC() {
        return rcrcdesc;
    }

    /**
     * Sets the value of the rcrcdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCRCDESC(String value) {
        this.rcrcdesc = value;
    }

    /**
     * Gets the value of the sedsdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEDSDESC() {
        return sedsdesc;
    }

    /**
     * Sets the value of the sedsdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEDSDESC(String value) {
        this.sedsdesc = value;
    }

    /**
     * Gets the value of the idcddesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDCDDESC() {
        return idcddesc;
    }

    /**
     * Sets the value of the idcddesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDCDDESC(String value) {
        this.idcddesc = value;
    }

    /**
     * Gets the value of the pscddesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSCDDESC() {
        return pscddesc;
    }

    /**
     * Sets the value of the pscddesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSCDDESC(String value) {
        this.pscddesc = value;
    }

    /**
     * Gets the value of the cdmlroomtypedesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDMLROOMTYPEDESC() {
        return cdmlroomtypedesc;
    }

    /**
     * Sets the value of the cdmlroomtypedesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDMLROOMTYPEDESC(String value) {
        this.cdmlroomtypedesc = value;
    }

    /**
     * Gets the value of the cdmlrefinddesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDMLREFINDDESC() {
        return cdmlrefinddesc;
    }

    /**
     * Sets the value of the cdmlrefinddesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDMLREFINDDESC(String value) {
        this.cdmlrefinddesc = value;
    }

    /**
     * Gets the value of the cdmlpcinddesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDMLPCINDDESC() {
        return cdmlpcinddesc;
    }

    /**
     * Sets the value of the cdmlpcinddesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDMLPCINDDESC(String value) {
        this.cdmlpcinddesc = value;
    }

    /**
     * Gets the value of the cdmlcapinddesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDMLCAPINDDESC() {
        return cdmlcapinddesc;
    }

    /**
     * Sets the value of the cdmlcapinddesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDMLCAPINDDESC(String value) {
        this.cdmlcapinddesc = value;
    }

    /**
     * Gets the value of the disallexcdtext1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISALLEXCDTEXT1() {
        return disallexcdtext1;
    }

    /**
     * Sets the value of the disallexcdtext1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISALLEXCDTEXT1(String value) {
        this.disallexcdtext1 = value;
    }

    /**
     * Gets the value of the disallexcdtext2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISALLEXCDTEXT2() {
        return disallexcdtext2;
    }

    /**
     * Sets the value of the disallexcdtext2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISALLEXCDTEXT2(String value) {
        this.disallexcdtext2 = value;
    }

    /**
     * Gets the value of the disallexcdhcstatcat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISALLEXCDHCSTATCAT() {
        return disallexcdhcstatcat;
    }

    /**
     * Sets the value of the disallexcdhcstatcat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISALLEXCDHCSTATCAT(String value) {
        this.disallexcdhcstatcat = value;
    }

    /**
     * Gets the value of the disallexcdhcstatcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISALLEXCDHCSTATCD() {
        return disallexcdhcstatcd;
    }

    /**
     * Sets the value of the disallexcdhcstatcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISALLEXCDHCSTATCD(String value) {
        this.disallexcdhcstatcd = value;
    }

    /**
     * Gets the value of the disallexcdhcadjcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISALLEXCDHCADJCD() {
        return disallexcdhcadjcd;
    }

    /**
     * Sets the value of the disallexcdhcadjcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISALLEXCDHCADJCD(String value) {
        this.disallexcdhcadjcd = value;
    }

    /**
     * Gets the value of the pndisallexcdtext1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNDISALLEXCDTEXT1() {
        return pndisallexcdtext1;
    }

    /**
     * Sets the value of the pndisallexcdtext1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNDISALLEXCDTEXT1(String value) {
        this.pndisallexcdtext1 = value;
    }

    /**
     * Gets the value of the pndisallexcdtext2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNDISALLEXCDTEXT2() {
        return pndisallexcdtext2;
    }

    /**
     * Sets the value of the pndisallexcdtext2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNDISALLEXCDTEXT2(String value) {
        this.pndisallexcdtext2 = value;
    }

    /**
     * Gets the value of the pndisallexcdhcstatcat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNDISALLEXCDHCSTATCAT() {
        return pndisallexcdhcstatcat;
    }

    /**
     * Sets the value of the pndisallexcdhcstatcat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNDISALLEXCDHCSTATCAT(String value) {
        this.pndisallexcdhcstatcat = value;
    }

    /**
     * Gets the value of the pndisallexcdhcstatcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNDISALLEXCDHCSTATCD() {
        return pndisallexcdhcstatcd;
    }

    /**
     * Sets the value of the pndisallexcdhcstatcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNDISALLEXCDHCSTATCD(String value) {
        this.pndisallexcdhcstatcd = value;
    }

    /**
     * Gets the value of the pndisallexcdhcadjcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNDISALLEXCDHCADJCD() {
        return pndisallexcdhcadjcd;
    }

    /**
     * Sets the value of the pndisallexcdhcadjcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNDISALLEXCDHCADJCD(String value) {
        this.pndisallexcdhcadjcd = value;
    }

    /**
     * Gets the value of the sedisallexcdtext1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEDISALLEXCDTEXT1() {
        return sedisallexcdtext1;
    }

    /**
     * Sets the value of the sedisallexcdtext1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEDISALLEXCDTEXT1(String value) {
        this.sedisallexcdtext1 = value;
    }

    /**
     * Gets the value of the sedisallexcdtext2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEDISALLEXCDTEXT2() {
        return sedisallexcdtext2;
    }

    /**
     * Sets the value of the sedisallexcdtext2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEDISALLEXCDTEXT2(String value) {
        this.sedisallexcdtext2 = value;
    }

    /**
     * Gets the value of the sedisallexcdhcstatcat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEDISALLEXCDHCSTATCAT() {
        return sedisallexcdhcstatcat;
    }

    /**
     * Sets the value of the sedisallexcdhcstatcat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEDISALLEXCDHCSTATCAT(String value) {
        this.sedisallexcdhcstatcat = value;
    }

    /**
     * Gets the value of the sedisallexcdhcstatcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEDISALLEXCDHCSTATCD() {
        return sedisallexcdhcstatcd;
    }

    /**
     * Sets the value of the sedisallexcdhcstatcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEDISALLEXCDHCSTATCD(String value) {
        this.sedisallexcdhcstatcd = value;
    }

    /**
     * Gets the value of the sedisallexcdhcadjcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEDISALLEXCDHCADJCD() {
        return sedisallexcdhcadjcd;
    }

    /**
     * Sets the value of the sedisallexcdhcadjcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEDISALLEXCDHCADJCD(String value) {
        this.sedisallexcdhcadjcd = value;
    }

    /**
     * Gets the value of the ltdisallexcdtext1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLTDISALLEXCDTEXT1() {
        return ltdisallexcdtext1;
    }

    /**
     * Sets the value of the ltdisallexcdtext1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLTDISALLEXCDTEXT1(String value) {
        this.ltdisallexcdtext1 = value;
    }

    /**
     * Gets the value of the ltdisallexcdtext2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLTDISALLEXCDTEXT2() {
        return ltdisallexcdtext2;
    }

    /**
     * Sets the value of the ltdisallexcdtext2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLTDISALLEXCDTEXT2(String value) {
        this.ltdisallexcdtext2 = value;
    }

    /**
     * Gets the value of the ltdisallexcdhcstatcat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLTDISALLEXCDHCSTATCAT() {
        return ltdisallexcdhcstatcat;
    }

    /**
     * Sets the value of the ltdisallexcdhcstatcat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLTDISALLEXCDHCSTATCAT(String value) {
        this.ltdisallexcdhcstatcat = value;
    }

    /**
     * Gets the value of the ltdisallexcdhcstatcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLTDISALLEXCDHCSTATCD() {
        return ltdisallexcdhcstatcd;
    }

    /**
     * Sets the value of the ltdisallexcdhcstatcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLTDISALLEXCDHCSTATCD(String value) {
        this.ltdisallexcdhcstatcd = value;
    }

    /**
     * Gets the value of the ltdisallexcdhcadjcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLTDISALLEXCDHCADJCD() {
        return ltdisallexcdhcadjcd;
    }

    /**
     * Sets the value of the ltdisallexcdhcadjcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLTDISALLEXCDHCADJCD(String value) {
        this.ltdisallexcdhcadjcd = value;
    }

    /**
     * Gets the value of the rwdisallexcdtext1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRWDISALLEXCDTEXT1() {
        return rwdisallexcdtext1;
    }

    /**
     * Sets the value of the rwdisallexcdtext1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRWDISALLEXCDTEXT1(String value) {
        this.rwdisallexcdtext1 = value;
    }

    /**
     * Gets the value of the rwdisallexcdtext2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRWDISALLEXCDTEXT2() {
        return rwdisallexcdtext2;
    }

    /**
     * Sets the value of the rwdisallexcdtext2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRWDISALLEXCDTEXT2(String value) {
        this.rwdisallexcdtext2 = value;
    }

    /**
     * Gets the value of the rwdisallexcdhcstatcat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRWDISALLEXCDHCSTATCAT() {
        return rwdisallexcdhcstatcat;
    }

    /**
     * Sets the value of the rwdisallexcdhcstatcat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRWDISALLEXCDHCSTATCAT(String value) {
        this.rwdisallexcdhcstatcat = value;
    }

    /**
     * Gets the value of the rwdisallexcdhcstatcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRWDISALLEXCDHCSTATCD() {
        return rwdisallexcdhcstatcd;
    }

    /**
     * Sets the value of the rwdisallexcdhcstatcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRWDISALLEXCDHCSTATCD(String value) {
        this.rwdisallexcdhcstatcd = value;
    }

    /**
     * Gets the value of the rwdisallexcdhcadjcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRWDISALLEXCDHCADJCD() {
        return rwdisallexcdhcadjcd;
    }

    /**
     * Sets the value of the rwdisallexcdhcadjcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRWDISALLEXCDHCADJCD(String value) {
        this.rwdisallexcdhcadjcd = value;
    }

    /**
     * Gets the value of the umdisallexcdtext1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUMDISALLEXCDTEXT1() {
        return umdisallexcdtext1;
    }

    /**
     * Sets the value of the umdisallexcdtext1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUMDISALLEXCDTEXT1(String value) {
        this.umdisallexcdtext1 = value;
    }

    /**
     * Gets the value of the umdisallexcdtext2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUMDISALLEXCDTEXT2() {
        return umdisallexcdtext2;
    }

    /**
     * Sets the value of the umdisallexcdtext2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUMDISALLEXCDTEXT2(String value) {
        this.umdisallexcdtext2 = value;
    }

    /**
     * Gets the value of the umdisallexcdhcstatcat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUMDISALLEXCDHCSTATCAT() {
        return umdisallexcdhcstatcat;
    }

    /**
     * Sets the value of the umdisallexcdhcstatcat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUMDISALLEXCDHCSTATCAT(String value) {
        this.umdisallexcdhcstatcat = value;
    }

    /**
     * Gets the value of the umdisallexcdhcstatcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUMDISALLEXCDHCSTATCD() {
        return umdisallexcdhcstatcd;
    }

    /**
     * Sets the value of the umdisallexcdhcstatcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUMDISALLEXCDHCSTATCD(String value) {
        this.umdisallexcdhcstatcd = value;
    }

    /**
     * Gets the value of the umdisallexcdhcadjcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUMDISALLEXCDHCADJCD() {
        return umdisallexcdhcadjcd;
    }

    /**
     * Sets the value of the umdisallexcdhcadjcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUMDISALLEXCDHCADJCD(String value) {
        this.umdisallexcdhcadjcd = value;
    }

    /**
     * Gets the value of the cedisallexcdtext1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEDISALLEXCDTEXT1() {
        return cedisallexcdtext1;
    }

    /**
     * Sets the value of the cedisallexcdtext1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEDISALLEXCDTEXT1(String value) {
        this.cedisallexcdtext1 = value;
    }

    /**
     * Gets the value of the cedisallexcdtext2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEDISALLEXCDTEXT2() {
        return cedisallexcdtext2;
    }

    /**
     * Sets the value of the cedisallexcdtext2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEDISALLEXCDTEXT2(String value) {
        this.cedisallexcdtext2 = value;
    }

    /**
     * Gets the value of the cedisallexcdhcstatcat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEDISALLEXCDHCSTATCAT() {
        return cedisallexcdhcstatcat;
    }

    /**
     * Sets the value of the cedisallexcdhcstatcat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEDISALLEXCDHCSTATCAT(String value) {
        this.cedisallexcdhcstatcat = value;
    }

    /**
     * Gets the value of the cedisallexcdhcstatcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEDISALLEXCDHCSTATCD() {
        return cedisallexcdhcstatcd;
    }

    /**
     * Sets the value of the cedisallexcdhcstatcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEDISALLEXCDHCSTATCD(String value) {
        this.cedisallexcdhcstatcd = value;
    }

    /**
     * Gets the value of the cedisallexcdhcadjcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEDISALLEXCDHCADJCD() {
        return cedisallexcdhcadjcd;
    }

    /**
     * Sets the value of the cedisallexcdhcadjcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEDISALLEXCDHCADJCD(String value) {
        this.cedisallexcdhcadjcd = value;
    }

    /**
     * Gets the value of the dsdisallexcdtext1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSDISALLEXCDTEXT1() {
        return dsdisallexcdtext1;
    }

    /**
     * Sets the value of the dsdisallexcdtext1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSDISALLEXCDTEXT1(String value) {
        this.dsdisallexcdtext1 = value;
    }

    /**
     * Gets the value of the dsdisallexcdtext2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSDISALLEXCDTEXT2() {
        return dsdisallexcdtext2;
    }

    /**
     * Sets the value of the dsdisallexcdtext2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSDISALLEXCDTEXT2(String value) {
        this.dsdisallexcdtext2 = value;
    }

    /**
     * Gets the value of the dsdisallexcdhcstatcat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSDISALLEXCDHCSTATCAT() {
        return dsdisallexcdhcstatcat;
    }

    /**
     * Sets the value of the dsdisallexcdhcstatcat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSDISALLEXCDHCSTATCAT(String value) {
        this.dsdisallexcdhcstatcat = value;
    }

    /**
     * Gets the value of the dsdisallexcdhcstatcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSDISALLEXCDHCSTATCD() {
        return dsdisallexcdhcstatcd;
    }

    /**
     * Sets the value of the dsdisallexcdhcstatcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSDISALLEXCDHCSTATCD(String value) {
        this.dsdisallexcdhcstatcd = value;
    }

    /**
     * Gets the value of the dsdisallexcdhcadjcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSDISALLEXCDHCADJCD() {
        return dsdisallexcdhcadjcd;
    }

    /**
     * Sets the value of the dsdisallexcdhcadjcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSDISALLEXCDHCADJCD(String value) {
        this.dsdisallexcdhcadjcd = value;
    }

    /**
     * Gets the value of the spdisallexcdtext1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPDISALLEXCDTEXT1() {
        return spdisallexcdtext1;
    }

    /**
     * Sets the value of the spdisallexcdtext1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPDISALLEXCDTEXT1(String value) {
        this.spdisallexcdtext1 = value;
    }

    /**
     * Gets the value of the spdisallexcdtext2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPDISALLEXCDTEXT2() {
        return spdisallexcdtext2;
    }

    /**
     * Sets the value of the spdisallexcdtext2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPDISALLEXCDTEXT2(String value) {
        this.spdisallexcdtext2 = value;
    }

    /**
     * Gets the value of the spdisallexcdhcstatcat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPDISALLEXCDHCSTATCAT() {
        return spdisallexcdhcstatcat;
    }

    /**
     * Sets the value of the spdisallexcdhcstatcat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPDISALLEXCDHCSTATCAT(String value) {
        this.spdisallexcdhcstatcat = value;
    }

    /**
     * Gets the value of the spdisallexcdhcstatcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPDISALLEXCDHCSTATCD() {
        return spdisallexcdhcstatcd;
    }

    /**
     * Sets the value of the spdisallexcdhcstatcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPDISALLEXCDHCSTATCD(String value) {
        this.spdisallexcdhcstatcd = value;
    }

    /**
     * Gets the value of the spdisallexcdhcadjcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPDISALLEXCDHCADJCD() {
        return spdisallexcdhcadjcd;
    }

    /**
     * Sets the value of the spdisallexcdhcadjcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPDISALLEXCDHCADJCD(String value) {
        this.spdisallexcdhcadjcd = value;
    }

    /**
     * Gets the value of the pcdisallexcdtext1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCDISALLEXCDTEXT1() {
        return pcdisallexcdtext1;
    }

    /**
     * Sets the value of the pcdisallexcdtext1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCDISALLEXCDTEXT1(String value) {
        this.pcdisallexcdtext1 = value;
    }

    /**
     * Gets the value of the pcdisallexcdtext2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCDISALLEXCDTEXT2() {
        return pcdisallexcdtext2;
    }

    /**
     * Sets the value of the pcdisallexcdtext2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCDISALLEXCDTEXT2(String value) {
        this.pcdisallexcdtext2 = value;
    }

    /**
     * Gets the value of the pcdisallexcdhcstatcat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCDISALLEXCDHCSTATCAT() {
        return pcdisallexcdhcstatcat;
    }

    /**
     * Sets the value of the pcdisallexcdhcstatcat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCDISALLEXCDHCSTATCAT(String value) {
        this.pcdisallexcdhcstatcat = value;
    }

    /**
     * Gets the value of the pcdisallexcdhcstatcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCDISALLEXCDHCSTATCD() {
        return pcdisallexcdhcstatcd;
    }

    /**
     * Sets the value of the pcdisallexcdhcstatcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCDISALLEXCDHCSTATCD(String value) {
        this.pcdisallexcdhcstatcd = value;
    }

    /**
     * Gets the value of the pcdisallexcdhcadjcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCDISALLEXCDHCADJCD() {
        return pcdisallexcdhcadjcd;
    }

    /**
     * Sets the value of the pcdisallexcdhcadjcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCDISALLEXCDHCADJCD(String value) {
        this.pcdisallexcdhcadjcd = value;
    }

    /**
     * Gets the value of the pidisallexcdtext1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIDISALLEXCDTEXT1() {
        return pidisallexcdtext1;
    }

    /**
     * Sets the value of the pidisallexcdtext1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIDISALLEXCDTEXT1(String value) {
        this.pidisallexcdtext1 = value;
    }

    /**
     * Gets the value of the pidisallexcdtext2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIDISALLEXCDTEXT2() {
        return pidisallexcdtext2;
    }

    /**
     * Sets the value of the pidisallexcdtext2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIDISALLEXCDTEXT2(String value) {
        this.pidisallexcdtext2 = value;
    }

    /**
     * Gets the value of the pidisallexcdhcstatcat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIDISALLEXCDHCSTATCAT() {
        return pidisallexcdhcstatcat;
    }

    /**
     * Sets the value of the pidisallexcdhcstatcat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIDISALLEXCDHCSTATCAT(String value) {
        this.pidisallexcdhcstatcat = value;
    }

    /**
     * Gets the value of the pidisallexcdhcstatcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIDISALLEXCDHCSTATCD() {
        return pidisallexcdhcstatcd;
    }

    /**
     * Sets the value of the pidisallexcdhcstatcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIDISALLEXCDHCSTATCD(String value) {
        this.pidisallexcdhcstatcd = value;
    }

    /**
     * Gets the value of the pidisallexcdhcadjcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIDISALLEXCDHCADJCD() {
        return pidisallexcdhcadjcd;
    }

    /**
     * Sets the value of the pidisallexcdhcadjcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIDISALLEXCDHCADJCD(String value) {
        this.pidisallexcdhcadjcd = value;
    }

    /**
     * Gets the value of the sddisallexcdtext1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDDISALLEXCDTEXT1() {
        return sddisallexcdtext1;
    }

    /**
     * Sets the value of the sddisallexcdtext1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDDISALLEXCDTEXT1(String value) {
        this.sddisallexcdtext1 = value;
    }

    /**
     * Gets the value of the sddisallexcdtext2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDDISALLEXCDTEXT2() {
        return sddisallexcdtext2;
    }

    /**
     * Sets the value of the sddisallexcdtext2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDDISALLEXCDTEXT2(String value) {
        this.sddisallexcdtext2 = value;
    }

    /**
     * Gets the value of the sddisallexcdhcstatcat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDDISALLEXCDHCSTATCAT() {
        return sddisallexcdhcstatcat;
    }

    /**
     * Sets the value of the sddisallexcdhcstatcat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDDISALLEXCDHCSTATCAT(String value) {
        this.sddisallexcdhcstatcat = value;
    }

    /**
     * Gets the value of the sddisallexcdhcstatcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDDISALLEXCDHCSTATCD() {
        return sddisallexcdhcstatcd;
    }

    /**
     * Sets the value of the sddisallexcdhcstatcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDDISALLEXCDHCSTATCD(String value) {
        this.sddisallexcdhcstatcd = value;
    }

    /**
     * Gets the value of the sddisallexcdhcadjcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDDISALLEXCDHCADJCD() {
        return sddisallexcdhcadjcd;
    }

    /**
     * Sets the value of the sddisallexcdhcadjcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDDISALLEXCDHCADJCD(String value) {
        this.sddisallexcdhcadjcd = value;
    }

    /**
     * Gets the value of the eobexcdtext1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEOBEXCDTEXT1() {
        return eobexcdtext1;
    }

    /**
     * Sets the value of the eobexcdtext1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEOBEXCDTEXT1(String value) {
        this.eobexcdtext1 = value;
    }

    /**
     * Gets the value of the eobexcdtext2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEOBEXCDTEXT2() {
        return eobexcdtext2;
    }

    /**
     * Sets the value of the eobexcdtext2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEOBEXCDTEXT2(String value) {
        this.eobexcdtext2 = value;
    }

    /**
     * Gets the value of the eobexcdhcstatcat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEOBEXCDHCSTATCAT() {
        return eobexcdhcstatcat;
    }

    /**
     * Sets the value of the eobexcdhcstatcat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEOBEXCDHCSTATCAT(String value) {
        this.eobexcdhcstatcat = value;
    }

    /**
     * Gets the value of the eobexcdhcstatcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEOBEXCDHCSTATCD() {
        return eobexcdhcstatcd;
    }

    /**
     * Sets the value of the eobexcdhcstatcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEOBEXCDHCSTATCD(String value) {
        this.eobexcdhcstatcd = value;
    }

    /**
     * Gets the value of the eobexcdhcadjcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEOBEXCDHCADJCD() {
        return eobexcdhcadjcd;
    }

    /**
     * Sets the value of the eobexcdhcadjcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEOBEXCDHCADJCD(String value) {
        this.eobexcdhcadjcd = value;
    }

    /**
     * Gets the value of the prprid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRPRID() {
        return prprid;
    }

    /**
     * Sets the value of the prprid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRPRID(String value) {
        this.prprid = value;
    }

    /**
     * Gets the value of the prprname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRPRNAME() {
        return prprname;
    }

    /**
     * Sets the value of the prprname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRPRNAME(String value) {
        this.prprname = value;
    }

    /**
     * Gets the value of the prprnpi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRPRNPI() {
        return prprnpi;
    }

    /**
     * Sets the value of the prprnpi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRPRNPI(String value) {
        this.prprnpi = value;
    }

    /**
     * Gets the value of the cdmlriskwhamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDMLRISKWHAMT() {
        return cdmlriskwhamt;
    }

    /**
     * Sets the value of the cdmlriskwhamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDMLRISKWHAMT(BigDecimal value) {
        this.cdmlriskwhamt = value;
    }

    /**
     * Gets the value of the cdmlprpymtamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDMLPRPYMTAMT() {
        return cdmlprpymtamt;
    }

    /**
     * Sets the value of the cdmlprpymtamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDMLPRPYMTAMT(BigDecimal value) {
        this.cdmlprpymtamt = value;
    }

    /**
     * Gets the value of the cdmlsbpymtamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDMLSBPYMTAMT() {
        return cdmlsbpymtamt;
    }

    /**
     * Sets the value of the cdmlsbpymtamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDMLSBPYMTAMT(BigDecimal value) {
        this.cdmlsbpymtamt = value;
    }

    /**
     * Gets the value of the cdmlumrefid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDMLUMREFID() {
        return cdmlumrefid;
    }

    /**
     * Sets the value of the cdmlumrefid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDMLUMREFID(String value) {
        this.cdmlumrefid = value;
    }

    /**
     * Gets the value of the cdmlrefsvseqno property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCDMLREFSVSEQNO() {
        return cdmlrefsvseqno;
    }

    /**
     * Sets the value of the cdmlrefsvseqno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCDMLREFSVSEQNO(Integer value) {
        this.cdmlrefsvseqno = value;
    }

    /**
     * Gets the value of the cdmlumauthid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDMLUMAUTHID() {
        return cdmlumauthid;
    }

    /**
     * Sets the value of the cdmlumauthid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDMLUMAUTHID(String value) {
        this.cdmlumauthid = value;
    }

    /**
     * Gets the value of the cdmlauthsvseqno property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCDMLAUTHSVSEQNO() {
        return cdmlauthsvseqno;
    }

    /**
     * Sets the value of the cdmlauthsvseqno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCDMLAUTHSVSEQNO(Integer value) {
        this.cdmlauthsvseqno = value;
    }

    /**
     * Gets the value of the grgrck property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGRGRCK() {
        return grgrck;
    }

    /**
     * Sets the value of the grgrck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGRGRCK(Long value) {
        this.grgrck = value;
    }

    /**
     * Gets the value of the sbsbid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBSBID() {
        return sbsbid;
    }

    /**
     * Sets the value of the sbsbid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBSBID(String value) {
        this.sbsbid = value;
    }

    /**
     * Gets the value of the sbihsbsbidorig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBIHSBSBIDORIG() {
        return sbihsbsbidorig;
    }

    /**
     * Sets the value of the sbihsbsbidorig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBIHSBSBIDORIG(String value) {
        this.sbihsbsbidorig = value;
    }

    /**
     * Gets the value of the memesfx property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMEMESFX() {
        return memesfx;
    }

    /**
     * Sets the value of the memesfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMEMESFX(Integer value) {
        this.memesfx = value;
    }

    /**
     * Gets the value of the memelastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEMELASTNAME() {
        return memelastname;
    }

    /**
     * Sets the value of the memelastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEMELASTNAME(String value) {
        this.memelastname = value;
    }

    /**
     * Gets the value of the memefirstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEMEFIRSTNAME() {
        return memefirstname;
    }

    /**
     * Sets the value of the memefirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEMEFIRSTNAME(String value) {
        this.memefirstname = value;
    }

    /**
     * Gets the value of the mememidinit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEMEMIDINIT() {
        return mememidinit;
    }

    /**
     * Sets the value of the mememidinit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEMEMIDINIT(String value) {
        this.mememidinit = value;
    }

    /**
     * Gets the value of the memerel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEMEREL() {
        return memerel;
    }

    /**
     * Sets the value of the memerel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEMEREL(String value) {
        this.memerel = value;
    }

    /**
     * Gets the value of the memereldesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEMERELDESC() {
        return memereldesc;
    }

    /**
     * Sets the value of the memereldesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEMERELDESC(String value) {
        this.memereldesc = value;
    }

    /**
     * Gets the value of the prprentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRPRENTITY() {
        return prprentity;
    }

    /**
     * Sets the value of the prprentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRPRENTITY(String value) {
        this.prprentity = value;
    }

    /**
     * Gets the value of the cdmltotpaliab property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDMLTOTPALIAB() {
        return cdmltotpaliab;
    }

    /**
     * Sets the value of the cdmltotpaliab property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDMLTOTPALIAB(BigDecimal value) {
        this.cdmltotpaliab = value;
    }

    /**
     * Gets the value of the cdmldispaliab property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDMLDISPALIAB() {
        return cdmldispaliab;
    }

    /**
     * Sets the value of the cdmldispaliab property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDMLDISPALIAB(BigDecimal value) {
        this.cdmldispaliab = value;
    }

    /**
     * Gets the value of the cdhlconsideramt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDHLCONSIDERAMT() {
        return cdhlconsideramt;
    }

    /**
     * Sets the value of the cdhlconsideramt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDHLCONSIDERAMT(BigDecimal value) {
        this.cdhlconsideramt = value;
    }

    /**
     * Gets the value of the cdhlnonconsdramt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDHLNONCONSDRAMT() {
        return cdhlnonconsdramt;
    }

    /**
     * Sets the value of the cdhlnonconsdramt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDHLNONCONSDRAMT(BigDecimal value) {
        this.cdhlnonconsdramt = value;
    }

    /**
     * Gets the value of the cdhldisallamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDHLDISALLAMT() {
        return cdhldisallamt;
    }

    /**
     * Sets the value of the cdhldisallamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDHLDISALLAMT(BigDecimal value) {
        this.cdhldisallamt = value;
    }

    /**
     * Gets the value of the excdid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXCDID() {
        return excdid;
    }

    /**
     * Sets the value of the excdid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXCDID(String value) {
        this.excdid = value;
    }

    /**
     * Gets the value of the excdidtext1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXCDIDTEXT1() {
        return excdidtext1;
    }

    /**
     * Sets the value of the excdidtext1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXCDIDTEXT1(String value) {
        this.excdidtext1 = value;
    }

    /**
     * Gets the value of the excdidtext2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXCDIDTEXT2() {
        return excdidtext2;
    }

    /**
     * Sets the value of the excdidtext2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXCDIDTEXT2(String value) {
        this.excdidtext2 = value;
    }

    /**
     * Gets the value of the excdidexcdhcstatcat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXCDIDEXCDHCSTATCAT() {
        return excdidexcdhcstatcat;
    }

    /**
     * Sets the value of the excdidexcdhcstatcat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXCDIDEXCDHCSTATCAT(String value) {
        this.excdidexcdhcstatcat = value;
    }

    /**
     * Gets the value of the excdidexcdhcstatcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXCDIDEXCDHCSTATCD() {
        return excdidexcdhcstatcd;
    }

    /**
     * Sets the value of the excdidexcdhcstatcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXCDIDEXCDHCSTATCD(String value) {
        this.excdidexcdhcstatcd = value;
    }

    /**
     * Gets the value of the excdidexcdhcadjcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXCDIDEXCDHCADJCD() {
        return excdidexcdhcadjcd;
    }

    /**
     * Sets the value of the excdidexcdhcadjcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXCDIDEXCDHCADJCD(String value) {
        this.excdidexcdhcadjcd = value;
    }

    /**
     * Gets the value of the cdhlpaidamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDHLPAIDAMT() {
        return cdhlpaidamt;
    }

    /**
     * Sets the value of the cdhlpaidamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDHLPAIDAMT(BigDecimal value) {
        this.cdhlpaidamt = value;
    }

    /**
     * Gets the value of the cdhlsbpymtamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDHLSBPYMTAMT() {
        return cdhlsbpymtamt;
    }

    /**
     * Sets the value of the cdhlsbpymtamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDHLSBPYMTAMT(BigDecimal value) {
        this.cdhlsbpymtamt = value;
    }

    /**
     * Gets the value of the cdhlprpymtamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDHLPRPYMTAMT() {
        return cdhlprpymtamt;
    }

    /**
     * Sets the value of the cdhlprpymtamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDHLPRPYMTAMT(BigDecimal value) {
        this.cdhlprpymtamt = value;
    }

    /**
     * Gets the value of the lobdid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOBDID() {
        return lobdid;
    }

    /**
     * Sets the value of the lobdid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOBDID(String value) {
        this.lobdid = value;
    }

    /**
     * Gets the value of the lobdname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOBDNAME() {
        return lobdname;
    }

    /**
     * Sets the value of the lobdname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOBDNAME(String value) {
        this.lobdname = value;
    }

    /**
     * Gets the value of the cdhlhsapcsind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDHLHSAPCSIND() {
        return cdhlhsapcsind;
    }

    /**
     * Sets the value of the cdhlhsapcsind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDHLHSAPCSIND(String value) {
        this.cdhlhsapcsind = value;
    }

    /**
     * Gets the value of the cdhlhsapcsinddesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDHLHSAPCSINDDESC() {
        return cdhlhsapcsinddesc;
    }

    /**
     * Sets the value of the cdhlhsapcsinddesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDHLHSAPCSINDDESC(String value) {
        this.cdhlhsapcsinddesc = value;
    }

    /**
     * Gets the value of the cdmfexpnsamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDMFEXPNSAMT() {
        return cdmfexpnsamt;
    }

    /**
     * Sets the value of the cdmfexpnsamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDMFEXPNSAMT(BigDecimal value) {
        this.cdmfexpnsamt = value;
    }

    /**
     * Gets the value of the cdmfpaidamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDMFPAIDAMT() {
        return cdmfpaidamt;
    }

    /**
     * Sets the value of the cdmfpaidamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDMFPAIDAMT(BigDecimal value) {
        this.cdmfpaidamt = value;
    }

    /**
     * Gets the value of the cdmfdisallexcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDMFDISALLEXCD() {
        return cdmfdisallexcd;
    }

    /**
     * Sets the value of the cdmfdisallexcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDMFDISALLEXCD(String value) {
        this.cdmfdisallexcd = value;
    }

    /**
     * Gets the value of the cdmfdisallexcdtext1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDMFDISALLEXCDTEXT1() {
        return cdmfdisallexcdtext1;
    }

    /**
     * Sets the value of the cdmfdisallexcdtext1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDMFDISALLEXCDTEXT1(String value) {
        this.cdmfdisallexcdtext1 = value;
    }

    /**
     * Gets the value of the cdmfdisallexcdtext2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDMFDISALLEXCDTEXT2() {
        return cdmfdisallexcdtext2;
    }

    /**
     * Sets the value of the cdmfdisallexcdtext2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDMFDISALLEXCDTEXT2(String value) {
        this.cdmfdisallexcdtext2 = value;
    }

    /**
     * Gets the value of the cdmfdisallexcdhcstatcat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDMFDISALLEXCDHCSTATCAT() {
        return cdmfdisallexcdhcstatcat;
    }

    /**
     * Sets the value of the cdmfdisallexcdhcstatcat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDMFDISALLEXCDHCSTATCAT(String value) {
        this.cdmfdisallexcdhcstatcat = value;
    }

    /**
     * Gets the value of the cdmfdisallexcdhcstatcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDMFDISALLEXCDHCSTATCD() {
        return cdmfdisallexcdhcstatcd;
    }

    /**
     * Sets the value of the cdmfdisallexcdhcstatcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDMFDISALLEXCDHCSTATCD(String value) {
        this.cdmfdisallexcdhcstatcd = value;
    }

    /**
     * Gets the value of the cdmfdisallexcdhcadjcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDMFDISALLEXCDHCADJCD() {
        return cdmfdisallexcdhcadjcd;
    }

    /**
     * Sets the value of the cdmfdisallexcdhcadjcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDMFDISALLEXCDHCADJCD(String value) {
        this.cdmfdisallexcdhcadjcd = value;
    }

    /**
     * Gets the value of the sesefsareimbind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSESEFSAREIMBIND() {
        return sesefsareimbind;
    }

    /**
     * Sets the value of the sesefsareimbind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSESEFSAREIMBIND(String value) {
        this.sesefsareimbind = value;
    }

    /**
     * Gets the value of the sesefsareimbinddesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSESEFSAREIMBINDDESC() {
        return sesefsareimbinddesc;
    }

    /**
     * Sets the value of the sesefsareimbinddesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSESEFSAREIMBINDDESC(String value) {
        this.sesefsareimbinddesc = value;
    }

    /**
     * Gets the value of the clststsdtm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCLSTSTSDTM() {
        return clststsdtm;
    }

    /**
     * Sets the value of the clststsdtm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCLSTSTSDTM(XMLGregorianCalendar value) {
        this.clststsdtm = value;
    }

    /**
     * Gets the value of the mcrlmemecrelcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCRLMEMECRELCD() {
        return mcrlmemecrelcd;
    }

    /**
     * Sets the value of the mcrlmemecrelcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCRLMEMECRELCD(String value) {
        this.mcrlmemecrelcd = value;
    }

    /**
     * Gets the value of the mcrlcreldesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCRLCRELDESC() {
        return mcrlcreldesc;
    }

    /**
     * Sets the value of the mcrlcreldesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCRLCRELDESC(String value) {
        this.mcrlcreldesc = value;
    }

    /**
     * Gets the value of the cdsdprpridrend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSDPRPRIDREND() {
        return cdsdprpridrend;
    }

    /**
     * Sets the value of the cdsdprpridrend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSDPRPRIDREND(String value) {
        this.cdsdprpridrend = value;
    }

    /**
     * Gets the value of the cdsdprpridrendname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSDPRPRIDRENDNAME() {
        return cdsdprpridrendname;
    }

    /**
     * Sets the value of the cdsdprpridrendname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSDPRPRIDRENDNAME(String value) {
        this.cdsdprpridrendname = value;
    }

    /**
     * Gets the value of the cdsdprprrenpi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSDPRPRRENPI() {
        return cdsdprprrenpi;
    }

    /**
     * Sets the value of the cdsdprprrenpi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSDPRPRRENPI(String value) {
        this.cdsdprprrenpi = value;
    }

    /**
     * Gets the value of the cdsdprprretax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSDPRPRRETAX() {
        return cdsdprprretax;
    }

    /**
     * Sets the value of the cdsdprprretax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSDPRPRRETAX(String value) {
        this.cdsdprprretax = value;
    }

    /**
     * Gets the value of the cdsdsvcareaind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSDSVCAREAIND() {
        return cdsdsvcareaind;
    }

    /**
     * Sets the value of the cdsdsvcareaind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSDSVCAREAIND(String value) {
        this.cdsdsvcareaind = value;
    }

    /**
     * Gets the value of the cdsdsvcareainddesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSDSVCAREAINDDESC() {
        return cdsdsvcareainddesc;
    }

    /**
     * Sets the value of the cdsdsvcareainddesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSDSVCAREAINDDESC(String value) {
        this.cdsdsvcareainddesc = value;
    }

    /**
     * Gets the value of the cdsdmedambzip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSDMEDAMBZIP() {
        return cdsdmedambzip;
    }

    /**
     * Sets the value of the cdsdmedambzip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSDMEDAMBZIP(String value) {
        this.cdsdmedambzip = value;
    }

    /**
     * Gets the value of the dfscid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDFSCID() {
        return dfscid;
    }

    /**
     * Sets the value of the dfscid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDFSCID(String value) {
        this.dfscid = value;
    }

    /**
     * Gets the value of the dfsciddesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDFSCIDDESC() {
        return dfsciddesc;
    }

    /**
     * Sets the value of the dfsciddesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDFSCIDDESC(String value) {
        this.dfsciddesc = value;
    }

    /**
     * Gets the value of the cdsddofrriskind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSDDOFRRISKIND() {
        return cdsddofrriskind;
    }

    /**
     * Sets the value of the cdsddofrriskind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSDDOFRRISKIND(String value) {
        this.cdsddofrriskind = value;
    }

    /**
     * Gets the value of the cdsddofrriskinddesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSDDOFRRISKINDDESC() {
        return cdsddofrriskinddesc;
    }

    /**
     * Sets the value of the cdsddofrriskinddesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSDDOFRRISKINDDESC(String value) {
        this.cdsddofrriskinddesc = value;
    }

    /**
     * Gets the value of the cdsddofrriskid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSDDOFRRISKID() {
        return cdsddofrriskid;
    }

    /**
     * Sets the value of the cdsddofrriskid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSDDOFRRISKID(String value) {
        this.cdsddofrriskid = value;
    }

    /**
     * Gets the value of the cdsddofrriskidname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSDDOFRRISKIDNAME() {
        return cdsddofrriskidname;
    }

    /**
     * Sets the value of the cdsddofrriskidname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSDDOFRRISKIDNAME(String value) {
        this.cdsddofrriskidname = value;
    }

    /**
     * Gets the value of the cdsddofrdelgcl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSDDOFRDELGCL() {
        return cdsddofrdelgcl;
    }

    /**
     * Sets the value of the cdsddofrdelgcl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSDDOFRDELGCL(String value) {
        this.cdsddofrdelgcl = value;
    }

    /**
     * Gets the value of the cdsddofrdelgcldesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSDDOFRDELGCLDESC() {
        return cdsddofrdelgcldesc;
    }

    /**
     * Sets the value of the cdsddofrdelgcldesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSDDOFRDELGCLDESC(String value) {
        this.cdsddofrdelgcldesc = value;
    }

    /**
     * Gets the value of the cdsddofrclid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSDDOFRCLID() {
        return cdsddofrclid;
    }

    /**
     * Sets the value of the cdsddofrclid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSDDOFRCLID(String value) {
        this.cdsddofrclid = value;
    }

    /**
     * Gets the value of the cdsddofrclidname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSDDOFRCLIDNAME() {
        return cdsddofrclidname;
    }

    /**
     * Sets the value of the cdsddofrclidname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSDDOFRCLIDNAME(String value) {
        this.cdsddofrclidname = value;
    }

    /**
     * Gets the value of the cdsddofrdelgum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSDDOFRDELGUM() {
        return cdsddofrdelgum;
    }

    /**
     * Sets the value of the cdsddofrdelgum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSDDOFRDELGUM(String value) {
        this.cdsddofrdelgum = value;
    }

    /**
     * Gets the value of the cdsddofrdelgumdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSDDOFRDELGUMDESC() {
        return cdsddofrdelgumdesc;
    }

    /**
     * Sets the value of the cdsddofrdelgumdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSDDOFRDELGUMDESC(String value) {
        this.cdsddofrdelgumdesc = value;
    }

    /**
     * Gets the value of the cdsddofrumid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSDDOFRUMID() {
        return cdsddofrumid;
    }

    /**
     * Sets the value of the cdsddofrumid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSDDOFRUMID(String value) {
        this.cdsddofrumid = value;
    }

    /**
     * Gets the value of the cdsddofrumidname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSDDOFRUMIDNAME() {
        return cdsddofrumidname;
    }

    /**
     * Sets the value of the cdsddofrumidname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSDDOFRUMIDNAME(String value) {
        this.cdsddofrumidname = value;
    }

    /**
     * Gets the value of the cdsdlinegrpptr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCDSDLINEGRPPTR() {
        return cdsdlinegrpptr;
    }

    /**
     * Sets the value of the cdsdlinegrpptr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCDSDLINEGRPPTR(Integer value) {
        this.cdsdlinegrpptr = value;
    }

    /**
     * Gets the value of the cdsdhiervalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSDHIERVALUE() {
        return cdsdhiervalue;
    }

    /**
     * Sets the value of the cdsdhiervalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSDHIERVALUE(String value) {
        this.cdsdhiervalue = value;
    }

    /**
     * Gets the value of the cdsdvalueamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDSDVALUEAMT() {
        return cdsdvalueamt;
    }

    /**
     * Sets the value of the cdsdvalueamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDSDVALUEAMT(BigDecimal value) {
        this.cdsdvalueamt = value;
    }

    /**
     * Gets the value of the cdsdstoplossamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDSDSTOPLOSSAMT() {
        return cdsdstoplossamt;
    }

    /**
     * Sets the value of the cdsdstoplossamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDSDSTOPLOSSAMT(BigDecimal value) {
        this.cdsdstoplossamt = value;
    }

    /**
     * Gets the value of the cdsdnetvalueamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDSDNETVALUEAMT() {
        return cdsdnetvalueamt;
    }

    /**
     * Sets the value of the cdsdnetvalueamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDSDNETVALUEAMT(BigDecimal value) {
        this.cdsdnetvalueamt = value;
    }

    /**
     * Gets the value of the cdpeprprid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDPEPRPRID() {
        return cdpeprprid;
    }

    /**
     * Sets the value of the cdpeprprid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDPEPRPRID(String value) {
        this.cdpeprprid = value;
    }

    /**
     * Gets the value of the cdpenpi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDPENPI() {
        return cdpenpi;
    }

    /**
     * Sets the value of the cdpenpi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDPENPI(String value) {
        this.cdpenpi = value;
    }

    /**
     * Gets the value of the cdpetaxid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDPETAXID() {
        return cdpetaxid;
    }

    /**
     * Sets the value of the cdpetaxid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDPETAXID(String value) {
        this.cdpetaxid = value;
    }

    /**
     * Gets the value of the eapgid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEAPGID() {
        return eapgid;
    }

    /**
     * Sets the value of the eapgid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEAPGID(String value) {
        this.eapgid = value;
    }

    /**
     * Gets the value of the eapgdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEAPGDESC() {
        return eapgdesc;
    }

    /**
     * Sets the value of the eapgdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEAPGDESC(String value) {
        this.eapgdesc = value;
    }

    /**
     * Gets the value of the eapmpaymethind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEAPMPAYMETHIND() {
        return eapmpaymethind;
    }

    /**
     * Sets the value of the eapmpaymethind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEAPMPAYMETHIND(String value) {
        this.eapmpaymethind = value;
    }

    /**
     * Gets the value of the eapmpaymethdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEAPMPAYMETHDESC() {
        return eapmpaymethdesc;
    }

    /**
     * Sets the value of the eapmpaymethdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEAPMPAYMETHDESC(String value) {
        this.eapmpaymethdesc = value;
    }

    /**
     * Gets the value of the prcfmctrspec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRCFMCTRSPEC() {
        return prcfmctrspec;
    }

    /**
     * Sets the value of the prcfmctrspec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRCFMCTRSPEC(String value) {
        this.prcfmctrspec = value;
    }

    /**
     * Gets the value of the prcfmctrspecdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRCFMCTRSPECDESC() {
        return prcfmctrspecdesc;
    }

    /**
     * Sets the value of the prcfmctrspecdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRCFMCTRSPECDESC(String value) {
        this.prcfmctrspecdesc = value;
    }

    /**
     * Gets the value of the cdsdsurchamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDSDSURCHAMT() {
        return cdsdsurchamt;
    }

    /**
     * Sets the value of the cdsdsurchamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDSDSURCHAMT(BigDecimal value) {
        this.cdsdsurchamt = value;
    }

    /**
     * Gets the value of the scpasurchpct property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSCPASURCHPCT() {
        return scpasurchpct;
    }

    /**
     * Sets the value of the scpasurchpct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSCPASURCHPCT(BigDecimal value) {
        this.scpasurchpct = value;
    }

    /**
     * Gets the value of the cdsdmctrreas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSDMCTRREAS() {
        return cdsdmctrreas;
    }

    /**
     * Sets the value of the cdsdmctrreas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSDMCTRREAS(String value) {
        this.cdsdmctrreas = value;
    }

    /**
     * Gets the value of the cdsdmctrreasdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSDMCTRREASDESC() {
        return cdsdmctrreasdesc;
    }

    /**
     * Sets the value of the cdsdmctrreasdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSDMCTRREASDESC(String value) {
        this.cdsdmctrreasdesc = value;
    }

    /**
     * Gets the value of the vbbdrule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVBBDRULE() {
        return vbbdrule;
    }

    /**
     * Sets the value of the vbbdrule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVBBDRULE(String value) {
        this.vbbdrule = value;
    }

    /**
     * Gets the value of the vbbddesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVBBDDESC() {
        return vbbddesc;
    }

    /**
     * Sets the value of the vbbddesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVBBDDESC(String value) {
        this.vbbddesc = value;
    }

    /**
     * Gets the value of the cdsdvbbexcdid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSDVBBEXCDID() {
        return cdsdvbbexcdid;
    }

    /**
     * Sets the value of the cdsdvbbexcdid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSDVBBEXCDID(String value) {
        this.cdsdvbbexcdid = value;
    }

    /**
     * Gets the value of the cdsdvbbexcdiddesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSDVBBEXCDIDDESC() {
        return cdsdvbbexcdiddesc;
    }

    /**
     * Sets the value of the cdsdvbbexcdiddesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSDVBBEXCDIDDESC(String value) {
        this.cdsdvbbexcdiddesc = value;
    }

    /**
     * Gets the value of the idcdidsub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDCDIDSUB() {
        return idcdidsub;
    }

    /**
     * Sets the value of the idcdidsub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDCDIDSUB(String value) {
        this.idcdidsub = value;
    }

    /**
     * Gets the value of the idcdidsubdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDCDIDSUBDESC() {
        return idcdidsubdesc;
    }

    /**
     * Sets the value of the idcdidsubdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDCDIDSUBDESC(String value) {
        this.idcdidsubdesc = value;
    }

    /**
     * Gets the value of the idcdidtrans property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDCDIDTRANS() {
        return idcdidtrans;
    }

    /**
     * Sets the value of the idcdidtrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDCDIDTRANS(String value) {
        this.idcdidtrans = value;
    }

    /**
     * Gets the value of the idcdidtransdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDCDIDTRANSDESC() {
        return idcdidtransdesc;
    }

    /**
     * Sets the value of the idcdidtransdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDCDIDTRANSDESC(String value) {
        this.idcdidtransdesc = value;
    }

    /**
     * Gets the value of the cdmldiscamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDMLDISCAMT() {
        return cdmldiscamt;
    }

    /**
     * Sets the value of the cdmldiscamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDMLDISCAMT(BigDecimal value) {
        this.cdmldiscamt = value;
    }

    /**
     * Gets the value of the scpaexcdid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCPAEXCDID() {
        return scpaexcdid;
    }

    /**
     * Sets the value of the scpaexcdid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCPAEXCDID(String value) {
        this.scpaexcdid = value;
    }

    /**
     * Gets the value of the scpaexcdidtext1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCPAEXCDIDTEXT1() {
        return scpaexcdidtext1;
    }

    /**
     * Sets the value of the scpaexcdidtext1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCPAEXCDIDTEXT1(String value) {
        this.scpaexcdidtext1 = value;
    }

    /**
     * Gets the value of the scpaexcdidtext2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCPAEXCDIDTEXT2() {
        return scpaexcdidtext2;
    }

    /**
     * Sets the value of the scpaexcdidtext2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCPAEXCDIDTEXT2(String value) {
        this.scpaexcdidtext2 = value;
    }

    /**
     * Gets the value of the cdsdfamind property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCDSDFAMIND() {
        return cdsdfamind;
    }

    /**
     * Sets the value of the cdsdfamind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCDSDFAMIND(Integer value) {
        this.cdsdfamind = value;
    }

    /**
     * Gets the value of the cdsdfaminddesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSDFAMINDDESC() {
        return cdsdfaminddesc;
    }

    /**
     * Sets the value of the cdsdfaminddesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSDFAMINDDESC(String value) {
        this.cdsdfaminddesc = value;
    }

    /**
     * Gets the value of the cdmlipcdmod2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDMLIPCDMOD2() {
        return cdmlipcdmod2;
    }

    /**
     * Sets the value of the cdmlipcdmod2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDMLIPCDMOD2(String value) {
        this.cdmlipcdmod2 = value;
    }

    /**
     * Gets the value of the cdmlipcdmod3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDMLIPCDMOD3() {
        return cdmlipcdmod3;
    }

    /**
     * Sets the value of the cdmlipcdmod3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDMLIPCDMOD3(String value) {
        this.cdmlipcdmod3 = value;
    }

    /**
     * Gets the value of the cdmlipcdmod4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDMLIPCDMOD4() {
        return cdmlipcdmod4;
    }

    /**
     * Sets the value of the cdmlipcdmod4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDMLIPCDMOD4(String value) {
        this.cdmlipcdmod4 = value;
    }

    /**
     * Gets the value of the cdmlclmdtype2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDMLCLMDTYPE2() {
        return cdmlclmdtype2;
    }

    /**
     * Sets the value of the cdmlclmdtype2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDMLCLMDTYPE2(String value) {
        this.cdmlclmdtype2 = value;
    }

    /**
     * Gets the value of the cdmlclmdtype3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDMLCLMDTYPE3() {
        return cdmlclmdtype3;
    }

    /**
     * Sets the value of the cdmlclmdtype3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDMLCLMDTYPE3(String value) {
        this.cdmlclmdtype3 = value;
    }

    /**
     * Gets the value of the cdmlclmdtype4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDMLCLMDTYPE4() {
        return cdmlclmdtype4;
    }

    /**
     * Sets the value of the cdmlclmdtype4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDMLCLMDTYPE4(String value) {
        this.cdmlclmdtype4 = value;
    }

    /**
     * Gets the value of the cdmlclmdtype5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDMLCLMDTYPE5() {
        return cdmlclmdtype5;
    }

    /**
     * Sets the value of the cdmlclmdtype5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDMLCLMDTYPE5(String value) {
        this.cdmlclmdtype5 = value;
    }

    /**
     * Gets the value of the cdmlclmdtype6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDMLCLMDTYPE6() {
        return cdmlclmdtype6;
    }

    /**
     * Sets the value of the cdmlclmdtype6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDMLCLMDTYPE6(String value) {
        this.cdmlclmdtype6 = value;
    }

    /**
     * Gets the value of the cdmlclmdtype7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDMLCLMDTYPE7() {
        return cdmlclmdtype7;
    }

    /**
     * Sets the value of the cdmlclmdtype7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDMLCLMDTYPE7(String value) {
        this.cdmlclmdtype7 = value;
    }

    /**
     * Gets the value of the cdmlclmdtype8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDMLCLMDTYPE8() {
        return cdmlclmdtype8;
    }

    /**
     * Sets the value of the cdmlclmdtype8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDMLCLMDTYPE8(String value) {
        this.cdmlclmdtype8 = value;
    }

    /**
     * Gets the value of the cdsdpbabundindnvl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSDPBABUNDINDNVL() {
        return cdsdpbabundindnvl;
    }

    /**
     * Sets the value of the cdsdpbabundindnvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSDPBABUNDINDNVL(String value) {
        this.cdsdpbabundindnvl = value;
    }

    /**
     * Gets the value of the cdsdpbabundtypenvl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSDPBABUNDTYPENVL() {
        return cdsdpbabundtypenvl;
    }

    /**
     * Sets the value of the cdsdpbabundtypenvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSDPBABUNDTYPENVL(String value) {
        this.cdsdpbabundtypenvl = value;
    }

    /**
     * Gets the value of the cdspclntwkind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSPCLNTWKIND() {
        return cdspclntwkind;
    }

    /**
     * Sets the value of the cdspclntwkind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSPCLNTWKIND(String value) {
        this.cdspclntwkind = value;
    }

    /**
     * Gets the value of the cdspscclnetind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSPSCCLNETIND() {
        return cdspscclnetind;
    }

    /**
     * Sets the value of the cdspscclnetind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSPSCCLNETIND(String value) {
        this.cdspscclnetind = value;
    }

    /**
     * Gets the value of the ltltpfx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLTLTPFX() {
        return ltltpfx;
    }

    /**
     * Sets the value of the ltltpfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLTLTPFX(String value) {
        this.ltltpfx = value;
    }

    /**
     * Gets the value of the ltltpfxdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLTLTPFXDESC() {
        return ltltpfxdesc;
    }

    /**
     * Sets the value of the ltltpfxdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLTLTPFXDESC(String value) {
        this.ltltpfxdesc = value;
    }

    /**
     * Gets the value of the cdspscltltpfx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSPSCLTLTPFX() {
        return cdspscltltpfx;
    }

    /**
     * Sets the value of the cdspscltltpfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSPSCLTLTPFX(String value) {
        this.cdspscltltpfx = value;
    }

    /**
     * Gets the value of the cdspltltpfxdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSPLTLTPFXDESC() {
        return cdspltltpfxdesc;
    }

    /**
     * Sets the value of the cdspltltpfxdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSPLTLTPFXDESC(String value) {
        this.cdspltltpfxdesc = value;
    }

    /**
     * Gets the value of the dedepfx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEDEPFX() {
        return dedepfx;
    }

    /**
     * Sets the value of the dedepfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEDEPFX(String value) {
        this.dedepfx = value;
    }

    /**
     * Gets the value of the dedepfxdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEDEPFXDESC() {
        return dedepfxdesc;
    }

    /**
     * Sets the value of the dedepfxdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEDEPFXDESC(String value) {
        this.dedepfxdesc = value;
    }

    /**
     * Gets the value of the cdspscdedepfx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSPSCDEDEPFX() {
        return cdspscdedepfx;
    }

    /**
     * Sets the value of the cdspscdedepfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSPSCDEDEPFX(String value) {
        this.cdspscdedepfx = value;
    }

    /**
     * Gets the value of the cdspscdedepfxdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSPSCDEDEPFXDESC() {
        return cdspscdedepfxdesc;
    }

    /**
     * Sets the value of the cdspscdedepfxdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSPSCDEDEPFXDESC(String value) {
        this.cdspscdedepfxdesc = value;
    }

    /**
     * Gets the value of the cdsppriceamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDSPPRICEAMT() {
        return cdsppriceamt;
    }

    /**
     * Sets the value of the cdsppriceamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDSPPRICEAMT(BigDecimal value) {
        this.cdsppriceamt = value;
    }

    /**
     * Gets the value of the cdspscpriceamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDSPSCPRICEAMT() {
        return cdspscpriceamt;
    }

    /**
     * Sets the value of the cdspscpriceamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDSPSCPRICEAMT(BigDecimal value) {
        this.cdspscpriceamt = value;
    }

    /**
     * Gets the value of the sepypfx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEPYPFX() {
        return sepypfx;
    }

    /**
     * Sets the value of the sepypfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEPYPFX(String value) {
        this.sepypfx = value;
    }

    /**
     * Gets the value of the sepypfxdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEPYPFXDESC() {
        return sepypfxdesc;
    }

    /**
     * Sets the value of the sepypfxdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEPYPFXDESC(String value) {
        this.sepypfxdesc = value;
    }

    /**
     * Gets the value of the cdspscsepypfx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSPSCSEPYPFX() {
        return cdspscsepypfx;
    }

    /**
     * Sets the value of the cdspscsepypfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSPSCSEPYPFX(String value) {
        this.cdspscsepypfx = value;
    }

    /**
     * Gets the value of the cdspscsepypfxdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSPSCSEPYPFXDESC() {
        return cdspscsepypfxdesc;
    }

    /**
     * Sets the value of the cdspscsepypfxdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSPSCSEPYPFXDESC(String value) {
        this.cdspscsepypfxdesc = value;
    }

    /**
     * Gets the value of the cdspscseserule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSPSCSESERULE() {
        return cdspscseserule;
    }

    /**
     * Sets the value of the cdspscseserule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSPSCSESERULE(String value) {
        this.cdspscseserule = value;
    }

    /**
     * Gets the value of the cdspallowamt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCDSPALLOWAMT() {
        return cdspallowamt;
    }

    /**
     * Sets the value of the cdspallowamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCDSPALLOWAMT(Integer value) {
        this.cdspallowamt = value;
    }

    /**
     * Gets the value of the cdspscallowamt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCDSPSCALLOWAMT() {
        return cdspscallowamt;
    }

    /**
     * Sets the value of the cdspscallowamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCDSPSCALLOWAMT(Integer value) {
        this.cdspscallowamt = value;
    }

    /**
     * Gets the value of the cdspdedamt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCDSPDEDAMT() {
        return cdspdedamt;
    }

    /**
     * Sets the value of the cdspdedamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCDSPDEDAMT(Integer value) {
        this.cdspdedamt = value;
    }

    /**
     * Gets the value of the cdspscdedamt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCDSPSCDEDAMT() {
        return cdspscdedamt;
    }

    /**
     * Sets the value of the cdspscdedamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCDSPSCDEDAMT(Integer value) {
        this.cdspscdedamt = value;
    }

    /**
     * Gets the value of the cdspdedaccumno property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCDSPDEDACCUMNO() {
        return cdspdedaccumno;
    }

    /**
     * Sets the value of the cdspdedaccumno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCDSPDEDACCUMNO(Integer value) {
        this.cdspdedaccumno = value;
    }

    /**
     * Gets the value of the cdspscdedaccno property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCDSPSCDEDACCNO() {
        return cdspscdedaccno;
    }

    /**
     * Sets the value of the cdspscdedaccno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCDSPSCDEDACCNO(Integer value) {
        this.cdspscdedaccno = value;
    }

    /**
     * Gets the value of the cdspcopayamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDSPCOPAYAMT() {
        return cdspcopayamt;
    }

    /**
     * Sets the value of the cdspcopayamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDSPCOPAYAMT(BigDecimal value) {
        this.cdspcopayamt = value;
    }

    /**
     * Gets the value of the cdspsccopayamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDSPSCCOPAYAMT() {
        return cdspsccopayamt;
    }

    /**
     * Sets the value of the cdspsccopayamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDSPSCCOPAYAMT(BigDecimal value) {
        this.cdspsccopayamt = value;
    }

    /**
     * Gets the value of the cdspcoinsamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDSPCOINSAMT() {
        return cdspcoinsamt;
    }

    /**
     * Sets the value of the cdspcoinsamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDSPCOINSAMT(BigDecimal value) {
        this.cdspcoinsamt = value;
    }

    /**
     * Gets the value of the cdspsccoinsamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDSPSCCOINSAMT() {
        return cdspsccoinsamt;
    }

    /**
     * Sets the value of the cdspsccoinsamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDSPSCCOINSAMT(BigDecimal value) {
        this.cdspsccoinsamt = value;
    }

    /**
     * Gets the value of the cdspunitsallow property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCDSPUNITSALLOW() {
        return cdspunitsallow;
    }

    /**
     * Sets the value of the cdspunitsallow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCDSPUNITSALLOW(Integer value) {
        this.cdspunitsallow = value;
    }

    /**
     * Gets the value of the cdspscunitsallow property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCDSPSCUNITSALLOW() {
        return cdspscunitsallow;
    }

    /**
     * Sets the value of the cdspscunitsallow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCDSPSCUNITSALLOW(Integer value) {
        this.cdspscunitsallow = value;
    }

    /**
     * Gets the value of the cdsppaidamt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCDSPPAIDAMT() {
        return cdsppaidamt;
    }

    /**
     * Sets the value of the cdsppaidamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCDSPPAIDAMT(Integer value) {
        this.cdsppaidamt = value;
    }

    /**
     * Gets the value of the cdspscpaidamt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCDSPSCPAIDAMT() {
        return cdspscpaidamt;
    }

    /**
     * Sets the value of the cdspscpaidamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCDSPSCPAIDAMT(Integer value) {
        this.cdspscpaidamt = value;
    }

    /**
     * Gets the value of the cdspdisallamt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCDSPDISALLAMT() {
        return cdspdisallamt;
    }

    /**
     * Sets the value of the cdspdisallamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCDSPDISALLAMT(Integer value) {
        this.cdspdisallamt = value;
    }

    /**
     * Gets the value of the cdspscdisallamt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCDSPSCDISALLAMT() {
        return cdspscdisallamt;
    }

    /**
     * Sets the value of the cdspscdisallamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCDSPSCDISALLAMT(Integer value) {
        this.cdspscdisallamt = value;
    }

    /**
     * Gets the value of the cdspdisallexcdid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSPDISALLEXCDID() {
        return cdspdisallexcdid;
    }

    /**
     * Sets the value of the cdspdisallexcdid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSPDISALLEXCDID(String value) {
        this.cdspdisallexcdid = value;
    }

    /**
     * Gets the value of the cdspdisallexcdtext1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSPDISALLEXCDTEXT1() {
        return cdspdisallexcdtext1;
    }

    /**
     * Sets the value of the cdspdisallexcdtext1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSPDISALLEXCDTEXT1(String value) {
        this.cdspdisallexcdtext1 = value;
    }

    /**
     * Gets the value of the cdspdisallexcdtext2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSPDISALLEXCDTEXT2() {
        return cdspdisallexcdtext2;
    }

    /**
     * Sets the value of the cdspdisallexcdtext2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSPDISALLEXCDTEXT2(String value) {
        this.cdspdisallexcdtext2 = value;
    }

    /**
     * Gets the value of the cdspscdisexcdid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSPSCDISEXCDID() {
        return cdspscdisexcdid;
    }

    /**
     * Sets the value of the cdspscdisexcdid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSPSCDISEXCDID(String value) {
        this.cdspscdisexcdid = value;
    }

    /**
     * Gets the value of the cdspscdisallexcdtext1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSPSCDISALLEXCDTEXT1() {
        return cdspscdisallexcdtext1;
    }

    /**
     * Sets the value of the cdspscdisallexcdtext1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSPSCDISALLEXCDTEXT1(String value) {
        this.cdspscdisallexcdtext1 = value;
    }

    /**
     * Gets the value of the cdspscdisallexcdtext2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSPSCDISALLEXCDTEXT2() {
        return cdspscdisallexcdtext2;
    }

    /**
     * Sets the value of the cdspscdisallexcdtext2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSPSCDISALLEXCDTEXT2(String value) {
        this.cdspscdisallexcdtext2 = value;
    }

    /**
     * Gets the value of the cdspsepyexpcat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSPSEPYEXPCAT() {
        return cdspsepyexpcat;
    }

    /**
     * Sets the value of the cdspsepyexpcat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSPSEPYEXPCAT(String value) {
        this.cdspsepyexpcat = value;
    }

    /**
     * Gets the value of the cdspscspexpcat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSPSCSPEXPCAT() {
        return cdspscspexpcat;
    }

    /**
     * Sets the value of the cdspscspexpcat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSPSCSPEXPCAT(String value) {
        this.cdspscspexpcat = value;
    }

    /**
     * Gets the value of the cdspsepyacctcat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSPSEPYACCTCAT() {
        return cdspsepyacctcat;
    }

    /**
     * Sets the value of the cdspsepyacctcat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSPSEPYACCTCAT(String value) {
        this.cdspsepyacctcat = value;
    }

    /**
     * Gets the value of the cdspscspactcat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSPSCSPACTCAT() {
        return cdspscspactcat;
    }

    /**
     * Sets the value of the cdspscspactcat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSPSCSPACTCAT(String value) {
        this.cdspscspactcat = value;
    }

    /**
     * Gets the value of the cdspeobexcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSPEOBEXCD() {
        return cdspeobexcd;
    }

    /**
     * Sets the value of the cdspeobexcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSPEOBEXCD(String value) {
        this.cdspeobexcd = value;
    }

    /**
     * Gets the value of the cdspeobexcdtext1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSPEOBEXCDTEXT1() {
        return cdspeobexcdtext1;
    }

    /**
     * Sets the value of the cdspeobexcdtext1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSPEOBEXCDTEXT1(String value) {
        this.cdspeobexcdtext1 = value;
    }

    /**
     * Gets the value of the cdspeobdisallexcdtext2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSPEOBDISALLEXCDTEXT2() {
        return cdspeobdisallexcdtext2;
    }

    /**
     * Sets the value of the cdspeobdisallexcdtext2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSPEOBDISALLEXCDTEXT2(String value) {
        this.cdspeobdisallexcdtext2 = value;
    }

    /**
     * Gets the value of the cdspsceobexcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSPSCEOBEXCD() {
        return cdspsceobexcd;
    }

    /**
     * Sets the value of the cdspsceobexcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSPSCEOBEXCD(String value) {
        this.cdspsceobexcd = value;
    }

    /**
     * Gets the value of the cdspsceobexcdtext1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSPSCEOBEXCDTEXT1() {
        return cdspsceobexcdtext1;
    }

    /**
     * Sets the value of the cdspsceobexcdtext1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSPSCEOBEXCDTEXT1(String value) {
        this.cdspsceobexcdtext1 = value;
    }

    /**
     * Gets the value of the cdspsceobdisallexcdtext2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSPSCEOBDISALLEXCDTEXT2() {
        return cdspsceobdisallexcdtext2;
    }

    /**
     * Sets the value of the cdspsceobdisallexcdtext2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSPSCEOBDISALLEXCDTEXT2(String value) {
        this.cdspsceobdisallexcdtext2 = value;
    }

    /**
     * Gets the value of the apcdid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPCDID() {
        return apcdid;
    }

    /**
     * Sets the value of the apcdid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPCDID(String value) {
        this.apcdid = value;
    }

    /**
     * Gets the value of the cdspscapcdid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSPSCAPCDID() {
        return cdspscapcdid;
    }

    /**
     * Sets the value of the cdspscapcdid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSPSCAPCDID(String value) {
        this.cdspscapcdid = value;
    }

    /**
     * Gets the value of the apsistsind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPSISTSIND() {
        return apsistsind;
    }

    /**
     * Sets the value of the apsistsind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPSISTSIND(String value) {
        this.apsistsind = value;
    }

    /**
     * Gets the value of the cdspscapsists property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSPSCAPSISTS() {
        return cdspscapsists;
    }

    /**
     * Sets the value of the cdspscapsists property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSPSCAPSISTS(String value) {
        this.cdspscapsists = value;
    }

    /**
     * Gets the value of the cdspunitsaply property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCDSPUNITSAPLY() {
        return cdspunitsaply;
    }

    /**
     * Sets the value of the cdspunitsaply property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCDSPUNITSAPLY(Integer value) {
        this.cdspunitsaply = value;
    }

    /**
     * Gets the value of the cdspscunitsaply property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCDSPSCUNITSAPLY() {
        return cdspscunitsaply;
    }

    /**
     * Sets the value of the cdspscunitsaply property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCDSPSCUNITSAPLY(Integer value) {
        this.cdspscunitsaply = value;
    }

    /**
     * Gets the value of the cdspamtaply property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDSPAMTAPLY() {
        return cdspamtaply;
    }

    /**
     * Sets the value of the cdspamtaply property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDSPAMTAPLY(BigDecimal value) {
        this.cdspamtaply = value;
    }

    /**
     * Gets the value of the cdspscamtaply property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDSPSCAMTAPLY() {
        return cdspscamtaply;
    }

    /**
     * Sets the value of the cdspscamtaply property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDSPSCAMTAPLY(BigDecimal value) {
        this.cdspscamtaply = value;
    }

    /**
     * Gets the value of the ehbdid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEHBDID() {
        return ehbdid;
    }

    /**
     * Sets the value of the ehbdid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEHBDID(String value) {
        this.ehbdid = value;
    }

    /**
     * Gets the value of the ehbddesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEHBDDESC() {
        return ehbddesc;
    }

    /**
     * Sets the value of the ehbddesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEHBDDESC(String value) {
        this.ehbddesc = value;
    }

    /**
     * Gets the value of the cdnpcoll property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRECCDNP }
     *     
     */
    public ArrayOfRECCDNP getCDNPCOLL() {
        return cdnpcoll;
    }

    /**
     * Sets the value of the cdnpcoll property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRECCDNP }
     *     
     */
    public void setCDNPCOLL(ArrayOfRECCDNP value) {
        this.cdnpcoll = value;
    }

    /**
     * Gets the value of the cdlmcoll property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRECCDLM }
     *     
     */
    public ArrayOfRECCDLM getCDLMCOLL() {
        return cdlmcoll;
    }

    /**
     * Sets the value of the cdlmcoll property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRECCDLM }
     *     
     */
    public void setCDLMCOLL(ArrayOfRECCDLM value) {
        this.cdlmcoll = value;
    }

}
