
package com.base.webservices.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "TestJdk6WebServiceService", targetNamespace = "http://webservice.valens.com/", wsdlLocation = "http://127.0.0.1:8085/java6ws/J6Ws/doService?wsdl")
public class TestJdk6WebServiceService
    extends Service
{

    private final static URL TESTJDK6WEBSERVICESERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.base.webservices.test.TestJdk6WebServiceService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.base.webservices.test.TestJdk6WebServiceService.class.getResource(".");
            url = new URL(baseUrl, "http://127.0.0.1:8085/java6ws/J6Ws/doService?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://127.0.0.1:8085/java6ws/J6Ws/doService?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        TESTJDK6WEBSERVICESERVICE_WSDL_LOCATION = url;
    }

    public TestJdk6WebServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TestJdk6WebServiceService() {
        super(TESTJDK6WEBSERVICESERVICE_WSDL_LOCATION, new QName("http://webservice.valens.com/", "TestJdk6WebServiceService"));
    }

    /**
     * 
     * @return
     *     returns TestJdk6WebService
     */
    @WebEndpoint(name = "TestJdk6WebServicePort")
    public TestJdk6WebService getTestJdk6WebServicePort() {
        return super.getPort(new QName("http://webservice.valens.com/", "TestJdk6WebServicePort"), TestJdk6WebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TestJdk6WebService
     */
    @WebEndpoint(name = "TestJdk6WebServicePort")
    public TestJdk6WebService getTestJdk6WebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.valens.com/", "TestJdk6WebServicePort"), TestJdk6WebService.class, features);
    }

}