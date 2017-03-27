
package com.founder.clpcecif.webservices.jyx.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoanInfoEhm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanInfoEhm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loanAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanContractNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanNature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanInfoEhm", propOrder = {
    "loanAmount",
    "loanBankCode",
    "loanContractNo",
    "loanEndDate",
    "loanNature",
    "loanStartDate"
})
public class LoanInfoEhm {

    @XmlElementRef(name = "loanAmount", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> loanAmount;
    @XmlElementRef(name = "loanBankCode", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> loanBankCode;
    @XmlElementRef(name = "loanContractNo", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> loanContractNo;
    @XmlElementRef(name = "loanEndDate", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> loanEndDate;
    @XmlElementRef(name = "loanNature", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> loanNature;
    @XmlElementRef(name = "loanStartDate", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> loanStartDate;

    /**
     * Gets the value of the loanAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLoanAmount() {
        return loanAmount;
    }

    /**
     * Sets the value of the loanAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLoanAmount(JAXBElement<String> value) {
        this.loanAmount = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the loanBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLoanBankCode() {
        return loanBankCode;
    }

    /**
     * Sets the value of the loanBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLoanBankCode(JAXBElement<String> value) {
        this.loanBankCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the loanContractNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLoanContractNo() {
        return loanContractNo;
    }

    /**
     * Sets the value of the loanContractNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLoanContractNo(JAXBElement<String> value) {
        this.loanContractNo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the loanEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLoanEndDate() {
        return loanEndDate;
    }

    /**
     * Sets the value of the loanEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLoanEndDate(JAXBElement<String> value) {
        this.loanEndDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the loanNature property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLoanNature() {
        return loanNature;
    }

    /**
     * Sets the value of the loanNature property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLoanNature(JAXBElement<String> value) {
        this.loanNature = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the loanStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLoanStartDate() {
        return loanStartDate;
    }

    /**
     * Sets the value of the loanStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLoanStartDate(JAXBElement<String> value) {
        this.loanStartDate = ((JAXBElement<String> ) value);
    }

}
