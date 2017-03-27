
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for partyProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="partyProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="custLifeStatus" type="{http://pub.services.ecif.clpc.com/}custLifeStatus" minOccurs="0"/>
 *         &lt;element name="custServiceLevel" type="{http://pub.services.ecif.clpc.com/}custServiceLevel" minOccurs="0"/>
 *         &lt;element name="custVIPLevel" type="{http://pub.services.ecif.clpc.com/}custVIPLevel" minOccurs="0"/>
 *         &lt;element name="partyIdObj" type="{http://pub.services.ecif.clpc.com/}partyIdObj" minOccurs="0"/>
 *         &lt;element name="partyRegistrationKeyInfo" type="{http://pub.services.ecif.clpc.com/}partyRegistrationKeyInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partyProfile", propOrder = {
    "custLifeStatus",
    "custServiceLevel",
    "custVIPLevel",
    "partyIdObj",
    "partyRegistrationKeyInfo"
})
public class PartyProfile {

    protected CustLifeStatus custLifeStatus;
    protected CustServiceLevel custServiceLevel;
    protected CustVIPLevel custVIPLevel;
    protected PartyIdObj partyIdObj;
    protected PartyRegistrationKeyInfo partyRegistrationKeyInfo;

    /**
     * Gets the value of the custLifeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CustLifeStatus }
     *     
     */
    public CustLifeStatus getCustLifeStatus() {
        return custLifeStatus;
    }

    /**
     * Sets the value of the custLifeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustLifeStatus }
     *     
     */
    public void setCustLifeStatus(CustLifeStatus value) {
        this.custLifeStatus = value;
    }

    /**
     * Gets the value of the custServiceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link CustServiceLevel }
     *     
     */
    public CustServiceLevel getCustServiceLevel() {
        return custServiceLevel;
    }

    /**
     * Sets the value of the custServiceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustServiceLevel }
     *     
     */
    public void setCustServiceLevel(CustServiceLevel value) {
        this.custServiceLevel = value;
    }

    /**
     * Gets the value of the custVIPLevel property.
     * 
     * @return
     *     possible object is
     *     {@link CustVIPLevel }
     *     
     */
    public CustVIPLevel getCustVIPLevel() {
        return custVIPLevel;
    }

    /**
     * Sets the value of the custVIPLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustVIPLevel }
     *     
     */
    public void setCustVIPLevel(CustVIPLevel value) {
        this.custVIPLevel = value;
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
     * Gets the value of the partyRegistrationKeyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PartyRegistrationKeyInfo }
     *     
     */
    public PartyRegistrationKeyInfo getPartyRegistrationKeyInfo() {
        return partyRegistrationKeyInfo;
    }

    /**
     * Sets the value of the partyRegistrationKeyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRegistrationKeyInfo }
     *     
     */
    public void setPartyRegistrationKeyInfo(PartyRegistrationKeyInfo value) {
        this.partyRegistrationKeyInfo = value;
    }

}
