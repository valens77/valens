
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modifyServiceCardLifeInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modifyServiceCardLifeInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extPartyReference" type="{http://pub.services.ecif.clpc.com/}extPartyReference" minOccurs="0"/>
 *         &lt;element name="serviceCard" type="{http://pub.services.ecif.clpc.com/}serviceCard" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modifyServiceCardLifeInput", propOrder = {
    "extPartyReference",
    "serviceCard"
})
public class ModifyServiceCardLifeInput {

    protected ExtPartyReference extPartyReference;
    protected ServiceCard serviceCard;

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
     * Gets the value of the serviceCard property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCard }
     *     
     */
    public ServiceCard getServiceCard() {
        return serviceCard;
    }

    /**
     * Sets the value of the serviceCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCard }
     *     
     */
    public void setServiceCard(ServiceCard value) {
        this.serviceCard = value;
    }

}
