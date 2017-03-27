
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modifyLifeSalesExtendInfoInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modifyLifeSalesExtendInfoInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extPartyReference" type="{http://pub.services.ecif.clpc.com/}extPartyReference" minOccurs="0"/>
 *         &lt;element name="lifeSales" type="{http://pub.services.ecif.clpc.com/}lifeSales" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modifyLifeSalesExtendInfoInput", propOrder = {
    "extPartyReference",
    "lifeSales"
})
public class ModifyLifeSalesExtendInfoInput {

    protected ExtPartyReference extPartyReference;
    protected LifeSales lifeSales;

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
     * Gets the value of the lifeSales property.
     * 
     * @return
     *     possible object is
     *     {@link LifeSales }
     *     
     */
    public LifeSales getLifeSales() {
        return lifeSales;
    }

    /**
     * Sets the value of the lifeSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeSales }
     *     
     */
    public void setLifeSales(LifeSales value) {
        this.lifeSales = value;
    }

}
