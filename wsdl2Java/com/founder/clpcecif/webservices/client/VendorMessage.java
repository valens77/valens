
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vendorMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vendorMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orgnizationComp" type="{http://pub.services.ecif.clpc.com/}orgnizationComp" minOccurs="0"/>
 *         &lt;element name="vendor" type="{http://pub.services.ecif.clpc.com/}vendor" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vendorMessage", propOrder = {
    "orgnizationComp",
    "vendor"
})
public class VendorMessage {

    protected OrgnizationComp orgnizationComp;
    protected Vendor vendor;

    /**
     * Gets the value of the orgnizationComp property.
     * 
     * @return
     *     possible object is
     *     {@link OrgnizationComp }
     *     
     */
    public OrgnizationComp getOrgnizationComp() {
        return orgnizationComp;
    }

    /**
     * Sets the value of the orgnizationComp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgnizationComp }
     *     
     */
    public void setOrgnizationComp(OrgnizationComp value) {
        this.orgnizationComp = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link Vendor }
     *     
     */
    public Vendor getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vendor }
     *     
     */
    public void setVendor(Vendor value) {
        this.vendor = value;
    }

}
