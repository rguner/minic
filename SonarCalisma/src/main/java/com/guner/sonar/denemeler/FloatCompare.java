package com.guner.sonar.denemeler;

import java.math.BigDecimal;

public class FloatCompare {

	public static void main(String[] args) {
		FloatCompare floatCompare = new FloatCompare();
		floatCompare.execute();
		floatCompare.execute2();
		floatCompare.execute3();
	}

	private void execute() {
		log("FLOAT--------------------------------------");
		float myNumber = 3.146f;
		// float myNumber = (float) 3.146;
		// Float myNumber = new Float(3.146);
		// float myNumber = Float.parseFloat("3.146");

		log(Float.toString(myNumber));
		BigDecimal bd1 = new BigDecimal(myNumber);
		log(bd1.toString());
		BigDecimal bd2= BigDecimal.valueOf(myNumber);
		log(bd2.toString());
		if (myNumber == 3.146f) {
			log("eşit 3.146f");
		}
		if (myNumber != 3.146f) {
			log("eşit değil 3.146f");
		}
		if (myNumber == 3.146) {
			log("eşit 3.146");
		}
		if (myNumber != 3.146) {
			log("eşit değil 3.146");
		}
		// System.out.println(Float.floatToRawIntBits(myNumber));
		// if (Float.floatToRawIntBits(myNumber) == 3.146) {
		// log("eşit floatToRawIntBits 3.146f ");
		// }

		float zero = 0.0f;
		log(Float.toString(zero));
		BigDecimal bdZero = new BigDecimal(zero);
		log(bdZero.toString());
		if (zero == 0.0) {
			log("eşit 0.0");
		}

	}

	private void execute2() {
		log("DOUBLE--------------------------------------");
		double myNumber2 = 3.146d;
		log(Double.toString(myNumber2));
		BigDecimal bd2 = new BigDecimal(myNumber2);
		log(bd2.toString());
		BigDecimal bd3 = new BigDecimal(3.146);
		log(bd3.toString());
		BigDecimal bd4 = BigDecimal.valueOf(myNumber2);
		log(bd4.toString());
		if (myNumber2 == 3.146d) {
			log("eşit 3.146d");
		}
		if (myNumber2 != 3.146d) {
			log("eşit değil 3.146d");
		}
		if (myNumber2 == 3.146f) {
			log("eşit 3.146f");
		}
		if (myNumber2 == 3.146) {
			log("eşit 3.146");
		}
		if (myNumber2 != 3.146) {
			log("eşit değil 3.146");
		}
	}

	private void execute3() {
		System.err.println(-0.0f == 0.0f); // true
		System.err.println(new Float(-0.0f).equals(new Float(0.0f))); // false
		System.err.println(0.1 + 0.2 == 0.3); // false
		// System.err.println(NaN == NaN); // false
		// System.err.println(new Float(NaN).equals(new Float(NaN))); // true
	}

	private void log(String s) {
		System.out.println(s);
	}

}
