package com.guner.calisma.jmockit2;

public class Bank {

	DBManager dbManager = new DBManager();

	public String processAccount(int accountID) {

		// Some other code goes here

		String accountHolderName = dbManager.retrieveAccountHolderName(accountID);

		// some more processing code

		return accountHolderName;
	}
}
