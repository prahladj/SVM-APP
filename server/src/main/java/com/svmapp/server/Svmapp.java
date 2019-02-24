package com.svmapp.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@SpringBootApplication
public class Svmapp {

	@RequestMapping("/")
    public String home() {
      return "Hello World!";
    }
	 
	public static void main(String[] args) {
		SpringApplication.run(Svmapp.class, args);
	}

}
