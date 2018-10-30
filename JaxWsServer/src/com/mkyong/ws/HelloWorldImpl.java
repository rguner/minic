package com.mkyong.ws;

import javax.jws.WebService;

// Service Implementation
@WebService(endpointInterface = "com.mkyong.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String getHelloWorldAsString(String name) {
		System.out.println("param --> " + name);
		return "Hello World JAX-WS " + name;
	}

}
