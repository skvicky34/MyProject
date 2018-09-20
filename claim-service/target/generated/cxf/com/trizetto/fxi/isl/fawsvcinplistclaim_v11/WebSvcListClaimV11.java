package com.trizetto.fxi.isl.fawsvcinplistclaim_v11;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.9
 * 2018-09-20T03:16:10.602-06:00
 * Generated source version: 3.1.9
 * 
 */
@WebServiceClient(name = "WebSvcListClaim_v11", 
                  wsdlLocation = "file:/C:/Users/Sandeep.Kumar/git/facet_branch/claim-service/src/main/resources/wsdl/FaWsvcInpListClaim_v11.wsdl",
                  targetNamespace = "http://trizetto.com/fxi/isl/FaWsvcInpListClaim_v11") 
public class WebSvcListClaimV11 extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://trizetto.com/fxi/isl/FaWsvcInpListClaim_v11", "WebSvcListClaim_v11");
    public final static QName WebSvcListClaimV11Soap = new QName("http://trizetto.com/fxi/isl/FaWsvcInpListClaim_v11", "WebSvcListClaim_v11Soap");
    public final static QName WebSvcListClaimV11Soap12 = new QName("http://trizetto.com/fxi/isl/FaWsvcInpListClaim_v11", "WebSvcListClaim_v11Soap12");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Sandeep.Kumar/git/facet_branch/claim-service/src/main/resources/wsdl/FaWsvcInpListClaim_v11.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(WebSvcListClaimV11.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Sandeep.Kumar/git/facet_branch/claim-service/src/main/resources/wsdl/FaWsvcInpListClaim_v11.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public WebSvcListClaimV11(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WebSvcListClaimV11(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebSvcListClaimV11() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public WebSvcListClaimV11(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public WebSvcListClaimV11(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public WebSvcListClaimV11(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns WebSvcListClaimV11Soap
     */
    @WebEndpoint(name = "WebSvcListClaim_v11Soap")
    public WebSvcListClaimV11Soap getWebSvcListClaimV11Soap() {
        return super.getPort(WebSvcListClaimV11Soap, WebSvcListClaimV11Soap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebSvcListClaimV11Soap
     */
    @WebEndpoint(name = "WebSvcListClaim_v11Soap")
    public WebSvcListClaimV11Soap getWebSvcListClaimV11Soap(WebServiceFeature... features) {
        return super.getPort(WebSvcListClaimV11Soap, WebSvcListClaimV11Soap.class, features);
    }


    /**
     *
     * @return
     *     returns WebSvcListClaimV11Soap
     */
    @WebEndpoint(name = "WebSvcListClaim_v11Soap12")
    public WebSvcListClaimV11Soap getWebSvcListClaimV11Soap12() {
        return super.getPort(WebSvcListClaimV11Soap12, WebSvcListClaimV11Soap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebSvcListClaimV11Soap
     */
    @WebEndpoint(name = "WebSvcListClaim_v11Soap12")
    public WebSvcListClaimV11Soap getWebSvcListClaimV11Soap12(WebServiceFeature... features) {
        return super.getPort(WebSvcListClaimV11Soap12, WebSvcListClaimV11Soap.class, features);
    }

}
