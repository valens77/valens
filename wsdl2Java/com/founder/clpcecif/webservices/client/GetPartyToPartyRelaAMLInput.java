
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPartyToPartyRelaAMLInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPartyToPartyRelaAMLInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extPartyReference" type="{http://pub.services.ecif.clpc.com/}extPartyReference" minOccurs="0"/>
 *         &lt;element name="masterSlaveFlagObj" type="{http://pub.services.ecif.clpc.com/}masterSlaveFlagObj" minOccurs="0"/>
 *         &lt;element name="partyIdObj" type="{http://pub.services.ecif.clpc.com/}partyIdObj" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPartyToPartyRelaAMLInput", propOrder = {
    "extPartyReference",
    "masterSlaveFlagObj",
    "partyIdObj"
})
public class GetPartyToPartyRelaAMLInput {

    protected ExtPartyReference extPartyReference;
    protected MasterSlaveFlagObj masterSlaveFlagObj;
    protected PartyIdObj partyIdObj;

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
     * Gets the value of the masterSlaveFlagObj property.
     * 
     * @return
     *     possible object is
     *     {@link MasterSlaveFlagObj }
     *     
     */
    public MasterSlaveFlagObj getMasterSlaveFlagObj() {
        return masterSlaveFlagObj;
    }

    /**
     * Sets the value of the masterSlaveFlagObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterSlaveFlagObj }
     *     
     */
    public void setMasterSlaveFlagObj(MasterSlaveFlagObj value) {
        this.masterSlaveFlagObj = value;
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

}
