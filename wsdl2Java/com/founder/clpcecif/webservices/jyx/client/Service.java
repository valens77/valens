
package com.founder.clpcecif.webservices.jyx.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="param0" type="{http://dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd}ProposalUndwrtRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "param0"
})
@XmlRootElement(name = "service", namespace = "http://service.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com")
public class Service {

    @XmlElementRef(name = "param0", namespace = "http://service.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com", type = JAXBElement.class)
    protected JAXBElement<ProposalUndwrtRequest> param0;

    /**
     * Gets the value of the param0 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProposalUndwrtRequest }{@code >}
     *     
     */
    public JAXBElement<ProposalUndwrtRequest> getParam0() {
        return param0;
    }

    /**
     * Sets the value of the param0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProposalUndwrtRequest }{@code >}
     *     
     */
    public void setParam0(JAXBElement<ProposalUndwrtRequest> value) {
        this.param0 = ((JAXBElement<ProposalUndwrtRequest> ) value);
    }

}
