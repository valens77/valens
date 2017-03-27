
package com.founder.clpcecif.webservices.client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for policy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="policy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agent_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appli_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appli_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrangement_Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="biz_Premium_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="biz_Src_Channel_Type_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="biz_Value_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="channel_Type_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="class_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coinsurance_Flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="confidential_Flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="crt_System" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ecif_Crt_Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ecif_Upd_Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="end_Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="handler_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insured_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insured_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inter_Org_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="item_Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="language_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="old_Policy_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner_User_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policy_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policy_Status_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RMB_Premium_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RMB_Value_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="rcd_Crt_Operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rcd_Crt_Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="rcd_End_Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="rcd_Upd_Operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rcd_Upd_Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="rewrite_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="risk_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="role_In_Contract_Type_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seq_No" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sign_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="start_Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="upd_System" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "policy", propOrder = {
    "agentCode",
    "appliCode",
    "appliName",
    "arrangementId",
    "bizPremiumAMT",
    "bizSrcChannelTypeCode",
    "bizValueAMT",
    "channelTypeCode",
    "classCode",
    "coinsuranceFlag",
    "confidentialFlag",
    "crtSystem",
    "currencyCode",
    "ecifCrtTime",
    "ecifUpdTime",
    "endTime",
    "handlerCode",
    "insuredCode",
    "insuredName",
    "interOrgCode",
    "itemDesc",
    "languageCode",
    "memo",
    "oldPolicyNo",
    "ownerUserCode",
    "policyNo",
    "policyStatusCode",
    "rmbPremiumAMT",
    "rmbValueAMT",
    "rcdCrtOperator",
    "rcdCrtTime",
    "rcdEndTime",
    "rcdUpdOperator",
    "rcdUpdTime",
    "rewriteDate",
    "riskCode",
    "roleInContractTypeCode",
    "seqNo",
    "signDate",
    "startTime",
    "updSystem"
})
public class Policy {

