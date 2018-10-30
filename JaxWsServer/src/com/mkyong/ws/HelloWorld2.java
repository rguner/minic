package com.mkyong.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

// Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.RPC)
public interface HelloWorld2 {

	@WebMethod
	String getHelloWorld(String name);

}
