package com.guner.sonar.denemeler;

public class Compare {

	public static void main(String[] args) {
		
		Compare compare = new Compare();
		compare.execute1();
		compare.execute2();
		compare.execute3();
		compare.execute4();
	}

	public void execute1() {
		Integer i=20;
		if (i.equals(20))
			System.out.println("eşit");
		else
			System.out.println("farklı");
		
	}
	
	public void execute2() {
		Integer i=20;
		if (i.equals("20"))
			System.out.println("eşit");
		else
			System.out.println("farklı");
		
	}
	
	private void execute3() {
		long id=123;
		Long idLong=123L;
		if ( idLong.equals(String.valueOf(id))) 
			System.out.println("eşit");
		else
			System.out.println("farklı");
		
	}
	
	private void execute4() {
		String s="ramazan";
		if ( s.equals("ramazan")) 
			System.out.println("eşit");
		else
			System.out.println("farklı");
		
	}

}
