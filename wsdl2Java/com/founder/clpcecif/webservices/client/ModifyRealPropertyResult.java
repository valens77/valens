
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modifyRealPropertyResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modifyRealPropertyResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modifyRealPropertyInput" type="{http://pub.services.ecif.clpc.com/}modifyRealPropertyInput" minOccurs="0"/>
 *         &lt;element name="realProperty" type="{http://pub.services.ecif.clpc.com/}realProperty" minOccurs="0"/>
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
@XmlType(name = "modifyRealPropertyResult", propOrder = {
    "modifyRealPropertyInput",
    "realProperty",
    "rsCode",
    "rsDesc",
    "transactionNO"
})
public class ModifyRealPropertyResult {

    protected ModifyRealPropertyInput modifyRealPropertyInput;
    protected RealProperty realProperty;
    protected Integer rsCode;
    protected String rsDesc;
    protected String transactionNO;

    /**
     * Gets the value of the modifyRealPropertyInput property.
     * 
     * @return
     *     possible object is
     *     {@link ModifyRealPropertyInput }
     *     
     */
    public ModifyRealPropertyInput getModifyRealPropertyInput() {
        return modifyRealPropertyInput;
    }

    /**
     * Sets the value of the modifyRealPropertyInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyRealPropertyInput }
     *     
     */
    public void setModifyRealPropertyInput(ModifyRealPropertyInput value) {
        this.modifyRealPropertyInput = value;
    }

    /**
     * Gets the value of the realProperty property.
     * 
     * @return
     *     possible object is
     *     {@link RealProperty }
     *     
     */
    public RealProperty getRealProperty() {
        return realProperty;
    }

    /**
     * Sets the value of the realProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealProperty }
     *     
     */
    public void setRealProperty(RealProperty value) {
        this.realProperty = value;
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
