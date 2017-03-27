
package com.founder.clpcecif.webservices.jyx.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LimitEhm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LimitEhm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="insureArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitEhm", propOrder = {
    "insureArea",
    "limitCode"
})
public class LimitEhm {

    @XmlElementRef(name = "insureArea", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> insureArea;
    @XmlElementRef(name = "limitCode", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> limitCode;

    /**
     * Gets the value of the insureArea property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsureArea() {
        return insureArea;
    }

    /**
     * Sets the value of the insureArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsureArea(JAXBElement<String> value) {
        this.insureArea = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the limitCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLimitCode() {
        return limitCode;
    }

    /**
     * Sets the value of the limitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLimitCode(JAXBElement<String> value) {
        this.limitCode = ((JAXBElement<String> ) value);
    }

}
