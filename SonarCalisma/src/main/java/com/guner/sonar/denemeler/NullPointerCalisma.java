package com.guner.sonar.denemeler;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class NullPointerCalisma {

	public static final int YUZ = 100;
	public static final int ELLI = 50;
	public static final String NOT_NULL = "Not null";

	public static void main(String[] args) {
		NullPointerCalisma nullPointerCalisma = new NullPointerCalisma();
		for (int i = 0; i < YUZ; i++) {
			nullPointerCalisma.execute1();
		}

		// nullPointerCalisma.execute2();

		// nullPointerCalisma.execute4();

		// nullPointerCalisma.execute5();

		// nullPointerCalisma.execute6();

		// nullPointerCalisma.execute7();

		// nullPointerCalisma.execute8();

		nullPointerCalisma.execute9();
	}

	private void execute1() {
		String result;

		Random random = new Random();
		int randomInt = random.nextInt(YUZ);
		if (randomInt > ELLI) {
			result = null;
		} else {
			result = NOT_NULL;
		}

		if (result != null && !result.equalsIgnoreCase("")) {
			log("true");
		} else {
			log("false");
		}

	}

	private void execute2() {
		Object returnedFromOtherMethod = execute3();

		log(returnedFromOtherMethod.toString());

	}

	private Object execute3() {
		return null;
	}

	private void execute4() {
		Object innerIObject4 = null;

		log(innerIObject4.toString());
	}

	private void execute5() {
		Object innerIObject5 = null;
		Random random = new Random();
		int randomInt = random.nextInt(YUZ);
		if (randomInt > ELLI) {
			innerIObject5 = NOT_NULL;
		}

		log(innerIObject5.toString());

	}

	private void execute6() {
		Object innerIObject6 = assignForExecute6();

		log(innerIObject6.toString());

	}

	private Object assignForExecute6() {
		Object innerIObject6 = null;
		Random random = new Random();
		int randomInt = random.nextInt(YUZ);
		if (randomInt > ELLI) {
			innerIObject6 = NOT_NULL;
		}
		return innerIObject6;
	}

	private void log(String s) {
		System.out.println(s);
	}

	private void execute7() {
		String result;

		Random random = new Random();
		int randomInt = random.nextInt(YUZ);
		if (randomInt > ELLI) {
			result = null;
		} else {
			result = NOT_NULL;
		}
		if (result != null || result.toString().equalsIgnoreCase("ramazan")) {
			log("true");
		}

	}

	private void execute8() {
		String[] sArray = { "ramazan", "ceyhan", "sevval", "omer" };
		// String[] sArray = null;
		List<String> sList = Arrays.asList(sArray);
		System.out.println(sList);
	}

	private void execute9() {
		// String[] sArray = { "ramazan", "ceyhan", "sevval", "omer" };
		String[] sArray = null;

		for (String o : sArray) {
			System.out.println(o);
		}

	}
}
