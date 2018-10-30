package com.guner.java8calisma;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		execute1();
	}

	private static void execute1() {

		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");

		// lambda
		// Output : A,B,C,D,E
		items.forEach(item -> System.out.print(item));

		System.out.println("");

		// Output : C
		items.forEach(item -> {
			if ("C".equals(item)) {
				System.out.print(item);
			}
		});
		System.out.println("");

		// method reference
		// Output : A,B,C,D,E
		items.forEach(System.out::print);
		System.out.println("");

		// Stream and filter
		// Output : B
		items.stream()
				.filter(s -> s.contains("B"))
				.forEach(System.out::print);
		System.out.println("");

	}
}
