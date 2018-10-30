package com.guner.sonar.denemeler;

import java.util.Arrays;
import java.util.List;

public class IfSadelestirme {

	public static final int RUN_COUNT = 9900000;
	private static final int ON=10;
	private static final int ONSEKIZ=18;
	private static final int ONDOKUZ=19;


	public static void main(String[] args) {

		IfSadelestirme ifSadelestirme = new IfSadelestirme();

		
		long time = System.currentTimeMillis();
		for (int i = 0; i < RUN_COUNT; i++) {
			ifSadelestirme.execute1();
		}
		System.out.println("execute1 " + (System.currentTimeMillis() - time));

		time = System.currentTimeMillis();
		for (int i = 0; i < RUN_COUNT; i++) {
			ifSadelestirme.execute2();
		}
		System.out.println("execute2 " + (System.currentTimeMillis() - time));
		
		time = System.currentTimeMillis();
		for (int i = 0; i < RUN_COUNT; i++) {
			ifSadelestirme.execute3();
		}
		System.out.println("execute3 " + (System.currentTimeMillis() - time));
		
		time = System.currentTimeMillis();
		for (int i = 0; i < RUN_COUNT; i++) {
			ifSadelestirme.execute4();
		}
		System.out.println("execute4 " + (System.currentTimeMillis() - time));
		
		time = System.currentTimeMillis();
		for (int i = 0; i < RUN_COUNT; i++) {
			ifSadelestirme.execute5();
		}
		System.out.println("execute5 " + (System.currentTimeMillis() - time));
		
		
	}

	private void execute1() {
		int serviceCode = 362;

		if (serviceCode == 10 || serviceCode == 18 || serviceCode == 19
				|| serviceCode == 20 || serviceCode == 21 || serviceCode == 24
				|| serviceCode == 119 || serviceCode == 362
				|| serviceCode == 633) {
			// System.out.println("true");
		} else {
			// System.out.println("false");
		}

	}

	private void execute2() {
		int serviceCode = 362;
		final List<Integer> SERVICE_CODES = Arrays.asList(10, 18, 19, 20, 21,
				24, 119, 362, 633);

		if (SERVICE_CODES.contains(serviceCode)) {
			// System.out.println("true");
		} else {
			// System.out.println("false");
		}

	}
	
	private void execute3() {
		int serviceCode = 362;
		
		int [] serviceCodes ={10,18,19,20,21,24,119,362,633};
		for (int sCode: serviceCodes)
		{
			if (sCode==serviceCode) {
				// System.out.println("true");
				return;
			}
		}
		// System.out.println("false");

	}
	
	private void execute4() {
		
		int serviceCode = 362;
		switch (serviceCode) {
        case ON: case ONSEKIZ: case ONDOKUZ: case 20: case 24: case 119: case 362: case 633:
        	//System.out.println("true");
            break;                   
        default:
        	//System.out.println("false");
            break;
		}
		
	}
	
	private void execute5() {
		
		int serviceCode = 361;
		int [] serviceCodes ={10,18,19,20,21,24,119,362,633};
		if (org.apache.commons.lang.ArrayUtils.contains(serviceCodes, serviceCode)) {			
			//System.out.println("true");
		} else {
			//System.out.println("false");
		}
		
	}

}
