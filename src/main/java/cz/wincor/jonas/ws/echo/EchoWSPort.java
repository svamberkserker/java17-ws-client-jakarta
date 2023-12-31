
package cz.wincor.jonas.ws.echo;

import jakarta.jws.WebMethod;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;
import cz.wincor.jonas.dto.EchoResponse;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EchoWSPort", targetNamespace = "http://echo.ws.jonas.wincor.cz")
@XmlSeeAlso({
    cz.wincor.jonas.ws.echo.ObjectFactory.class,
    cz.wincor.jonas.dto.ObjectFactory.class
})
public interface EchoWSPort {


    /**
     * 
     * @return
     *     returns cz.wincor.jonas.dto.EchoResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "echoRequest", targetNamespace = "http://echo.ws.jonas.wincor.cz", className = "cz.wincor.jonas.ws.echo.EchoRequest")
    @ResponseWrapper(localName = "echoRequestResponse", targetNamespace = "http://echo.ws.jonas.wincor.cz", className = "cz.wincor.jonas.ws.echo.EchoRequestResponse")
    public EchoResponse echoRequest();

}
