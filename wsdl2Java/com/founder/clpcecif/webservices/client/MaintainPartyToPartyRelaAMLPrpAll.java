
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaintainPartyToPartyRelaAMLPrpAll complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaintainPartyToPartyRelaAMLPrpAll">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://pub.services.ecif.clpc.com/}maintainPartyToPartyRelaAMLPrpAllInput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintainPartyToPartyRelaAMLPrpAll", propOrder = {
    "arg0"
})
public class MaintainPartyToPartyRelaAMLPrpAll {

    protected MaintainPartyToPartyRelaAMLPrpAllInput arg0;

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link MaintainPartyToPartyRelaAMLPrpAllInput }
     *     
     */
    public MaintainPartyToPartyRelaAMLPrpAllInput getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintainPartyToPartyRelaAMLPrpAllInput }
     *     
     */
    public void setArg0(MaintainPartyToPartyRelaAMLPrpAllInput value) {
        this.arg0 = value;
    }

}
