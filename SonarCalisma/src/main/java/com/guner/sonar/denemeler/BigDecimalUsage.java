package com.guner.sonar.denemeler;

import java.math.BigDecimal;

public class BigDecimalUsage {

	public static void main(String[] args) {
		BigDecimalUsage bigDecimalUsage = new BigDecimalUsage();
		bigDecimalUsage.execute();
	}

	private void execute() {
		double d = 1.1;

		BigDecimal bd1 = new BigDecimal(d); // Noncompliant; see comment above
		BigDecimal bd2 = new BigDecimal(1.1); // Noncompliant; same result

		// Compliant Solution

		BigDecimal bd3 = BigDecimal.valueOf(d);
		BigDecimal bd4 = BigDecimal.valueOf(1.1);

		System.out.println(bd1);
		System.out.println(bd2);
		System.out.println(bd3);
		System.out.println(bd4);

	}
}
