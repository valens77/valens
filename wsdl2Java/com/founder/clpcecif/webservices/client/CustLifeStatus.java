
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for custLifeStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="custLifeStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="crt_System" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ecif_Crt_Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ecif_Upd_Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="invalid_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="life_Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="life_Status_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="party_Type_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rcd_Crt_Operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rcd_Crt_Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="rcd_End_Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="rcd_Upd_Operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rcd_Upd_Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="role_Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="seq_No" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="upd_System" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valid_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "custLifeStatus", propOrder = {
    "crtSystem",
    "ecifCrtTime",
    "ecifUpdTime",
    "invalidDate",
    "lifeId",
    "lifeStatusCode",
    "partyTypeCode",
    "rcdCrtOperator",
    "rcdCrtTime",
    "rcdEndTime",
    "rcdUpdOperator",
    "rcdUpdTime",
    "roleId",
    "seqNo",
    "updSystem",
    "validDate"
})
public class CustLifeStatus {

    @XmlElement(name = "crt_System")
    protected String crtSystem;
    @XmlElement(name = "ecif_Crt_Time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ecifCrtTime;
    @XmlElement(name = "ecif_Upd_Time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ecifUpdTime;
    @XmlElement(name = "invalid_Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar invalidDate;
    @XmlElement(name = "life_Id")
    protected Long lifeId;
    @XmlElement(name = "life_Status_Code")
    protected String lifeStatusCode;
    @XmlElement(name = "party_Type_Code")
    protected String partyTypeCode;
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
    @XmlElement(name = "role_Id")
    protected Long roleId;
    @XmlElement(name = "seq_No")
    protected Long seqNo;
    @XmlElement(name = "upd_System")
    protected String updSystem;
    @XmlElement(name = "valid_Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validDate;

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
     * Gets the value of the lifeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLifeId() {
        return lifeId;
    }

    /**
     * Sets the value of the lifeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLifeId(Long value) {
        this.lifeId = value;
    }

    /**
     * Gets the value of the lifeStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifeStatusCode() {
        return lifeStatusCode;
    }

    /**
     * Sets the value of the lifeStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifeStatusCode(String value) {
        this.lifeStatusCode = value;
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
     * Gets the value of the roleId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * Sets the value of the roleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRoleId(Long value) {
        this.roleId = value;
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

    /**
     * Gets the value of the validDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidDate() {
        return validDate;
    }

    /**
     * Sets the value of the validDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidDate(XMLGregorianCalendar value) {
        this.validDate = value;
    }

}