    @XmlElement(name = "agent_Code")
    protected String agentCode;
    @XmlElement(name = "appli_Code")
    protected String appliCode;
    @XmlElement(name = "appli_Name")
    protected String appliName;
    @XmlElement(name = "arrangement_Id")
    protected Long arrangementId;
    @XmlElement(name = "biz_Premium_AMT")
    protected BigDecimal bizPremiumAMT;
    @XmlElement(name = "biz_Src_Channel_Type_Code")
    protected String bizSrcChannelTypeCode;
    @XmlElement(name = "biz_Value_AMT")
    protected BigDecimal bizValueAMT;
    @XmlElement(name = "channel_Type_Code")
    protected String channelTypeCode;
    @XmlElement(name = "class_Code")
    protected String classCode;
    @XmlElement(name = "coinsurance_Flag")
    protected String coinsuranceFlag;
    @XmlElement(name = "confidential_Flag")
    protected String confidentialFlag;
    @XmlElement(name = "crt_System")
    protected String crtSystem;
    @XmlElement(name = "currency_Code")
    protected String currencyCode;
    @XmlElement(name = "ecif_Crt_Time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ecifCrtTime;
    @XmlElement(name = "ecif_Upd_Time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ecifUpdTime;
    @XmlElement(name = "end_Time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "handler_Code")
    protected String handlerCode;
    @XmlElement(name = "insured_Code")
    protected String insuredCode;
    @XmlElement(name = "insured_Name")
    protected String insuredName;
    @XmlElement(name = "inter_Org_Code")
    protected String interOrgCode;
    @XmlElement(name = "item_Desc")
    protected String itemDesc;
    @XmlElement(name = "language_Code")
    protected String languageCode;
    protected String memo;
    @XmlElement(name = "old_Policy_No")
    protected String oldPolicyNo;
    @XmlElement(name = "owner_User_Code")
    protected String ownerUserCode;
    @XmlElement(name = "policy_No")
    protected String policyNo;
    @XmlElement(name = "policy_Status_Code")
    protected String policyStatusCode;
    @XmlElement(name = "RMB_Premium_AMT")
    protected BigDecimal rmbPremiumAMT;
    @XmlElement(name = "RMB_Value_AMT")
    protected BigDecimal rmbValueAMT;
    @XmlElement(name = "rcd_Crt_Operator")
    protected String rcdCrtOperator;
    @XmlElement(name = "rcd_Crt_Time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rcdCrtTime;
    @XmlElement(name = "rcd_End_Time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rcdEndTime;
    @XmlElement(name = "rcd_Upd_Operator")
    protected String rcdUpdOperator;
    @XmlElement(name = "rcd_Upd_Time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rcdUpdTime;
    @XmlElement(name = "rewrite_Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rewriteDate;
    @XmlElement(name = "risk_Code")
    protected String riskCode;
    @XmlElement(name = "role_In_Contract_Type_Code")
    protected String roleInContractTypeCode;
    @XmlElement(name = "seq_No")
    protected Long seqNo;
    @XmlElement(name = "sign_Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signDate;
    @XmlElement(name = "start_Time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "upd_System")
    protected String updSystem;

    /**
     * Gets the value of the agentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentCode() {
        return agentCode;
    }

    /**
     * Sets the value of the agentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentCode(String value) {
        this.agentCode = value;
    }

    /**
     * Gets the value of the appliCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppliCode() {
        return appliCode;
    }

    /**
     * Sets the value of the appliCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppliCode(String value) {
        this.appliCode = value;
    }

    /**
     * Gets the value of the appliName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppliName() {
        return appliName;
    }

    /**
     * Sets the value of the appliName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppliName(String value) {
        this.appliName = value;
    }

    /**
     * Gets the value of the arrangementId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getArrangementId() {
        return arrangementId;
    }

    /**
     * Sets the value of the arrangementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setArrangementId(Long value) {
        this.arrangementId = value;
    }

    /**
     * Gets the value of the bizPremiumAMT property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBizPremiumAMT() {
        return bizPremiumAMT;
    }

    /**
     * Sets the value of the bizPremiumAMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBizPremiumAMT(BigDecimal value) {
        this.bizPremiumAMT = value;
    }

    /**
     * Gets the value of the bizSrcChannelTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizSrcChannelTypeCode() {
        return bizSrcChannelTypeCode;
    }

    /**
     * Sets the value of the bizSrcChannelTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizSrcChannelTypeCode(String value) {
        this.bizSrcChannelTypeCode = value;
    }

    /**
     * Gets the value of the bizValueAMT property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBizValueAMT() {
        return bizValueAMT;
    }

    /**
     * Sets the value of the bizValueAMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBizValueAMT(BigDecimal value) {
        this.bizValueAMT = value;
    }

    /**
     * Gets the value of the channelTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelTypeCode() {
        return channelTypeCode;
    }

    /**
     * Sets the value of the channelTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelTypeCode(String value) {
        this.channelTypeCode = value;
    }

    /**
     * Gets the value of the classCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassCode() {
        return classCode;
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassCode(String value) {
        this.classCode = value;
    }

    /**
     * Gets the value of the coinsuranceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoinsuranceFlag() {
        return coinsuranceFlag;
    }

    /**
     * Sets the value of the coinsuranceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoinsuranceFlag(String value) {
        this.coinsuranceFlag = value;
    }

    /**
     * Gets the value of the confidentialFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfidentialFlag() {
        return confidentialFlag;
    }

    /**
     * Sets the value of the confidentialFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfidentialFlag(String value) {
        this.confidentialFlag = value;
    }

    /**
     * Gets the value of the crtSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrtSystem() {
        return crtSystem;
    }

    /**
     * Sets the value of the crtSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrtSystem(String value) {
        this.crtSystem = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the ecifCrtTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEcifCrtTime() {
        return ecifCrtTime;
    }

    /**
     * Sets the value of the ecifCrtTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEcifCrtTime(XMLGregorianCalendar value) {
        this.ecifCrtTime = value;
    }

    /**
     * Gets the value of the ecifUpdTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEcifUpdTime() {
        return ecifUpdTime;
    }

    /**
     * Sets the value of the ecifUpdTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEcifUpdTime(XMLGregorianCalendar value) {
        this.ecifUpdTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the handlerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandlerCode() {
        return handlerCode;
    }

    /**
     * Sets the value of the handlerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandlerCode(String value) {
        this.handlerCode = value;
    }

    /**
     * Gets the value of the insuredCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredCode() {
        return insuredCode;
    }

    /**
     * Sets the value of the insuredCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredCode(String value) {
        this.insuredCode = value;
    }

    /**
     * Gets the value of the insuredName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredName() {
        return insuredName;
    }

    /**
     * Sets the value of the insuredName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredName(String value) {
        this.insuredName = value;
    }

    /**
     * Gets the value of the interOrgCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterOrgCode() {
        return interOrgCode;
    }

    /**
     * Sets the value of the interOrgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterOrgCode(String value) {
        this.interOrgCode = value;
    }

    /**
     * Gets the value of the itemDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDesc() {
        return itemDesc;
    }

    /**
     * Sets the value of the itemDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDesc(String value) {
        this.itemDesc = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * Gets the value of the oldPolicyNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldPolicyNo() {
        return oldPolicyNo;
    }

    /**
     * Sets the value of the oldPolicyNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldPolicyNo(String value) {
        this.oldPolicyNo = value;
    }

    /**
     * Gets the value of the ownerUserCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerUserCode() {
        return ownerUserCode;
    }

    /**
     * Sets the value of the ownerUserCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerUserCode(String value) {
        this.ownerUserCode = value;
    }

    /**
     * Gets the value of the policyNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyNo() {
        return policyNo;
    }

    /**
     * Sets the value of the policyNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyNo(String value) {
        this.policyNo = value;
    }

    /**
     * Gets the value of the policyStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyStatusCode() {
        return policyStatusCode;
    }

    /**
     * Sets the value of the policyStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyStatusCode(String value) {
        this.policyStatusCode = value;
    }

    /**
     * Gets the value of the rmbPremiumAMT property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRMBPremiumAMT() {
        return rmbPremiumAMT;
    }

    /**
     * Sets the value of the rmbPremiumAMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRMBPremiumAMT(BigDecimal value) {
        this.rmbPremiumAMT = value;
    }

    /**
     * Gets the value of the rmbValueAMT property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRMBValueAMT() {
        return rmbValueAMT;
    }

    /**
     * Sets the value of the rmbValueAMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRMBValueAMT(BigDecimal value) {
        this.rmbValueAMT = value;
    }

    /**
     * Gets the value of the rcdCrtOperator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcdCrtOperator() {
        return rcdCrtOperator;
    }

    /**
     * Sets the value of the rcdCrtOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcdCrtOperator(String value) {
        this.rcdCrtOperator = value;
    }

    /**
     * Gets the value of the rcdCrtTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRcdCrtTime() {
        return rcdCrtTime;
    }

    /**
     * Sets the value of the rcdCrtTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRcdCrtTime(XMLGregorianCalendar value) {
        this.rcdCrtTime = value;
    }

    /**
     * Gets the value of the rcdEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRcdEndTime() {
        return rcdEndTime;
    }

    /**
     * Sets the value of the rcdEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRcdEndTime(XMLGregorianCalendar value) {
        this.rcdEndTime = value;
    }

    /**
     * Gets the value of the rcdUpdOperator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcdUpdOperator() {
        return rcdUpdOperator;
    }

    /**
     * Sets the value of the rcdUpdOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcdUpdOperator(String value) {
        this.rcdUpdOperator = value;
    }

    /**
     * Gets the value of the rcdUpdTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRcdUpdTime() {
        return rcdUpdTime;
    }

    /**
     * Sets the value of the rcdUpdTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRcdUpdTime(XMLGregorianCalendar value) {
        this.rcdUpdTime = value;
    }

    /**
     * Gets the value of the rewriteDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRewriteDate() {
        return rewriteDate;
    }

    /**
     * Sets the value of the rewriteDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRewriteDate(XMLGregorianCalendar value) {
        this.rewriteDate = value;
    }

    /**
     * Gets the value of the riskCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskCode() {
        return riskCode;
    }

    /**
     * Sets the value of the riskCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskCode(String value) {
        this.riskCode = value;
    }

    /**
     * Gets the value of the roleInContractTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleInContractTypeCode() {
        return roleInContractTypeCode;
    }

    /**
     * Sets the value of the roleInContractTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleInContractTypeCode(String value) {
        this.roleInContractTypeCode = value;
    }

    /**
     * Gets the value of the seqNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSeqNo() {
        return seqNo;
    }

    /**
     * Sets the value of the seqNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSeqNo(Long value) {
        this.seqNo = value;
    }

    /**
     * Gets the value of the signDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignDate() {
        return signDate;
    }

    /**
     * Sets the value of the signDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignDate(XMLGregorianCalendar value) {
        this.signDate = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the updSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdSystem() {
        return updSystem;
    }

    /**
     * Sets the value of the updSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdSystem(String value) {
        this.updSystem = value;
    }

}
