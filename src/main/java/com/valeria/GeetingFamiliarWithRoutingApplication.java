package com.valeria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/coding")
public class GeetingFamiliarWithRoutingApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeetingFamiliarWithRoutingApplication.class, args);
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String getHome() {
		return "<h1>Hello Coding Dojo!</h1>";
	}
	
	@RequestMapping(value = "/python", method = RequestMethod.GET)
	public String getPython() {
		return "<h1>Python/Django was awesome!</h1>";
	}
	
	@RequestMapping(value = "/java", method = RequestMethod.GET)
	public String getJava() {
		return "<h1>Java/Spring is better!</h1>";
	}
}

