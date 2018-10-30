package genel;

import java.util.Calendar;


public class TransIdGenerate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s=Thread.currentThread().hashCode() + "_" 
		+ Calendar.getInstance().getTimeInMillis();
		System.out.println(s);
		
		s=Thread.currentThread().getId() + "_" 
		+ Calendar.getInstance().getTimeInMillis();
		 System.out.println(s);
		 
		 s=Thread.currentThread().hashCode() + ""; 
			
			System.out.println(s);
			
		TransIdGenerate transIdGenerate = new TransIdGenerate();
		transIdGenerate.islem();

	}
	
	public void islem()
	{
		String a="A";
		System.out.println("A1 " + a);
		yap(a);
		System.out.println("A3 " + a);
		
	}
	
	public void yap(String a)
	{
		System.out.println("A2 " + a);
		a="B";
	}

}
