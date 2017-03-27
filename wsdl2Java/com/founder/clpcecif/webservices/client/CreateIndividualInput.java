
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createIndividualInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createIndividualInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extPartyReference" type="{http://pub.services.ecif.clpc.com/}extPartyReference" minOccurs="0"/>
 *         &lt;element name="individualComp" type="{http://pub.services.ecif.clpc.com/}individualComp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createIndividualInput", propOrder = {
    "extPartyReference",
    "individualComp"
})
public class CreateIndividualInput {

    protected ExtPartyReference extPartyReference;
    protected IndividualComp individualComp;

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
     * Gets the value of the individualComp property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualComp }
     *     
     */
    public IndividualComp getIndividualComp() {
        return individualComp;
    }

    /**
     * Sets the value of the individualComp property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualComp }
     *     
     */
    public void setIndividualComp(IndividualComp value) {
        this.individualComp = value;
    }

}