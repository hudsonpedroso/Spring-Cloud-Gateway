package br.com.hudsonpedroso.oi_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class OiApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OiApiApplication.class, args);
	}

}

@RestController
@RequestMapping("oi")
class OiController {

	@GetMapping
	public String oi() {
		return "oi mundo!";
	}
}