package com.guner.calisma.jmockit;

import static org.junit.Assert.*;

import mockit.Mock;
import mockit.MockUp;
import org.junit.Test;

public class BankTest {

	@Test
	public void testBankStaticBlock() {

		new MockUp<Bank>() {

			@SuppressWarnings("unused")
			@Mock
			public void $clinit() {
				Bank.updateBalance(500);
			}
		};

		assertEquals("The balance amount is 500", 500, Bank.balanceAmount);

	}
}
