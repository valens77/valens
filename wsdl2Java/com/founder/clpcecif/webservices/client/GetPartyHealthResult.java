
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPartyHealthResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPartyHealthResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getPartyHealthInput" type="{http://pub.services.ecif.clpc.com/}getPartyHealthInput" minOccurs="0"/>
 *         &lt;element name="partyHealth" type="{http://pub.services.ecif.clpc.com/}partyHealth" minOccurs="0"/>
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
@XmlType(name = "getPartyHealthResult", propOrder = {
    "getPartyHealthInput",
    "partyHealth",
    "rsCode",
    "rsDesc",
    "transactionNO"
})
public class GetPartyHealthResult {

    protected GetPartyHealthInput getPartyHealthInput;
    protected PartyHealth partyHealth;
    protected Integer rsCode;
    protected String rsDesc;
    protected String transactionNO;

    /**
     * Gets the value of the getPartyHealthInput property.
     * 
     * @return
     *     possible object is
     *     {@link GetPartyHealthInput }
     *     
     */
    public GetPartyHealthInput getGetPartyHealthInput() {
        return getPartyHealthInput;
    }

    /**
     * Sets the value of the getPartyHealthInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPartyHealthInput }
     *     
     */
    public void setGetPartyHealthInput(GetPartyHealthInput value) {
        this.getPartyHealthInput = value;
    }

    /**
     * Gets the value of the partyHealth property.
     * 
     * @return
     *     possible object is
     *     {@link PartyHealth }
     *     
     */
    public PartyHealth getPartyHealth() {
        return partyHealth;
    }

    /**
     * Sets the value of the partyHealth property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyHealth }
     *     
     */
    public void setPartyHealth(PartyHealth value) {
        this.partyHealth = value;
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
