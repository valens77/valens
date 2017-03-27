
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceLevelComp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceLevelComp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceLevelObj" type="{http://pub.services.ecif.clpc.com/}serviceLevelObj" minOccurs="0"/>
 *         &lt;element name="tokenSettingWay" type="{http://pub.services.ecif.clpc.com/}tokenSettingWay" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceLevelComp", propOrder = {
    "serviceLevelObj",
    "tokenSettingWay"
})
public class ServiceLevelComp {

    protected ServiceLevelObj serviceLevelObj;
    protected TokenSettingWay tokenSettingWay;

    /**
     * Gets the value of the serviceLevelObj property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLevelObj }
     *     
     */
    public ServiceLevelObj getServiceLevelObj() {
        return serviceLevelObj;
    }

    /**
     * Sets the value of the serviceLevelObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLevelObj }
     *     
     */
    public void setServiceLevelObj(ServiceLevelObj value) {
        this.serviceLevelObj = value;
    }

    /**
     * Gets the value of the tokenSettingWay property.
     * 
     * @return
     *     possible object is
     *     {@link TokenSettingWay }
     *     
     */
    public TokenSettingWay getTokenSettingWay() {
        return tokenSettingWay;
    }

    /**
     * Sets the value of the tokenSettingWay property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenSettingWay }
     *     
     */
    public void setTokenSettingWay(TokenSettingWay value) {
        this.tokenSettingWay = value;
    }

}
