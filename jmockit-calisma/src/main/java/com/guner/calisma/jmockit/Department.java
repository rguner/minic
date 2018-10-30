package com.guner.calisma.jmockit;

public class Department {

	Person person = new Person();// Person is the 'collaborator'- a fancy name for third party object

	public String getPersonName() {
		return person.getName();
	}
}
