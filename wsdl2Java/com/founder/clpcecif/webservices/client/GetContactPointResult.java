
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getContactPointResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getContactPointResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getContactPointInput" type="{http://pub.services.ecif.clpc.com/}getContactPointInput" minOccurs="0"/>
 *         &lt;element name="partyContactComp" type="{http://pub.services.ecif.clpc.com/}partyContactComp" minOccurs="0"/>
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
@XmlType(name = "getContactPointResult", propOrder = {
    "getContactPointInput",
    "partyContactComp",
    "rsCode",
    "rsDesc",
    "transactionNO"
})
public class GetContactPointResult {

    protected GetContactPointInput getContactPointInput;
    protected PartyContactComp partyContactComp;
    protected Integer rsCode;
    protected String rsDesc;
    protected String transactionNO;

    /**
     * Gets the value of the getContactPointInput property.
     * 
     * @return
     *     possible object is
     *     {@link GetContactPointInput }
     *     
     */
    public GetContactPointInput getGetContactPointInput() {
        return getContactPointInput;
    }

    /**
     * Sets the value of the getContactPointInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetContactPointInput }
     *     
     */
    public void setGetContactPointInput(GetContactPointInput value) {
        this.getContactPointInput = value;
    }

    /**
     * Gets the value of the partyContactComp property.
     * 
     * @return
     *     possible object is
     *     {@link PartyContactComp }
     *     
     */
    public PartyContactComp getPartyContactComp() {
        return partyContactComp;
    }

    /**
     * Sets the value of the partyContactComp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyContactComp }
     *     
     */
    public void setPartyContactComp(PartyContactComp value) {
        this.partyContactComp = value;
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
