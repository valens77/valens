
package com.founder.clpcecif.webservices.jyx.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsuredEhm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsuredEhm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appOccupationFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthday" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="driveNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identifyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identifyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insuredCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insuredName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insuredNature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occupationCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occupationCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occupationCode3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serialNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuredEhm", propOrder = {
    "addressName",
    "age",
    "appOccupationFlag",
    "birthday",
    "driveNo",
    "email",
    "identifyNumber",
    "identifyType",
    "insuredCode",
    "insuredName",
    "insuredNature",
    "linkerName",
    "mobile",
    "occupationCode1",
    "occupationCode2",
    "occupationCode3",
    "phone",
    "postAddress",
    "postCode",
    "relation",
    "serialNo",
    "sex",
    "valid"
})
public class InsuredEhm {

    @XmlElementRef(name = "addressName", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> addressName;
    @XmlElementRef(name = "age", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> age;
    @XmlElementRef(name = "appOccupationFlag", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> appOccupationFlag;
    @XmlElementRef(name = "birthday", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> birthday;
    @XmlElementRef(name = "driveNo", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> driveNo;
    @XmlElementRef(name = "email", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "identifyNumber", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> identifyNumber;
    @XmlElementRef(name = "identifyType", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> identifyType;
    @XmlElementRef(name = "insuredCode", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> insuredCode;
    @XmlElementRef(name = "insuredName", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> insuredName;
    @XmlElementRef(name = "insuredNature", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> insuredNature;
    @XmlElementRef(name = "linkerName", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> linkerName;
    @XmlElementRef(name = "mobile", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> mobile;
    @XmlElementRef(name = "occupationCode1", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> occupationCode1;
    @XmlElementRef(name = "occupationCode2", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> occupationCode2;
    @XmlElementRef(name = "occupationCode3", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> occupationCode3;
    @XmlElementRef(name = "phone", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> phone;
    @XmlElementRef(name = "postAddress", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> postAddress;
    @XmlElementRef(name = "postCode", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> postCode;
    @XmlElementRef(name = "relation", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> relation;
    protected Integer serialNo;
    @XmlElementRef(name = "sex", namespace = "http://common.dto.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> sex;
    protected Boolean valid;

    /**
     * Gets the value of the addressName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressName() {
        return addressName;
    }

    /**
     * Sets the value of the addressName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressName(JAXBElement<String> value) {
        this.addressName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAge(JAXBElement<String> value) {
        this.age = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the appOccupationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAppOccupationFlag() {
        return appOccupationFlag;
    }

    /**
     * Sets the value of the appOccupationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAppOccupationFlag(JAXBElement<String> value) {
        this.appOccupationFlag = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the birthday property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBirthday() {
        return birthday;
    }

    /**
     * Sets the value of the birthday property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBirthday(JAXBElement<String> value) {
        this.birthday = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the driveNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDriveNo() {
        return driveNo;
    }

    /**
     * Sets the value of the driveNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDriveNo(JAXBElement<String> value) {
        this.driveNo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the identifyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentifyNumber() {
        return identifyNumber;
    }

    /**
     * Sets the value of the identifyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentifyNumber(JAXBElement<String> value) {
        this.identifyNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the identifyType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentifyType() {
        return identifyType;
    }

    /**
     * Sets the value of the identifyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentifyType(JAXBElement<String> value) {
        this.identifyType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the insuredCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsuredCode() {
        return insuredCode;
    }

    /**
     * Sets the value of the insuredCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsuredCode(JAXBElement<String> value) {
        this.insuredCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the insuredName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsuredName() {
        return insuredName;
    }

    /**
     * Sets the value of the insuredName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsuredName(JAXBElement<String> value) {
        this.insuredName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the insuredNature property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsuredNature() {
        return insuredNature;
    }

    /**
     * Sets the value of the insuredNature property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsuredNature(JAXBElement<String> value) {
        this.insuredNature = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the linkerName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLinkerName() {
        return linkerName;
    }

    /**
     * Sets the value of the linkerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLinkerName(JAXBElement<String> value) {
        this.linkerName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobile(JAXBElement<String> value) {
        this.mobile = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the occupationCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOccupationCode1() {
        return occupationCode1;
    }

    /**
     * Sets the value of the occupationCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOccupationCode1(JAXBElement<String> value) {
        this.occupationCode1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the occupationCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOccupationCode2() {
        return occupationCode2;
    }

    /**
     * Sets the value of the occupationCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOccupationCode2(JAXBElement<String> value) {
        this.occupationCode2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the occupationCode3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOccupationCode3() {
        return occupationCode3;
    }

    /**
     * Sets the value of the occupationCode3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOccupationCode3(JAXBElement<String> value) {
        this.occupationCode3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhone(JAXBElement<String> value) {
        this.phone = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the postAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostAddress() {
        return postAddress;
    }

    /**
     * Sets the value of the postAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostAddress(JAXBElement<String> value) {
        this.postAddress = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostCode(JAXBElement<String> value) {
        this.postCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the relation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRelation() {
        return relation;
    }

    /**
     * Sets the value of the relation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRelation(JAXBElement<String> value) {
        this.relation = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the serialNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSerialNo() {
        return serialNo;
    }

    /**
     * Sets the value of the serialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSerialNo(Integer value) {
        this.serialNo = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSex(JAXBElement<String> value) {
        this.sex = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the valid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValid() {
        return valid;
    }

    /**
     * Sets the value of the valid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValid(Boolean value) {
        this.valid = value;
    }

}
