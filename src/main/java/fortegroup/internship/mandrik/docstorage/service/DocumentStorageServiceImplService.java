
package fortegroup.internship.mandrik.docstorage.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "DocumentStorageServiceImplService", targetNamespace = "http://service.docstorage.mandrik.internship.fortegroup/", wsdlLocation = "http://localhost:7070/storage/document?wsdl")
public class DocumentStorageServiceImplService
    extends Service
{

    private final static URL DOCUMENTSTORAGESERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException DOCUMENTSTORAGESERVICEIMPLSERVICE_EXCEPTION;
    private final static QName DOCUMENTSTORAGESERVICEIMPLSERVICE_QNAME = new QName("http://service.docstorage.mandrik.internship.fortegroup/", "DocumentStorageServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:7070/storage/document?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DOCUMENTSTORAGESERVICEIMPLSERVICE_WSDL_LOCATION = url;
        DOCUMENTSTORAGESERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public DocumentStorageServiceImplService() {
        super(__getWsdlLocation(), DOCUMENTSTORAGESERVICEIMPLSERVICE_QNAME);
    }

    public DocumentStorageServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), DOCUMENTSTORAGESERVICEIMPLSERVICE_QNAME, features);
    }

    public DocumentStorageServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, DOCUMENTSTORAGESERVICEIMPLSERVICE_QNAME);
    }

    public DocumentStorageServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DOCUMENTSTORAGESERVICEIMPLSERVICE_QNAME, features);
    }

    public DocumentStorageServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DocumentStorageServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DocumentStorageService
     */
    @WebEndpoint(name = "DocumentStorageServiceImplPort")
    public DocumentStorageService getDocumentStorageServiceImplPort() {
        return super.getPort(new QName("http://service.docstorage.mandrik.internship.fortegroup/", "DocumentStorageServiceImplPort"), DocumentStorageService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DocumentStorageService
     */
    @WebEndpoint(name = "DocumentStorageServiceImplPort")
    public DocumentStorageService getDocumentStorageServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.docstorage.mandrik.internship.fortegroup/", "DocumentStorageServiceImplPort"), DocumentStorageService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DOCUMENTSTORAGESERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw DOCUMENTSTORAGESERVICEIMPLSERVICE_EXCEPTION;
        }
        return DOCUMENTSTORAGESERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
