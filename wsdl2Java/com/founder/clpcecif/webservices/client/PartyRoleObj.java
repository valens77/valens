
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for partyRoleObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="partyRoleObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lawer" type="{http://pub.services.ecif.clpc.com/}lawer" minOccurs="0"/>
 *         &lt;element name="lifeSales" type="{http://pub.services.ecif.clpc.com/}lifeSales" minOccurs="0"/>
 *         &lt;element name="orgAgent" type="{http://pub.services.ecif.clpc.com/}orgAgent" minOccurs="0"/>
 *         &lt;element name="partyRole" type="{http://pub.services.ecif.clpc.com/}partyRole" minOccurs="0"/>
 *         &lt;element name="personalAgent" type="{http://pub.services.ecif.clpc.com/}personalAgent" minOccurs="0"/>
 *         &lt;element name="reinsurer" type="{http://pub.services.ecif.clpc.com/}reinsurer" minOccurs="0"/>
 *         &lt;element name="repairFactory" type="{http://pub.services.ecif.clpc.com/}repairFactory" minOccurs="0"/>
 *         &lt;element name="vendor" type="{http://pub.services.ecif.clpc.com/}vendor" minOccurs="0"/>
 *         &lt;element name="pCSales" type="{http://pub.services.ecif.clpc.com/}pcSales" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partyRoleObj", propOrder = {
    "lawer",
    "lifeSales",
    "orgAgent",
    "partyRole",
    "personalAgent",
    "reinsurer",
    "repairFactory",
    "vendor",
    "pcSales"
})
public class PartyRoleObj {

    protected Lawer lawer;
    protected LifeSales lifeSales;
    protected OrgAgent orgAgent;
    protected PartyRole partyRole;
    protected PersonalAgent personalAgent;
    protected Reinsurer reinsurer;
    protected RepairFactory repairFactory;
    protected Vendor vendor;
    @XmlElement(name = "pCSales")
    protected PcSales pcSales;

    /**
     * Gets the value of the lawer property.
     * 
     * @return
     *     possible object is
     *     {@link Lawer }
     *     
     */
    public Lawer getLawer() {
        return lawer;
    }

    /**
     * Sets the value of the lawer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lawer }
     *     
     */
    public void setLawer(Lawer value) {
        this.lawer = value;
    }

    /**
     * Gets the value of the lifeSales property.
     * 
     * @return
     *     possible object is
     *     {@link LifeSales }
     *     
     */
    public LifeSales getLifeSales() {
        return lifeSales;
    }

    /**
     * Sets the value of the lifeSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeSales }
     *     
     */
    public void setLifeSales(LifeSales value) {
        this.lifeSales = value;
    }

    /**
     * Gets the value of the orgAgent property.
     * 
     * @return
     *     possible object is
     *     {@link OrgAgent }
     *     
     */
    public OrgAgent getOrgAgent() {
        return orgAgent;
    }

    /**
     * Sets the value of the orgAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgAgent }
     *     
     */
    public void setOrgAgent(OrgAgent value) {
        this.orgAgent = value;
    }

    /**
     * Gets the value of the partyRole property.
     * 
     * @return
     *     possible object is
     *     {@link PartyRole }
     *     
     */
    public PartyRole getPartyRole() {
        return partyRole;
    }

    /**
     * Sets the value of the partyRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRole }
     *     
     */
    public void setPartyRole(PartyRole value) {
        this.partyRole = value;
    }

    /**
     * Gets the value of the personalAgent property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalAgent }
     *     
     */
    public PersonalAgent getPersonalAgent() {
        return personalAgent;
    }

    /**
     * Sets the value of the personalAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalAgent }
     *     
     */
    public void setPersonalAgent(PersonalAgent value) {
        this.personalAgent = value;
    }

    /**
     * Gets the value of the reinsurer property.
     * 
     * @return
     *     possible object is
     *     {@link Reinsurer }
     *     
     */
    public Reinsurer getReinsurer() {
        return reinsurer;
    }

    /**
     * Sets the value of the reinsurer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reinsurer }
     *     
     */
    public void setReinsurer(Reinsurer value) {
        this.reinsurer = value;
    }

    /**
     * Gets the value of the repairFactory property.
     * 
     * @return
     *     possible object is
     *     {@link RepairFactory }
     *     
     */
    public RepairFactory getRepairFactory() {
        return repairFactory;
    }

    /**
     * Sets the value of the repairFactory property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairFactory }
     *     
     */
    public void setRepairFactory(RepairFactory value) {
        this.repairFactory = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link Vendor }
     *     
     */
    public Vendor getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vendor }
     *     
     */
    public void setVendor(Vendor value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the pcSales property.
     * 
     * @return
     *     possible object is
     *     {@link PcSales }
     *     
     */
    public PcSales getPCSales() {
        return pcSales;
    }

    /**
     * Sets the value of the pcSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link PcSales }
     *     
     */
    public void setPCSales(PcSales value) {
        this.pcSales = value;
    }

}
