
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaintainPartyToPartyRelaAML complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaintainPartyToPartyRelaAML">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://pub.services.ecif.clpc.com/}maintainPartyToPartyRelaAMLInput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintainPartyToPartyRelaAML", propOrder = {
    "arg0"
})
public class MaintainPartyToPartyRelaAML {

    protected MaintainPartyToPartyRelaAMLInput arg0;

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link MaintainPartyToPartyRelaAMLInput }
     *     
     */
    public MaintainPartyToPartyRelaAMLInput getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintainPartyToPartyRelaAMLInput }
     *     
     */
    public void setArg0(MaintainPartyToPartyRelaAMLInput value) {
        this.arg0 = value;
    }

}
