package cz.ds.pos.ws.jakarta;

import cz.wincor.jonas.ws.echo.EchoWSPort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class EchoController {

    private final EchoWSPort echoWS;

    public EchoController(EchoWSPort echoWS) {
        this.echoWS = echoWS;
    }

    @GetMapping
    public String echo() {
        return echoWS.echoRequest().value();
    }
}
