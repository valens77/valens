
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deletePartyTeleByPhoneResResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deletePartyTeleByPhoneResResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deletePartyTeleByPhoneResInput" type="{http://pub.services.ecif.clpc.com/}deletePartyTeleByPhoneResInput" minOccurs="0"/>
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
@XmlType(name = "deletePartyTeleByPhoneResResult", propOrder = {
    "deletePartyTeleByPhoneResInput",
    "rsCode",
    "rsDesc",
    "transactionNO"
})
public class DeletePartyTeleByPhoneResResult {

    protected DeletePartyTeleByPhoneResInput deletePartyTeleByPhoneResInput;
    protected Integer rsCode;
    protected String rsDesc;
    protected String transactionNO;

    /**
     * Gets the value of the deletePartyTeleByPhoneResInput property.
     * 
     * @return
     *     possible object is
     *     {@link DeletePartyTeleByPhoneResInput }
     *     
     */
    public DeletePartyTeleByPhoneResInput getDeletePartyTeleByPhoneResInput() {
        return deletePartyTeleByPhoneResInput;
    }

    /**
     * Sets the value of the deletePartyTeleByPhoneResInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeletePartyTeleByPhoneResInput }
     *     
     */
    public void setDeletePartyTeleByPhoneResInput(DeletePartyTeleByPhoneResInput value) {
        this.deletePartyTeleByPhoneResInput = value;
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
