package com.guner.calisma.jmockit;

import static org.junit.Assert.*;

import mockit.Mock;
import mockit.MockUp;
import org.junit.Test;

public class Department4Test {

	@Test
	public void testGetNameCalls() {
		Department dept = new Department();

		new MockUp<Department>() {

			@Mock // A directive to JMockit to redefine the method. Remember!!
			public String getPersonName() {
				return null;
			}

		};
		String name = dept.getPersonName();// this call returns a null because of redefinition
		assertNull(name);
	}
}
