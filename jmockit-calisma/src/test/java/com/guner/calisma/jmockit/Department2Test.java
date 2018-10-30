package com.guner.calisma.jmockit;

import mockit.Mocked;
import mockit.Verifications;
import org.junit.Test;

public class Department2Test {

	@Mocked
	Person person;// The mocked object.Note that I am NOT using new to create an instance.

	@Test
	public void testGetNameCalls() {
		Department dept = new Department();
		String name = dept.getPersonName();
		new Verifications() {

			{
				person.getName();// verify that this method is called when dept.getPersonName() is invoked
			}
		};
	}
}
