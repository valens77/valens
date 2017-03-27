
package com.founder.clpcecif.webservices.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCustSpecialLabelResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCustSpecialLabelResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="custSpecialLabel" type="{http://pub.services.ecif.clpc.com/}custSpecialLabel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="getCustSpecialLabelInput" type="{http://pub.services.ecif.clpc.com/}getCustSpecialLabelInput" minOccurs="0"/>
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
@XmlType(name = "getCustSpecialLabelResult", propOrder = {
    "custSpecialLabel",
    "getCustSpecialLabelInput",
    "rsCode",
    "rsDesc",
    "transactionNO"
})
public class GetCustSpecialLabelResult {

    @XmlElement(nillable = true)
    protected List<CustSpecialLabel> custSpecialLabel;
    protected GetCustSpecialLabelInput getCustSpecialLabelInput;
    protected Integer rsCode;
    protected String rsDesc;
    protected String transactionNO;

    /**
     * Gets the value of the custSpecialLabel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custSpecialLabel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustSpecialLabel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustSpecialLabel }
     * 
     * 
     */
    public List<CustSpecialLabel> getCustSpecialLabel() {
        if (custSpecialLabel == null) {
            custSpecialLabel = new ArrayList<CustSpecialLabel>();
        }
        return this.custSpecialLabel;
    }

    /**
     * Gets the value of the getCustSpecialLabelInput property.
     * 
     * @return
     *     possible object is
     *     {@link GetCustSpecialLabelInput }
     *     
     */
    public GetCustSpecialLabelInput getGetCustSpecialLabelInput() {
        return getCustSpecialLabelInput;
    }

    /**
     * Sets the value of the getCustSpecialLabelInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustSpecialLabelInput }
     *     
     */
    public void setGetCustSpecialLabelInput(GetCustSpecialLabelInput value) {
        this.getCustSpecialLabelInput = value;
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
