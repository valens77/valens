
package com.founder.clpcecif.webservices.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchRoleListByPartyIdResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchRoleListByPartyIdResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partyRoleObj" type="{http://pub.services.ecif.clpc.com/}partyRoleObj" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rsCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rsDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchRoleListByPartyIdInput" type="{http://pub.services.ecif.clpc.com/}searchRoleListByPartyIdInput" minOccurs="0"/>
 *         &lt;element name="transactionNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchRoleListByPartyIdResult", propOrder = {
    "partyRoleObj",
    "rsCode",
    "rsDesc",
    "searchRoleListByPartyIdInput",
    "transactionNO"
})
public class SearchRoleListByPartyIdResult {

    @XmlElement(nillable = true)
    protected List<PartyRoleObj> partyRoleObj;
    protected Integer rsCode;
    protected String rsDesc;
    protected SearchRoleListByPartyIdInput searchRoleListByPartyIdInput;
    protected String transactionNO;

    /**
     * Gets the value of the partyRoleObj property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyRoleObj property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyRoleObj().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyRoleObj }
     * 
     * 
     */
    public List<PartyRoleObj> getPartyRoleObj() {
        if (partyRoleObj == null) {
            partyRoleObj = new ArrayList<PartyRoleObj>();
        }
        return this.partyRoleObj;
    }

    /**
     * Gets the value of the rsCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRsCode() {
        return rsCode;
    }

    /**
     * Sets the value of the rsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRsCode(Integer value) {
        this.rsCode = value;
    }

    /**
     * Gets the value of the rsDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsDesc() {
        return rsDesc;
    }

    /**
     * Sets the value of the rsDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsDesc(String value) {
        this.rsDesc = value;
    }

    /**
     * Gets the value of the searchRoleListByPartyIdInput property.
     * 
     * @return
     *     possible object is
     *     {@link SearchRoleListByPartyIdInput }
     *     
     */
    public SearchRoleListByPartyIdInput getSearchRoleListByPartyIdInput() {
        return searchRoleListByPartyIdInput;
    }

    /**
     * Sets the value of the searchRoleListByPartyIdInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchRoleListByPartyIdInput }
     *     
     */
    public void setSearchRoleListByPartyIdInput(SearchRoleListByPartyIdInput value) {
        this.searchRoleListByPartyIdInput = value;
    }

    /**
     * Gets the value of the transactionNO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionNO() {
        return transactionNO;
    }

    /**
     * Sets the value of the transactionNO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionNO(String value) {
        this.transactionNO = value;
    }

}
