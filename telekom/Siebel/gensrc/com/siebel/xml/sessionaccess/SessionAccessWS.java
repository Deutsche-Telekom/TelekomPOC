
package com.siebel.xml.sessionaccess;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.1-b03-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "SessionAccessWS", targetNamespace = "http://www.siebel.com/xml/SessionAccess", wsdlLocation = "http://localhost/wsdl/SessionAccessWS.wsdl")
public class SessionAccessWS
    extends Service
{

    private final static URL SESSIONACCESSWS_WSDL_LOCATION;

    static {
        URL url = null;
        try {
            url = new URL("http://localhost/wsdl/SessionAccessWS.wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        SESSIONACCESSWS_WSDL_LOCATION = url;
    }

    public SessionAccessWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SessionAccessWS() {
        super(SESSIONACCESSWS_WSDL_LOCATION, new QName("http://www.siebel.com/xml/SessionAccess", "SessionAccessWS"));
    }

    /**
     * 
     * @return
     *     returns Port
     */
    @WebEndpoint(name = "port")
    public Port getPort() {
        return (Port)super.getPort(new QName("http://www.siebel.com/xml/SessionAccess", "port"), Port.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Port
     */
    @WebEndpoint(name = "port")
    public Port getPort(WebServiceFeature... features) {
        return (Port)super.getPort(new QName("http://www.siebel.com/xml/SessionAccess", "port"), Port.class, features);
    }

}