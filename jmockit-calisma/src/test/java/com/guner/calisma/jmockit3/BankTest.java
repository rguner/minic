package com.guner.calisma.jmockit3;

import static org.junit.Assert.*;

import mockit.Mock;
import mockit.MockUp;
import org.junit.Test;

public class BankTest {

	@Test
	public void testMakeConnectionWithMockUp() {
		new MockUp<DBManager>() {

			// Redefine the method here
			// But With No static modifier
			@Mock
			public String getConnectionString() {
				return "DUPLICATE";
			}

		};

		Bank bank = new Bank();
		String status = bank.makeConnection();

		assertEquals("Status is FAIL", "FAIL", status);
	}

	@Test
	public void testMakeConnectionSuccessWithMockUp() {
		new MockUp<DBManager>() {

			// Redefine the method here
			// But With No static modifier
			@Mock
			public String getConnectionString() {
				return "ORIGINAL";
			}

		};

		Bank bank = new Bank();
		String status = bank.makeConnection();

		assertEquals("Status is SUCCESS", "SUCCESS", status);
	}
}
