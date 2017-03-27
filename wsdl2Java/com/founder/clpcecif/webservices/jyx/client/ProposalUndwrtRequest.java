
package com.founder.clpcecif.webservices.jyx.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProposalUndwrtRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProposalUndwrtRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicantEhm" type="{http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd}ApplicantEhm" minOccurs="0"/>
 *         &lt;element name="benefitEhmList" type="{http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd}BenefitLoanEhm" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dataSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dealCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insuredEhm" type="{http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd}InsuredEhm" minOccurs="0"/>
 *         &lt;element name="itemKindAddrEhm" type="{http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd}ItemKindAddrEhm" minOccurs="0"/>
 *         &lt;element name="limitEhm" type="{http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd}LimitEhm" minOccurs="0"/>
 *         &lt;element name="loanInfoEhm" type="{http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd}LoanInfoEhm" minOccurs="0"/>
 *         &lt;element name="mainEhm" type="{http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd}MainEhm" minOccurs="0"/>
 *         &lt;element name="operteLogEhm" type="{http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd}OperteLogEhm" minOccurs="0"/>
 *         &lt;element name="pwd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salerInfoEhm" type="{http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd}SalerInfoEhm" minOccurs="0"/>
 *         &lt;element name="specialInfoEhm" type="{http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd}SpecialInfoEhm" minOccurs="0"/>
 *         &lt;element name="systemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProposalUndwrtRequest", namespace = "http://dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", propOrder = {
    "applicantEhm",
    "benefitEhmList",
    "dataSource",
    "dealCode",
    "insuredEhm",
    "itemKindAddrEhm",
    "limitEhm",
    "loanInfoEhm",
    "mainEhm",
    "operteLogEhm",
    "pwd",
    "requestType",
    "salerInfoEhm",
    "specialInfoEhm",
    "systemCode",
    "userName"
})
public class ProposalUndwrtRequest {

