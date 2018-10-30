package com.guner.sonar.denemeler;

import java.util.StringTokenizer;

public class StringNullPointer
{

	public static void main(String args[])
	{

		StringNullPointer stringNullPointer = new StringNullPointer();
		// stringNullPointer.execute1();
		// stringNullPointer.execute2();
		stringNullPointer.execute3();

	}

	private void execute1() {

		String string = "ramazan;cihangir";
		String[] parsed = string.split(";");
		System.out.println(parsed[0] + " " + parsed[1]);

	}

	private void execute2() {

		String string = null;
		String[] parsed = string.split(";");
		System.out.println(parsed[0] + " " + parsed[1]);

	}

	private void execute3() {
		// String nullOlabilirObject = null;
		// String nullOlabilirObject = "ramazan,ceyhan";
		String nullOlabilirObject = "";
		StringTokenizer tokenizer = new StringTokenizer(nullOlabilirObject, ",");
		System.out.println(tokenizer + " " + tokenizer.countTokens() + " " + tokenizer.nextToken());
	}

}
