
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTelephonePartyNumberInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTelephonePartyNumberInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partyRegistrationKeyInfo" type="{http://pub.services.ecif.clpc.com/}partyRegistrationKeyInfo" minOccurs="0"/>
 *         &lt;element name="telephonePartyNumber" type="{http://pub.services.ecif.clpc.com/}telephonePartyNumberObj" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTelephonePartyNumberInput", propOrder = {
    "partyRegistrationKeyInfo",
    "telephonePartyNumber"
})
public class GetTelephonePartyNumberInput {

    protected PartyRegistrationKeyInfo partyRegistrationKeyInfo;
    protected TelephonePartyNumberObj telephonePartyNumber;

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

    /**
     * Gets the value of the telephonePartyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TelephonePartyNumberObj }
     *     
     */
    public TelephonePartyNumberObj getTelephonePartyNumber() {
        return telephonePartyNumber;
    }

    /**
     * Sets the value of the telephonePartyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephonePartyNumberObj }
     *     
     */
    public void setTelephonePartyNumber(TelephonePartyNumberObj value) {
        this.telephonePartyNumber = value;
    }

}
