
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modifyGroupResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modifyGroupResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modifyGroupInput" type="{http://pub.services.ecif.clpc.com/}modifyGroupInput" minOccurs="0"/>
 *         &lt;element name="partyIdObj" type="{http://pub.services.ecif.clpc.com/}partyIdObj" minOccurs="0"/>
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
@XmlType(name = "modifyGroupResult", propOrder = {
    "modifyGroupInput",
    "partyIdObj",
    "rsCode",
    "rsDesc",
    "transactionNO"
})
public class ModifyGroupResult {

    protected ModifyGroupInput modifyGroupInput;
    protected PartyIdObj partyIdObj;
    protected Integer rsCode;
    protected String rsDesc;
    protected String transactionNO;

    /**
     * Gets the value of the modifyGroupInput property.
     * 
     * @return
     *     possible object is
     *     {@link ModifyGroupInput }
     *     
     */
    public ModifyGroupInput getModifyGroupInput() {
        return modifyGroupInput;
    }

    /**
     * Sets the value of the modifyGroupInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyGroupInput }
     *     
     */
    public void setModifyGroupInput(ModifyGroupInput value) {
        this.modifyGroupInput = value;
    }

    /**
     * Gets the value of the partyIdObj property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdObj }
     *     
     */
    public PartyIdObj getPartyIdObj() {
        return partyIdObj;
    }

    /**
     * Sets the value of the partyIdObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdObj }
     *     
     */
    public void setPartyIdObj(PartyIdObj value) {
        this.partyIdObj = value;
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
