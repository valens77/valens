
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteShipInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteShipInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extPartyReference" type="{http://pub.services.ecif.clpc.com/}extPartyReference" minOccurs="0"/>
 *         &lt;element name="partyIdObj" type="{http://pub.services.ecif.clpc.com/}partyIdObj" minOccurs="0"/>
 *         &lt;element name="shipIdObj" type="{http://pub.services.ecif.clpc.com/}shipIdObj" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteShipInput", propOrder = {
    "extPartyReference",
    "partyIdObj",
    "shipIdObj"
})
public class DeleteShipInput {

    protected ExtPartyReference extPartyReference;
    protected PartyIdObj partyIdObj;
    protected ShipIdObj shipIdObj;

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
     * Gets the value of the shipIdObj property.
     * 
     * @return
     *     possible object is
     *     {@link ShipIdObj }
     *     
     */
    public ShipIdObj getShipIdObj() {
        return shipIdObj;
    }

    /**
     * Sets the value of the shipIdObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipIdObj }
     *     
     */
    public void setShipIdObj(ShipIdObj value) {
        this.shipIdObj = value;
    }

}
