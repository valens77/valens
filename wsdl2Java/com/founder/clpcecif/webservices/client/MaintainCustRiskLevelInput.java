
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for maintainCustRiskLevelInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="maintainCustRiskLevelInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="custRiskLevel" type="{http://pub.services.ecif.clpc.com/}custRiskLevel" minOccurs="0"/>
 *         &lt;element name="extPartyReference" type="{http://pub.services.ecif.clpc.com/}extPartyReference" minOccurs="0"/>
 *         &lt;element name="partyIdObj" type="{http://pub.services.ecif.clpc.com/}partyIdObj" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "maintainCustRiskLevelInput", propOrder = {
    "custRiskLevel",
    "extPartyReference",
    "partyIdObj"
})
public class MaintainCustRiskLevelInput {

    protected CustRiskLevel custRiskLevel;
    protected ExtPartyReference extPartyReference;
    protected PartyIdObj partyIdObj;

    /**
     * Gets the value of the custRiskLevel property.
     * 
     * @return
     *     possible object is
     *     {@link CustRiskLevel }
     *     
     */
    public CustRiskLevel getCustRiskLevel() {
        return custRiskLevel;
    }

    /**
     * Sets the value of the custRiskLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustRiskLevel }
     *     
     */
    public void setCustRiskLevel(CustRiskLevel value) {
        this.custRiskLevel = value;
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

    /**
     * Gets the value of the partyIdObj property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdObj }
     *     
     */
    public PartyIdObj getPartyIdObj() {
        return partyIdObj;
    }

    /**
     * Sets the value of the partyIdObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdObj }
     *     
     */
    public void setPartyIdObj(PartyIdObj value) {
        this.partyIdObj = value;
    }

}
