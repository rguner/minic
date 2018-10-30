package com.guner.calisma.jmockit2;

import static org.junit.Assert.*;

import mockit.Mock;
import mockit.MockUp;
import org.junit.Test;

public class SimpleTest {

	@Test
	public void testPublicInvokesPrivateMockUp() {

		new MockUp<Simple>() {

			// Override the private method
			// Dont provide any ACCESSS MODIFIER!
			@Mock
			String iAmPrivate() {
				return "MockUp Invoke";
			}

		};

		Simple simple = new Simple();

		String str = simple.publicCallsPrivate();
		assertEquals("String returned - MockUp Invoke", "MockUp Invoke", str);

	}
}
