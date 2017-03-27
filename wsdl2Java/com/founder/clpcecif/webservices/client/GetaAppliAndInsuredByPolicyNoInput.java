
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getaAppliAndInsuredByPolicyNoInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getaAppliAndInsuredByPolicyNoInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pageInput" type="{http://pub.services.ecif.clpc.com/}pageInput" minOccurs="0"/>
 *         &lt;element name="policyIdObj" type="{http://pub.services.ecif.clpc.com/}policyIdObj" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getaAppliAndInsuredByPolicyNoInput", propOrder = {
    "pageInput",
    "policyIdObj"
})
public class GetaAppliAndInsuredByPolicyNoInput {

    protected PageInput pageInput;
    protected PolicyIdObj policyIdObj;

    /**
     * Gets the value of the pageInput property.
     * 
     * @return
     *     possible object is
     *     {@link PageInput }
     *     
     */
    public PageInput getPageInput() {
        return pageInput;
    }

    /**
     * Sets the value of the pageInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageInput }
     *     
     */
    public void setPageInput(PageInput value) {
        this.pageInput = value;
    }

    /**
     * Gets the value of the policyIdObj property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyIdObj }
     *     
     */
    public PolicyIdObj getPolicyIdObj() {
        return policyIdObj;
    }

    /**
     * Sets the value of the policyIdObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyIdObj }
     *     
     */
    public void setPolicyIdObj(PolicyIdObj value) {
        this.policyIdObj = value;
    }

}
