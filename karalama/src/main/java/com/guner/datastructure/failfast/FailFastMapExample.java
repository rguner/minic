package com.guner.datastructure.failfast;// Java code to illustrate
// Fail Fast Iterator in Java
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastMapExample {
	public static void main(String[] args)
	{
		Map<String, String> cityCode = new HashMap<String, String>();
		cityCode.put("Delhi", "India");
		cityCode.put("Moscow", "Russia");
		cityCode.put("New York", "USA");
		cityCode.put("Tokyo", "Japan");

		// iterator ile silme
		System.out.println("-------- Iterator silme --------");
		Iterator iterator1 = cityCode.keySet().iterator();

		while (iterator1.hasNext()) {
			String country= cityCode.get(iterator1.next());
			System.out.println(country);

			// no exception occurs.
			if ("USA".equalsIgnoreCase(country)) {
				iterator1.remove();
				System.out.println("USA deleted");
			}
		}

		// normal collection ile silme.
		System.out.println("-------- Map item ekleme veya silme --------");
		Iterator iterator = cityCode.keySet().iterator();

		while (iterator.hasNext()) {
			System.out.println(cityCode.get(iterator.next()));

			// adding an element to Map
			// exception will be thrown on next call
			// of next() method.
			cityCode.put("Istanbul", "Turkey");
			// her iki durumda da ConcurrentModificationException fırlatılır.
			// cityCode.remove("Delhi");
		}
	}
}
