package com.mkyong.ws;

import javax.jws.WebService;

// Service Implementation
@WebService(endpointInterface = "com.mkyong.ws.HelloWorld2")
public class HelloWorldImpl2 implements HelloWorld2 {

	@Override
	public String getHelloWorld(String name) {
		System.out.println("param --> " + name);
		return "Hello World JAX-WS " + name;
	}

}
