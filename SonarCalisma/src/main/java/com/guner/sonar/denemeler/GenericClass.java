package com.guner.sonar.denemeler;

public class GenericClass<T> {

	private T t;

	public void add(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

	public static void main(String[] args) {
		GenericClass<Integer> integerGenericClass = new GenericClass<Integer>();
		GenericClass<String> stringGenericClass = new GenericClass<String>();

		integerGenericClass.add(new Integer(10));
		stringGenericClass.add(new String("Hello World"));

		System.out.printf("Integer Value :%d\n\n", integerGenericClass.get());
		System.out.printf("String Value :%s\n", stringGenericClass.get());
	}
}
