
package com.founder.clpcecif.webservices.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPolicyResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPolicyResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getPolicyInput" type="{http://pub.services.ecif.clpc.com/}getPolicyInput" minOccurs="0"/>
 *         &lt;element name="pageOutput" type="{http://pub.services.ecif.clpc.com/}pageOutput" minOccurs="0"/>
 *         &lt;element name="policy" type="{http://pub.services.ecif.clpc.com/}policy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="policyOutPage" type="{http://pub.services.ecif.clpc.com/}policyOutPage" minOccurs="0"/>
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
@XmlType(name = "getPolicyResult", propOrder = {
    "getPolicyInput",
    "pageOutput",
    "policy",
    "policyOutPage",
    "rsCode",
    "rsDesc",
    "transactionNO"
})
public class GetPolicyResult {

    protected GetPolicyInput getPolicyInput;
    protected PageOutput pageOutput;
    @XmlElement(nillable = true)
    protected List<Policy> policy;
    protected PolicyOutPage policyOutPage;
    protected Integer rsCode;
    protected String rsDesc;
    protected String transactionNO;

    /**
     * Gets the value of the getPolicyInput property.
     * 
     * @return
     *     possible object is
     *     {@link GetPolicyInput }
     *     
     */
    public GetPolicyInput getGetPolicyInput() {
        return getPolicyInput;
    }

    /**
     * Sets the value of the getPolicyInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPolicyInput }
     *     
     */
    public void setGetPolicyInput(GetPolicyInput value) {
        this.getPolicyInput = value;
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
     * Gets the value of the policy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Policy }
     * 
     * 
     */
    public List<Policy> getPolicy() {
        if (policy == null) {
            policy = new ArrayList<Policy>();
        }
        return this.policy;
    }

    /**
     * Gets the value of the policyOutPage property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyOutPage }
     *     
     */
    public PolicyOutPage getPolicyOutPage() {
        return policyOutPage;
    }

    /**
     * Sets the value of the policyOutPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyOutPage }
     *     
     */
    public void setPolicyOutPage(PolicyOutPage value) {
        this.policyOutPage = value;
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
