
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createOrgnizationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createOrgnizationResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createOrgnizationInput" type="{http://pub.services.ecif.clpc.com/}createOrgnizationInput" minOccurs="0"/>
 *         &lt;element name="partyIdObj" type="{http://pub.services.ecif.clpc.com/}partyIdObj" minOccurs="0"/>
 *         &lt;element name="registIdObj" type="{http://pub.services.ecif.clpc.com/}registIdObj" minOccurs="0"/>
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
@XmlType(name = "createOrgnizationResult", propOrder = {
    "createOrgnizationInput",
    "partyIdObj",
    "registIdObj",
    "rsCode",
    "rsDesc",
    "transactionNO"
})
public class CreateOrgnizationResult {

    protected CreateOrgnizationInput createOrgnizationInput;
    protected PartyIdObj partyIdObj;
    protected RegistIdObj registIdObj;
    protected Integer rsCode;
    protected String rsDesc;
    protected String transactionNO;

    /**
     * Gets the value of the createOrgnizationInput property.
     * 
     * @return
     *     possible object is
     *     {@link CreateOrgnizationInput }
     *     
     */
    public CreateOrgnizationInput getCreateOrgnizationInput() {
        return createOrgnizationInput;
    }

    /**
     * Sets the value of the createOrgnizationInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateOrgnizationInput }
     *     
     */
    public void setCreateOrgnizationInput(CreateOrgnizationInput value) {
        this.createOrgnizationInput = value;
    }

    /**
     * Gets the value of the partyIdObj property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdObj }
     *     
     */
    public PartyIdObj getPartyIdObj() {
        return partyIdObj;
    }

    /**
     * Sets the value of the partyIdObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdObj }
     *     
     */
    public void setPartyIdObj(PartyIdObj value) {
        this.partyIdObj = value;
    }

    /**
     * Gets the value of the registIdObj property.
     * 
     * @return
     *     possible object is
     *     {@link RegistIdObj }
     *     
     */
    public RegistIdObj getRegistIdObj() {
        return registIdObj;
    }

    /**
     * Sets the value of the registIdObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistIdObj }
     *     
     */
    public void setRegistIdObj(RegistIdObj value) {
        this.registIdObj = value;
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
