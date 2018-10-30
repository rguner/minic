package com.guner.calisma.jmockit2;

import static org.junit.Assert.*;

import mockit.Mock;
import mockit.MockUp;
import org.junit.Test;

public class Bank2Test {

	@Test
	public void testBankProcessAccount() {

		new MockUp<DBManager>() {

			@SuppressWarnings("unused")
			@Mock
			public String retrieveAccountHolderName(int accountId) {
				return "Abhi";
			}
		};

		Bank bank = new Bank();

		String name = bank.processAccount(20);

		assertEquals("Account holder Name for A/C id 20 is 'Abhi' ", "Abhi", name);

	}
}
