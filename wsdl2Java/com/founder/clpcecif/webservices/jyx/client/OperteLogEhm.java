
package com.founder.clpcecif.webservices.jyx.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperteLogEhm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperteLogEhm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="branch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="branchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cxSaler" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cxSalerBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cxSalerBranchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cxSalerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="drawerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="drawerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operatorBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operatorBranchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operatorBusinessArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperteLogEhm", propOrder = {
    "branch",
    "branchName",
    "cxSaler",
    "cxSalerBranch",
    "cxSalerBranchName",
    "cxSalerName",
    "drawerId",
    "drawerName",
    "operator",
    "operatorBranch",
    "operatorBranchName",
    "operatorBusinessArea",
    "operatorName"
})
public class OperteLogEhm {

    @XmlElementRef(name = "branch", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> branch;
    @XmlElementRef(name = "branchName", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> branchName;
    @XmlElementRef(name = "cxSaler", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> cxSaler;
    @XmlElementRef(name = "cxSalerBranch", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> cxSalerBranch;
    @XmlElementRef(name = "cxSalerBranchName", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> cxSalerBranchName;
    @XmlElementRef(name = "cxSalerName", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> cxSalerName;
    @XmlElementRef(name = "drawerId", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> drawerId;
    @XmlElementRef(name = "drawerName", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> drawerName;
    @XmlElementRef(name = "operator", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> operator;
    @XmlElementRef(name = "operatorBranch", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> operatorBranch;
    @XmlElementRef(name = "operatorBranchName", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> operatorBranchName;
    @XmlElementRef(name = "operatorBusinessArea", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> operatorBusinessArea;
    @XmlElementRef(name = "operatorName", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> operatorName;

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBranch() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBranch(JAXBElement<String> value) {
        this.branch = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the branchName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBranchName() {
        return branchName;
    }

    /**
     * Sets the value of the branchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBranchName(JAXBElement<String> value) {
        this.branchName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxSaler property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxSaler() {
        return cxSaler;
    }

    /**
     * Sets the value of the cxSaler property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxSaler(JAXBElement<String> value) {
        this.cxSaler = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxSalerBranch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxSalerBranch() {
        return cxSalerBranch;
    }

    /**
     * Sets the value of the cxSalerBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxSalerBranch(JAXBElement<String> value) {
        this.cxSalerBranch = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxSalerBranchName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxSalerBranchName() {
        return cxSalerBranchName;
    }

    /**
     * Sets the value of the cxSalerBranchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxSalerBranchName(JAXBElement<String> value) {
        this.cxSalerBranchName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxSalerName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxSalerName() {
        return cxSalerName;
    }

    /**
     * Sets the value of the cxSalerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxSalerName(JAXBElement<String> value) {
        this.cxSalerName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the drawerId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDrawerId() {
        return drawerId;
    }

    /**
     * Sets the value of the drawerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDrawerId(JAXBElement<String> value) {
        this.drawerId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the drawerName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDrawerName() {
        return drawerName;
    }

    /**
     * Sets the value of the drawerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDrawerName(JAXBElement<String> value) {
        this.drawerName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperator(JAXBElement<String> value) {
        this.operator = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the operatorBranch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperatorBranch() {
        return operatorBranch;
    }

    /**
     * Sets the value of the operatorBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperatorBranch(JAXBElement<String> value) {
        this.operatorBranch = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the operatorBranchName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperatorBranchName() {
        return operatorBranchName;
    }

    /**
     * Sets the value of the operatorBranchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperatorBranchName(JAXBElement<String> value) {
        this.operatorBranchName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the operatorBusinessArea property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperatorBusinessArea() {
        return operatorBusinessArea;
    }

    /**
     * Sets the value of the operatorBusinessArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperatorBusinessArea(JAXBElement<String> value) {
        this.operatorBusinessArea = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the operatorName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperatorName() {
        return operatorName;
    }

    /**
     * Sets the value of the operatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperatorName(JAXBElement<String> value) {
        this.operatorName = ((JAXBElement<String> ) value);
    }

}
