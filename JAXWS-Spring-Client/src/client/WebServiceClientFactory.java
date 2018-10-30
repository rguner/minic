package client;

import com.javacodegeeks.enterprise.ws.MyWebService;
import com.javacodegeeks.enterprise.ws.MyWebService_Service;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import java.net.MalformedURLException;
import java.net.URL;

public class WebServiceClientFactory {

	private MyWebService myWebService = null;

	public MyWebService getMyWebServiceClient() {
		MyWebService_Service myWebService_Service = null;
		if (myWebService == null) {
			try {
				URL url = new URL("http://localhost:8080/JAXWS-Spring/jaxws-spring?wsdl");
				QName qname = new QName("http://ws.enterprise.javacodegeeks.com/", "MyWebService");

				myWebService_Service = new MyWebService_Service(url, qname);

				myWebService = myWebService_Service.getMyWebServicePort();
			} catch (MalformedURLException e) {
				System.out.println("Malformed Url for MyWebService" + e.getMessage());
				myWebService = new MyWebService_Service().getMyWebServicePort();
			}
		}

		BindingProvider bp = (BindingProvider) myWebService;
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:8080/JAXWS-Spring/jaxws-spring?wsdl");

		bp.getRequestContext().put("com.sun.xml.ws.connect.timeout", 20000);
		bp.getRequestContext().put("com.sun.xml.ws.request.timeout", 20000);

		return myWebService;
	}
}
