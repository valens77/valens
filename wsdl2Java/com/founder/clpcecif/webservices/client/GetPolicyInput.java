
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPolicyInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPolicyInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extPartyReference" type="{http://pub.services.ecif.clpc.com/}extPartyReference" minOccurs="0"/>
 *         &lt;element name="pageInput" type="{http://pub.services.ecif.clpc.com/}pageInput" minOccurs="0"/>
 *         &lt;element name="partyIdObj" type="{http://pub.services.ecif.clpc.com/}partyIdObj" minOccurs="0"/>
 *         &lt;element name="policySearchObject" type="{http://pub.services.ecif.clpc.com/}policySearchObject" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPolicyInput", propOrder = {
    "extPartyReference",
    "pageInput",
    "partyIdObj",
    "policySearchObject"
})
public class GetPolicyInput {

    protected ExtPartyReference extPartyReference;
    protected PageInput pageInput;
    protected PartyIdObj partyIdObj;
    protected PolicySearchObject policySearchObject;

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
     * Gets the value of the pageInput property.
     * 
     * @return
     *     possible object is
     *     {@link PageInput }
     *     
     */
    public PageInput getPageInput() {
        return pageInput;
    }

    /**
     * Sets the value of the pageInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageInput }
     *     
     */
    public void setPageInput(PageInput value) {
        this.pageInput = value;
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

    /**
     * Gets the value of the policySearchObject property.
     * 
     * @return
     *     possible object is
     *     {@link PolicySearchObject }
     *     
     */
    public PolicySearchObject getPolicySearchObject() {
        return policySearchObject;
    }

    /**
     * Sets the value of the policySearchObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicySearchObject }
     *     
     */
    public void setPolicySearchObject(PolicySearchObject value) {
        this.policySearchObject = value;
    }

}
