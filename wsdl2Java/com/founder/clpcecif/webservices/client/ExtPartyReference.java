
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for extPartyReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="extPartyReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extSysId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extSysPartyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "extPartyReference", propOrder = {
    "extSysId",
    "extSysPartyId"
})
public class ExtPartyReference {

    protected String extSysId;
    protected String extSysPartyId;

    /**
     * Gets the value of the extSysId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtSysId() {
        return extSysId;
    }

    /**
     * Sets the value of the extSysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtSysId(String value) {
        this.extSysId = value;
    }

    /**
     * Gets the value of the extSysPartyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtSysPartyId() {
        return extSysPartyId;
    }

    /**
     * Sets the value of the extSysPartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtSysPartyId(String value) {
        this.extSysPartyId = value;
    }

}
