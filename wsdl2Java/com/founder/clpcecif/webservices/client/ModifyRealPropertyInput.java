
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modifyRealPropertyInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modifyRealPropertyInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extPartyReference" type="{http://pub.services.ecif.clpc.com/}extPartyReference" minOccurs="0"/>
 *         &lt;element name="realProperty" type="{http://pub.services.ecif.clpc.com/}realProperty" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modifyRealPropertyInput", propOrder = {
    "extPartyReference",
    "realProperty"
})
public class ModifyRealPropertyInput {

    protected ExtPartyReference extPartyReference;
    protected RealProperty realProperty;

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
     * Gets the value of the realProperty property.
     * 
     * @return
     *     possible object is
     *     {@link RealProperty }
     *     
     */
    public RealProperty getRealProperty() {
        return realProperty;
    }

    /**
     * Sets the value of the realProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealProperty }
     *     
     */
    public void setRealProperty(RealProperty value) {
        this.realProperty = value;
    }

}
