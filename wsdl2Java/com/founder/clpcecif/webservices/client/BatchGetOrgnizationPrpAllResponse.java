
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchGetOrgnizationPrpAllResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchGetOrgnizationPrpAllResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://pub.services.ecif.clpc.com/}batchGetOrgnizationPrpAllResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchGetOrgnizationPrpAllResponse", propOrder = {
    "_return"
})
public class BatchGetOrgnizationPrpAllResponse {

    @XmlElement(name = "return")
    protected BatchGetOrgnizationPrpAllResult _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link BatchGetOrgnizationPrpAllResult }
     *     
     */
    public BatchGetOrgnizationPrpAllResult getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchGetOrgnizationPrpAllResult }
     *     
     */
    public void setReturn(BatchGetOrgnizationPrpAllResult value) {
        this._return = value;
    }

}
