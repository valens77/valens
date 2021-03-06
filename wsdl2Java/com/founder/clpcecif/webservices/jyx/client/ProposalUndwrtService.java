
package com.founder.clpcecif.webservices.jyx.client;

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
@WebServiceClient(name = "ProposalUndwrtService", targetNamespace = "http://service.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com", wsdlLocation = "http://9.1.165.11:7001/webServiceCenter/services/ProposalUndwrtService?wsdl")
public class ProposalUndwrtService
    extends Service
{

    private final static URL PROPOSALUNDWRTSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.founder.clpcecif.webservices.jyx.client.ProposalUndwrtService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.founder.clpcecif.webservices.jyx.client.ProposalUndwrtService.class.getResource(".");
            url = new URL(baseUrl, "http://9.1.165.11:7001/webServiceCenter/services/ProposalUndwrtService?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://9.1.165.11:7001/webServiceCenter/services/ProposalUndwrtService?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        PROPOSALUNDWRTSERVICE_WSDL_LOCATION = url;
    }

    public ProposalUndwrtService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProposalUndwrtService() {
        super(PROPOSALUNDWRTSERVICE_WSDL_LOCATION, new QName("http://service.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com", "ProposalUndwrtService"));
    }

    /**
     * 
     * @return
     *     returns ProposalUndwrtServicePortType
     */
    @WebEndpoint(name = "ProposalUndwrtServiceHttpSoap11Endpoint")
    public ProposalUndwrtServicePortType getProposalUndwrtServiceHttpSoap11Endpoint() {
        return super.getPort(new QName("http://service.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com", "ProposalUndwrtServiceHttpSoap11Endpoint"), ProposalUndwrtServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProposalUndwrtServicePortType
     */
    @WebEndpoint(name = "ProposalUndwrtServiceHttpSoap11Endpoint")
    public ProposalUndwrtServicePortType getProposalUndwrtServiceHttpSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.proposalundwrt.dwx.commonship.webServiceCenter.sinosoft.com", "ProposalUndwrtServiceHttpSoap11Endpoint"), ProposalUndwrtServicePortType.class, features);
    }

}
