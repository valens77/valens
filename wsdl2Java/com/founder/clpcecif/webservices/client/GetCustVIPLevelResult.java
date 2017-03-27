
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCustVIPLevelResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCustVIPLevelResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="custVIPLevel" type="{http://pub.services.ecif.clpc.com/}custVIPLevel" minOccurs="0"/>
 *         &lt;element name="getCustVIPLevelInput" type="{http://pub.services.ecif.clpc.com/}getCustVIPLevelInput" minOccurs="0"/>
 *         &lt;element name="maxServiceLevelObj" type="{http://pub.services.ecif.clpc.com/}maxServiceLevelObj" minOccurs="0"/>
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
@XmlType(name = "getCustVIPLevelResult", propOrder = {
    "custVIPLevel",
    "getCustVIPLevelInput",
    "maxServiceLevelObj",
    "rsCode",
    "rsDesc",
    "transactionNO"
})
public class GetCustVIPLevelResult {

    protected CustVIPLevel custVIPLevel;
    protected GetCustVIPLevelInput getCustVIPLevelInput;
    protected MaxServiceLevelObj maxServiceLevelObj;
    protected Integer rsCode;
    protected String rsDesc;
    protected String transactionNO;

    /**
     * Gets the value of the custVIPLevel property.
     * 
     * @return
     *     possible object is
     *     {@link CustVIPLevel }
     *     
     */
    public CustVIPLevel getCustVIPLevel() {
        return custVIPLevel;
    }

    /**
     * Sets the value of the custVIPLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustVIPLevel }
     *     
     */
    public void setCustVIPLevel(CustVIPLevel value) {
        this.custVIPLevel = value;
    }

    /**
     * Gets the value of the getCustVIPLevelInput property.
     * 
     * @return
     *     possible object is
     *     {@link GetCustVIPLevelInput }
     *     
     */
    public GetCustVIPLevelInput getGetCustVIPLevelInput() {
        return getCustVIPLevelInput;
    }

    /**
     * Sets the value of the getCustVIPLevelInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustVIPLevelInput }
     *     
     */
    public void setGetCustVIPLevelInput(GetCustVIPLevelInput value) {
        this.getCustVIPLevelInput = value;
    }

    /**
     * Gets the value of the maxServiceLevelObj property.
     * 
     * @return
     *     possible object is
     *     {@link MaxServiceLevelObj }
     *     
     */
    public MaxServiceLevelObj getMaxServiceLevelObj() {
        return maxServiceLevelObj;
    }

    /**
     * Sets the value of the maxServiceLevelObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxServiceLevelObj }
     *     
     */
    public void setMaxServiceLevelObj(MaxServiceLevelObj value) {
        this.maxServiceLevelObj = value;
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
