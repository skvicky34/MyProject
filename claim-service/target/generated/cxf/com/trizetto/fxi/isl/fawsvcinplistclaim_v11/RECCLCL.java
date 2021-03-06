
package com.trizetto.fxi.isl.fawsvcinplistclaim_v11;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for REC_CLCL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REC_CLCL"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://trizetto.com/fxi/isl/FaWsvcInpListClaim_v11}RecordBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CLCL_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MEME_CK" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="GRGR_CK" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="SBSB_CK" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="SGSG_CK" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="CSPD_CAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLCL_PAY_PR_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLCL_CL_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLCL_CL_SUB_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLCL_CUR_STS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLCL_RECD_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CLCL_LOW_SVC_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CLCL_HIGH_SVC_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CLCL_ID_ADJ_FROM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLCL_ID_ADJ_TO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLCL_TOT_CHG" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CLCL_TOT_PAYABLE" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CLCL_PA_PAID_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CLCL_PA_ACCT_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLCL_CAP_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLST_MCTR_REAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLST_MCTR_REAS_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRPR_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRPR_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRPR_NPI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MEME_SFX" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MEME_FIRST_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MEME_LAST_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MEME_MID_INIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MEME_REL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CSPD_CAT_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SBSB_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SBIH_SBSB_ID_ORIG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GRGR_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GRGR_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SGSG_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CSPI_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PLDS_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLCL_PAY_PR_IND_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLCL_CL_TYPE_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLCL_CL_SUB_TYPE_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLCL_CUR_STS_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLCL_CAP_IND_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MEME_REL_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLCB_COB_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLCB_COB_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CLCB_COB_DISALLOW" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CLCB_COB_ALLOW" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CLCB_COB_TYPE_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLCL_LAST_ACT_DTM" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CLCL_INPUT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CLCL_PAID_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CSCS_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NWNW_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NWNW_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AGAG_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLCL_PAYEE_PR_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLCL_NTWK_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLCL_PCP_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLCL_EXT_AUTH_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLCL_AIAI_EOB_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLCL_MICRO_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLST_STS_DTM" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="PRPR_ENTITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLCL_EOB_EXCD_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EXCD_HC_STAT_CAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EXCD_HC_STAT_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EXCD_HC_ADJ_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CSPI_ITS_PREFIX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLCL_HSA_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLCL_REL_CLCL_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLCL_HSA_IND_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLHS_TOT_CONSIDER" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CLHS_TOT_PAID" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="HSAI_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HSAI_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HSAI_ACC_SFX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HSAI_HSA_FSA_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HSAI_HSA_FSA_IND_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SBHS_DED_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="SBHS_ME_DED_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="SBHS_DED_ACCUM_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="MEHS_DED_ACCUM_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CLHS_SB_ALLOC_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CLHS_ME_ALLOC_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="SBHS_PAID_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="MEHS_PAID_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="SBHS_PAID_CUR" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="SBHS_DED2_ACCM_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="SBHS_DED2_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="SBHS_ME_DED2_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="MEHS_DED2_ACCM_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="SBHS_DED_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SBHS_DED_IND_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SBHS_DED2_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SBHS_DED2_IND_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDMF_EXPNS_AMT_SUM" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CDMF_PAID_AMT_SUM" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CDDF_EXPNS_AMT_SUM" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CDDF_PAID_AMT_SUM" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="MCRL_MEME_CREL_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MCRL_CREL_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PDPD_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLMF_PRPR_ID_FAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLMF_INPUT_TXNM_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRFA_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLMI_ITS_SCCF_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLCL_PRE_PRICE_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TOT_PA_LIAB_CLAIM" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="DIS_PA_LIAB_CLAIM" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CLHP_ADM_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CLHP_ADM_SOURCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLHP_ADM_TYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLHP_BILL_CLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLHP_DC_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CLHP_DC_HOUR_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLHP_DC_STAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLHP_FAC_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLHP_FREQUENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLHP_ICD_QUAL_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLHP_INPUT_AGRG_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLHP_IPCD_METH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLHP_MED_REC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLHP_PRPR_ID_ADM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLHP_PRPR_ID_OPER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLHP_PRPR_ID_OTH1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLHP_PRPR_ID_OTH2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLHP_STAMENT_FR_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CLHP_STAMENT_TO_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CLMF_INPUT_SBSB_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLMF_PRPR_FA_NPI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLMF_PRPR_FA_TAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLMF_PRPR_RF_NPI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLMF_PRPR_RF_TAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLMF_PRPR_SE_NPI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLMF_PRPR_SE_TAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLHP_PRPR_AD_NPI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLHP_PRPR_AD_TAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLHP_PRPR_OP_NPI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLHP_PRPR_OP_TAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLHP_PRPR_O1_NPI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLHP_PRPR_O1_TAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLHP_PRPR_O2_NPI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLHP_PRPR_O2_TAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLMF_INPUT_HLTH_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLMF_ICD_IND_PROC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLMF_ICD_IND_PROC_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLMF_ICD_QUAL_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLMF_ICD_QUAL_IND_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLMF_EXT_PREATH_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLMF_EXT_REFRAL_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLSD_PRPR_ID_REND_NVL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLSD_PRPR_RE_NPI_NVL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLSD_PRPR_RE_TAX_NVL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NWPE_PFX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NWPE_PFX_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NWPR_PFX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NWPR_PFX_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NWCR_PFX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NWCR_PFX_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PDBC_PFX_NPPR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NPPR_PFX_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PDBC_PFX_SPPR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SPPR_PFX_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PDBC_PFX_SEDF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SEDF_PFX_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLSP_NTWK_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PDPD_ACC_SFX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AGRG_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLSP_AG_SOURCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLSP_AG_SOURCE_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PDDS_PROD_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PDDS_PROD_TYPE_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PDDS_MCTR_BCAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PDDS_MCTR_BCAT_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLSP_TOT_AMT_APLY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLHC_COLL" type="{http://trizetto.com/fxi/isl/FaWsvcInpListClaim_v11}ArrayOfREC_CLHC" minOccurs="0"/&gt;
 *         &lt;element name="CLID_COLL" type="{http://trizetto.com/fxi/isl/FaWsvcInpListClaim_v11}ArrayOfREC_CLID" minOccurs="0"/&gt;
 *         &lt;element name="CLRN_COLL" type="{http://trizetto.com/fxi/isl/FaWsvcInpListClaim_v11}ArrayOfREC_CLRN" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REC_CLCL", propOrder = {
    "clclid",
    "memeck",
    "grgrck",
    "sbsbck",
    "sgsgck",
    "cspdcat",
    "clclpayprind",
    "clclcltype",
    "clclclsubtype",
    "clclcursts",
    "clclrecddt",
    "clcllowsvcdt",
    "clclhighsvcdt",
    "clclidadjfrom",
    "clclidadjto",
    "clcltotchg",
    "clcltotpayable",
    "clclpapaidamt",
    "clclpaacctno",
    "clclcapind",
    "clstmctrreas",
    "clstmctrreasdesc",
    "prprid",
    "prprname",
    "prprnpi",
    "memesfx",
    "memefirstname",
    "memelastname",
    "mememidinit",
    "memerel",
    "cspdcatdesc",
    "sbsbid",
    "sbihsbsbidorig",
    "grgrname",
    "grgrid",
    "sgsgname",
    "cspiid",
    "pldsdesc",
    "clclpayprinddesc",
    "clclcltypedesc",
    "clclclsubtypedesc",
    "clclcurstsdesc",
    "clclcapinddesc",
    "memereldesc",
    "clcbcobtype",
    "clcbcobamt",
    "clcbcobdisallow",
    "clcbcoballow",
    "clcbcobtypedesc",
    "clcllastactdtm",
    "clclinputdt",
    "clclpaiddt",
    "cscsid",
    "nwnwid",
    "nwnwname",
    "agagid",
    "clclpayeeprid",
    "clclntwkind",
    "clclpcpind",
    "clclextauthno",
    "clclaiaieobind",
    "clclmicroid",
    "clststsdtm",
    "prprentity",
    "clcleobexcdid",
    "excdhcstatcat",
    "excdhcstatcd",
    "excdhcadjcd",
    "cspiitsprefix",
    "clclhsaind",
    "clclrelclclid",
    "clclhsainddesc",
    "clhstotconsider",
    "clhstotpaid",
    "hsaiid",
    "hsaidesc",
    "hsaiaccsfx",
    "hsaihsafsaind",
    "hsaihsafsainddesc",
    "sbhsdedamt",
    "sbhsmededamt",
    "sbhsdedaccumamt",
    "mehsdedaccumamt",
    "clhssballocamt",
    "clhsmeallocamt",
    "sbhspaidamt",
    "mehspaidamt",
    "sbhspaidcur",
    "sbhsded2ACCMAMT",
    "sbhsded2AMT",
    "sbhsmeded2AMT",
    "mehsded2ACCMAMT",
    "sbhsdedind",
    "sbhsdedinddesc",
    "sbhsded2IND",
    "sbhsded2INDDESC",
    "cdmfexpnsamtsum",
    "cdmfpaidamtsum",
    "cddfexpnsamtsum",
    "cddfpaidamtsum",
    "mcrlmemecrelcd",
    "mcrlcreldesc",
    "pdpdid",
    "clmfprpridfac",
    "clmfinputtxnmcd",
    "prfaname",
    "clmiitssccfno",
    "clclprepriceind",
    "totpaliabclaim",
    "dispaliabclaim",
    "clhpadmdt",
    "clhpadmsource",
    "clhpadmtyp",
    "clhpbillclass",
    "clhpdcdt",
    "clhpdchourcd",
    "clhpdcstat",
    "clhpfactype",
    "clhpfrequency",
    "clhpicdqualind",
    "clhpinputagrgid",
    "clhpipcdmeth",
    "clhpmedrecno",
    "clhpprpridadm",
    "clhpprpridoper",
    "clhpprpridoth1",
    "clhpprpridoth2",
    "clhpstamentfrdt",
    "clhpstamenttodt",
    "clmfinputsbsbid",
    "clmfprprfanpi",
    "clmfprprfatax",
    "clmfprprrfnpi",
    "clmfprprrftax",
    "clmfprprsenpi",
    "clmfprprsetax",
    "clhpprpradnpi",
    "clhpprpradtax",
    "clhpprpropnpi",
    "clhpprproptax",
    "clhpprpro1NPI",
    "clhpprpro1TAX",
    "clhpprpro2NPI",
    "clhpprpro2TAX",
    "clmfinputhlthid",
    "clmficdindproc",
    "clmficdindprocdesc",
    "clmficdqualind",
    "clmficdqualinddesc",
    "clmfextpreathno",
    "clmfextrefralno",
    "clsdprpridrendnvl",
    "clsdprprrenpinvl",
    "clsdprprretaxnvl",
    "nwpepfx",
    "nwpepfxdesc",
    "nwprpfx",
    "nwprpfxdesc",
    "nwcrpfx",
    "nwcrpfxdesc",
    "pdbcpfxnppr",
    "npprpfxdesc",
    "pdbcpfxsppr",
    "spprpfxdesc",
    "pdbcpfxsedf",
    "sedfpfxdesc",
    "clspntwkind",
    "pdpdaccsfx",
    "agrgid",
    "clspagsource",
    "clspagsourcedesc",
    "pddsprodtype",
    "pddsprodtypedesc",
    "pddsmctrbcat",
    "pddsmctrbcatdesc",
    "clsptotamtaply",
    "clhccoll",
    "clidcoll",
    "clrncoll"
})
public class RECCLCL
    extends RecordBase
{

    @XmlElement(name = "CLCL_ID")
    protected String clclid;
    @XmlElement(name = "MEME_CK", required = true, type = Long.class, nillable = true)
    protected Long memeck;
    @XmlElement(name = "GRGR_CK", required = true, type = Long.class, nillable = true)
    protected Long grgrck;
    @XmlElement(name = "SBSB_CK", required = true, type = Long.class, nillable = true)
    protected Long sbsbck;
    @XmlElement(name = "SGSG_CK", required = true, type = Long.class, nillable = true)
    protected Long sgsgck;
    @XmlElement(name = "CSPD_CAT")
    protected String cspdcat;
    @XmlElement(name = "CLCL_PAY_PR_IND")
    protected String clclpayprind;
    @XmlElement(name = "CLCL_CL_TYPE")
    protected String clclcltype;
    @XmlElement(name = "CLCL_CL_SUB_TYPE")
    protected String clclclsubtype;
    @XmlElement(name = "CLCL_CUR_STS")
    protected String clclcursts;
    @XmlElement(name = "CLCL_RECD_DT", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clclrecddt;
    @XmlElement(name = "CLCL_LOW_SVC_DT", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clcllowsvcdt;
    @XmlElement(name = "CLCL_HIGH_SVC_DT", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clclhighsvcdt;
    @XmlElement(name = "CLCL_ID_ADJ_FROM")
    protected String clclidadjfrom;
    @XmlElement(name = "CLCL_ID_ADJ_TO")
    protected String clclidadjto;
    @XmlElement(name = "CLCL_TOT_CHG", required = true, nillable = true)
    protected BigDecimal clcltotchg;
    @XmlElement(name = "CLCL_TOT_PAYABLE", required = true, nillable = true)
    protected BigDecimal clcltotpayable;
    @XmlElement(name = "CLCL_PA_PAID_AMT", required = true, nillable = true)
    protected BigDecimal clclpapaidamt;
    @XmlElement(name = "CLCL_PA_ACCT_NO")
    protected String clclpaacctno;
    @XmlElement(name = "CLCL_CAP_IND")
    protected String clclcapind;
    @XmlElement(name = "CLST_MCTR_REAS")
    protected String clstmctrreas;
    @XmlElement(name = "CLST_MCTR_REAS_DESC")
    protected String clstmctrreasdesc;
    @XmlElement(name = "PRPR_ID")
    protected String prprid;
    @XmlElement(name = "PRPR_NAME")
    protected String prprname;
    @XmlElement(name = "PRPR_NPI")
    protected String prprnpi;
    @XmlElement(name = "MEME_SFX", required = true, type = Integer.class, nillable = true)
    protected Integer memesfx;
    @XmlElement(name = "MEME_FIRST_NAME")
    protected String memefirstname;
    @XmlElement(name = "MEME_LAST_NAME")
    protected String memelastname;
    @XmlElement(name = "MEME_MID_INIT")
    protected String mememidinit;
    @XmlElement(name = "MEME_REL")
    protected String memerel;
    @XmlElement(name = "CSPD_CAT_DESC")
    protected String cspdcatdesc;
    @XmlElement(name = "SBSB_ID")
    protected String sbsbid;
    @XmlElement(name = "SBIH_SBSB_ID_ORIG")
    protected String sbihsbsbidorig;
    @XmlElement(name = "GRGR_NAME")
    protected String grgrname;
    @XmlElement(name = "GRGR_ID")
    protected String grgrid;
    @XmlElement(name = "SGSG_NAME")
    protected String sgsgname;
    @XmlElement(name = "CSPI_ID")
    protected String cspiid;
    @XmlElement(name = "PLDS_DESC")
    protected String pldsdesc;
    @XmlElement(name = "CLCL_PAY_PR_IND_DESC")
    protected String clclpayprinddesc;
    @XmlElement(name = "CLCL_CL_TYPE_DESC")
    protected String clclcltypedesc;
    @XmlElement(name = "CLCL_CL_SUB_TYPE_DESC")
    protected String clclclsubtypedesc;
    @XmlElement(name = "CLCL_CUR_STS_DESC")
    protected String clclcurstsdesc;
    @XmlElement(name = "CLCL_CAP_IND_DESC")
    protected String clclcapinddesc;
    @XmlElement(name = "MEME_REL_DESC")
    protected String memereldesc;
    @XmlElement(name = "CLCB_COB_TYPE")
    protected String clcbcobtype;
    @XmlElement(name = "CLCB_COB_AMT", required = true, nillable = true)
    protected BigDecimal clcbcobamt;
    @XmlElement(name = "CLCB_COB_DISALLOW", required = true, nillable = true)
    protected BigDecimal clcbcobdisallow;
    @XmlElement(name = "CLCB_COB_ALLOW", required = true, nillable = true)
    protected BigDecimal clcbcoballow;
    @XmlElement(name = "CLCB_COB_TYPE_DESC")
    protected String clcbcobtypedesc;
    @XmlElement(name = "CLCL_LAST_ACT_DTM", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clcllastactdtm;
    @XmlElement(name = "CLCL_INPUT_DT", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clclinputdt;
    @XmlElement(name = "CLCL_PAID_DT", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clclpaiddt;
    @XmlElement(name = "CSCS_ID")
    protected String cscsid;
    @XmlElement(name = "NWNW_ID")
    protected String nwnwid;
    @XmlElement(name = "NWNW_NAME")
    protected String nwnwname;
    @XmlElement(name = "AGAG_ID")
    protected String agagid;
    @XmlElement(name = "CLCL_PAYEE_PR_ID")
    protected String clclpayeeprid;
    @XmlElement(name = "CLCL_NTWK_IND")
    protected String clclntwkind;
    @XmlElement(name = "CLCL_PCP_IND")
    protected String clclpcpind;
    @XmlElement(name = "CLCL_EXT_AUTH_NO")
    protected String clclextauthno;
    @XmlElement(name = "CLCL_AIAI_EOB_IND")
    protected String clclaiaieobind;
    @XmlElement(name = "CLCL_MICRO_ID")
    protected String clclmicroid;
    @XmlElement(name = "CLST_STS_DTM", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clststsdtm;
    @XmlElement(name = "PRPR_ENTITY")
    protected String prprentity;
    @XmlElement(name = "CLCL_EOB_EXCD_ID")
    protected String clcleobexcdid;
    @XmlElement(name = "EXCD_HC_STAT_CAT")
    protected String excdhcstatcat;
    @XmlElement(name = "EXCD_HC_STAT_CD")
    protected String excdhcstatcd;
    @XmlElement(name = "EXCD_HC_ADJ_CD")
    protected String excdhcadjcd;
    @XmlElement(name = "CSPI_ITS_PREFIX")
    protected String cspiitsprefix;
    @XmlElement(name = "CLCL_HSA_IND")
    protected String clclhsaind;
    @XmlElement(name = "CLCL_REL_CLCL_ID")
    protected String clclrelclclid;
    @XmlElement(name = "CLCL_HSA_IND_DESC")
    protected String clclhsainddesc;
    @XmlElement(name = "CLHS_TOT_CONSIDER", required = true, nillable = true)
    protected BigDecimal clhstotconsider;
    @XmlElement(name = "CLHS_TOT_PAID", required = true, nillable = true)
    protected BigDecimal clhstotpaid;
    @XmlElement(name = "HSAI_ID")
    protected String hsaiid;
    @XmlElement(name = "HSAI_DESC")
    protected String hsaidesc;
    @XmlElement(name = "HSAI_ACC_SFX")
    protected String hsaiaccsfx;
    @XmlElement(name = "HSAI_HSA_FSA_IND")
    protected String hsaihsafsaind;
    @XmlElement(name = "HSAI_HSA_FSA_IND_DESC")
    protected String hsaihsafsainddesc;
    @XmlElement(name = "SBHS_DED_AMT", required = true, nillable = true)
    protected BigDecimal sbhsdedamt;
    @XmlElement(name = "SBHS_ME_DED_AMT", required = true, nillable = true)
    protected BigDecimal sbhsmededamt;
    @XmlElement(name = "SBHS_DED_ACCUM_AMT", required = true, nillable = true)
    protected BigDecimal sbhsdedaccumamt;
    @XmlElement(name = "MEHS_DED_ACCUM_AMT", required = true, nillable = true)
    protected BigDecimal mehsdedaccumamt;
    @XmlElement(name = "CLHS_SB_ALLOC_AMT", required = true, nillable = true)
    protected BigDecimal clhssballocamt;
    @XmlElement(name = "CLHS_ME_ALLOC_AMT", required = true, nillable = true)
    protected BigDecimal clhsmeallocamt;
    @XmlElement(name = "SBHS_PAID_AMT", required = true, nillable = true)
    protected BigDecimal sbhspaidamt;
    @XmlElement(name = "MEHS_PAID_AMT", required = true, nillable = true)
    protected BigDecimal mehspaidamt;
    @XmlElement(name = "SBHS_PAID_CUR", required = true, nillable = true)
    protected BigDecimal sbhspaidcur;
    @XmlElement(name = "SBHS_DED2_ACCM_AMT", required = true, nillable = true)
    protected BigDecimal sbhsded2ACCMAMT;
    @XmlElement(name = "SBHS_DED2_AMT", required = true, nillable = true)
    protected BigDecimal sbhsded2AMT;
    @XmlElement(name = "SBHS_ME_DED2_AMT", required = true, nillable = true)
    protected BigDecimal sbhsmeded2AMT;
    @XmlElement(name = "MEHS_DED2_ACCM_AMT", required = true, nillable = true)
    protected BigDecimal mehsded2ACCMAMT;
    @XmlElement(name = "SBHS_DED_IND")
    protected String sbhsdedind;
    @XmlElement(name = "SBHS_DED_IND_DESC")
    protected String sbhsdedinddesc;
    @XmlElement(name = "SBHS_DED2_IND")
    protected String sbhsded2IND;
    @XmlElement(name = "SBHS_DED2_IND_DESC")
    protected String sbhsded2INDDESC;
    @XmlElement(name = "CDMF_EXPNS_AMT_SUM", required = true, nillable = true)
    protected BigDecimal cdmfexpnsamtsum;
    @XmlElement(name = "CDMF_PAID_AMT_SUM", required = true, nillable = true)
    protected BigDecimal cdmfpaidamtsum;
    @XmlElement(name = "CDDF_EXPNS_AMT_SUM", required = true, nillable = true)
    protected BigDecimal cddfexpnsamtsum;
    @XmlElement(name = "CDDF_PAID_AMT_SUM", required = true, nillable = true)
    protected BigDecimal cddfpaidamtsum;
    @XmlElement(name = "MCRL_MEME_CREL_CD")
    protected String mcrlmemecrelcd;
    @XmlElement(name = "MCRL_CREL_DESC")
    protected String mcrlcreldesc;
    @XmlElement(name = "PDPD_ID")
    protected String pdpdid;
    @XmlElement(name = "CLMF_PRPR_ID_FAC")
    protected String clmfprpridfac;
    @XmlElement(name = "CLMF_INPUT_TXNM_CD")
    protected String clmfinputtxnmcd;
    @XmlElement(name = "PRFA_NAME")
    protected String prfaname;
    @XmlElement(name = "CLMI_ITS_SCCF_NO")
    protected String clmiitssccfno;
    @XmlElement(name = "CLCL_PRE_PRICE_IND")
    protected String clclprepriceind;
    @XmlElement(name = "TOT_PA_LIAB_CLAIM", required = true, nillable = true)
    protected BigDecimal totpaliabclaim;
    @XmlElement(name = "DIS_PA_LIAB_CLAIM", required = true, nillable = true)
    protected BigDecimal dispaliabclaim;
    @XmlElement(name = "CLHP_ADM_DT", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clhpadmdt;
    @XmlElement(name = "CLHP_ADM_SOURCE")
    protected String clhpadmsource;
    @XmlElement(name = "CLHP_ADM_TYP")
    protected String clhpadmtyp;
    @XmlElement(name = "CLHP_BILL_CLASS")
    protected String clhpbillclass;
    @XmlElement(name = "CLHP_DC_DT", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clhpdcdt;
    @XmlElement(name = "CLHP_DC_HOUR_CD")
    protected String clhpdchourcd;
    @XmlElement(name = "CLHP_DC_STAT")
    protected String clhpdcstat;
    @XmlElement(name = "CLHP_FAC_TYPE")
    protected String clhpfactype;
    @XmlElement(name = "CLHP_FREQUENCY")
    protected String clhpfrequency;
    @XmlElement(name = "CLHP_ICD_QUAL_IND")
    protected String clhpicdqualind;
    @XmlElement(name = "CLHP_INPUT_AGRG_ID")
    protected String clhpinputagrgid;
    @XmlElement(name = "CLHP_IPCD_METH")
    protected String clhpipcdmeth;
    @XmlElement(name = "CLHP_MED_REC_NO")
    protected String clhpmedrecno;
    @XmlElement(name = "CLHP_PRPR_ID_ADM")
    protected String clhpprpridadm;
    @XmlElement(name = "CLHP_PRPR_ID_OPER")
    protected String clhpprpridoper;
    @XmlElement(name = "CLHP_PRPR_ID_OTH1")
    protected String clhpprpridoth1;
    @XmlElement(name = "CLHP_PRPR_ID_OTH2")
    protected String clhpprpridoth2;
    @XmlElement(name = "CLHP_STAMENT_FR_DT", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clhpstamentfrdt;
    @XmlElement(name = "CLHP_STAMENT_TO_DT", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clhpstamenttodt;
    @XmlElement(name = "CLMF_INPUT_SBSB_ID")
    protected String clmfinputsbsbid;
    @XmlElement(name = "CLMF_PRPR_FA_NPI")
    protected String clmfprprfanpi;
    @XmlElement(name = "CLMF_PRPR_FA_TAX")
    protected String clmfprprfatax;
    @XmlElement(name = "CLMF_PRPR_RF_NPI")
    protected String clmfprprrfnpi;
    @XmlElement(name = "CLMF_PRPR_RF_TAX")
    protected String clmfprprrftax;
    @XmlElement(name = "CLMF_PRPR_SE_NPI")
    protected String clmfprprsenpi;
    @XmlElement(name = "CLMF_PRPR_SE_TAX")
    protected String clmfprprsetax;
    @XmlElement(name = "CLHP_PRPR_AD_NPI")
    protected String clhpprpradnpi;
    @XmlElement(name = "CLHP_PRPR_AD_TAX")
    protected String clhpprpradtax;
    @XmlElement(name = "CLHP_PRPR_OP_NPI")
    protected String clhpprpropnpi;
    @XmlElement(name = "CLHP_PRPR_OP_TAX")
    protected String clhpprproptax;
    @XmlElement(name = "CLHP_PRPR_O1_NPI")
    protected String clhpprpro1NPI;
    @XmlElement(name = "CLHP_PRPR_O1_TAX")
    protected String clhpprpro1TAX;
    @XmlElement(name = "CLHP_PRPR_O2_NPI")
    protected String clhpprpro2NPI;
    @XmlElement(name = "CLHP_PRPR_O2_TAX")
    protected String clhpprpro2TAX;
    @XmlElement(name = "CLMF_INPUT_HLTH_ID")
    protected String clmfinputhlthid;
    @XmlElement(name = "CLMF_ICD_IND_PROC")
    protected String clmficdindproc;
    @XmlElement(name = "CLMF_ICD_IND_PROC_DESC")
    protected String clmficdindprocdesc;
    @XmlElement(name = "CLMF_ICD_QUAL_IND")
    protected String clmficdqualind;
    @XmlElement(name = "CLMF_ICD_QUAL_IND_DESC")
    protected String clmficdqualinddesc;
    @XmlElement(name = "CLMF_EXT_PREATH_NO")
    protected String clmfextpreathno;
    @XmlElement(name = "CLMF_EXT_REFRAL_NO")
    protected String clmfextrefralno;
    @XmlElement(name = "CLSD_PRPR_ID_REND_NVL")
    protected String clsdprpridrendnvl;
    @XmlElement(name = "CLSD_PRPR_RE_NPI_NVL")
    protected String clsdprprrenpinvl;
    @XmlElement(name = "CLSD_PRPR_RE_TAX_NVL")
    protected String clsdprprretaxnvl;
    @XmlElement(name = "NWPE_PFX")
    protected String nwpepfx;
    @XmlElement(name = "NWPE_PFX_DESC")
    protected String nwpepfxdesc;
    @XmlElement(name = "NWPR_PFX")
    protected String nwprpfx;
    @XmlElement(name = "NWPR_PFX_DESC")
    protected String nwprpfxdesc;
    @XmlElement(name = "NWCR_PFX")
    protected String nwcrpfx;
    @XmlElement(name = "NWCR_PFX_DESC")
    protected String nwcrpfxdesc;
    @XmlElement(name = "PDBC_PFX_NPPR")
    protected String pdbcpfxnppr;
    @XmlElement(name = "NPPR_PFX_DESC")
    protected String npprpfxdesc;
    @XmlElement(name = "PDBC_PFX_SPPR")
    protected String pdbcpfxsppr;
    @XmlElement(name = "SPPR_PFX_DESC")
    protected String spprpfxdesc;
    @XmlElement(name = "PDBC_PFX_SEDF")
    protected String pdbcpfxsedf;
    @XmlElement(name = "SEDF_PFX_DESC")
    protected String sedfpfxdesc;
    @XmlElement(name = "CLSP_NTWK_IND")
    protected String clspntwkind;
    @XmlElement(name = "PDPD_ACC_SFX")
    protected String pdpdaccsfx;
    @XmlElement(name = "AGRG_ID")
    protected String agrgid;
    @XmlElement(name = "CLSP_AG_SOURCE")
    protected String clspagsource;
    @XmlElement(name = "CLSP_AG_SOURCE_DESC")
    protected String clspagsourcedesc;
    @XmlElement(name = "PDDS_PROD_TYPE")
    protected String pddsprodtype;
    @XmlElement(name = "PDDS_PROD_TYPE_DESC")
    protected String pddsprodtypedesc;
    @XmlElement(name = "PDDS_MCTR_BCAT")
    protected String pddsmctrbcat;
    @XmlElement(name = "PDDS_MCTR_BCAT_DESC")
    protected String pddsmctrbcatdesc;
    @XmlElement(name = "CLSP_TOT_AMT_APLY")
    protected String clsptotamtaply;
    @XmlElement(name = "CLHC_COLL")
    protected ArrayOfRECCLHC clhccoll;
    @XmlElement(name = "CLID_COLL")
    protected ArrayOfRECCLID clidcoll;
    @XmlElement(name = "CLRN_COLL")
    protected ArrayOfRECCLRN clrncoll;

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
     * Gets the value of the sbsbck property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSBSBCK() {
        return sbsbck;
    }

    /**
     * Sets the value of the sbsbck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSBSBCK(Long value) {
        this.sbsbck = value;
    }

    /**
     * Gets the value of the sgsgck property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSGSGCK() {
        return sgsgck;
    }

    /**
     * Sets the value of the sgsgck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSGSGCK(Long value) {
        this.sgsgck = value;
    }

    /**
     * Gets the value of the cspdcat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSPDCAT() {
        return cspdcat;
    }

    /**
     * Sets the value of the cspdcat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSPDCAT(String value) {
        this.cspdcat = value;
    }

    /**
     * Gets the value of the clclpayprind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLCLPAYPRIND() {
        return clclpayprind;
    }

    /**
     * Sets the value of the clclpayprind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLCLPAYPRIND(String value) {
        this.clclpayprind = value;
    }

    /**
     * Gets the value of the clclcltype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLCLCLTYPE() {
        return clclcltype;
    }

    /**
     * Sets the value of the clclcltype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLCLCLTYPE(String value) {
        this.clclcltype = value;
    }

    /**
     * Gets the value of the clclclsubtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLCLCLSUBTYPE() {
        return clclclsubtype;
    }

    /**
     * Sets the value of the clclclsubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLCLCLSUBTYPE(String value) {
        this.clclclsubtype = value;
    }

    /**
     * Gets the value of the clclcursts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLCLCURSTS() {
        return clclcursts;
    }

    /**
     * Sets the value of the clclcursts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLCLCURSTS(String value) {
        this.clclcursts = value;
    }

    /**
     * Gets the value of the clclrecddt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCLCLRECDDT() {
        return clclrecddt;
    }

    /**
     * Sets the value of the clclrecddt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCLCLRECDDT(XMLGregorianCalendar value) {
        this.clclrecddt = value;
    }

    /**
     * Gets the value of the clcllowsvcdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCLCLLOWSVCDT() {
        return clcllowsvcdt;
    }

    /**
     * Sets the value of the clcllowsvcdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCLCLLOWSVCDT(XMLGregorianCalendar value) {
        this.clcllowsvcdt = value;
    }

    /**
     * Gets the value of the clclhighsvcdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCLCLHIGHSVCDT() {
        return clclhighsvcdt;
    }

    /**
     * Sets the value of the clclhighsvcdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCLCLHIGHSVCDT(XMLGregorianCalendar value) {
        this.clclhighsvcdt = value;
    }

    /**
     * Gets the value of the clclidadjfrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLCLIDADJFROM() {
        return clclidadjfrom;
    }

    /**
     * Sets the value of the clclidadjfrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLCLIDADJFROM(String value) {
        this.clclidadjfrom = value;
    }

    /**
     * Gets the value of the clclidadjto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLCLIDADJTO() {
        return clclidadjto;
    }

    /**
     * Sets the value of the clclidadjto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLCLIDADJTO(String value) {
        this.clclidadjto = value;
    }

    /**
     * Gets the value of the clcltotchg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCLCLTOTCHG() {
        return clcltotchg;
    }

    /**
     * Sets the value of the clcltotchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCLCLTOTCHG(BigDecimal value) {
        this.clcltotchg = value;
    }

    /**
     * Gets the value of the clcltotpayable property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCLCLTOTPAYABLE() {
        return clcltotpayable;
    }

    /**
     * Sets the value of the clcltotpayable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCLCLTOTPAYABLE(BigDecimal value) {
        this.clcltotpayable = value;
    }

    /**
     * Gets the value of the clclpapaidamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCLCLPAPAIDAMT() {
        return clclpapaidamt;
    }

    /**
     * Sets the value of the clclpapaidamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCLCLPAPAIDAMT(BigDecimal value) {
        this.clclpapaidamt = value;
    }

    /**
     * Gets the value of the clclpaacctno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLCLPAACCTNO() {
        return clclpaacctno;
    }

    /**
     * Sets the value of the clclpaacctno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLCLPAACCTNO(String value) {
        this.clclpaacctno = value;
    }

    /**
     * Gets the value of the clclcapind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLCLCAPIND() {
        return clclcapind;
    }

    /**
     * Sets the value of the clclcapind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLCLCAPIND(String value) {
        this.clclcapind = value;
    }

    /**
     * Gets the value of the clstmctrreas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLSTMCTRREAS() {
        return clstmctrreas;
    }

    /**
     * Sets the value of the clstmctrreas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLSTMCTRREAS(String value) {
        this.clstmctrreas = value;
    }

    /**
     * Gets the value of the clstmctrreasdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLSTMCTRREASDESC() {
        return clstmctrreasdesc;
    }

    /**
     * Sets the value of the clstmctrreasdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLSTMCTRREASDESC(String value) {
        this.clstmctrreasdesc = value;
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
     * Gets the value of the cspdcatdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSPDCATDESC() {
        return cspdcatdesc;
    }

    /**
     * Sets the value of the cspdcatdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSPDCATDESC(String value) {
        this.cspdcatdesc = value;
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
     * Gets the value of the grgrname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRGRNAME() {
        return grgrname;
    }

    /**
     * Sets the value of the grgrname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRGRNAME(String value) {
        this.grgrname = value;
    }

    /**
     * Gets the value of the grgrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRGRID() {
        return grgrid;
    }

    /**
     * Sets the value of the grgrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRGRID(String value) {
        this.grgrid = value;
    }

    /**
     * Gets the value of the sgsgname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSGSGNAME() {
        return sgsgname;
    }

    /**
     * Sets the value of the sgsgname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSGSGNAME(String value) {
        this.sgsgname = value;
    }

    /**
     * Gets the value of the cspiid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSPIID() {
        return cspiid;
    }

    /**
     * Sets the value of the cspiid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSPIID(String value) {
        this.cspiid = value;
    }

    /**
     * Gets the value of the pldsdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLDSDESC() {
        return pldsdesc;
    }

    /**
     * Sets the value of the pldsdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLDSDESC(String value) {
        this.pldsdesc = value;
    }

    /**
     * Gets the value of the clclpayprinddesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLCLPAYPRINDDESC() {
        return clclpayprinddesc;
    }

    /**
     * Sets the value of the clclpayprinddesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLCLPAYPRINDDESC(String value) {
        this.clclpayprinddesc = value;
    }

    /**
     * Gets the value of the clclcltypedesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLCLCLTYPEDESC() {
        return clclcltypedesc;
    }

    /**
     * Sets the value of the clclcltypedesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLCLCLTYPEDESC(String value) {
        this.clclcltypedesc = value;
    }

    /**
     * Gets the value of the clclclsubtypedesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLCLCLSUBTYPEDESC() {
        return clclclsubtypedesc;
    }

    /**
     * Sets the value of the clclclsubtypedesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLCLCLSUBTYPEDESC(String value) {
        this.clclclsubtypedesc = value;
    }

    /**
     * Gets the value of the clclcurstsdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLCLCURSTSDESC() {
        return clclcurstsdesc;
    }

    /**
     * Sets the value of the clclcurstsdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLCLCURSTSDESC(String value) {
        this.clclcurstsdesc = value;
    }

    /**
     * Gets the value of the clclcapinddesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLCLCAPINDDESC() {
        return clclcapinddesc;
    }

    /**
     * Sets the value of the clclcapinddesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLCLCAPINDDESC(String value) {
        this.clclcapinddesc = value;
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
     * Gets the value of the clcbcobtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLCBCOBTYPE() {
        return clcbcobtype;
    }

    /**
     * Sets the value of the clcbcobtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLCBCOBTYPE(String value) {
        this.clcbcobtype = value;
    }

    /**
     * Gets the value of the clcbcobamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCLCBCOBAMT() {
        return clcbcobamt;
    }

    /**
     * Sets the value of the clcbcobamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCLCBCOBAMT(BigDecimal value) {
        this.clcbcobamt = value;
    }

    /**
     * Gets the value of the clcbcobdisallow property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCLCBCOBDISALLOW() {
        return clcbcobdisallow;
    }

    /**
     * Sets the value of the clcbcobdisallow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCLCBCOBDISALLOW(BigDecimal value) {
        this.clcbcobdisallow = value;
    }

    /**
     * Gets the value of the clcbcoballow property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCLCBCOBALLOW() {
        return clcbcoballow;
    }

    /**
     * Sets the value of the clcbcoballow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCLCBCOBALLOW(BigDecimal value) {
        this.clcbcoballow = value;
    }

    /**
     * Gets the value of the clcbcobtypedesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLCBCOBTYPEDESC() {
        return clcbcobtypedesc;
    }

    /**
     * Sets the value of the clcbcobtypedesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLCBCOBTYPEDESC(String value) {
        this.clcbcobtypedesc = value;
    }

    /**
     * Gets the value of the clcllastactdtm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCLCLLASTACTDTM() {
        return clcllastactdtm;
    }

    /**
     * Sets the value of the clcllastactdtm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCLCLLASTACTDTM(XMLGregorianCalendar value) {
        this.clcllastactdtm = value;
    }

    /**
     * Gets the value of the clclinputdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCLCLINPUTDT() {
        return clclinputdt;
    }

    /**
     * Sets the value of the clclinputdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCLCLINPUTDT(XMLGregorianCalendar value) {
        this.clclinputdt = value;
    }

    /**
     * Gets the value of the clclpaiddt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCLCLPAIDDT() {
        return clclpaiddt;
    }

    /**
     * Sets the value of the clclpaiddt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCLCLPAIDDT(XMLGregorianCalendar value) {
        this.clclpaiddt = value;
    }

    /**
     * Gets the value of the cscsid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSCSID() {
        return cscsid;
    }

    /**
     * Sets the value of the cscsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSCSID(String value) {
        this.cscsid = value;
    }

    /**
     * Gets the value of the nwnwid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNWNWID() {
        return nwnwid;
    }

    /**
     * Sets the value of the nwnwid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNWNWID(String value) {
        this.nwnwid = value;
    }

    /**
     * Gets the value of the nwnwname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNWNWNAME() {
        return nwnwname;
    }

    /**
     * Sets the value of the nwnwname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNWNWNAME(String value) {
        this.nwnwname = value;
    }

    /**
     * Gets the value of the agagid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGAGID() {
        return agagid;
    }

    /**
     * Sets the value of the agagid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGAGID(String value) {
        this.agagid = value;
    }

    /**
     * Gets the value of the clclpayeeprid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLCLPAYEEPRID() {
        return clclpayeeprid;
    }

    /**
     * Sets the value of the clclpayeeprid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLCLPAYEEPRID(String value) {
        this.clclpayeeprid = value;
    }

    /**
     * Gets the value of the clclntwkind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLCLNTWKIND() {
        return clclntwkind;
    }

    /**
     * Sets the value of the clclntwkind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLCLNTWKIND(String value) {
        this.clclntwkind = value;
    }

    /**
     * Gets the value of the clclpcpind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLCLPCPIND() {
        return clclpcpind;
    }

    /**
     * Sets the value of the clclpcpind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLCLPCPIND(String value) {
        this.clclpcpind = value;
    }

    /**
     * Gets the value of the clclextauthno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLCLEXTAUTHNO() {
        return clclextauthno;
    }

    /**
     * Sets the value of the clclextauthno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLCLEXTAUTHNO(String value) {
        this.clclextauthno = value;
    }

    /**
     * Gets the value of the clclaiaieobind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLCLAIAIEOBIND() {
        return clclaiaieobind;
    }

    /**
     * Sets the value of the clclaiaieobind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLCLAIAIEOBIND(String value) {
        this.clclaiaieobind = value;
    }

    /**
     * Gets the value of the clclmicroid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLCLMICROID() {
        return clclmicroid;
    }

    /**
     * Sets the value of the clclmicroid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLCLMICROID(String value) {
        this.clclmicroid = value;
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
     * Gets the value of the clcleobexcdid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLCLEOBEXCDID() {
        return clcleobexcdid;
    }

    /**
     * Sets the value of the clcleobexcdid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLCLEOBEXCDID(String value) {
        this.clcleobexcdid = value;
    }

    /**
     * Gets the value of the excdhcstatcat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXCDHCSTATCAT() {
        return excdhcstatcat;
    }

    /**
     * Sets the value of the excdhcstatcat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXCDHCSTATCAT(String value) {
        this.excdhcstatcat = value;
    }

    /**
     * Gets the value of the excdhcstatcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXCDHCSTATCD() {
        return excdhcstatcd;
    }

    /**
     * Sets the value of the excdhcstatcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXCDHCSTATCD(String value) {
        this.excdhcstatcd = value;
    }

    /**
     * Gets the value of the excdhcadjcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXCDHCADJCD() {
        return excdhcadjcd;
    }

    /**
     * Sets the value of the excdhcadjcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXCDHCADJCD(String value) {
        this.excdhcadjcd = value;
    }

    /**
     * Gets the value of the cspiitsprefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSPIITSPREFIX() {
        return cspiitsprefix;
    }

    /**
     * Sets the value of the cspiitsprefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSPIITSPREFIX(String value) {
        this.cspiitsprefix = value;
    }

    /**
     * Gets the value of the clclhsaind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLCLHSAIND() {
        return clclhsaind;
    }

    /**
     * Sets the value of the clclhsaind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLCLHSAIND(String value) {
        this.clclhsaind = value;
    }

    /**
     * Gets the value of the clclrelclclid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLCLRELCLCLID() {
        return clclrelclclid;
    }

    /**
     * Sets the value of the clclrelclclid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLCLRELCLCLID(String value) {
        this.clclrelclclid = value;
    }

    /**
     * Gets the value of the clclhsainddesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLCLHSAINDDESC() {
        return clclhsainddesc;
    }

    /**
     * Sets the value of the clclhsainddesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLCLHSAINDDESC(String value) {
        this.clclhsainddesc = value;
    }

    /**
     * Gets the value of the clhstotconsider property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCLHSTOTCONSIDER() {
        return clhstotconsider;
    }

    /**
     * Sets the value of the clhstotconsider property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCLHSTOTCONSIDER(BigDecimal value) {
        this.clhstotconsider = value;
    }

    /**
     * Gets the value of the clhstotpaid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCLHSTOTPAID() {
        return clhstotpaid;
    }

    /**
     * Sets the value of the clhstotpaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCLHSTOTPAID(BigDecimal value) {
        this.clhstotpaid = value;
    }

    /**
     * Gets the value of the hsaiid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHSAIID() {
        return hsaiid;
    }

    /**
     * Sets the value of the hsaiid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHSAIID(String value) {
        this.hsaiid = value;
    }

    /**
     * Gets the value of the hsaidesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHSAIDESC() {
        return hsaidesc;
    }

    /**
     * Sets the value of the hsaidesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHSAIDESC(String value) {
        this.hsaidesc = value;
    }

    /**
     * Gets the value of the hsaiaccsfx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHSAIACCSFX() {
        return hsaiaccsfx;
    }

    /**
     * Sets the value of the hsaiaccsfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHSAIACCSFX(String value) {
        this.hsaiaccsfx = value;
    }

    /**
     * Gets the value of the hsaihsafsaind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHSAIHSAFSAIND() {
        return hsaihsafsaind;
    }

    /**
     * Sets the value of the hsaihsafsaind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHSAIHSAFSAIND(String value) {
        this.hsaihsafsaind = value;
    }

    /**
     * Gets the value of the hsaihsafsainddesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHSAIHSAFSAINDDESC() {
        return hsaihsafsainddesc;
    }

    /**
     * Sets the value of the hsaihsafsainddesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHSAIHSAFSAINDDESC(String value) {
        this.hsaihsafsainddesc = value;
    }

    /**
     * Gets the value of the sbhsdedamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSBHSDEDAMT() {
        return sbhsdedamt;
    }

    /**
     * Sets the value of the sbhsdedamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSBHSDEDAMT(BigDecimal value) {
        this.sbhsdedamt = value;
    }

    /**
     * Gets the value of the sbhsmededamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSBHSMEDEDAMT() {
        return sbhsmededamt;
    }

    /**
     * Sets the value of the sbhsmededamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSBHSMEDEDAMT(BigDecimal value) {
        this.sbhsmededamt = value;
    }

    /**
     * Gets the value of the sbhsdedaccumamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSBHSDEDACCUMAMT() {
        return sbhsdedaccumamt;
    }

    /**
     * Sets the value of the sbhsdedaccumamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSBHSDEDACCUMAMT(BigDecimal value) {
        this.sbhsdedaccumamt = value;
    }

    /**
     * Gets the value of the mehsdedaccumamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMEHSDEDACCUMAMT() {
        return mehsdedaccumamt;
    }

    /**
     * Sets the value of the mehsdedaccumamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMEHSDEDACCUMAMT(BigDecimal value) {
        this.mehsdedaccumamt = value;
    }

    /**
     * Gets the value of the clhssballocamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCLHSSBALLOCAMT() {
        return clhssballocamt;
    }

    /**
     * Sets the value of the clhssballocamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCLHSSBALLOCAMT(BigDecimal value) {
        this.clhssballocamt = value;
    }

    /**
     * Gets the value of the clhsmeallocamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCLHSMEALLOCAMT() {
        return clhsmeallocamt;
    }

    /**
     * Sets the value of the clhsmeallocamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCLHSMEALLOCAMT(BigDecimal value) {
        this.clhsmeallocamt = value;
    }

    /**
     * Gets the value of the sbhspaidamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSBHSPAIDAMT() {
        return sbhspaidamt;
    }

    /**
     * Sets the value of the sbhspaidamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSBHSPAIDAMT(BigDecimal value) {
        this.sbhspaidamt = value;
    }

    /**
     * Gets the value of the mehspaidamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMEHSPAIDAMT() {
        return mehspaidamt;
    }

    /**
     * Sets the value of the mehspaidamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMEHSPAIDAMT(BigDecimal value) {
        this.mehspaidamt = value;
    }

    /**
     * Gets the value of the sbhspaidcur property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSBHSPAIDCUR() {
        return sbhspaidcur;
    }

    /**
     * Sets the value of the sbhspaidcur property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSBHSPAIDCUR(BigDecimal value) {
        this.sbhspaidcur = value;
    }

    /**
     * Gets the value of the sbhsded2ACCMAMT property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSBHSDED2ACCMAMT() {
        return sbhsded2ACCMAMT;
    }

    /**
     * Sets the value of the sbhsded2ACCMAMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSBHSDED2ACCMAMT(BigDecimal value) {
        this.sbhsded2ACCMAMT = value;
    }

    /**
     * Gets the value of the sbhsded2AMT property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSBHSDED2AMT() {
        return sbhsded2AMT;
    }

    /**
     * Sets the value of the sbhsded2AMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSBHSDED2AMT(BigDecimal value) {
        this.sbhsded2AMT = value;
    }

    /**
     * Gets the value of the sbhsmeded2AMT property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSBHSMEDED2AMT() {
        return sbhsmeded2AMT;
    }

    /**
     * Sets the value of the sbhsmeded2AMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSBHSMEDED2AMT(BigDecimal value) {
        this.sbhsmeded2AMT = value;
    }

    /**
     * Gets the value of the mehsded2ACCMAMT property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMEHSDED2ACCMAMT() {
        return mehsded2ACCMAMT;
    }

    /**
     * Sets the value of the mehsded2ACCMAMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMEHSDED2ACCMAMT(BigDecimal value) {
        this.mehsded2ACCMAMT = value;
    }

    /**
     * Gets the value of the sbhsdedind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBHSDEDIND() {
        return sbhsdedind;
    }

    /**
     * Sets the value of the sbhsdedind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBHSDEDIND(String value) {
        this.sbhsdedind = value;
    }

    /**
     * Gets the value of the sbhsdedinddesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBHSDEDINDDESC() {
        return sbhsdedinddesc;
    }

    /**
     * Sets the value of the sbhsdedinddesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBHSDEDINDDESC(String value) {
        this.sbhsdedinddesc = value;
    }

    /**
     * Gets the value of the sbhsded2IND property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBHSDED2IND() {
        return sbhsded2IND;
    }

    /**
     * Sets the value of the sbhsded2IND property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBHSDED2IND(String value) {
        this.sbhsded2IND = value;
    }

    /**
     * Gets the value of the sbhsded2INDDESC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBHSDED2INDDESC() {
        return sbhsded2INDDESC;
    }

    /**
     * Sets the value of the sbhsded2INDDESC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBHSDED2INDDESC(String value) {
        this.sbhsded2INDDESC = value;
    }

    /**
     * Gets the value of the cdmfexpnsamtsum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDMFEXPNSAMTSUM() {
        return cdmfexpnsamtsum;
    }

    /**
     * Sets the value of the cdmfexpnsamtsum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDMFEXPNSAMTSUM(BigDecimal value) {
        this.cdmfexpnsamtsum = value;
    }

    /**
     * Gets the value of the cdmfpaidamtsum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDMFPAIDAMTSUM() {
        return cdmfpaidamtsum;
    }

    /**
     * Sets the value of the cdmfpaidamtsum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDMFPAIDAMTSUM(BigDecimal value) {
        this.cdmfpaidamtsum = value;
    }

    /**
     * Gets the value of the cddfexpnsamtsum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDDFEXPNSAMTSUM() {
        return cddfexpnsamtsum;
    }

    /**
     * Sets the value of the cddfexpnsamtsum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDDFEXPNSAMTSUM(BigDecimal value) {
        this.cddfexpnsamtsum = value;
    }

    /**
     * Gets the value of the cddfpaidamtsum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDDFPAIDAMTSUM() {
        return cddfpaidamtsum;
    }

    /**
     * Sets the value of the cddfpaidamtsum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDDFPAIDAMTSUM(BigDecimal value) {
        this.cddfpaidamtsum = value;
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
     * Gets the value of the pdpdid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDPDID() {
        return pdpdid;
    }

    /**
     * Sets the value of the pdpdid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDPDID(String value) {
        this.pdpdid = value;
    }

    /**
     * Gets the value of the clmfprpridfac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLMFPRPRIDFAC() {
        return clmfprpridfac;
    }

    /**
     * Sets the value of the clmfprpridfac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLMFPRPRIDFAC(String value) {
        this.clmfprpridfac = value;
    }

    /**
     * Gets the value of the clmfinputtxnmcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLMFINPUTTXNMCD() {
        return clmfinputtxnmcd;
    }

    /**
     * Sets the value of the clmfinputtxnmcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLMFINPUTTXNMCD(String value) {
        this.clmfinputtxnmcd = value;
    }

    /**
     * Gets the value of the prfaname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRFANAME() {
        return prfaname;
    }

    /**
     * Sets the value of the prfaname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRFANAME(String value) {
        this.prfaname = value;
    }

    /**
     * Gets the value of the clmiitssccfno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLMIITSSCCFNO() {
        return clmiitssccfno;
    }

    /**
     * Sets the value of the clmiitssccfno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLMIITSSCCFNO(String value) {
        this.clmiitssccfno = value;
    }

    /**
     * Gets the value of the clclprepriceind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLCLPREPRICEIND() {
        return clclprepriceind;
    }

    /**
     * Sets the value of the clclprepriceind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLCLPREPRICEIND(String value) {
        this.clclprepriceind = value;
    }

    /**
     * Gets the value of the totpaliabclaim property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOTPALIABCLAIM() {
        return totpaliabclaim;
    }

    /**
     * Sets the value of the totpaliabclaim property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOTPALIABCLAIM(BigDecimal value) {
        this.totpaliabclaim = value;
    }

    /**
     * Gets the value of the dispaliabclaim property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDISPALIABCLAIM() {
        return dispaliabclaim;
    }

    /**
     * Sets the value of the dispaliabclaim property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDISPALIABCLAIM(BigDecimal value) {
        this.dispaliabclaim = value;
    }

    /**
     * Gets the value of the clhpadmdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCLHPADMDT() {
        return clhpadmdt;
    }

    /**
     * Sets the value of the clhpadmdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCLHPADMDT(XMLGregorianCalendar value) {
        this.clhpadmdt = value;
    }

    /**
     * Gets the value of the clhpadmsource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLHPADMSOURCE() {
        return clhpadmsource;
    }

    /**
     * Sets the value of the clhpadmsource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLHPADMSOURCE(String value) {
        this.clhpadmsource = value;
    }

    /**
     * Gets the value of the clhpadmtyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLHPADMTYP() {
        return clhpadmtyp;
    }

    /**
     * Sets the value of the clhpadmtyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLHPADMTYP(String value) {
        this.clhpadmtyp = value;
    }

    /**
     * Gets the value of the clhpbillclass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLHPBILLCLASS() {
        return clhpbillclass;
    }

    /**
     * Sets the value of the clhpbillclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLHPBILLCLASS(String value) {
        this.clhpbillclass = value;
    }

    /**
     * Gets the value of the clhpdcdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCLHPDCDT() {
        return clhpdcdt;
    }

    /**
     * Sets the value of the clhpdcdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCLHPDCDT(XMLGregorianCalendar value) {
        this.clhpdcdt = value;
    }

    /**
     * Gets the value of the clhpdchourcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLHPDCHOURCD() {
        return clhpdchourcd;
    }

    /**
     * Sets the value of the clhpdchourcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLHPDCHOURCD(String value) {
        this.clhpdchourcd = value;
    }

    /**
     * Gets the value of the clhpdcstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLHPDCSTAT() {
        return clhpdcstat;
    }

    /**
     * Sets the value of the clhpdcstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLHPDCSTAT(String value) {
        this.clhpdcstat = value;
    }

    /**
     * Gets the value of the clhpfactype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLHPFACTYPE() {
        return clhpfactype;
    }

    /**
     * Sets the value of the clhpfactype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLHPFACTYPE(String value) {
        this.clhpfactype = value;
    }

    /**
     * Gets the value of the clhpfrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLHPFREQUENCY() {
        return clhpfrequency;
    }

    /**
     * Sets the value of the clhpfrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLHPFREQUENCY(String value) {
        this.clhpfrequency = value;
    }

    /**
     * Gets the value of the clhpicdqualind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLHPICDQUALIND() {
        return clhpicdqualind;
    }

    /**
     * Sets the value of the clhpicdqualind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLHPICDQUALIND(String value) {
        this.clhpicdqualind = value;
    }

    /**
     * Gets the value of the clhpinputagrgid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLHPINPUTAGRGID() {
        return clhpinputagrgid;
    }

    /**
     * Sets the value of the clhpinputagrgid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLHPINPUTAGRGID(String value) {
        this.clhpinputagrgid = value;
    }

    /**
     * Gets the value of the clhpipcdmeth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLHPIPCDMETH() {
        return clhpipcdmeth;
    }

    /**
     * Sets the value of the clhpipcdmeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLHPIPCDMETH(String value) {
        this.clhpipcdmeth = value;
    }

    /**
     * Gets the value of the clhpmedrecno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLHPMEDRECNO() {
        return clhpmedrecno;
    }

    /**
     * Sets the value of the clhpmedrecno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLHPMEDRECNO(String value) {
        this.clhpmedrecno = value;
    }

    /**
     * Gets the value of the clhpprpridadm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLHPPRPRIDADM() {
        return clhpprpridadm;
    }

    /**
     * Sets the value of the clhpprpridadm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLHPPRPRIDADM(String value) {
        this.clhpprpridadm = value;
    }

    /**
     * Gets the value of the clhpprpridoper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLHPPRPRIDOPER() {
        return clhpprpridoper;
    }

    /**
     * Sets the value of the clhpprpridoper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLHPPRPRIDOPER(String value) {
        this.clhpprpridoper = value;
    }

    /**
     * Gets the value of the clhpprpridoth1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLHPPRPRIDOTH1() {
        return clhpprpridoth1;
    }

    /**
     * Sets the value of the clhpprpridoth1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLHPPRPRIDOTH1(String value) {
        this.clhpprpridoth1 = value;
    }

    /**
     * Gets the value of the clhpprpridoth2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLHPPRPRIDOTH2() {
        return clhpprpridoth2;
    }

    /**
     * Sets the value of the clhpprpridoth2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLHPPRPRIDOTH2(String value) {
        this.clhpprpridoth2 = value;
    }

    /**
     * Gets the value of the clhpstamentfrdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCLHPSTAMENTFRDT() {
        return clhpstamentfrdt;
    }

    /**
     * Sets the value of the clhpstamentfrdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCLHPSTAMENTFRDT(XMLGregorianCalendar value) {
        this.clhpstamentfrdt = value;
    }

    /**
     * Gets the value of the clhpstamenttodt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCLHPSTAMENTTODT() {
        return clhpstamenttodt;
    }

    /**
     * Sets the value of the clhpstamenttodt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCLHPSTAMENTTODT(XMLGregorianCalendar value) {
        this.clhpstamenttodt = value;
    }

    /**
     * Gets the value of the clmfinputsbsbid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLMFINPUTSBSBID() {
        return clmfinputsbsbid;
    }

    /**
     * Sets the value of the clmfinputsbsbid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLMFINPUTSBSBID(String value) {
        this.clmfinputsbsbid = value;
    }

    /**
     * Gets the value of the clmfprprfanpi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLMFPRPRFANPI() {
        return clmfprprfanpi;
    }

    /**
     * Sets the value of the clmfprprfanpi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLMFPRPRFANPI(String value) {
        this.clmfprprfanpi = value;
    }

    /**
     * Gets the value of the clmfprprfatax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLMFPRPRFATAX() {
        return clmfprprfatax;
    }

    /**
     * Sets the value of the clmfprprfatax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLMFPRPRFATAX(String value) {
        this.clmfprprfatax = value;
    }

    /**
     * Gets the value of the clmfprprrfnpi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLMFPRPRRFNPI() {
        return clmfprprrfnpi;
    }

    /**
     * Sets the value of the clmfprprrfnpi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLMFPRPRRFNPI(String value) {
        this.clmfprprrfnpi = value;
    }

    /**
     * Gets the value of the clmfprprrftax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLMFPRPRRFTAX() {
        return clmfprprrftax;
    }

    /**
     * Sets the value of the clmfprprrftax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLMFPRPRRFTAX(String value) {
        this.clmfprprrftax = value;
    }

    /**
     * Gets the value of the clmfprprsenpi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLMFPRPRSENPI() {
        return clmfprprsenpi;
    }

    /**
     * Sets the value of the clmfprprsenpi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLMFPRPRSENPI(String value) {
        this.clmfprprsenpi = value;
    }

    /**
     * Gets the value of the clmfprprsetax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLMFPRPRSETAX() {
        return clmfprprsetax;
    }

    /**
     * Sets the value of the clmfprprsetax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLMFPRPRSETAX(String value) {
        this.clmfprprsetax = value;
    }

    /**
     * Gets the value of the clhpprpradnpi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLHPPRPRADNPI() {
        return clhpprpradnpi;
    }

    /**
     * Sets the value of the clhpprpradnpi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLHPPRPRADNPI(String value) {
        this.clhpprpradnpi = value;
    }

    /**
     * Gets the value of the clhpprpradtax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLHPPRPRADTAX() {
        return clhpprpradtax;
    }

    /**
     * Sets the value of the clhpprpradtax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLHPPRPRADTAX(String value) {
        this.clhpprpradtax = value;
    }

    /**
     * Gets the value of the clhpprpropnpi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLHPPRPROPNPI() {
        return clhpprpropnpi;
    }

    /**
     * Sets the value of the clhpprpropnpi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLHPPRPROPNPI(String value) {
        this.clhpprpropnpi = value;
    }

    /**
     * Gets the value of the clhpprproptax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLHPPRPROPTAX() {
        return clhpprproptax;
    }

    /**
     * Sets the value of the clhpprproptax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLHPPRPROPTAX(String value) {
        this.clhpprproptax = value;
    }

    /**
     * Gets the value of the clhpprpro1NPI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLHPPRPRO1NPI() {
        return clhpprpro1NPI;
    }

    /**
     * Sets the value of the clhpprpro1NPI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLHPPRPRO1NPI(String value) {
        this.clhpprpro1NPI = value;
    }

    /**
     * Gets the value of the clhpprpro1TAX property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLHPPRPRO1TAX() {
        return clhpprpro1TAX;
    }

    /**
     * Sets the value of the clhpprpro1TAX property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLHPPRPRO1TAX(String value) {
        this.clhpprpro1TAX = value;
    }

    /**
     * Gets the value of the clhpprpro2NPI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLHPPRPRO2NPI() {
        return clhpprpro2NPI;
    }

    /**
     * Sets the value of the clhpprpro2NPI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLHPPRPRO2NPI(String value) {
        this.clhpprpro2NPI = value;
    }

    /**
     * Gets the value of the clhpprpro2TAX property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLHPPRPRO2TAX() {
        return clhpprpro2TAX;
    }

    /**
     * Sets the value of the clhpprpro2TAX property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLHPPRPRO2TAX(String value) {
        this.clhpprpro2TAX = value;
    }

    /**
     * Gets the value of the clmfinputhlthid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLMFINPUTHLTHID() {
        return clmfinputhlthid;
    }

    /**
     * Sets the value of the clmfinputhlthid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLMFINPUTHLTHID(String value) {
        this.clmfinputhlthid = value;
    }

    /**
     * Gets the value of the clmficdindproc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLMFICDINDPROC() {
        return clmficdindproc;
    }

    /**
     * Sets the value of the clmficdindproc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLMFICDINDPROC(String value) {
        this.clmficdindproc = value;
    }

    /**
     * Gets the value of the clmficdindprocdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLMFICDINDPROCDESC() {
        return clmficdindprocdesc;
    }

    /**
     * Sets the value of the clmficdindprocdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLMFICDINDPROCDESC(String value) {
        this.clmficdindprocdesc = value;
    }

    /**
     * Gets the value of the clmficdqualind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLMFICDQUALIND() {
        return clmficdqualind;
    }

    /**
     * Sets the value of the clmficdqualind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLMFICDQUALIND(String value) {
        this.clmficdqualind = value;
    }

    /**
     * Gets the value of the clmficdqualinddesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLMFICDQUALINDDESC() {
        return clmficdqualinddesc;
    }

    /**
     * Sets the value of the clmficdqualinddesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLMFICDQUALINDDESC(String value) {
        this.clmficdqualinddesc = value;
    }

    /**
     * Gets the value of the clmfextpreathno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLMFEXTPREATHNO() {
        return clmfextpreathno;
    }

    /**
     * Sets the value of the clmfextpreathno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLMFEXTPREATHNO(String value) {
        this.clmfextpreathno = value;
    }

    /**
     * Gets the value of the clmfextrefralno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLMFEXTREFRALNO() {
        return clmfextrefralno;
    }

    /**
     * Sets the value of the clmfextrefralno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLMFEXTREFRALNO(String value) {
        this.clmfextrefralno = value;
    }

    /**
     * Gets the value of the clsdprpridrendnvl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLSDPRPRIDRENDNVL() {
        return clsdprpridrendnvl;
    }

    /**
     * Sets the value of the clsdprpridrendnvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLSDPRPRIDRENDNVL(String value) {
        this.clsdprpridrendnvl = value;
    }

    /**
     * Gets the value of the clsdprprrenpinvl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLSDPRPRRENPINVL() {
        return clsdprprrenpinvl;
    }

    /**
     * Sets the value of the clsdprprrenpinvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLSDPRPRRENPINVL(String value) {
        this.clsdprprrenpinvl = value;
    }

    /**
     * Gets the value of the clsdprprretaxnvl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLSDPRPRRETAXNVL() {
        return clsdprprretaxnvl;
    }

    /**
     * Sets the value of the clsdprprretaxnvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLSDPRPRRETAXNVL(String value) {
        this.clsdprprretaxnvl = value;
    }

    /**
     * Gets the value of the nwpepfx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNWPEPFX() {
        return nwpepfx;
    }

    /**
     * Sets the value of the nwpepfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNWPEPFX(String value) {
        this.nwpepfx = value;
    }

    /**
     * Gets the value of the nwpepfxdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNWPEPFXDESC() {
        return nwpepfxdesc;
    }

    /**
     * Sets the value of the nwpepfxdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNWPEPFXDESC(String value) {
        this.nwpepfxdesc = value;
    }

    /**
     * Gets the value of the nwprpfx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNWPRPFX() {
        return nwprpfx;
    }

    /**
     * Sets the value of the nwprpfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNWPRPFX(String value) {
        this.nwprpfx = value;
    }

    /**
     * Gets the value of the nwprpfxdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNWPRPFXDESC() {
        return nwprpfxdesc;
    }

    /**
     * Sets the value of the nwprpfxdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNWPRPFXDESC(String value) {
        this.nwprpfxdesc = value;
    }

    /**
     * Gets the value of the nwcrpfx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNWCRPFX() {
        return nwcrpfx;
    }

    /**
     * Sets the value of the nwcrpfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNWCRPFX(String value) {
        this.nwcrpfx = value;
    }

    /**
     * Gets the value of the nwcrpfxdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNWCRPFXDESC() {
        return nwcrpfxdesc;
    }

    /**
     * Sets the value of the nwcrpfxdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNWCRPFXDESC(String value) {
        this.nwcrpfxdesc = value;
    }

    /**
     * Gets the value of the pdbcpfxnppr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDBCPFXNPPR() {
        return pdbcpfxnppr;
    }

    /**
     * Sets the value of the pdbcpfxnppr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDBCPFXNPPR(String value) {
        this.pdbcpfxnppr = value;
    }

    /**
     * Gets the value of the npprpfxdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPPRPFXDESC() {
        return npprpfxdesc;
    }

    /**
     * Sets the value of the npprpfxdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPPRPFXDESC(String value) {
        this.npprpfxdesc = value;
    }

    /**
     * Gets the value of the pdbcpfxsppr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDBCPFXSPPR() {
        return pdbcpfxsppr;
    }

    /**
     * Sets the value of the pdbcpfxsppr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDBCPFXSPPR(String value) {
        this.pdbcpfxsppr = value;
    }

    /**
     * Gets the value of the spprpfxdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPPRPFXDESC() {
        return spprpfxdesc;
    }

    /**
     * Sets the value of the spprpfxdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPPRPFXDESC(String value) {
        this.spprpfxdesc = value;
    }

    /**
     * Gets the value of the pdbcpfxsedf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDBCPFXSEDF() {
        return pdbcpfxsedf;
    }

    /**
     * Sets the value of the pdbcpfxsedf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDBCPFXSEDF(String value) {
        this.pdbcpfxsedf = value;
    }

    /**
     * Gets the value of the sedfpfxdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEDFPFXDESC() {
        return sedfpfxdesc;
    }

    /**
     * Sets the value of the sedfpfxdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEDFPFXDESC(String value) {
        this.sedfpfxdesc = value;
    }

    /**
     * Gets the value of the clspntwkind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLSPNTWKIND() {
        return clspntwkind;
    }

    /**
     * Sets the value of the clspntwkind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLSPNTWKIND(String value) {
        this.clspntwkind = value;
    }

    /**
     * Gets the value of the pdpdaccsfx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDPDACCSFX() {
        return pdpdaccsfx;
    }

    /**
     * Sets the value of the pdpdaccsfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDPDACCSFX(String value) {
        this.pdpdaccsfx = value;
    }

    /**
     * Gets the value of the agrgid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGRGID() {
        return agrgid;
    }

    /**
     * Sets the value of the agrgid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGRGID(String value) {
        this.agrgid = value;
    }

    /**
     * Gets the value of the clspagsource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLSPAGSOURCE() {
        return clspagsource;
    }

    /**
     * Sets the value of the clspagsource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLSPAGSOURCE(String value) {
        this.clspagsource = value;
    }

    /**
     * Gets the value of the clspagsourcedesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLSPAGSOURCEDESC() {
        return clspagsourcedesc;
    }

    /**
     * Sets the value of the clspagsourcedesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLSPAGSOURCEDESC(String value) {
        this.clspagsourcedesc = value;
    }

    /**
     * Gets the value of the pddsprodtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDDSPRODTYPE() {
        return pddsprodtype;
    }

    /**
     * Sets the value of the pddsprodtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDDSPRODTYPE(String value) {
        this.pddsprodtype = value;
    }

    /**
     * Gets the value of the pddsprodtypedesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDDSPRODTYPEDESC() {
        return pddsprodtypedesc;
    }

    /**
     * Sets the value of the pddsprodtypedesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDDSPRODTYPEDESC(String value) {
        this.pddsprodtypedesc = value;
    }

    /**
     * Gets the value of the pddsmctrbcat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDDSMCTRBCAT() {
        return pddsmctrbcat;
    }

    /**
     * Sets the value of the pddsmctrbcat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDDSMCTRBCAT(String value) {
        this.pddsmctrbcat = value;
    }

    /**
     * Gets the value of the pddsmctrbcatdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDDSMCTRBCATDESC() {
        return pddsmctrbcatdesc;
    }

    /**
     * Sets the value of the pddsmctrbcatdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDDSMCTRBCATDESC(String value) {
        this.pddsmctrbcatdesc = value;
    }

    /**
     * Gets the value of the clsptotamtaply property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLSPTOTAMTAPLY() {
        return clsptotamtaply;
    }

    /**
     * Sets the value of the clsptotamtaply property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLSPTOTAMTAPLY(String value) {
        this.clsptotamtaply = value;
    }

    /**
     * Gets the value of the clhccoll property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRECCLHC }
     *     
     */
    public ArrayOfRECCLHC getCLHCCOLL() {
        return clhccoll;
    }

    /**
     * Sets the value of the clhccoll property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRECCLHC }
     *     
     */
    public void setCLHCCOLL(ArrayOfRECCLHC value) {
        this.clhccoll = value;
    }

    /**
     * Gets the value of the clidcoll property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRECCLID }
     *     
     */
    public ArrayOfRECCLID getCLIDCOLL() {
        return clidcoll;
    }

    /**
     * Sets the value of the clidcoll property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRECCLID }
     *     
     */
    public void setCLIDCOLL(ArrayOfRECCLID value) {
        this.clidcoll = value;
    }

    /**
     * Gets the value of the clrncoll property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRECCLRN }
     *     
     */
    public ArrayOfRECCLRN getCLRNCOLL() {
        return clrncoll;
    }

    /**
     * Sets the value of the clrncoll property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRECCLRN }
     *     
     */
    public void setCLRNCOLL(ArrayOfRECCLRN value) {
        this.clrncoll = value;
    }

}
