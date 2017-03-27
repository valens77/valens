
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createPartyGroupMemberResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createPartyGroupMemberResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createPartyGroupMemberInput" type="{http://pub.services.ecif.clpc.com/}createPartyGroupMemberInput" minOccurs="0"/>
 *         &lt;element name="groupIdObj" type="{http://pub.services.ecif.clpc.com/}groupIdObj" minOccurs="0"/>
 *         &lt;element name="rsCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rsDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createPartyGroupMemberResult", propOrder = {
    "createPartyGroupMemberInput",
    "groupIdObj",
    "rsCode",
    "rsDesc",
    "transactionNO"
})
public class CreatePartyGroupMemberResult {

    protected CreatePartyGroupMemberInput createPartyGroupMemberInput;
    protected GroupIdObj groupIdObj;
    protected Integer rsCode;
    protected String rsDesc;
    protected String transactionNO;

    /**
     * Gets the value of the createPartyGroupMemberInput property.
     * 
     * @return
     *     possible object is
     *     {@link CreatePartyGroupMemberInput }
     *     
     */
    public CreatePartyGroupMemberInput getCreatePartyGroupMemberInput() {
        return createPartyGroupMemberInput;
    }

    /**
     * Sets the value of the createPartyGroupMemberInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreatePartyGroupMemberInput }
     *     
     */
    public void setCreatePartyGroupMemberInput(CreatePartyGroupMemberInput value) {
        this.createPartyGroupMemberInput = value;
    }

    /**
     * Gets the value of the groupIdObj property.
     * 
     * @return
     *     possible object is
     *     {@link GroupIdObj }
     *     
     */
    public GroupIdObj getGroupIdObj() {
        return groupIdObj;
    }

    /**
     * Sets the value of the groupIdObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupIdObj }
     *     
     */
    public void setGroupIdObj(GroupIdObj value) {
        this.groupIdObj = value;
    }

    /**
     * Gets the value of the rsCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRsCode() {
        return rsCode;
    }

    /**
     * Sets the value of the rsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRsCode(Integer value) {
        this.rsCode = value;
    }

    /**
     * Gets the value of the rsDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsDesc() {
        return rsDesc;
    }

    /**
     * Sets the value of the rsDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsDesc(String value) {
        this.rsDesc = value;
    }

    /**
     * Gets the value of the transactionNO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionNO() {
        return transactionNO;
    }

    /**
     * Sets the value of the transactionNO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionNO(String value) {
        this.transactionNO = value;
    }

}
