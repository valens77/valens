
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for maintainPartyToPartyRelaVipInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="maintainPartyToPartyRelaVipInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extPartyReference" type="{http://pub.services.ecif.clpc.com/}extPartyReference" minOccurs="0"/>
 *         &lt;element name="partyToPartyRelaObj" type="{http://pub.services.ecif.clpc.com/}partyToPartyRelaObj" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "maintainPartyToPartyRelaVipInput", propOrder = {
    "extPartyReference",
    "partyToPartyRelaObj"
})
public class MaintainPartyToPartyRelaVipInput {

    protected ExtPartyReference extPartyReference;
    protected PartyToPartyRelaObj partyToPartyRelaObj;

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
     * Gets the value of the partyToPartyRelaObj property.
     * 
     * @return
     *     possible object is
     *     {@link PartyToPartyRelaObj }
     *     
     */
    public PartyToPartyRelaObj getPartyToPartyRelaObj() {
        return partyToPartyRelaObj;
    }

    /**
     * Sets the value of the partyToPartyRelaObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyToPartyRelaObj }
     *     
     */
    public void setPartyToPartyRelaObj(PartyToPartyRelaObj value) {
        this.partyToPartyRelaObj = value;
    }

}
