
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaintainCustAffiliatedFlagResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaintainCustAffiliatedFlagResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://pub.services.ecif.clpc.com/}maintainCustAffiliatedFlagResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintainCustAffiliatedFlagResponse", propOrder = {
    "_return"
})
public class MaintainCustAffiliatedFlagResponse {

    @XmlElement(name = "return")
    protected MaintainCustAffiliatedFlagResult _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link MaintainCustAffiliatedFlagResult }
     *     
     */
    public MaintainCustAffiliatedFlagResult getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintainCustAffiliatedFlagResult }
     *     
     */
    public void setReturn(MaintainCustAffiliatedFlagResult value) {
        this._return = value;
    }

}
