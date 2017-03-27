
package com.founder.clpcecif.webservices.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lifeEmpNo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lifeEmpNo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="src_Sys_Role_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lifeEmpNo", propOrder = {
    "srcSysRoleNo"
})
public class LifeEmpNo {

    @XmlElement(name = "src_Sys_Role_No")
    protected String srcSysRoleNo;

    /**
     * Gets the value of the srcSysRoleNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcSysRoleNo() {
        return srcSysRoleNo;
    }

    /**
     * Sets the value of the srcSysRoleNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcSysRoleNo(String value) {
        this.srcSysRoleNo = value;
    }

}
