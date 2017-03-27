
package com.founder.clpcecif.webservices.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orgnizationOutComp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orgnizationOutComp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orgnization" type="{http://pub.services.ecif.clpc.com/}orgnization" minOccurs="0"/>
 *         &lt;element name="partyName" type="{http://pub.services.ecif.clpc.com/}partyName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="partyRegistration" type="{http://pub.services.ecif.clpc.com/}partyRegistration" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orgnizationOutComp", propOrder = {
    "orgnization",
    "partyName",
    "partyRegistration"
})
public class OrgnizationOutComp {

    protected Orgnization orgnization;
    @XmlElement(nillable = true)
    protected List<PartyName> partyName;
    @XmlElement(nillable = true)
    protected List<PartyRegistration> partyRegistration;

    /**
     * Gets the value of the orgnization property.
     * 
     * @return
     *     possible object is
     *     {@link Orgnization }
     *     
     */
    public Orgnization getOrgnization() {
        return orgnization;
    }

    /**
     * Sets the value of the orgnization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Orgnization }
     *     
     */
    public void setOrgnization(Orgnization value) {
        this.orgnization = value;
    }

    /**
     * Gets the value of the partyName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyName }
     * 
     * 
     */
    public List<PartyName> getPartyName() {
        if (partyName == null) {
            partyName = new ArrayList<PartyName>();
        }
        return this.partyName;
    }

    /**
     * Gets the value of the partyRegistration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyRegistration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyRegistration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyRegistration }
     * 
     * 
     */
    public List<PartyRegistration> getPartyRegistration() {
        if (partyRegistration == null) {
            partyRegistration = new ArrayList<PartyRegistration>();
        }
        return this.partyRegistration;
    }

}
