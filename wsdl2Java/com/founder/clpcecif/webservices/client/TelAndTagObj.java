
package com.founder.clpcecif.webservices.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for telAndTagObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="telAndTagObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="telePhoneTag" type="{http://pub.services.ecif.clpc.com/}partyTelePhoneTag" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="telephone" type="{http://pub.services.ecif.clpc.com/}telephone" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "telAndTagObj", propOrder = {
    "telePhoneTag",
    "telephone"
})
public class TelAndTagObj {

    @XmlElement(nillable = true)
    protected List<PartyTelePhoneTag> telePhoneTag;
    protected Telephone telephone;

    /**
     * Gets the value of the telePhoneTag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telePhoneTag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelePhoneTag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyTelePhoneTag }
     * 
     * 
     */
    public List<PartyTelePhoneTag> getTelePhoneTag() {
        if (telePhoneTag == null) {
            telePhoneTag = new ArrayList<PartyTelePhoneTag>();
        }
        return this.telePhoneTag;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * @return
     *     possible object is
     *     {@link Telephone }
     *     
     */
    public Telephone getTelephone() {
        return telephone;
    }

    /**
     * Sets the value of the telephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Telephone }
     *     
     */
    public void setTelephone(Telephone value) {
        this.telephone = value;
    }

}
