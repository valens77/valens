
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for masterSlaveFlagObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="masterSlaveFlagObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MSFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "masterSlaveFlagObj", propOrder = {
    "msFlag"
})
public class MasterSlaveFlagObj {

    @XmlElement(name = "MSFlag")
    protected String msFlag;

    /**
     * Gets the value of the msFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSFlag() {
        return msFlag;
    }

    /**
     * Sets the value of the msFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSFlag(String value) {
        this.msFlag = value;
    }

}
