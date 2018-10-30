package com.javatpoint.springbootexample2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController2 {

	@RequestMapping("/hello2")
	public String hello() {
		return "Hello2!";
	}
}
