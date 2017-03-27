
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createSearchOrgnizationInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createSearchOrgnizationInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extPartyReference" type="{http://pub.services.ecif.clpc.com/}extPartyReference" minOccurs="0"/>
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
@XmlType(name = "createSearchOrgnizationInput", propOrder = {
    "extPartyReference",
    "partyRegistrationKeyInfo"
})
public class CreateSearchOrgnizationInput {

    protected ExtPartyReference extPartyReference;
    protected PartyRegistrationKeyInfo partyRegistrationKeyInfo;

    /**
     * Gets the value of the extPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link ExtPartyReference }
     *     
     */
    public ExtPartyReference getExtPartyReference() {
        return extPartyReference;
    }

    /**
     * Sets the value of the extPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtPartyReference }
     *     
     */
    public void setExtPartyReference(ExtPartyReference value) {
        this.extPartyReference = value;
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
