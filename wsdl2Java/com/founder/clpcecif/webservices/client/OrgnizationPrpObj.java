
package com.founder.clpcecif.webservices.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orgnizationPrpObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orgnizationPrpObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://pub.services.ecif.clpc.com/}address" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="custServiceLevel" type="{http://pub.services.ecif.clpc.com/}custServiceLevel" minOccurs="0"/>
 *         &lt;element name="electronicContactPoint" type="{http://pub.services.ecif.clpc.com/}electronicContactPoint" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="maxServiceLevelObj" type="{http://pub.services.ecif.clpc.com/}maxServiceLevelObj" minOccurs="0"/>
 *         &lt;element name="orgnization" type="{http://pub.services.ecif.clpc.com/}orgnization" minOccurs="0"/>
 *         &lt;element name="partyLinkman" type="{http://pub.services.ecif.clpc.com/}partyLinkman" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="partyName" type="{http://pub.services.ecif.clpc.com/}partyName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="partyRegistration" type="{http://pub.services.ecif.clpc.com/}partyRegistration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relFlagObj" type="{http://pub.services.ecif.clpc.com/}relFlagObj" minOccurs="0"/>
 *         &lt;element name="telephone" type="{http://pub.services.ecif.clpc.com/}telephone" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orgnizationPrpObj", propOrder = {
    "address",
    "custServiceLevel",
    "electronicContactPoint",
    "maxServiceLevelObj",
    "orgnization",
    "partyLinkman",
    "partyName",
    "partyRegistration",
    "relFlagObj",
    "telephone"
})
public class OrgnizationPrpObj {

    @XmlElement(nillable = true)
    protected List<Address> address;
    protected CustServiceLevel custServiceLevel;
    @XmlElement(nillable = true)
    protected List<ElectronicContactPoint> electronicContactPoint;
    protected MaxServiceLevelObj maxServiceLevelObj;
    protected Orgnization orgnization;
    @XmlElement(nillable = true)
    protected List<PartyLinkman> partyLinkman;
    @XmlElement(nillable = true)
    protected List<PartyName> partyName;
    @XmlElement(nillable = true)
    protected List<PartyRegistration> partyRegistration;
    protected RelFlagObj relFlagObj;
    @XmlElement(nillable = true)
    protected List<Telephone> telephone;

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * 
     * 
     */
    public List<Address> getAddress() {
        if (address == null) {
            address = new ArrayList<Address>();
        }
        return this.address;
    }

    /**
     * Gets the value of the custServiceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link CustServiceLevel }
     *     
     */
    public CustServiceLevel getCustServiceLevel() {
        return custServiceLevel;
    }

    /**
     * Sets the value of the custServiceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustServiceLevel }
     *     
     */
    public void setCustServiceLevel(CustServiceLevel value) {
        this.custServiceLevel = value;
    }

    /**
     * Gets the value of the electronicContactPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the electronicContactPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectronicContactPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectronicContactPoint }
     * 
     * 
     */
    public List<ElectronicContactPoint> getElectronicContactPoint() {
        if (electronicContactPoint == null) {
            electronicContactPoint = new ArrayList<ElectronicContactPoint>();
        }
        return this.electronicContactPoint;
    }

    /**
     * Gets the value of the maxServiceLevelObj property.
     * 
     * @return
     *     possible object is
     *     {@link MaxServiceLevelObj }
     *     
     */
    public MaxServiceLevelObj getMaxServiceLevelObj() {
        return maxServiceLevelObj;
    }

    /**
     * Sets the value of the maxServiceLevelObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxServiceLevelObj }
     *     
     */
    public void setMaxServiceLevelObj(MaxServiceLevelObj value) {
        this.maxServiceLevelObj = value;
    }

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
     * Gets the value of the partyLinkman property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyLinkman property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyLinkman().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyLinkman }
     * 
     * 
     */
    public List<PartyLinkman> getPartyLinkman() {
        if (partyLinkman == null) {
            partyLinkman = new ArrayList<PartyLinkman>();
        }
        return this.partyLinkman;
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

    /**
     * Gets the value of the relFlagObj property.
     * 
     * @return
     *     possible object is
     *     {@link RelFlagObj }
     *     
     */
    public RelFlagObj getRelFlagObj() {
        return relFlagObj;
    }

    /**
     * Sets the value of the relFlagObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelFlagObj }
     *     
     */
    public void setRelFlagObj(RelFlagObj value) {
        this.relFlagObj = value;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Telephone }
     * 
     * 
     */
    public List<Telephone> getTelephone() {
        if (telephone == null) {
            telephone = new ArrayList<Telephone>();
        }
        return this.telephone;
    }

}
