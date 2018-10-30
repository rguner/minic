package com.mkyong.client;

import com.mkyong.ws.HelloWorld;
import com.mkyong.ws.HelloWorld2;
import com.mkyong.ws.HelloWorldImpl2Service;
import com.mkyong.ws.HelloWorldImplService;

public class HelloWorldClient {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			HelloWorldImplService helloService = new HelloWorldImplService();
			HelloWorld hello = helloService.getHelloWorldImplPort();

			System.out.println(hello.hashCode() + " " + hello.getHelloWorldAsString("ramazan"));

			HelloWorldImpl2Service helloService2 = new HelloWorldImpl2Service();
			HelloWorld2 hello2 = helloService2.getHelloWorldImpl2Port();

			System.out.println(hello.hashCode() + " " + hello2.getHelloWorld("guner"));
		}

	}

}
