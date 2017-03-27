
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deletePartyGroupMemberResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deletePartyGroupMemberResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deletePartyGroupMemberInput" type="{http://pub.services.ecif.clpc.com/}deletePartyGroupMemberInput" minOccurs="0"/>
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
@XmlType(name = "deletePartyGroupMemberResult", propOrder = {
    "deletePartyGroupMemberInput",
    "groupIdObj",
    "rsCode",
    "rsDesc",
    "transactionNO"
})
public class DeletePartyGroupMemberResult {

    protected DeletePartyGroupMemberInput deletePartyGroupMemberInput;
    protected GroupIdObj groupIdObj;
    protected Integer rsCode;
    protected String rsDesc;
    protected String transactionNO;

    /**
     * Gets the value of the deletePartyGroupMemberInput property.
     * 
     * @return
     *     possible object is
     *     {@link DeletePartyGroupMemberInput }
     *     
     */
    public DeletePartyGroupMemberInput getDeletePartyGroupMemberInput() {
        return deletePartyGroupMemberInput;
    }

    /**
     * Sets the value of the deletePartyGroupMemberInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeletePartyGroupMemberInput }
     *     
     */
    public void setDeletePartyGroupMemberInput(DeletePartyGroupMemberInput value) {
        this.deletePartyGroupMemberInput = value;
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
