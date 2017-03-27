
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCustAffiliatedFlagResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCustAffiliatedFlagResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getCustAffiliatedFlagInput" type="{http://pub.services.ecif.clpc.com/}getCustAffiliatedFlagInput" minOccurs="0"/>
 *         &lt;element name="relFlagObj" type="{http://pub.services.ecif.clpc.com/}relFlagObj" minOccurs="0"/>
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
@XmlType(name = "getCustAffiliatedFlagResult", propOrder = {
    "getCustAffiliatedFlagInput",
    "relFlagObj",
    "rsCode",
    "rsDesc",
    "transactionNO"
})
public class GetCustAffiliatedFlagResult {

    protected GetCustAffiliatedFlagInput getCustAffiliatedFlagInput;
    protected RelFlagObj relFlagObj;
    protected Integer rsCode;
    protected String rsDesc;
    protected String transactionNO;

    /**
     * Gets the value of the getCustAffiliatedFlagInput property.
     * 
     * @return
     *     possible object is
     *     {@link GetCustAffiliatedFlagInput }
     *     
     */
    public GetCustAffiliatedFlagInput getGetCustAffiliatedFlagInput() {
        return getCustAffiliatedFlagInput;
    }

    /**
     * Sets the value of the getCustAffiliatedFlagInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustAffiliatedFlagInput }
     *     
     */
    public void setGetCustAffiliatedFlagInput(GetCustAffiliatedFlagInput value) {
        this.getCustAffiliatedFlagInput = value;
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
