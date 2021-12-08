package com.iris.pk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootCicdApplication {

	@GetMapping("/message")
	public String getMsg() {
		return "Hi.. How are you?.. All good!!";
	}
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome my web-Site!!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootCicdApplication.class, args);
	}

}
