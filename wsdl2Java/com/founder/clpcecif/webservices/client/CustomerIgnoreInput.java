
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customerIgnoreInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customerIgnoreInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerIgnoreObj" type="{http://pub.services.ecif.clpc.com/}customerIgnoreObj" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerIgnoreInput", propOrder = {
    "customerIgnoreObj"
})
public class CustomerIgnoreInput {

    protected CustomerIgnoreObj customerIgnoreObj;

    /**
     * Gets the value of the customerIgnoreObj property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIgnoreObj }
     *     
     */
    public CustomerIgnoreObj getCustomerIgnoreObj() {
        return customerIgnoreObj;
    }

    /**
     * Sets the value of the customerIgnoreObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIgnoreObj }
     *     
     */
    public void setCustomerIgnoreObj(CustomerIgnoreObj value) {
        this.customerIgnoreObj = value;
    }

}
