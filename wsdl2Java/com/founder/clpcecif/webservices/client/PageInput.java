
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pageInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pageInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pageNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="perPageNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pageInput", propOrder = {
    "pageNo",
    "perPageNum"
})
public class PageInput {

    protected Long pageNo;
    protected Long perPageNum;

    /**
     * Gets the value of the pageNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPageNo() {
        return pageNo;
    }

    /**
     * Sets the value of the pageNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPageNo(Long value) {
        this.pageNo = value;
    }

    /**
     * Gets the value of the perPageNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPerPageNum() {
        return perPageNum;
    }

    /**
     * Sets the value of the perPageNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPerPageNum(Long value) {
        this.perPageNum = value;
    }

}
