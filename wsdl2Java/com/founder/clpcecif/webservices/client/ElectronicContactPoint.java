
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for electronicContactPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="electronicContactPoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactPoint_Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="crt_System" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="e_Contact_Type_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ecif_Crt_Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ecif_Upd_Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="primary_flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rcd_Crt_Operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rcd_Crt_Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="rcd_End_Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="rcd_Upd_Operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rcd_Upd_Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="relation_Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="role_In_Contact_Type_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "electronicContactPoint", propOrder = {
    "contactPointId",
    "crtSystem",
    "eAddress",
    "eContactTypeCode",
    "ecifCrtTime",
    "ecifUpdTime",
    "primaryFlag",
    "rcdCrtOperator",
    "rcdCrtTime",
    "rcdEndTime",
    "rcdUpdOperator",
    "rcdUpdTime",
    "relationId",
    "roleInContactTypeCode",
    "seqNo",
    "updSystem"
})
public class ElectronicContactPoint {

    @XmlElement(name = "contactPoint_Id")
    protected Long contactPointId;
    @XmlElement(name = "crt_System")
    protected String crtSystem;
    @XmlElement(name = "EAddress")
    protected String eAddress;
    @XmlElement(name = "e_Contact_Type_Code")
    protected String eContactTypeCode;
    @XmlElement(name = "ecif_Crt_Time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ecifCrtTime;
    @XmlElement(name = "ecif_Upd_Time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ecifUpdTime;
    @XmlElement(name = "primary_flag")
    protected String primaryFlag;
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
    @XmlElement(name = "relation_Id")
    protected Long relationId;
    @XmlElement(name = "role_In_Contact_Type_Code")
    protected String roleInContactTypeCode;
    @XmlElement(name = "seq_No")
    protected Long seqNo;
    @XmlElement(name = "upd_System")
    protected String updSystem;

    /**
     * Gets the value of the contactPointId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContactPointId() {
        return contactPointId;
    }

    /**
     * Sets the value of the contactPointId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContactPointId(Long value) {
        this.contactPointId = value;
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
     * Gets the value of the eAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEAddress() {
        return eAddress;
    }

    /**
     * Sets the value of the eAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEAddress(String value) {
        this.eAddress = value;
    }

    /**
     * Gets the value of the eContactTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEContactTypeCode() {
        return eContactTypeCode;
    }

    /**
     * Sets the value of the eContactTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEContactTypeCode(String value) {
        this.eContactTypeCode = value;
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
     * Gets the value of the primaryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryFlag() {
        return primaryFlag;
    }

    /**
     * Sets the value of the primaryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryFlag(String value) {
        this.primaryFlag = value;
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
     * Gets the value of the relationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRelationId() {
        return relationId;
    }

    /**
     * Sets the value of the relationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRelationId(Long value) {
        this.relationId = value;
    }

    /**
     * Gets the value of the roleInContactTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleInContactTypeCode() {
        return roleInContactTypeCode;
    }

    /**
     * Sets the value of the roleInContactTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleInContactTypeCode(String value) {
        this.roleInContactTypeCode = value;
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
