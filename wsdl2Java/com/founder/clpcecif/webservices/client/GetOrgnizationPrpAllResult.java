
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getOrgnizationPrpAllResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getOrgnizationPrpAllResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getOrgnizationPrpAllInput" type="{http://pub.services.ecif.clpc.com/}getOrgnizationPrpAllInput" minOccurs="0"/>
 *         &lt;element name="orgnizationPrpObj" type="{http://pub.services.ecif.clpc.com/}orgnizationPrpObj" minOccurs="0"/>
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
@XmlType(name = "getOrgnizationPrpAllResult", propOrder = {
    "getOrgnizationPrpAllInput",
    "orgnizationPrpObj",
    "rsCode",
    "rsDesc",
    "transactionNO"
})
public class GetOrgnizationPrpAllResult {

    protected GetOrgnizationPrpAllInput getOrgnizationPrpAllInput;
    protected OrgnizationPrpObj orgnizationPrpObj;
    protected Integer rsCode;
    protected String rsDesc;
    protected String transactionNO;

    /**
     * Gets the value of the getOrgnizationPrpAllInput property.
     * 
     * @return
     *     possible object is
     *     {@link GetOrgnizationPrpAllInput }
     *     
     */
    public GetOrgnizationPrpAllInput getGetOrgnizationPrpAllInput() {
        return getOrgnizationPrpAllInput;
    }

    /**
     * Sets the value of the getOrgnizationPrpAllInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetOrgnizationPrpAllInput }
     *     
     */
    public void setGetOrgnizationPrpAllInput(GetOrgnizationPrpAllInput value) {
        this.getOrgnizationPrpAllInput = value;
    }

    /**
     * Gets the value of the orgnizationPrpObj property.
     * 
     * @return
     *     possible object is
     *     {@link OrgnizationPrpObj }
     *     
     */
    public OrgnizationPrpObj getOrgnizationPrpObj() {
        return orgnizationPrpObj;
    }

    /**
     * Sets the value of the orgnizationPrpObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgnizationPrpObj }
     *     
     */
    public void setOrgnizationPrpObj(OrgnizationPrpObj value) {
        this.orgnizationPrpObj = value;
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
