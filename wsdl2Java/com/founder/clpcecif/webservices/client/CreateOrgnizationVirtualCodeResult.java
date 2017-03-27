
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createOrgnizationVirtualCodeResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createOrgnizationVirtualCodeResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createOrgnizationVirtualCodeInput" type="{http://pub.services.ecif.clpc.com/}createOrgnizationVirtualCodeInput" minOccurs="0"/>
 *         &lt;element name="rsCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rsDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="virtualCodeObj" type="{http://pub.services.ecif.clpc.com/}virtualCodeObj" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createOrgnizationVirtualCodeResult", propOrder = {
    "createOrgnizationVirtualCodeInput",
    "rsCode",
    "rsDesc",
    "transactionNO",
    "virtualCodeObj"
})
public class CreateOrgnizationVirtualCodeResult {

    protected CreateOrgnizationVirtualCodeInput createOrgnizationVirtualCodeInput;
    protected Integer rsCode;
    protected String rsDesc;
    protected String transactionNO;
    protected VirtualCodeObj virtualCodeObj;

    /**
     * Gets the value of the createOrgnizationVirtualCodeInput property.
     * 
     * @return
     *     possible object is
     *     {@link CreateOrgnizationVirtualCodeInput }
     *     
     */
    public CreateOrgnizationVirtualCodeInput getCreateOrgnizationVirtualCodeInput() {
        return createOrgnizationVirtualCodeInput;
    }

    /**
     * Sets the value of the createOrgnizationVirtualCodeInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateOrgnizationVirtualCodeInput }
     *     
     */
    public void setCreateOrgnizationVirtualCodeInput(CreateOrgnizationVirtualCodeInput value) {
        this.createOrgnizationVirtualCodeInput = value;
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

    /**
     * Gets the value of the virtualCodeObj property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualCodeObj }
     *     
     */
    public VirtualCodeObj getVirtualCodeObj() {
        return virtualCodeObj;
    }

    /**
     * Sets the value of the virtualCodeObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualCodeObj }
     *     
     */
    public void setVirtualCodeObj(VirtualCodeObj value) {
        this.virtualCodeObj = value;
    }

}
