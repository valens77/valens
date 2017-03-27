
package com.founder.clpcecif.webservices.client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for policyOutPage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="policyOutPage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="availAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="availCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="avialPolicyNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="policyNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="totalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totalCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "policyOutPage", propOrder = {
    "availAmount",
    "availCost",
    "avialPolicyNum",
    "policyNum",
    "totalAmount",
    "totalCost"
})
public class PolicyOutPage {

    protected BigDecimal availAmount;
    protected BigDecimal availCost;
    protected Long avialPolicyNum;
    protected Long policyNum;
    protected BigDecimal totalAmount;
    protected BigDecimal totalCost;

    /**
     * Gets the value of the availAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvailAmount() {
        return availAmount;
    }

    /**
     * Sets the value of the availAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvailAmount(BigDecimal value) {
        this.availAmount = value;
    }

    /**
     * Gets the value of the availCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvailCost() {
        return availCost;
    }

    /**
     * Sets the value of the availCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvailCost(BigDecimal value) {
        this.availCost = value;
    }

    /**
     * Gets the value of the avialPolicyNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAvialPolicyNum() {
        return avialPolicyNum;
    }

    /**
     * Sets the value of the avialPolicyNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAvialPolicyNum(Long value) {
        this.avialPolicyNum = value;
    }

    /**
     * Gets the value of the policyNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPolicyNum() {
        return policyNum;
    }

    /**
     * Sets the value of the policyNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPolicyNum(Long value) {
        this.policyNum = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmount(BigDecimal value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the totalCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCost() {
        return totalCost;
    }

    /**
     * Sets the value of the totalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCost(BigDecimal value) {
        this.totalCost = value;
    }

}
