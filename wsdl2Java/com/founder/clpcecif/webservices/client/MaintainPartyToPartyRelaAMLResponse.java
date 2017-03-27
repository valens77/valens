
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaintainPartyToPartyRelaAMLResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaintainPartyToPartyRelaAMLResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://pub.services.ecif.clpc.com/}maintainPartyToPartyRelaAMLResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintainPartyToPartyRelaAMLResponse", propOrder = {
    "_return"
})
public class MaintainPartyToPartyRelaAMLResponse {

    @XmlElement(name = "return")
    protected MaintainPartyToPartyRelaAMLResult _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link MaintainPartyToPartyRelaAMLResult }
     *     
     */
    public MaintainPartyToPartyRelaAMLResult getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintainPartyToPartyRelaAMLResult }
     *     
     */
    public void setReturn(MaintainPartyToPartyRelaAMLResult value) {
        this._return = value;
    }

}
