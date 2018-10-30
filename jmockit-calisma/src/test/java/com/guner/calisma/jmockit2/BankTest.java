package com.guner.calisma.jmockit2;

import static org.junit.Assert.*;

import mockit.Expectations;
import org.junit.Test;

public class BankTest {

	@Test
	public void testRetrieveAccountHolderName() {

		Bank bank = new Bank();
		// Define the Expectations block here
		new Expectations() {

			DBManager dbManager; // variables declared here are mocked by default
			{
				dbManager.retrieveAccountHolderName(10);
				returns("Abhi");
			}
		};

		String name = bank.processAccount(10);

		assertEquals("Account holder Name for A/C id 10 is 'Abhi' ", "Abhi", name);

	}
}
