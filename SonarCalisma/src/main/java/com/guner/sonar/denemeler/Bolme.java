package com.guner.sonar.denemeler;

public class Bolme {
	
	public static void main(String[] args) {
		Bolme bolme= new Bolme();
		bolme.execute1();
		bolme.execute2();
		bolme.execute3();
	}

	private void execute1() {

		int x = 2;
		int y = 5;
		// Wrong: yields result 0.0
		int sonuc= x /y ;
		double value =  x / y;
		System.out.println("Int: " + sonuc + " Double: " + value);

		
	}
	
	private void execute2() {

		int x = 2;
		int y = 5;

		// Right: yields result 0.4
		double value =  x / (double) y;
		int sonuc= (int) (x /(double) y) ;
		System.out.println("Int: " + sonuc + " Double: " + value);

		
	}
	
	private void execute3() {

		int x = 2;
		int y = 5;

		// Right: yields result 0.4
		double value =  (double) x / y;
		int sonuc=  (int) ((double) x / y);
		System.out.println("Int: " + sonuc + " Double: " + value);

		
	}

}
