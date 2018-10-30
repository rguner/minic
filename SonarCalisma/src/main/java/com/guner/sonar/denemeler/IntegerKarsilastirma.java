package com.guner.sonar.denemeler;

public class IntegerKarsilastirma {

	public static void main(String[] args) {
		IntegerKarsilastirma integerKarsilastirma = new IntegerKarsilastirma();
		integerKarsilastirma.execute1();
		integerKarsilastirma.execute2();
		integerKarsilastirma.execute3();
		integerKarsilastirma.execute4();
		integerKarsilastirma.execute5();		
		integerKarsilastirma.execute6();
	}


	public void execute1() {
		// -128 ile 127 arası cachlenir, i1 ile i2 aynı object olur.
		Integer i1=Integer.valueOf(99); 
		Integer i2=Integer.valueOf(99);
		if (i1==i2)
			System.out.println("true");
		else
			System.out.println("false");
		
		// bu aşamada i1 farklı bir object oluyor. bu nedenle problem yok.
		i1=88;
		System.out.println(i2.intValue());
		
	}
	
	public void execute2() {
		Integer i1=new Integer(521);
		Integer i2=new Integer(521);
		if (i1==i2)
			System.out.println("true");
		else
			System.out.println("false");
		
	}
	
	public void execute3() {
		
		Integer i1=Integer.valueOf(521);
		Integer i2=Integer.valueOf(521);
		if (i1.intValue()==i2.intValue())
			System.out.println("true");
		else
			System.out.println("false");
		
	}
	
	public void execute4() {
		Integer i1=new Integer(521);
		Integer i2=new Integer(521);
		if (i1.equals(i2))
			System.out.println("true");
		else
			System.out.println("false");
		
	}
	
	public void execute5() {
		Integer i1=new Integer(521);
		Integer i2=new Integer(521);
		if (i1==i2)
			System.out.println("Objectler eşit");
		else
			System.out.println("Objectler eşit değil");
		if (i1.equals(i2))
			System.out.println("Valuelar eşit");
		else
			System.out.println("Valuelar eşit değil");

		
	}
	
	public void execute6() {
		Integer i1=Integer.valueOf(99);
		Integer i2=Integer.valueOf(99);
		if (i1==i2)
			System.out.println("Objectler eşit");
		else
			System.out.println("Objectler eşit değil");
		if (i1.equals(i2))
			System.out.println("Valuelar eşit");
		else
			System.out.println("Valuelar eşit değil");

		
	}


}
