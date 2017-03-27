
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaintainPartyToPartyRelaVip complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaintainPartyToPartyRelaVip">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://pub.services.ecif.clpc.com/}maintainPartyToPartyRelaVipInput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintainPartyToPartyRelaVip", propOrder = {
    "arg0"
})
public class MaintainPartyToPartyRelaVip {

    protected MaintainPartyToPartyRelaVipInput arg0;

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link MaintainPartyToPartyRelaVipInput }
     *     
     */
    public MaintainPartyToPartyRelaVipInput getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintainPartyToPartyRelaVipInput }
     *     
     */
    public void setArg0(MaintainPartyToPartyRelaVipInput value) {
        this.arg0 = value;
    }

}
