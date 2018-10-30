package com.guner.sonar.denemeler;

public class IfStatement {

	public static void main(String[] args) {
		IfStatement ifStatement = new IfStatement();
		ifStatement.execute1();
		ifStatement.execute2();

	}

	private void execute1() {
		
		Boolean cdto1= Boolean.TRUE;
		Boolean cdto2= Boolean.TRUE;
		Boolean cdto3= Boolean.TRUE;
		
		if ( cdto1!=null && cdto1.booleanValue()==true && cdto2!=null && cdto2.booleanValue()==true && cdto3!=null && cdto3.booleanValue()==true)
		{
			System.out.println("TRUE");
		}
		
	}
	
	private void execute2() {
		
		Boolean cdto1= Boolean.TRUE;
		Boolean cdto2= Boolean.TRUE;
		Boolean cdto3= Boolean.TRUE;
		Boolean cdto4= Boolean.TRUE;	
		
		boolean bCdto1=cdto1!=null && cdto1.booleanValue();
		boolean bCdto2=cdto2!=null && cdto2.booleanValue();
		boolean bCdto3=cdto3!=null && cdto3.booleanValue();
		boolean bCdto4=cdto4!=null && cdto4.booleanValue();
		
		if ( bCdto1 && bCdto2 && bCdto3 && bCdto4)
		{
			System.out.println("TRUE");
		}
		
	}

}
