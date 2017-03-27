
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPartyProfileByIdResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPartyProfileByIdResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getPartyProfileByIdInput" type="{http://pub.services.ecif.clpc.com/}getPartyProfileByIdInput" minOccurs="0"/>
 *         &lt;element name="partyProfile" type="{http://pub.services.ecif.clpc.com/}partyProfile" minOccurs="0"/>
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
@XmlType(name = "getPartyProfileByIdResult", propOrder = {
    "getPartyProfileByIdInput",
    "partyProfile",
    "rsCode",
    "rsDesc",
    "transactionNO"
})
public class GetPartyProfileByIdResult {

    protected GetPartyProfileByIdInput getPartyProfileByIdInput;
    protected PartyProfile partyProfile;
    protected Integer rsCode;
    protected String rsDesc;
    protected String transactionNO;

    /**
     * Gets the value of the getPartyProfileByIdInput property.
     * 
     * @return
     *     possible object is
     *     {@link GetPartyProfileByIdInput }
     *     
     */
    public GetPartyProfileByIdInput getGetPartyProfileByIdInput() {
        return getPartyProfileByIdInput;
    }

    /**
     * Sets the value of the getPartyProfileByIdInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPartyProfileByIdInput }
     *     
     */
    public void setGetPartyProfileByIdInput(GetPartyProfileByIdInput value) {
        this.getPartyProfileByIdInput = value;
    }

    /**
     * Gets the value of the partyProfile property.
     * 
     * @return
     *     possible object is
     *     {@link PartyProfile }
     *     
     */
    public PartyProfile getPartyProfile() {
        return partyProfile;
    }

    /**
     * Sets the value of the partyProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyProfile }
     *     
     */
    public void setPartyProfile(PartyProfile value) {
        this.partyProfile = value;
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
