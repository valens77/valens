
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createOrgnizationVirtualCodeInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createOrgnizationVirtualCodeInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createOperatorObj" type="{http://pub.services.ecif.clpc.com/}createOperatorObj" minOccurs="0"/>
 *         &lt;element name="extPartyReference" type="{http://pub.services.ecif.clpc.com/}extPartyReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createOrgnizationVirtualCodeInput", propOrder = {
    "createOperatorObj",
    "extPartyReference"
})
public class CreateOrgnizationVirtualCodeInput {

    protected CreateOperatorObj createOperatorObj;
    protected ExtPartyReference extPartyReference;

    /**
     * Gets the value of the createOperatorObj property.
     * 
     * @return
     *     possible object is
     *     {@link CreateOperatorObj }
     *     
     */
    public CreateOperatorObj getCreateOperatorObj() {
        return createOperatorObj;
    }

    /**
     * Sets the value of the createOperatorObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateOperatorObj }
     *     
     */
    public void setCreateOperatorObj(CreateOperatorObj value) {
        this.createOperatorObj = value;
    }

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

}
