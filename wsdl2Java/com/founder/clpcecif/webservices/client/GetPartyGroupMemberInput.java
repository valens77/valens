
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPartyGroupMemberInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPartyGroupMemberInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extPartyReference" type="{http://pub.services.ecif.clpc.com/}extPartyReference" minOccurs="0"/>
 *         &lt;element name="groupIdObj" type="{http://pub.services.ecif.clpc.com/}groupIdObj" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPartyGroupMemberInput", propOrder = {
    "extPartyReference",
    "groupIdObj"
})
public class GetPartyGroupMemberInput {

    protected ExtPartyReference extPartyReference;
    protected GroupIdObj groupIdObj;

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
     * Gets the value of the groupIdObj property.
     * 
     * @return
     *     possible object is
     *     {@link GroupIdObj }
     *     
     */
    public GroupIdObj getGroupIdObj() {
        return groupIdObj;
    }

    /**
     * Sets the value of the groupIdObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupIdObj }
     *     
     */
    public void setGroupIdObj(GroupIdObj value) {
        this.groupIdObj = value;
    }

}
