package com.guner.sonar.denemeler;

import java.util.Arrays;

public class ArrayToString {

	public static void main(String[] args) {
		ArrayToString arrayToString = new ArrayToString();
		arrayToString.execute1();
	}

	private void execute1() {
		String[] sArray = { "ramazan", "ceyhan", "omer", "sevval" };
		String[] sArray2 = { "ramazan" };
		String[] sArray3 = { "1", "2" };
		System.out.println(sArray.toString());
		System.out.println(sArray);
		System.out.println(sArray2.toString());
		System.out.println(sArray3.toString());
		System.out.println(Arrays.toString(sArray));
		System.out.println(Arrays.toString(sArray2));
		System.out.println(Arrays.toString(sArray3));
		if (sArray.toString().startsWith("r"))
			System.out.println("r ile baslar");
		else
			System.out.println("r ile baslamaz");

		if (Arrays.toString(sArray2).startsWith("[r"))
			System.out.println("[r ile baslar");
		else
			System.out.println("[r ile baslamaz");

	}

}
