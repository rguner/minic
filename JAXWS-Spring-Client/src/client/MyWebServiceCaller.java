package client;

import com.javacodegeeks.enterprise.ws.Model;
import com.javacodegeeks.enterprise.ws.MyWebService;

public class MyWebServiceCaller {

	WebServiceClientFactory webServiceClientFactory;

	public static void main(String[] args) {

		MyWebServiceCaller caller = new MyWebServiceCaller();
		// caller.call();
		caller.callMT();

	}

	public void call() {

		webServiceClientFactory = new WebServiceClientFactory();
		MyWebService myWebService = webServiceClientFactory.getMyWebServiceClient();
		String returnValue = myWebService.echo("merhaba");
		System.out.println(returnValue);

	}

	public void callMT()
	{
		webServiceClientFactory = new WebServiceClientFactory();
		MyWebService myWebService = webServiceClientFactory.getMyWebServiceClient();

		AThread aThread = new AThread(myWebService, "A");
		aThread.start();

		AThread aThread2 = new AThread(myWebService, "B");
		aThread2.start();

		AThread aThread3 = new AThread(myWebService, "C");
		aThread3.start();

		AThread aThread4 = new AThread(myWebService, "D");
		aThread4.start();

	}

	private class AThread extends Thread
	{

		private MyWebService myWebService;
		private String param;

		public AThread(MyWebService myWebService, String param)
		{
			this.myWebService = myWebService;
			this.param = param;
		}

		public void run()
		{
			int i = 0;
			long t = System.currentTimeMillis();
			while (i < 20000)
			{
				Model m = new Model();
				m.setId(i);
				m.setName(param);
				Model responseModel = myWebService.echoComplex(m);
				if (!responseModel.getName().equalsIgnoreCase(param)) {
					System.err.println("-----------------------uyumsuzluk -----------------------" + responseModel.getId() + responseModel.getName()
							+ responseModel.getValue());
				} else {
					if (i % 20 == 0)
						System.out.println(param + " devam ediyor...");
					// System.out.print(donus);
				}
				i++;
			}

			System.out.println("Bitti " + param + " " + (System.currentTimeMillis() - t));
		}
	}

}
