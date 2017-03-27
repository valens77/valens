
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for maintainPhoneFilterConfigResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="maintainPhoneFilterConfigResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maintainPhoneFilterConfigInput" type="{http://pub.services.ecif.clpc.com/}maintainPhoneFilterConfigInput" minOccurs="0"/>
 *         &lt;element name="phoneFilterConfig" type="{http://pub.services.ecif.clpc.com/}phoneFilterConfig" minOccurs="0"/>
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
@XmlType(name = "maintainPhoneFilterConfigResult", propOrder = {
    "maintainPhoneFilterConfigInput",
    "phoneFilterConfig",
    "rsCode",
    "rsDesc",
    "transactionNO"
})
public class MaintainPhoneFilterConfigResult {

    protected MaintainPhoneFilterConfigInput maintainPhoneFilterConfigInput;
    protected PhoneFilterConfig phoneFilterConfig;
    protected Integer rsCode;
    protected String rsDesc;
    protected String transactionNO;

    /**
     * Gets the value of the maintainPhoneFilterConfigInput property.
     * 
     * @return
     *     possible object is
     *     {@link MaintainPhoneFilterConfigInput }
     *     
     */
    public MaintainPhoneFilterConfigInput getMaintainPhoneFilterConfigInput() {
        return maintainPhoneFilterConfigInput;
    }

    /**
     * Sets the value of the maintainPhoneFilterConfigInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintainPhoneFilterConfigInput }
     *     
     */
    public void setMaintainPhoneFilterConfigInput(MaintainPhoneFilterConfigInput value) {
        this.maintainPhoneFilterConfigInput = value;
    }

    /**
     * Gets the value of the phoneFilterConfig property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneFilterConfig }
     *     
     */
    public PhoneFilterConfig getPhoneFilterConfig() {
        return phoneFilterConfig;
    }

    /**
     * Sets the value of the phoneFilterConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneFilterConfig }
     *     
     */
    public void setPhoneFilterConfig(PhoneFilterConfig value) {
        this.phoneFilterConfig = value;
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
