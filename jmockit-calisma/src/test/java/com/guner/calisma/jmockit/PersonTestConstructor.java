package com.guner.calisma.jmockit;

import static org.junit.Assert.*;

import mockit.Mock;
import mockit.MockUp;
import org.junit.Test;

/******************* PersonTestConstructor.java ***********/
public class PersonTestConstructor {

	@Test
	public void testGetName() {
		new MockUp<Person>() {

			@Mock
			public void $init() {
				// Dont assign name variable at all
				// Leave it null
				System.out.println("deneme");
			}

		};

		Person p = new Person();
		String name = p.getName();

		assertNull("Name of person is null", name);
	}

}
