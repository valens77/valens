
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pageOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pageOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outPageNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="outPageNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="outPerpageNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="totalRecord" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pageOutput", propOrder = {
    "outPageNo",
    "outPageNum",
    "outPerpageNum",
    "totalRecord"
})
public class PageOutput {

    protected Long outPageNo;
    protected Long outPageNum;
    protected Long outPerpageNum;
    protected Long totalRecord;

    /**
     * Gets the value of the outPageNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOutPageNo() {
        return outPageNo;
    }

    /**
     * Sets the value of the outPageNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOutPageNo(Long value) {
        this.outPageNo = value;
    }

    /**
     * Gets the value of the outPageNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOutPageNum() {
        return outPageNum;
    }

    /**
     * Sets the value of the outPageNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOutPageNum(Long value) {
        this.outPageNum = value;
    }

    /**
     * Gets the value of the outPerpageNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOutPerpageNum() {
        return outPerpageNum;
    }

    /**
     * Sets the value of the outPerpageNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOutPerpageNum(Long value) {
        this.outPerpageNum = value;
    }

    /**
     * Gets the value of the totalRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalRecord() {
        return totalRecord;
    }

    /**
     * Sets the value of the totalRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalRecord(Long value) {
        this.totalRecord = value;
    }

}
