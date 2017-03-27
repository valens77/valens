
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCustServiceLevelMultiResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCustServiceLevelMultiResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getCustServiceLevelMultiInput" type="{http://pub.services.ecif.clpc.com/}getCustServiceLevelMultiInput" minOccurs="0"/>
 *         &lt;element name="rsCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rsDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceLevelComp" type="{http://pub.services.ecif.clpc.com/}serviceLevelComp" minOccurs="0"/>
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
@XmlType(name = "getCustServiceLevelMultiResult", propOrder = {
    "getCustServiceLevelMultiInput",
    "rsCode",
    "rsDesc",
    "serviceLevelComp",
    "transactionNO"
})
public class GetCustServiceLevelMultiResult {

    protected GetCustServiceLevelMultiInput getCustServiceLevelMultiInput;
    protected Integer rsCode;
    protected String rsDesc;
    protected ServiceLevelComp serviceLevelComp;
    protected String transactionNO;

    /**
     * Gets the value of the getCustServiceLevelMultiInput property.
     * 
     * @return
     *     possible object is
     *     {@link GetCustServiceLevelMultiInput }
     *     
     */
    public GetCustServiceLevelMultiInput getGetCustServiceLevelMultiInput() {
        return getCustServiceLevelMultiInput;
    }

    /**
     * Sets the value of the getCustServiceLevelMultiInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustServiceLevelMultiInput }
     *     
     */
    public void setGetCustServiceLevelMultiInput(GetCustServiceLevelMultiInput value) {
        this.getCustServiceLevelMultiInput = value;
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
     * Gets the value of the serviceLevelComp property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLevelComp }
     *     
     */
    public ServiceLevelComp getServiceLevelComp() {
        return serviceLevelComp;
    }

    /**
     * Sets the value of the serviceLevelComp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLevelComp }
     *     
     */
    public void setServiceLevelComp(ServiceLevelComp value) {
        this.serviceLevelComp = value;
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
