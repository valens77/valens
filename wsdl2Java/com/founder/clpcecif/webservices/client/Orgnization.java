
package com.founder.clpcecif.webservices.client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for orgnization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orgnization">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="biz_Licence_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="biz_Licence_No_Invalid_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="biz_Licence_No_Valid_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="biz_Reg_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="biz_Reg_No_Invalid_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="biz_Reg_No_Valid_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="biz_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="biz_Scope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cancellation_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="create_Inter_Org_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="crt_System" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ecif_Crt_Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ecif_Upd_Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="economic_Type_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employee_number" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="fixed_assets" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="found_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="industry_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="language_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legal_repres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="local_Tax_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="local_Tax_No_Invalid_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="local_Tax_No_Valid_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="member_number" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="national_Tax_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="national_Tax_No_Invalid_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="national_Tax_No_Valid_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="org_Social_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="org_Social_No_Invalid_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="org_Social_No_Valid_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="org_Status_Mod_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="orgnization_Status_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgnization_Type_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="party_Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="profit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="rcd_Crt_Operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rcd_Crt_Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="rcd_End_Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="rcd_Upd_Operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rcd_Upd_Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="reg_Fun" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="revenue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="seq_No" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="superior_org" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="upd_System" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="update_Inter_Org_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orgnization", propOrder = {
    "bizLicenceNo",
    "bizLicenceNoInvalidDate",
    "bizLicenceNoValidDate",
    "bizRegNo",
    "bizRegNoInvalidDate",
    "bizRegNoValidDate",
    "bizRegion",
    "bizScope",
    "cancellationDate",
    "createInterOrgCode",
    "crtSystem",
    "currencyCode",
    "ecifCrtTime",
    "ecifUpdTime",
    "economicTypeCode",
    "employeeNumber",
    "fixedAssets",
    "foundDate",
    "industryCode",
    "languageCode",
    "legalRepres",
    "localTaxNo",
    "localTaxNoInvalidDate",
    "localTaxNoValidDate",
    "memberNumber",
    "memo",
    "nationalTaxNo",
    "nationalTaxNoInvalidDate",
    "nationalTaxNoValidDate",
    "orgSocialNo",
    "orgSocialNoInvalidDate",
    "orgSocialNoValidDate",
    "orgStatusModDate",
    "orgnizationStatusCode",
    "orgnizationTypeCode",
    "partyId",
    "profit",
    "rcdCrtOperator",
    "rcdCrtTime",
    "rcdEndTime",
    "rcdUpdOperator",
    "rcdUpdTime",
    "regFun",
    "revenue",
    "seqNo",
    "superiorOrg",
    "updSystem",
    "updateInterOrgCode"
})
public class Orgnization {

