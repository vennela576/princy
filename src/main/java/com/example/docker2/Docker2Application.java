package com.example.docker2;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Docker2Application {
@RequestMapping("/venni")
public String home(){
return "hii jennipala";
}
	public static void main(String[] args) {
		SpringApplication.run(Docker2Application.class, args);
	}

}
