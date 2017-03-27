
package com.founder.clpcecif.webservices.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for splitPartyCrossReferenceInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="splitPartyCrossReferenceInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extPartyReference" type="{http://pub.services.ecif.clpc.com/}extPartyReference" minOccurs="0"/>
 *         &lt;element name="partyCrossReference" type="{http://pub.services.ecif.clpc.com/}partyCrossReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="partyIdObj" type="{http://pub.services.ecif.clpc.com/}partyIdObj" minOccurs="0"/>
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
@XmlType(name = "splitPartyCrossReferenceInput", propOrder = {
    "extPartyReference",
    "partyCrossReference",
    "partyIdObj",
    "secondPartyIdObj"
})
public class SplitPartyCrossReferenceInput {

    protected ExtPartyReference extPartyReference;
    @XmlElement(nillable = true)
    protected List<PartyCrossReference> partyCrossReference;
    protected PartyIdObj partyIdObj;
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
     * Gets the value of the partyCrossReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyCrossReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyCrossReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyCrossReference }
     * 
     * 
     */
    public List<PartyCrossReference> getPartyCrossReference() {
        if (partyCrossReference == null) {
            partyCrossReference = new ArrayList<PartyCrossReference>();
        }
        return this.partyCrossReference;
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
