
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getIndividualPrpAllResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getIndividualPrpAllResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getIndividualPrpAllInput" type="{http://pub.services.ecif.clpc.com/}getIndividualPrpAllInput" minOccurs="0"/>
 *         &lt;element name="individualPrpObjTag" type="{http://pub.services.ecif.clpc.com/}individualPrpObjTag" minOccurs="0"/>
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
@XmlType(name = "getIndividualPrpAllResult", propOrder = {
    "getIndividualPrpAllInput",
    "individualPrpObjTag",
    "rsCode",
    "rsDesc",
    "transactionNO"
})
public class GetIndividualPrpAllResult {

    protected GetIndividualPrpAllInput getIndividualPrpAllInput;
    protected IndividualPrpObjTag individualPrpObjTag;
    protected Integer rsCode;
    protected String rsDesc;
    protected String transactionNO;

    /**
     * Gets the value of the getIndividualPrpAllInput property.
     * 
     * @return
     *     possible object is
     *     {@link GetIndividualPrpAllInput }
     *     
     */
    public GetIndividualPrpAllInput getGetIndividualPrpAllInput() {
        return getIndividualPrpAllInput;
    }

    /**
     * Sets the value of the getIndividualPrpAllInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetIndividualPrpAllInput }
     *     
     */
    public void setGetIndividualPrpAllInput(GetIndividualPrpAllInput value) {
        this.getIndividualPrpAllInput = value;
    }

    /**
     * Gets the value of the individualPrpObjTag property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPrpObjTag }
     *     
     */
    public IndividualPrpObjTag getIndividualPrpObjTag() {
        return individualPrpObjTag;
    }

    /**
     * Sets the value of the individualPrpObjTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPrpObjTag }
     *     
     */
    public void setIndividualPrpObjTag(IndividualPrpObjTag value) {
        this.individualPrpObjTag = value;
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
