package com.mkyong.endpoint;

import com.mkyong.ws.HelloWorldImpl;
import com.mkyong.ws.HelloWorldImpl2;
import javax.xml.ws.Endpoint;

// Endpoint publisher
public class HelloWorldPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
		System.out.println("basladi.. 9999 portundan dinliyor...");

		Endpoint.publish("http://localhost:9998/ws/hello", new HelloWorldImpl2());
		System.out.println("basladi.. 9998 portundan dinliyor...");
	}

}
