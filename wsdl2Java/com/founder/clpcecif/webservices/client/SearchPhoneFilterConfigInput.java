
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchPhoneFilterConfigInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchPhoneFilterConfigInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phoneFilterConfig" type="{http://pub.services.ecif.clpc.com/}phoneFilterConfig" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchPhoneFilterConfigInput", propOrder = {
    "phoneFilterConfig"
})
public class SearchPhoneFilterConfigInput {

    protected PhoneFilterConfig phoneFilterConfig;

    /**
     * Gets the value of the phoneFilterConfig property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneFilterConfig }
     *     
     */
    public PhoneFilterConfig getPhoneFilterConfig() {
        return phoneFilterConfig;
    }

    /**
     * Sets the value of the phoneFilterConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneFilterConfig }
     *     
     */
    public void setPhoneFilterConfig(PhoneFilterConfig value) {
        this.phoneFilterConfig = value;
    }

}
