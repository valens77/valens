
package com.base.webservices.test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.base.webservices.test package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DoService2_QNAME = new QName("http://webservice.valens.com/", "doService2");
    private final static QName _DoServiceResponse_QNAME = new QName("http://webservice.valens.com/", "doServiceResponse");
    private final static QName _DoService2Response_QNAME = new QName("http://webservice.valens.com/", "doService2Response");
    private final static QName _DoService_QNAME = new QName("http://webservice.valens.com/", "doService");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.base.webservices.test
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DoServiceResponse }
     * 
     */
    public DoServiceResponse createDoServiceResponse() {
        return new DoServiceResponse();
    }

    /**
     * Create an instance of {@link DoService2Response }
     * 
     */
    public DoService2Response createDoService2Response() {
        return new DoService2Response();
    }

    /**
     * Create an instance of {@link DoService2 }
     * 
     */
    public DoService2 createDoService2() {
        return new DoService2();
    }

    /**
     * Create an instance of {@link DoService }
     * 
     */
    public DoService createDoService() {
        return new DoService();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoService2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.valens.com/", name = "doService2")
    public JAXBElement<DoService2> createDoService2(DoService2 value) {
        return new JAXBElement<DoService2>(_DoService2_QNAME, DoService2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.valens.com/", name = "doServiceResponse")
    public JAXBElement<DoServiceResponse> createDoServiceResponse(DoServiceResponse value) {
        return new JAXBElement<DoServiceResponse>(_DoServiceResponse_QNAME, DoServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoService2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.valens.com/", name = "doService2Response")
    public JAXBElement<DoService2Response> createDoService2Response(DoService2Response value) {
        return new JAXBElement<DoService2Response>(_DoService2Response_QNAME, DoService2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.valens.com/", name = "doService")
    public JAXBElement<DoService> createDoService(DoService value) {
        return new JAXBElement<DoService>(_DoService_QNAME, DoService.class, null, value);
    }

}