    @XmlElement(name = "biz_Licence_No")
    protected String bizLicenceNo;
    @XmlElement(name = "biz_Licence_No_Invalid_Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bizLicenceNoInvalidDate;
    @XmlElement(name = "biz_Licence_No_Valid_Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bizLicenceNoValidDate;
    @XmlElement(name = "biz_Reg_No")
    protected String bizRegNo;
    @XmlElement(name = "biz_Reg_No_Invalid_Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bizRegNoInvalidDate;
    @XmlElement(name = "biz_Reg_No_Valid_Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bizRegNoValidDate;
    @XmlElement(name = "biz_Region")
    protected String bizRegion;
    @XmlElement(name = "biz_Scope")
    protected String bizScope;
    @XmlElement(name = "cancellation_Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancellationDate;
    @XmlElement(name = "create_Inter_Org_Code")
    protected String createInterOrgCode;
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
    @XmlElement(name = "economic_Type_Code")
    protected String economicTypeCode;
    @XmlElement(name = "employee_number")
    protected Long employeeNumber;
    @XmlElement(name = "fixed_assets")
    protected BigDecimal fixedAssets;
    @XmlElement(name = "found_Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar foundDate;
    @XmlElement(name = "industry_Code")
    protected String industryCode;
    @XmlElement(name = "language_Code")
    protected String languageCode;
    @XmlElement(name = "legal_repres")
    protected String legalRepres;
    @XmlElement(name = "local_Tax_No")
    protected String localTaxNo;
    @XmlElement(name = "local_Tax_No_Invalid_Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar localTaxNoInvalidDate;
    @XmlElement(name = "local_Tax_No_Valid_Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar localTaxNoValidDate;
    @XmlElement(name = "member_number")
    protected Long memberNumber;
    protected String memo;
    @XmlElement(name = "national_Tax_No")
    protected String nationalTaxNo;
    @XmlElement(name = "national_Tax_No_Invalid_Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nationalTaxNoInvalidDate;
    @XmlElement(name = "national_Tax_No_Valid_Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nationalTaxNoValidDate;
    @XmlElement(name = "org_Social_No")
    protected String orgSocialNo;
    @XmlElement(name = "org_Social_No_Invalid_Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orgSocialNoInvalidDate;
    @XmlElement(name = "org_Social_No_Valid_Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orgSocialNoValidDate;
    @XmlElement(name = "org_Status_Mod_Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orgStatusModDate;
    @XmlElement(name = "orgnization_Status_Code")
    protected String orgnizationStatusCode;
    @XmlElement(name = "orgnization_Type_Code")
    protected String orgnizationTypeCode;
    @XmlElement(name = "party_Id")
    protected Long partyId;
    protected BigDecimal profit;
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
    @XmlElement(name = "reg_Fun")
    protected BigDecimal regFun;
    protected BigDecimal revenue;
    @XmlElement(name = "seq_No")
    protected Long seqNo;
    @XmlElement(name = "superior_org")
    protected String superiorOrg;
    @XmlElement(name = "upd_System")
    protected String updSystem;
    @XmlElement(name = "update_Inter_Org_Code")
    protected String updateInterOrgCode;

    /**
     * Gets the value of the bizLicenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizLicenceNo() {
        return bizLicenceNo;
    }

    /**
     * Sets the value of the bizLicenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizLicenceNo(String value) {
        this.bizLicenceNo = value;
    }

    /**
     * Gets the value of the bizLicenceNoInvalidDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBizLicenceNoInvalidDate() {
        return bizLicenceNoInvalidDate;
    }

    /**
     * Sets the value of the bizLicenceNoInvalidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBizLicenceNoInvalidDate(XMLGregorianCalendar value) {
        this.bizLicenceNoInvalidDate = value;
    }

    /**
     * Gets the value of the bizLicenceNoValidDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBizLicenceNoValidDate() {
        return bizLicenceNoValidDate;
    }

    /**
     * Sets the value of the bizLicenceNoValidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBizLicenceNoValidDate(XMLGregorianCalendar value) {
        this.bizLicenceNoValidDate = value;
    }

    /**
     * Gets the value of the bizRegNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizRegNo() {
        return bizRegNo;
    }

    /**
     * Sets the value of the bizRegNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizRegNo(String value) {
        this.bizRegNo = value;
    }

    /**
     * Gets the value of the bizRegNoInvalidDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBizRegNoInvalidDate() {
        return bizRegNoInvalidDate;
    }

    /**
     * Sets the value of the bizRegNoInvalidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBizRegNoInvalidDate(XMLGregorianCalendar value) {
        this.bizRegNoInvalidDate = value;
    }

    /**
     * Gets the value of the bizRegNoValidDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBizRegNoValidDate() {
        return bizRegNoValidDate;
    }

    /**
     * Sets the value of the bizRegNoValidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBizRegNoValidDate(XMLGregorianCalendar value) {
        this.bizRegNoValidDate = value;
    }

    /**
     * Gets the value of the bizRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizRegion() {
        return bizRegion;
    }

    /**
     * Sets the value of the bizRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizRegion(String value) {
        this.bizRegion = value;
    }

    /**
     * Gets the value of the bizScope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizScope() {
        return bizScope;
    }

    /**
     * Sets the value of the bizScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizScope(String value) {
        this.bizScope = value;
    }

    /**
     * Gets the value of the cancellationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancellationDate() {
        return cancellationDate;
    }

    /**
     * Sets the value of the cancellationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancellationDate(XMLGregorianCalendar value) {
        this.cancellationDate = value;
    }

    /**
     * Gets the value of the createInterOrgCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateInterOrgCode() {
        return createInterOrgCode;
    }

    /**
     * Sets the value of the createInterOrgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateInterOrgCode(String value) {
        this.createInterOrgCode = value;
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
     * Gets the value of the economicTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEconomicTypeCode() {
        return economicTypeCode;
    }

    /**
     * Sets the value of the economicTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEconomicTypeCode(String value) {
        this.economicTypeCode = value;
    }

    /**
     * Gets the value of the employeeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * Sets the value of the employeeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEmployeeNumber(Long value) {
        this.employeeNumber = value;
    }

    /**
     * Gets the value of the fixedAssets property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFixedAssets() {
        return fixedAssets;
    }

    /**
     * Sets the value of the fixedAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFixedAssets(BigDecimal value) {
        this.fixedAssets = value;
    }

    /**
     * Gets the value of the foundDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFoundDate() {
        return foundDate;
    }

    /**
     * Sets the value of the foundDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFoundDate(XMLGregorianCalendar value) {
        this.foundDate = value;
    }

    /**
     * Gets the value of the industryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryCode() {
        return industryCode;
    }

    /**
     * Sets the value of the industryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryCode(String value) {
        this.industryCode = value;
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
     * Gets the value of the legalRepres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalRepres() {
        return legalRepres;
    }

    /**
     * Sets the value of the legalRepres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalRepres(String value) {
        this.legalRepres = value;
    }

    /**
     * Gets the value of the localTaxNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalTaxNo() {
        return localTaxNo;
    }

    /**
     * Sets the value of the localTaxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalTaxNo(String value) {
        this.localTaxNo = value;
    }

    /**
     * Gets the value of the localTaxNoInvalidDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLocalTaxNoInvalidDate() {
        return localTaxNoInvalidDate;
    }

    /**
     * Sets the value of the localTaxNoInvalidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLocalTaxNoInvalidDate(XMLGregorianCalendar value) {
        this.localTaxNoInvalidDate = value;
    }

    /**
     * Gets the value of the localTaxNoValidDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLocalTaxNoValidDate() {
        return localTaxNoValidDate;
    }

    /**
     * Sets the value of the localTaxNoValidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLocalTaxNoValidDate(XMLGregorianCalendar value) {
        this.localTaxNoValidDate = value;
    }

    /**
     * Gets the value of the memberNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMemberNumber() {
        return memberNumber;
    }

    /**
     * Sets the value of the memberNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMemberNumber(Long value) {
        this.memberNumber = value;
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
     * Gets the value of the nationalTaxNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalTaxNo() {
        return nationalTaxNo;
    }

    /**
     * Sets the value of the nationalTaxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalTaxNo(String value) {
        this.nationalTaxNo = value;
    }

    /**
     * Gets the value of the nationalTaxNoInvalidDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNationalTaxNoInvalidDate() {
        return nationalTaxNoInvalidDate;
    }

    /**
     * Sets the value of the nationalTaxNoInvalidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNationalTaxNoInvalidDate(XMLGregorianCalendar value) {
        this.nationalTaxNoInvalidDate = value;
    }

    /**
     * Gets the value of the nationalTaxNoValidDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNationalTaxNoValidDate() {
        return nationalTaxNoValidDate;
    }

    /**
     * Sets the value of the nationalTaxNoValidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNationalTaxNoValidDate(XMLGregorianCalendar value) {
        this.nationalTaxNoValidDate = value;
    }

    /**
     * Gets the value of the orgSocialNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgSocialNo() {
        return orgSocialNo;
    }

    /**
     * Sets the value of the orgSocialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgSocialNo(String value) {
        this.orgSocialNo = value;
    }

    /**
     * Gets the value of the orgSocialNoInvalidDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrgSocialNoInvalidDate() {
        return orgSocialNoInvalidDate;
    }

    /**
     * Sets the value of the orgSocialNoInvalidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrgSocialNoInvalidDate(XMLGregorianCalendar value) {
        this.orgSocialNoInvalidDate = value;
    }

    /**
     * Gets the value of the orgSocialNoValidDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrgSocialNoValidDate() {
        return orgSocialNoValidDate;
    }

    /**
     * Sets the value of the orgSocialNoValidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrgSocialNoValidDate(XMLGregorianCalendar value) {
        this.orgSocialNoValidDate = value;
    }

    /**
     * Gets the value of the orgStatusModDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrgStatusModDate() {
        return orgStatusModDate;
    }

    /**
     * Sets the value of the orgStatusModDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrgStatusModDate(XMLGregorianCalendar value) {
        this.orgStatusModDate = value;
    }

    /**
     * Gets the value of the orgnizationStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnizationStatusCode() {
        return orgnizationStatusCode;
    }

    /**
     * Sets the value of the orgnizationStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnizationStatusCode(String value) {
        this.orgnizationStatusCode = value;
    }

    /**
     * Gets the value of the orgnizationTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnizationTypeCode() {
        return orgnizationTypeCode;
    }

    /**
     * Sets the value of the orgnizationTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnizationTypeCode(String value) {
        this.orgnizationTypeCode = value;
    }

    /**
     * Gets the value of the partyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPartyId() {
        return partyId;
    }

    /**
     * Sets the value of the partyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPartyId(Long value) {
        this.partyId = value;
    }

    /**
     * Gets the value of the profit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProfit() {
        return profit;
    }

    /**
     * Sets the value of the profit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProfit(BigDecimal value) {
        this.profit = value;
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
     * Gets the value of the regFun property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRegFun() {
        return regFun;
    }

    /**
     * Sets the value of the regFun property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRegFun(BigDecimal value) {
        this.regFun = value;
    }

    /**
     * Gets the value of the revenue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRevenue() {
        return revenue;
    }

    /**
     * Sets the value of the revenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRevenue(BigDecimal value) {
        this.revenue = value;
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
     * Gets the value of the superiorOrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuperiorOrg() {
        return superiorOrg;
    }

    /**
     * Sets the value of the superiorOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuperiorOrg(String value) {
        this.superiorOrg = value;
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

    /**
     * Gets the value of the updateInterOrgCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateInterOrgCode() {
        return updateInterOrgCode;
    }

    /**
     * Sets the value of the updateInterOrgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateInterOrgCode(String value) {
        this.updateInterOrgCode = value;
    }

}
