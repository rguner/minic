package com.guner.calisma.jmockit;

import static org.junit.Assert.*;

import mockit.Mock;
import mockit.MockUp;
import mockit.Tested;
import org.junit.Test;

public class Department5Test {

	@Tested
	Department dept;

	@Test
	public void testGetNameCalls() {

		new MockUp<Department>() {

			@Mock // A directive to JMockit to redefine the method. Remember!!
			public String getPersonName() {
				return "ramazan";
			}

		};
		String name = dept.getPersonName();
		assertEquals("ramazan", name);
	}
}
