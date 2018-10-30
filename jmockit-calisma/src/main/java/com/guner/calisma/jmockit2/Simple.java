package com.guner.calisma.jmockit2;

public class Simple {

	private String iAmPrivate() {
		return "Private Method";
	}

	public String publicCallsPrivate() {
		return iAmPrivate();
	}
}
