
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCustServiceLevelMultiInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCustServiceLevelMultiInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extPartyReference" type="{http://pub.services.ecif.clpc.com/}extPartyReference" minOccurs="0"/>
 *         &lt;element name="lifeEmpNo" type="{http://pub.services.ecif.clpc.com/}lifeEmpNo" minOccurs="0"/>
 *         &lt;element name="partyIdObj" type="{http://pub.services.ecif.clpc.com/}partyIdObj" minOccurs="0"/>
 *         &lt;element name="secondExtPartyReference" type="{http://pub.services.ecif.clpc.com/}secondExtPartyReference" minOccurs="0"/>
 *         &lt;element name="secondPartyIdObj" type="{http://pub.services.ecif.clpc.com/}secondPartyIdObj" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustServiceLevelMultiInput", propOrder = {
    "extPartyReference",
    "lifeEmpNo",
    "partyIdObj",
    "secondExtPartyReference",
    "secondPartyIdObj"
})
public class GetCustServiceLevelMultiInput {

    protected ExtPartyReference extPartyReference;
    protected LifeEmpNo lifeEmpNo;
    protected PartyIdObj partyIdObj;
    protected SecondExtPartyReference secondExtPartyReference;
    protected SecondPartyIdObj secondPartyIdObj;

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
     * Gets the value of the lifeEmpNo property.
     * 
     * @return
     *     possible object is
     *     {@link LifeEmpNo }
     *     
     */
    public LifeEmpNo getLifeEmpNo() {
        return lifeEmpNo;
    }

    /**
     * Sets the value of the lifeEmpNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeEmpNo }
     *     
     */
    public void setLifeEmpNo(LifeEmpNo value) {
        this.lifeEmpNo = value;
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
     * Gets the value of the secondExtPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link SecondExtPartyReference }
     *     
     */
    public SecondExtPartyReference getSecondExtPartyReference() {
        return secondExtPartyReference;
    }

    /**
     * Sets the value of the secondExtPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondExtPartyReference }
     *     
     */
    public void setSecondExtPartyReference(SecondExtPartyReference value) {
        this.secondExtPartyReference = value;
    }

    /**
     * Gets the value of the secondPartyIdObj property.
     * 
     * @return
     *     possible object is
     *     {@link SecondPartyIdObj }
     *     
     */
    public SecondPartyIdObj getSecondPartyIdObj() {
        return secondPartyIdObj;
    }

    /**
     * Sets the value of the secondPartyIdObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondPartyIdObj }
     *     
     */
    public void setSecondPartyIdObj(SecondPartyIdObj value) {
        this.secondPartyIdObj = value;
    }

}
