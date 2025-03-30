package br.com.hudsonpedroso.api_client_server_discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ApiClientServerDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiClientServerDiscoveryApplication.class, args);
	}

}

@RestController
@RequestMapping("hello")
class HelloController {

	@GetMapping
	public String hello() {
		return "hello world!";
	}
}
