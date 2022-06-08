package calisma4;

import java.math.BigDecimal;

public class BigDecimalCalisma {

	public static void main(String[] args) {
		BigDecimalCalisma bg = new BigDecimalCalisma();
		bg.execute1();

	}

	private void execute1() {
		double d = 1.1;

		BigDecimal bd1 = new BigDecimal(d);
		BigDecimal bd2 = new BigDecimal(1.1);
		BigDecimal bd2_f = new BigDecimal(1.1f);

		// Compliant Solution

		BigDecimal bd3 = BigDecimal.valueOf(d);
		BigDecimal bd4 = BigDecimal.valueOf(1.1);

		System.out.println(bd1);
		System.out.println(bd2);
		System.out.println(bd2_f);
		System.out.println(bd3);
		System.out.println(bd4);
		System.out.println(bd1.doubleValue());
		System.out.println("selam");

		BigDecimal bd5 = new BigDecimal(79.1f);
		System.out.println("bigdecimal from float --> " + bd5);

		BigDecimal bd5_1 = new BigDecimal(79.1d);
		System.out.println("bigdecimal from double --> " + bd5_1);

		Float ff = new Float(79.1f);
		System.out.println("float from float--> " + ff);

		Double dd = new Double(79.1f);
		System.out.println("double from float --> " + dd);

		Double dd2 = new Double(79.1d);
		System.out.println("double from double --> " + dd2);

	}
}
