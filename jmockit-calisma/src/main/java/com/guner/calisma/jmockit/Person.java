package com.guner.calisma.jmockit;

public class Person {

	String name = "Abhi";

	public Person() {
		name = "Default Abhi";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
