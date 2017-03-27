
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createOrgnizationInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createOrgnizationInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extPartyReference" type="{http://pub.services.ecif.clpc.com/}extPartyReference" minOccurs="0"/>
 *         &lt;element name="orgnizationComp" type="{http://pub.services.ecif.clpc.com/}orgnizationComp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createOrgnizationInput", propOrder = {
    "extPartyReference",
    "orgnizationComp"
})
public class CreateOrgnizationInput {

    protected ExtPartyReference extPartyReference;
    protected OrgnizationComp orgnizationComp;

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

}
