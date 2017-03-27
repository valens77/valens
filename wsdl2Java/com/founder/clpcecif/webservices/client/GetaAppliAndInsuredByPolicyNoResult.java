
package com.founder.clpcecif.webservices.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getaAppliAndInsuredByPolicyNoResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getaAppliAndInsuredByPolicyNoResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getaAppliAndInsuredByPolicyNoInput" type="{http://pub.services.ecif.clpc.com/}getaAppliAndInsuredByPolicyNoInput" minOccurs="0"/>
 *         &lt;element name="pageOutput" type="{http://pub.services.ecif.clpc.com/}pageOutput" minOccurs="0"/>
 *         &lt;element name="policyApplicant" type="{http://pub.services.ecif.clpc.com/}policyApplicant" minOccurs="0"/>
 *         &lt;element name="policyInsurant" type="{http://pub.services.ecif.clpc.com/}policyInsurant" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "getaAppliAndInsuredByPolicyNoResult", propOrder = {
    "getaAppliAndInsuredByPolicyNoInput",
    "pageOutput",
    "policyApplicant",
    "policyInsurant",
    "rsCode",
    "rsDesc",
    "transactionNO"
})
public class GetaAppliAndInsuredByPolicyNoResult {

    protected GetaAppliAndInsuredByPolicyNoInput getaAppliAndInsuredByPolicyNoInput;
    protected PageOutput pageOutput;
    protected PolicyApplicant policyApplicant;
    @XmlElement(nillable = true)
    protected List<PolicyInsurant> policyInsurant;
    protected Integer rsCode;
    protected String rsDesc;
    protected String transactionNO;

    /**
     * Gets the value of the getaAppliAndInsuredByPolicyNoInput property.
     * 
     * @return
     *     possible object is
     *     {@link GetaAppliAndInsuredByPolicyNoInput }
     *     
     */
    public GetaAppliAndInsuredByPolicyNoInput getGetaAppliAndInsuredByPolicyNoInput() {
        return getaAppliAndInsuredByPolicyNoInput;
    }

    /**
     * Sets the value of the getaAppliAndInsuredByPolicyNoInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetaAppliAndInsuredByPolicyNoInput }
     *     
     */
    public void setGetaAppliAndInsuredByPolicyNoInput(GetaAppliAndInsuredByPolicyNoInput value) {
        this.getaAppliAndInsuredByPolicyNoInput = value;
    }

    /**
     * Gets the value of the pageOutput property.
     * 
     * @return
     *     possible object is
     *     {@link PageOutput }
     *     
     */
    public PageOutput getPageOutput() {
        return pageOutput;
    }

    /**
     * Sets the value of the pageOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageOutput }
     *     
     */
    public void setPageOutput(PageOutput value) {
        this.pageOutput = value;
    }

    /**
     * Gets the value of the policyApplicant property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyApplicant }
     *     
     */
    public PolicyApplicant getPolicyApplicant() {
        return policyApplicant;
    }

    /**
     * Sets the value of the policyApplicant property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyApplicant }
     *     
     */
    public void setPolicyApplicant(PolicyApplicant value) {
        this.policyApplicant = value;
    }

    /**
     * Gets the value of the policyInsurant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policyInsurant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicyInsurant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolicyInsurant }
     * 
     * 
     */
    public List<PolicyInsurant> getPolicyInsurant() {
        if (policyInsurant == null) {
            policyInsurant = new ArrayList<PolicyInsurant>();
        }
        return this.policyInsurant;
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
