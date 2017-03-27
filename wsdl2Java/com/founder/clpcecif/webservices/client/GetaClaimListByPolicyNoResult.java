
package com.founder.clpcecif.webservices.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getaClaimListByPolicyNoResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getaClaimListByPolicyNoResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="claim" type="{http://pub.services.ecif.clpc.com/}claim" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="getaClaimListByPolicyNoInput" type="{http://pub.services.ecif.clpc.com/}getaClaimListByPolicyNoInput" minOccurs="0"/>
 *         &lt;element name="pageOutput" type="{http://pub.services.ecif.clpc.com/}pageOutput" minOccurs="0"/>
 *         &lt;element name="rsCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rsDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "getaClaimListByPolicyNoResult", propOrder = {
    "claim",
    "getaClaimListByPolicyNoInput",
    "pageOutput",
    "rsCode",
    "rsDesc",
    "transactionNO"
})
public class GetaClaimListByPolicyNoResult {

    @XmlElement(nillable = true)
    protected List<Claim> claim;
    protected GetaClaimListByPolicyNoInput getaClaimListByPolicyNoInput;
    protected PageOutput pageOutput;
    protected Integer rsCode;
    protected String rsDesc;
    protected String transactionNO;

    /**
     * Gets the value of the claim property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claim property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaim().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Claim }
     * 
     * 
     */
    public List<Claim> getClaim() {
        if (claim == null) {
            claim = new ArrayList<Claim>();
        }
        return this.claim;
    }

    /**
     * Gets the value of the getaClaimListByPolicyNoInput property.
     * 
     * @return
     *     possible object is
     *     {@link GetaClaimListByPolicyNoInput }
     *     
     */
    public GetaClaimListByPolicyNoInput getGetaClaimListByPolicyNoInput() {
        return getaClaimListByPolicyNoInput;
    }

    /**
     * Sets the value of the getaClaimListByPolicyNoInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetaClaimListByPolicyNoInput }
     *     
     */
    public void setGetaClaimListByPolicyNoInput(GetaClaimListByPolicyNoInput value) {
        this.getaClaimListByPolicyNoInput = value;
    }

    /**
     * Gets the value of the pageOutput property.
     * 
     * @return
     *     possible object is
     *     {@link PageOutput }
     *     
     */
    public PageOutput getPageOutput() {
        return pageOutput;
    }

    /**
     * Sets the value of the pageOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageOutput }
     *     
     */
    public void setPageOutput(PageOutput value) {
        this.pageOutput = value;
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
