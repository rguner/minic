package com.mkyong.client;

import com.mkyong.ws.HelloWorld;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import java.net.URL;

public class HelloWorldClient {

	public static void main(String[] args) throws Exception {

		URL url = new URL("http://localhost:9999/ws/hello?wsdl");

		// 1st argument service URI, refer to wsdl document above
		// 2nd argument is service name, refer to wsdl document above
		QName qname = new QName("http://ws.mkyong.com/", "HelloWorldImplService");

		Service service = Service.create(url, qname);

		HelloWorld hello = service.getPort(HelloWorld.class);

		System.out.println(hello.getHelloWorldAsString("mkyong"));

	}

}