    @XmlElementRef(name = "applicantEhm", namespace = "http://dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<ApplicantEhm> applicantEhm;
    @XmlElement(nillable = true)
    protected List<BenefitLoanEhm> benefitEhmList;
    @XmlElementRef(name = "dataSource", namespace = "http://dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> dataSource;
    @XmlElementRef(name = "dealCode", namespace = "http://dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> dealCode;
    @XmlElementRef(name = "insuredEhm", namespace = "http://dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<InsuredEhm> insuredEhm;
    @XmlElementRef(name = "itemKindAddrEhm", namespace = "http://dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<ItemKindAddrEhm> itemKindAddrEhm;
    @XmlElementRef(name = "limitEhm", namespace = "http://dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<LimitEhm> limitEhm;
    @XmlElementRef(name = "loanInfoEhm", namespace = "http://dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<LoanInfoEhm> loanInfoEhm;
    @XmlElementRef(name = "mainEhm", namespace = "http://dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<MainEhm> mainEhm;
    @XmlElementRef(name = "operteLogEhm", namespace = "http://dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<OperteLogEhm> operteLogEhm;
    @XmlElementRef(name = "pwd", namespace = "http://dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> pwd;
    @XmlElementRef(name = "requestType", namespace = "http://dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> requestType;
    @XmlElementRef(name = "salerInfoEhm", namespace = "http://dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<SalerInfoEhm> salerInfoEhm;
    @XmlElementRef(name = "specialInfoEhm", namespace = "http://dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<SpecialInfoEhm> specialInfoEhm;
    @XmlElementRef(name = "systemCode", namespace = "http://dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> systemCode;
    @XmlElementRef(name = "userName", namespace = "http://dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> userName;

    /**
     * Gets the value of the applicantEhm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ApplicantEhm }{@code >}
     *     
     */
    public JAXBElement<ApplicantEhm> getApplicantEhm() {
        return applicantEhm;
    }

    /**
     * Sets the value of the applicantEhm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ApplicantEhm }{@code >}
     *     
     */
    public void setApplicantEhm(JAXBElement<ApplicantEhm> value) {
        this.applicantEhm = ((JAXBElement<ApplicantEhm> ) value);
    }

    /**
     * Gets the value of the benefitEhmList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the benefitEhmList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBenefitEhmList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BenefitLoanEhm }
     * 
     * 
     */
    public List<BenefitLoanEhm> getBenefitEhmList() {
        if (benefitEhmList == null) {
            benefitEhmList = new ArrayList<BenefitLoanEhm>();
        }
        return this.benefitEhmList;
    }

    /**
     * Gets the value of the dataSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataSource() {
        return dataSource;
    }

    /**
     * Sets the value of the dataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataSource(JAXBElement<String> value) {
        this.dataSource = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dealCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDealCode() {
        return dealCode;
    }

    /**
     * Sets the value of the dealCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDealCode(JAXBElement<String> value) {
        this.dealCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the insuredEhm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InsuredEhm }{@code >}
     *     
     */
    public JAXBElement<InsuredEhm> getInsuredEhm() {
        return insuredEhm;
    }

    /**
     * Sets the value of the insuredEhm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InsuredEhm }{@code >}
     *     
     */
    public void setInsuredEhm(JAXBElement<InsuredEhm> value) {
        this.insuredEhm = ((JAXBElement<InsuredEhm> ) value);
    }

    /**
     * Gets the value of the itemKindAddrEhm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ItemKindAddrEhm }{@code >}
     *     
     */
    public JAXBElement<ItemKindAddrEhm> getItemKindAddrEhm() {
        return itemKindAddrEhm;
    }

    /**
     * Sets the value of the itemKindAddrEhm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ItemKindAddrEhm }{@code >}
     *     
     */
    public void setItemKindAddrEhm(JAXBElement<ItemKindAddrEhm> value) {
        this.itemKindAddrEhm = ((JAXBElement<ItemKindAddrEhm> ) value);
    }

    /**
     * Gets the value of the limitEhm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LimitEhm }{@code >}
     *     
     */
    public JAXBElement<LimitEhm> getLimitEhm() {
        return limitEhm;
    }

    /**
     * Sets the value of the limitEhm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LimitEhm }{@code >}
     *     
     */
    public void setLimitEhm(JAXBElement<LimitEhm> value) {
        this.limitEhm = ((JAXBElement<LimitEhm> ) value);
    }

    /**
     * Gets the value of the loanInfoEhm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LoanInfoEhm }{@code >}
     *     
     */
    public JAXBElement<LoanInfoEhm> getLoanInfoEhm() {
        return loanInfoEhm;
    }

    /**
     * Sets the value of the loanInfoEhm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LoanInfoEhm }{@code >}
     *     
     */
    public void setLoanInfoEhm(JAXBElement<LoanInfoEhm> value) {
        this.loanInfoEhm = ((JAXBElement<LoanInfoEhm> ) value);
    }

    /**
     * Gets the value of the mainEhm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MainEhm }{@code >}
     *     
     */
    public JAXBElement<MainEhm> getMainEhm() {
        return mainEhm;
    }

    /**
     * Sets the value of the mainEhm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MainEhm }{@code >}
     *     
     */
    public void setMainEhm(JAXBElement<MainEhm> value) {
        this.mainEhm = ((JAXBElement<MainEhm> ) value);
    }

    /**
     * Gets the value of the operteLogEhm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OperteLogEhm }{@code >}
     *     
     */
    public JAXBElement<OperteLogEhm> getOperteLogEhm() {
        return operteLogEhm;
    }

    /**
     * Sets the value of the operteLogEhm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OperteLogEhm }{@code >}
     *     
     */
    public void setOperteLogEhm(JAXBElement<OperteLogEhm> value) {
        this.operteLogEhm = ((JAXBElement<OperteLogEhm> ) value);
    }

    /**
     * Gets the value of the pwd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPwd() {
        return pwd;
    }

    /**
     * Sets the value of the pwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPwd(JAXBElement<String> value) {
        this.pwd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequestType(JAXBElement<String> value) {
        this.requestType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the salerInfoEhm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SalerInfoEhm }{@code >}
     *     
     */
    public JAXBElement<SalerInfoEhm> getSalerInfoEhm() {
        return salerInfoEhm;
    }

    /**
     * Sets the value of the salerInfoEhm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SalerInfoEhm }{@code >}
     *     
     */
    public void setSalerInfoEhm(JAXBElement<SalerInfoEhm> value) {
        this.salerInfoEhm = ((JAXBElement<SalerInfoEhm> ) value);
    }

    /**
     * Gets the value of the specialInfoEhm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SpecialInfoEhm }{@code >}
     *     
     */
    public JAXBElement<SpecialInfoEhm> getSpecialInfoEhm() {
        return specialInfoEhm;
    }

    /**
     * Sets the value of the specialInfoEhm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SpecialInfoEhm }{@code >}
     *     
     */
    public void setSpecialInfoEhm(JAXBElement<SpecialInfoEhm> value) {
        this.specialInfoEhm = ((JAXBElement<SpecialInfoEhm> ) value);
    }

    /**
     * Gets the value of the systemCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSystemCode() {
        return systemCode;
    }

    /**
     * Sets the value of the systemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSystemCode(JAXBElement<String> value) {
        this.systemCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserName(JAXBElement<String> value) {
        this.userName = ((JAXBElement<String> ) value);
    }

}
