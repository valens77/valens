
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modifyServiceCardLifeResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modifyServiceCardLifeResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modifyServiceCardLifeInput" type="{http://pub.services.ecif.clpc.com/}modifyServiceCardLifeInput" minOccurs="0"/>
 *         &lt;element name="rsCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rsDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceCard" type="{http://pub.services.ecif.clpc.com/}serviceCard" minOccurs="0"/>
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
@XmlType(name = "modifyServiceCardLifeResult", propOrder = {
    "modifyServiceCardLifeInput",
    "rsCode",
    "rsDesc",
    "serviceCard",
    "transactionNO"
})
public class ModifyServiceCardLifeResult {

    protected ModifyServiceCardLifeInput modifyServiceCardLifeInput;
    protected Integer rsCode;
    protected String rsDesc;
    protected ServiceCard serviceCard;
    protected String transactionNO;

    /**
     * Gets the value of the modifyServiceCardLifeInput property.
     * 
     * @return
     *     possible object is
     *     {@link ModifyServiceCardLifeInput }
     *     
     */
    public ModifyServiceCardLifeInput getModifyServiceCardLifeInput() {
        return modifyServiceCardLifeInput;
    }

    /**
     * Sets the value of the modifyServiceCardLifeInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyServiceCardLifeInput }
     *     
     */
    public void setModifyServiceCardLifeInput(ModifyServiceCardLifeInput value) {
        this.modifyServiceCardLifeInput = value;
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
     * Gets the value of the serviceCard property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCard }
     *     
     */
    public ServiceCard getServiceCard() {
        return serviceCard;
    }

    /**
     * Sets the value of the serviceCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCard }
     *     
     */
    public void setServiceCard(ServiceCard value) {
        this.serviceCard = value;
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
