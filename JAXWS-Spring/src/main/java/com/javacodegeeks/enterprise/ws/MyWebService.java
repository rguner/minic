package com.javacodegeeks.enterprise.ws;

import com.javacodegeeks.enterprise.bo.MyBObject;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService(serviceName = "MyWebService")
@SOAPBinding(style = Style.RPC, use = Use.LITERAL)
public class MyWebService {

	// Dependency Injection (DI) via Spring
	MyBObject myBObject;

	@WebMethod(exclude = true)
	public void setMyBObject(MyBObject bObject) {
		this.myBObject = bObject;
	}

	@WebMethod(operationName = "printMessage")
	public String printMessage() {

		return myBObject.printMessage();

	}

	@WebMethod(operationName = "echo")
	public String echo(String param) {

		try {
			Thread.currentThread().sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return param;
	}

	@WebMethod(operationName = "echoComplex")
	public Model echoComplex(Model m) {

		Model m2 = new Model();
		m2.id = m.id;
		m2.name = m.name;
		m2.value = "test";
		try {
			Thread.currentThread().sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m2;
	}

}
