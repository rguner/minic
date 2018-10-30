package com.guner.calisma.jmockit4;

import mockit.Expectations;
import org.junit.Test;

public class BankTest {

	@Test(expected = Exception.class)
	public void testGetConnection() throws Exception {
		final Bank bank = new Bank();
		new Expectations(bank) {

			{
				bank.getConnection();
				result = new Exception();
			}
		};
		bank.getConnection();
	}
}
