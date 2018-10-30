package com.javatpoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello ramazan nede!";
	}

	@RequestMapping("/hello3")
	public String hello3() {
		return "Hello 3!";
	}

	@RequestMapping("/hello4")
	public String hello4() {
		return "Hello 3!";
	}
}
