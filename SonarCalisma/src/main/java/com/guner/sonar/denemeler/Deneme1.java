package com.guner.sonar.denemeler;

public final class Deneme1 {
	
	public static void main(String[] args) {
		Deneme1 deneme1 = new Deneme1();
		
		deneme1.immutableObject();
		
		deneme1.makeCall();
		
		deneme1.stringNull();
	}

	private void stringNull() {
		String aString= new String("ramazan");
		String nullObject=null;
		String bString= new String(nullObject);
		
	}

	private void immutableObject() {
		
		String s="";
		for (int i=0;i<100;i++)
			s+=String.valueOf(i);
		
		System.out.println(s);
	}
	
	private void kullanilmayanMethod()
	{
		
	}
	
	private void makeCall()
	{
		int i=0;
		Deneme2.make(i);
		System.out.println("Deneme1 int --> " + i);
		
		Integer in = new Integer(0);
		Deneme2.makeInteger(in);
		System.out.println("Deneme1 Integer--> " + in);
		
		
	}

}
