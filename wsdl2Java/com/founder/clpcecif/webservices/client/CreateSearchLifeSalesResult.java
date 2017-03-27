
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createSearchLifeSalesResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createSearchLifeSalesResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createSearchLifeSalesInput" type="{http://pub.services.ecif.clpc.com/}createSearchLifeSalesInput" minOccurs="0"/>
 *         &lt;element name="lifeSalesIdObj" type="{http://pub.services.ecif.clpc.com/}lifeSalesIdObj" minOccurs="0"/>
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
@XmlType(name = "createSearchLifeSalesResult", propOrder = {
    "createSearchLifeSalesInput",
    "lifeSalesIdObj",
    "rsCode",
    "rsDesc",
    "transactionNO"
})
public class CreateSearchLifeSalesResult {

    protected CreateSearchLifeSalesInput createSearchLifeSalesInput;
    protected LifeSalesIdObj lifeSalesIdObj;
    protected Integer rsCode;
    protected String rsDesc;
    protected String transactionNO;

    /**
     * Gets the value of the createSearchLifeSalesInput property.
     * 
     * @return
     *     possible object is
     *     {@link CreateSearchLifeSalesInput }
     *     
     */
    public CreateSearchLifeSalesInput getCreateSearchLifeSalesInput() {
        return createSearchLifeSalesInput;
    }

    /**
     * Sets the value of the createSearchLifeSalesInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateSearchLifeSalesInput }
     *     
     */
    public void setCreateSearchLifeSalesInput(CreateSearchLifeSalesInput value) {
        this.createSearchLifeSalesInput = value;
    }

    /**
     * Gets the value of the lifeSalesIdObj property.
     * 
     * @return
     *     possible object is
     *     {@link LifeSalesIdObj }
     *     
     */
    public LifeSalesIdObj getLifeSalesIdObj() {
        return lifeSalesIdObj;
    }

    /**
     * Sets the value of the lifeSalesIdObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeSalesIdObj }
     *     
     */
    public void setLifeSalesIdObj(LifeSalesIdObj value) {
        this.lifeSalesIdObj = value;
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
