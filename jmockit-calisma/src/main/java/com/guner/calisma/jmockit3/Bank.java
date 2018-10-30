package com.guner.calisma.jmockit3;

public class Bank {

	public String makeConnection() {
		// some connection related code
		// goes here

		// call to static method
		String conStr = DBManager.getConnectionString();

		// If the connection String
		// is anything other than
		// ORIGINAL return FAIL
		if (conStr.equals("ORIGINAL"))
			return "SUCCESS";
		else
			return "FAIL";
	}
}
