package cz.ds.pos.ws.jakarta;

import cz.wincor.jonas.ws.echo.EchoWSPort;
import cz.wincor.jonas.ws.echo.EchoWSService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.net.MalformedURLException;
import java.net.URL;

@SpringBootApplication
public class Java17WsClientJakartaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Java17WsClientJakartaApplication.class, args);
	}

	@Bean
	public EchoWSPort echoWS() throws MalformedURLException {
//		EchoWSService echoWSService = new EchoWSService(new URL("http://10.15.13.41:8099/jonas-ws/EchoWS?wsdl"));
		EchoWSService echoWSService = new EchoWSService();
		return echoWSService.getEchoWSPort();
	}
}
