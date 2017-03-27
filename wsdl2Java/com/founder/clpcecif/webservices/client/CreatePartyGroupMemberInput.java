
package com.founder.clpcecif.webservices.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createPartyGroupMemberInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createPartyGroupMemberInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extPartyReference" type="{http://pub.services.ecif.clpc.com/}extPartyReference" minOccurs="0"/>
 *         &lt;element name="groupIdObj" type="{http://pub.services.ecif.clpc.com/}groupIdObj" minOccurs="0"/>
 *         &lt;element name="partyGroupMember" type="{http://pub.services.ecif.clpc.com/}partyGroupMember" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createPartyGroupMemberInput", propOrder = {
    "extPartyReference",
    "groupIdObj",
    "partyGroupMember"
})
public class CreatePartyGroupMemberInput {

    protected ExtPartyReference extPartyReference;
    protected GroupIdObj groupIdObj;
    @XmlElement(nillable = true)
    protected List<PartyGroupMember> partyGroupMember;

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

    /**
     * Gets the value of the partyGroupMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyGroupMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyGroupMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyGroupMember }
     * 
     * 
     */
    public List<PartyGroupMember> getPartyGroupMember() {
        if (partyGroupMember == null) {
            partyGroupMember = new ArrayList<PartyGroupMember>();
        }
        return this.partyGroupMember;
    }

}
