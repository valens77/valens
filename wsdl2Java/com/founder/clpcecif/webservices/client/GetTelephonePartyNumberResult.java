
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTelephonePartyNumberResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTelephonePartyNumberResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getTelephonePartyNumberInput" type="{http://pub.services.ecif.clpc.com/}getTelephonePartyNumberInput" minOccurs="0"/>
 *         &lt;element name="rsCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rsDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telePartyNumberOutObject" type="{http://pub.services.ecif.clpc.com/}telePartyNumberOutObject" minOccurs="0"/>
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
@XmlType(name = "getTelephonePartyNumberResult", propOrder = {
    "getTelephonePartyNumberInput",
    "rsCode",
    "rsDesc",
    "telePartyNumberOutObject",
    "transactionNO"
})
public class GetTelephonePartyNumberResult {

    protected GetTelephonePartyNumberInput getTelephonePartyNumberInput;
    protected Integer rsCode;
    protected String rsDesc;
    protected TelePartyNumberOutObject telePartyNumberOutObject;
    protected String transactionNO;

    /**
     * Gets the value of the getTelephonePartyNumberInput property.
     * 
     * @return
     *     possible object is
     *     {@link GetTelephonePartyNumberInput }
     *     
     */
    public GetTelephonePartyNumberInput getGetTelephonePartyNumberInput() {
        return getTelephonePartyNumberInput;
    }

    /**
     * Sets the value of the getTelephonePartyNumberInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTelephonePartyNumberInput }
     *     
     */
    public void setGetTelephonePartyNumberInput(GetTelephonePartyNumberInput value) {
        this.getTelephonePartyNumberInput = value;
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
     * Gets the value of the telePartyNumberOutObject property.
     * 
     * @return
     *     possible object is
     *     {@link TelePartyNumberOutObject }
     *     
     */
    public TelePartyNumberOutObject getTelePartyNumberOutObject() {
        return telePartyNumberOutObject;
    }

    /**
     * Sets the value of the telePartyNumberOutObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelePartyNumberOutObject }
     *     
     */
    public void setTelePartyNumberOutObject(TelePartyNumberOutObject value) {
        this.telePartyNumberOutObject = value;
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
