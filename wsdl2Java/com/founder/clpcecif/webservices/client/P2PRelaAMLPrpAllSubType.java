
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for p2PRelaAMLPrpAllSubType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="p2PRelaAMLPrpAllSubType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="party_Rela_Sub_Type_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "p2PRelaAMLPrpAllSubType", propOrder = {
    "partyRelaSubTypeCode"
})
public class P2PRelaAMLPrpAllSubType {

    @XmlElement(name = "party_Rela_Sub_Type_Code")
    protected String partyRelaSubTypeCode;

    /**
     * Gets the value of the partyRelaSubTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyRelaSubTypeCode() {
        return partyRelaSubTypeCode;
    }

    /**
     * Sets the value of the partyRelaSubTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyRelaSubTypeCode(String value) {
        this.partyRelaSubTypeCode = value;
    }

}
