
package com.founder.clpcecif.webservices.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for maintainTelePhoneTagListInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="maintainTelePhoneTagListInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="telPhoneAndTag" type="{http://pub.services.ecif.clpc.com/}telPhoneAndTag" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "maintainTelePhoneTagListInput", propOrder = {
    "telPhoneAndTag"
})
public class MaintainTelePhoneTagListInput {

    @XmlElement(nillable = true)
    protected List<TelPhoneAndTag> telPhoneAndTag;

    /**
     * Gets the value of the telPhoneAndTag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telPhoneAndTag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelPhoneAndTag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TelPhoneAndTag }
     * 
     * 
     */
    public List<TelPhoneAndTag> getTelPhoneAndTag() {
        if (telPhoneAndTag == null) {
            telPhoneAndTag = new ArrayList<TelPhoneAndTag>();
        }
        return this.telPhoneAndTag;
    }

}
