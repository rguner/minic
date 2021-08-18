package com.guner.controller;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!, %s";
	private final AtomicLong counter = new AtomicLong();
	public static final String CONTROLLER_HEADERS = "Accept=*/*";
	public static final String CONTROLLER_JSON_PRODUCES = "application/json;charset=UTF-8";

	@GetMapping(value="/greeting", produces = CONTROLLER_JSON_PRODUCES)
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name, "Merhaba"));
	}
}