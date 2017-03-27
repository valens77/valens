
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for maintainPartyToPartyRelaAMLPrpAllInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="maintainPartyToPartyRelaAMLPrpAllInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extPartyReference" type="{http://pub.services.ecif.clpc.com/}extPartyReference" minOccurs="0"/>
 *         &lt;element name="p2PRelaAMLPrpAllSubType" type="{http://pub.services.ecif.clpc.com/}p2PRelaAMLPrpAllSubType" minOccurs="0"/>
 *         &lt;element name="partyIdObj" type="{http://pub.services.ecif.clpc.com/}partyIdObj" minOccurs="0"/>
 *         &lt;element name="partyRegistration" type="{http://pub.services.ecif.clpc.com/}partyRegistration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "maintainPartyToPartyRelaAMLPrpAllInput", propOrder = {
    "extPartyReference",
    "p2PRelaAMLPrpAllSubType",
    "partyIdObj",
    "partyRegistration"
})
public class MaintainPartyToPartyRelaAMLPrpAllInput {

    protected ExtPartyReference extPartyReference;
    protected P2PRelaAMLPrpAllSubType p2PRelaAMLPrpAllSubType;
    protected PartyIdObj partyIdObj;
    protected PartyRegistration partyRegistration;

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
     * Gets the value of the p2PRelaAMLPrpAllSubType property.
     * 
     * @return
     *     possible object is
     *     {@link P2PRelaAMLPrpAllSubType }
     *     
     */
    public P2PRelaAMLPrpAllSubType getP2PRelaAMLPrpAllSubType() {
        return p2PRelaAMLPrpAllSubType;
    }

    /**
     * Sets the value of the p2PRelaAMLPrpAllSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link P2PRelaAMLPrpAllSubType }
     *     
     */
    public void setP2PRelaAMLPrpAllSubType(P2PRelaAMLPrpAllSubType value) {
        this.p2PRelaAMLPrpAllSubType = value;
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
     * Gets the value of the partyRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link PartyRegistration }
     *     
     */
    public PartyRegistration getPartyRegistration() {
        return partyRegistration;
    }

    /**
     * Sets the value of the partyRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRegistration }
     *     
     */
    public void setPartyRegistration(PartyRegistration value) {
        this.partyRegistration = value;
    }

}
