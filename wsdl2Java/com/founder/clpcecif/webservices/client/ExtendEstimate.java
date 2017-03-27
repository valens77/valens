
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for extendEstimate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="extendEstimate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="crt_System" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ecif_Crt_Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ecif_Upd_Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="estimate_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="estimate_Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="extend_Estimate_Type_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inter_Org_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invalid_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="party_Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="party_Type_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="properly_Biz_Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="properly_Location_Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rcd_Crt_Operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rcd_Crt_Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="rcd_End_Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="rcd_Upd_Operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rcd_Upd_Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="result_Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seq_No" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlType(name = "extendEstimate", propOrder = {
    "crtSystem",
    "ecifCrtTime",
    "ecifUpdTime",
    "estimateDate",
    "estimateId",
    "extendEstimateTypeCode",
    "interOrgCode",
    "invalidDate",
    "partyId",
    "partyTypeCode",
    "properlyBizDesc",
    "properlyLocationDesc",
    "rcdCrtOperator",
    "rcdCrtTime",
    "rcdEndTime",
    "rcdUpdOperator",
    "rcdUpdTime",
    "result",
    "resultDesc",
    "seqNo",
    "updSystem"
})
public class ExtendEstimate {

    @XmlElement(name = "crt_System")
    protected String crtSystem;
    @XmlElement(name = "ecif_Crt_Time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ecifCrtTime;
    @XmlElement(name = "ecif_Upd_Time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ecifUpdTime;
    @XmlElement(name = "estimate_Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimateDate;
    @XmlElement(name = "estimate_Id")
    protected Long estimateId;
    @XmlElement(name = "extend_Estimate_Type_Code")
    protected String extendEstimateTypeCode;
    @XmlElement(name = "inter_Org_Code")
    protected String interOrgCode;
    @XmlElement(name = "invalid_Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar invalidDate;
    @XmlElement(name = "party_Id")
    protected Long partyId;
    @XmlElement(name = "party_Type_Code")
    protected String partyTypeCode;
    @XmlElement(name = "properly_Biz_Desc")
    protected String properlyBizDesc;
    @XmlElement(name = "properly_Location_Desc")
    protected String properlyLocationDesc;
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
    protected String result;
    @XmlElement(name = "result_Desc")
    protected String resultDesc;
    @XmlElement(name = "seq_No")
    protected Long seqNo;
    @XmlElement(name = "upd_System")
    protected String updSystem;

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
     * Gets the value of the estimateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimateDate() {
        return estimateDate;
    }

    /**
     * Sets the value of the estimateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimateDate(XMLGregorianCalendar value) {
        this.estimateDate = value;
    }

    /**
     * Gets the value of the estimateId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEstimateId() {
        return estimateId;
    }

    /**
     * Sets the value of the estimateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEstimateId(Long value) {
        this.estimateId = value;
    }

    /**
     * Gets the value of the extendEstimateTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendEstimateTypeCode() {
        return extendEstimateTypeCode;
    }

    /**
     * Sets the value of the extendEstimateTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendEstimateTypeCode(String value) {
        this.extendEstimateTypeCode = value;
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
     * Gets the value of the invalidDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvalidDate() {
        return invalidDate;
    }

    /**
     * Sets the value of the invalidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvalidDate(XMLGregorianCalendar value) {
        this.invalidDate = value;
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
     * Gets the value of the partyTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyTypeCode() {
        return partyTypeCode;
    }

    /**
     * Sets the value of the partyTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyTypeCode(String value) {
        this.partyTypeCode = value;
    }

    /**
     * Gets the value of the properlyBizDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperlyBizDesc() {
        return properlyBizDesc;
    }

    /**
     * Sets the value of the properlyBizDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperlyBizDesc(String value) {
        this.properlyBizDesc = value;
    }

    /**
     * Gets the value of the properlyLocationDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperlyLocationDesc() {
        return properlyLocationDesc;
    }

    /**
     * Sets the value of the properlyLocationDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperlyLocationDesc(String value) {
        this.properlyLocationDesc = value;
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
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

    /**
     * Gets the value of the resultDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultDesc() {
        return resultDesc;
    }

    /**
     * Sets the value of the resultDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultDesc(String value) {
        this.resultDesc = value;
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
