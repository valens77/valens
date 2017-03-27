
package com.founder.clpcecif.webservices.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for batchGetIndividualPrpAllResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="batchGetIndividualPrpAllResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="batchGetIndividualPrpAllInput" type="{http://pub.services.ecif.clpc.com/}batchGetIndividualPrpAllInput" minOccurs="0"/>
 *         &lt;element name="individualPrpObjTag" type="{http://pub.services.ecif.clpc.com/}individualPrpObjTag" minOccurs="0"/>
 *         &lt;element name="individualPrpQueryListObjTag" type="{http://pub.services.ecif.clpc.com/}individualPrpQueryListObjTag" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "batchGetIndividualPrpAllResult", propOrder = {
    "batchGetIndividualPrpAllInput",
    "individualPrpObjTag",
    "individualPrpQueryListObjTag",
    "rsCode",
    "rsDesc",
    "transactionNO"
})
public class BatchGetIndividualPrpAllResult {

    protected BatchGetIndividualPrpAllInput batchGetIndividualPrpAllInput;
    protected IndividualPrpObjTag individualPrpObjTag;
    @XmlElement(nillable = true)
    protected List<IndividualPrpQueryListObjTag> individualPrpQueryListObjTag;
    protected Integer rsCode;
    protected String rsDesc;
    protected String transactionNO;

    /**
     * Gets the value of the batchGetIndividualPrpAllInput property.
     * 
     * @return
     *     possible object is
     *     {@link BatchGetIndividualPrpAllInput }
     *     
     */
    public BatchGetIndividualPrpAllInput getBatchGetIndividualPrpAllInput() {
        return batchGetIndividualPrpAllInput;
    }

    /**
     * Sets the value of the batchGetIndividualPrpAllInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchGetIndividualPrpAllInput }
     *     
     */
    public void setBatchGetIndividualPrpAllInput(BatchGetIndividualPrpAllInput value) {
        this.batchGetIndividualPrpAllInput = value;
    }

    /**
     * Gets the value of the individualPrpObjTag property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPrpObjTag }
     *     
     */
    public IndividualPrpObjTag getIndividualPrpObjTag() {
        return individualPrpObjTag;
    }

    /**
     * Sets the value of the individualPrpObjTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPrpObjTag }
     *     
     */
    public void setIndividualPrpObjTag(IndividualPrpObjTag value) {
        this.individualPrpObjTag = value;
    }

    /**
     * Gets the value of the individualPrpQueryListObjTag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the individualPrpQueryListObjTag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndividualPrpQueryListObjTag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualPrpQueryListObjTag }
     * 
     * 
     */
    public List<IndividualPrpQueryListObjTag> getIndividualPrpQueryListObjTag() {
        if (individualPrpQueryListObjTag == null) {
            individualPrpQueryListObjTag = new ArrayList<IndividualPrpQueryListObjTag>();
        }
        return this.individualPrpQueryListObjTag;
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
