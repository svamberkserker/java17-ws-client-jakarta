
package cz.wincor.jonas.ws.echo;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cz.wincor.jonas.ws.echo package. 
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

    private final static QName _EchoRequest_QNAME = new QName("http://echo.ws.jonas.wincor.cz", "echoRequest");
    private final static QName _EchoRequestResponse_QNAME = new QName("http://echo.ws.jonas.wincor.cz", "echoRequestResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cz.wincor.jonas.ws.echo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EchoRequest }
     * 
     */
    public EchoRequest createEchoRequest() {
        return new EchoRequest();
    }

    /**
     * Create an instance of {@link EchoRequestResponse }
     * 
     */
    public EchoRequestResponse createEchoRequestResponse() {
        return new EchoRequestResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EchoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://echo.ws.jonas.wincor.cz", name = "echoRequest")
    public JAXBElement<EchoRequest> createEchoRequest(EchoRequest value) {
        return new JAXBElement<EchoRequest>(_EchoRequest_QNAME, EchoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EchoRequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://echo.ws.jonas.wincor.cz", name = "echoRequestResponse")
    public JAXBElement<EchoRequestResponse> createEchoRequestResponse(EchoRequestResponse value) {
        return new JAXBElement<EchoRequestResponse>(_EchoRequestResponse_QNAME, EchoRequestResponse.class, null, value);
    }

}
