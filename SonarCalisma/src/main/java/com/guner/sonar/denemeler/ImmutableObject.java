package com.guner.sonar.denemeler;

import java.util.Date;

public class ImmutableObject {
	
	public static void main(String[] args) {
		ImmutableObject immutableObject = new ImmutableObject();
		immutableObject.immutableExample1();
		immutableObject.immutableExample2();
		immutableObject.mutableExample1();
	}

	// sYedek s1'in eski halini görüyor. Çünkü s1'e atama yapılduğunda yeni bir object create edildi
	private void immutableExample1() {
		
		String s1="ramazan";
		String s2="guner";
		
		String sYedek=s1;
		
		
		System.out.println(s1.hashCode() + " " + s2.hashCode() + " " + sYedek.hashCode());
		
		s1="sevval";
		
		System.out.println(s1.hashCode() + " " + s2.hashCode() + " " + sYedek.hashCode());
		
		System.out.println(s1 + " " + s2 + " " + sYedek);
		
	}
	
	// sYedek s1'in eski halini görüyor. Çünkü s1'e atama yapılduğunda yeni bir object create edildi
	private void immutableExample2() {
		
		Integer s1=10;
		Integer s2=20;
		
		Integer sYedek=s1;
		
		
		System.out.println(s1.hashCode() + " " + s2.hashCode() + " " + sYedek.hashCode());
		
		s1=30;
		
		System.out.println(s1.hashCode() + " " + s2.hashCode() + " " + sYedek.hashCode());
		
		System.out.println(s1 + " " + s2 + " " + sYedek);
		
	}
	
	// sYedek s1'in eski halini görmüyor. s1'de yapılan değişiklikler sYedek'e yansıyor. Çünkü Date mutable, atama ile yeni bir oject create olmuyor.
	private void mutableExample1() {
		
		Date s1=new Date();
		Date s2=new Date();
		s2.setYear(52);
		
		Date sYedek=s1;
		
		
		System.out.println(s1.hashCode() + " " + s2.hashCode() + " " + sYedek.hashCode());
		
		s1.setYear(51);
		
		System.out.println(s1.hashCode() + " " + s2.hashCode() + " " + sYedek.hashCode());
		
		System.out.println(s1 + " " + s2 + " " + sYedek);
		
	}

}
