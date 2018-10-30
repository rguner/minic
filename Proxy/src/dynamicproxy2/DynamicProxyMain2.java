package dynamicproxy2;

import java.util.HashMap;

public class DynamicProxyMain2 {

	public static void main(String[] args) {

		DynamicProxyMain2 dynamicProxyMain2 = new DynamicProxyMain2();
		dynamicProxyMain2.execute();
	}

	public void execute() {

		HashMap identity = new HashMap();
		Person person = new Person();
		HashMap map = new HashMap();
		IPerson ip = (IPerson) ViewProxy.newInstance(map,
				person,
				new Class[] { IPerson.class });

		IEmployee ie = (IEmployee) ViewProxy.newInstance(map,
				person,
				new Class[] { IEmployee.class });

		ip.setName("ramazan");
		ie.setAddress("alooo");

	}

}
