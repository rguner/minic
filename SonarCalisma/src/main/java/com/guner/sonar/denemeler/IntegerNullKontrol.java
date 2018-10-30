package com.guner.sonar.denemeler;

public class IntegerNullKontrol {
	
	public static void main(String[] args) {
		IntegerNullKontrol integerNullKontrol = new IntegerNullKontrol();
		integerNullKontrol.execute();
	}

	private void execute() {

		Integer integer=32210;
		Integer integer3=32210;
		Integer integerA=10;
		Integer integerB=10;
		Integer integer2=null;
		System.out.println("Integer --> " +  integer);
		System.out.println("Integer --> " +  integer2);
		
		if ( integer==integer3)
			System.out.println("eşit");
		else 
			System.out.println("eşit değil");
		
		if ( integerA==integerB)
			System.out.println("eşit");
		else 
			System.out.println("eşit değil");
		
		
		if ( integer2==integer3)
			System.out.println("eşit");
		else 
			System.out.println("eşit değil");
		
		// intValue yaptiginden null cikar.
		
		if ( integer2==20)
			System.out.println("eşit");
		else 
			System.out.println("eşit değil");
		
	}

}
