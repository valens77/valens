
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCustServiceLevelResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCustServiceLevelResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="custServiceLevel" type="{http://pub.services.ecif.clpc.com/}custServiceLevel" minOccurs="0"/>
 *         &lt;element name="getCustServiceLevelInput" type="{http://pub.services.ecif.clpc.com/}getCustServiceLevelInput" minOccurs="0"/>
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
@XmlType(name = "getCustServiceLevelResult", propOrder = {
    "custServiceLevel",
    "getCustServiceLevelInput",
    "maxServiceLevelObj",
    "rsCode",
    "rsDesc",
    "transactionNO"
})
public class GetCustServiceLevelResult {

    protected CustServiceLevel custServiceLevel;
    protected GetCustServiceLevelInput getCustServiceLevelInput;
    protected MaxServiceLevelObj maxServiceLevelObj;
    protected Integer rsCode;
    protected String rsDesc;
    protected String transactionNO;

    /**
     * Gets the value of the custServiceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link CustServiceLevel }
     *     
     */
    public CustServiceLevel getCustServiceLevel() {
        return custServiceLevel;
    }

    /**
     * Sets the value of the custServiceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustServiceLevel }
     *     
     */
    public void setCustServiceLevel(CustServiceLevel value) {
        this.custServiceLevel = value;
    }

    /**
     * Gets the value of the getCustServiceLevelInput property.
     * 
     * @return
     *     possible object is
     *     {@link GetCustServiceLevelInput }
     *     
     */
    public GetCustServiceLevelInput getGetCustServiceLevelInput() {
        return getCustServiceLevelInput;
    }

    /**
     * Sets the value of the getCustServiceLevelInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustServiceLevelInput }
     *     
     */
    public void setGetCustServiceLevelInput(GetCustServiceLevelInput value) {
        this.getCustServiceLevelInput = value;
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
