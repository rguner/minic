package com.turkcell.jrebel.calisma;

public class RebelDenemeleri {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		RebelDenemeleri rebelDenemeleri = new RebelDenemeleri();
		for ( int i=0;i<100;i++)
		{
			rebelDenemeleri.carpmaIslemi();
			rebelDenemeleri.toplamaIslemi();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private void toplamaIslemi() {
		System.out.println("++++++ TOPLAMA ++++++++");
		System.out.println(".....................");
		//System.out.println(2+3);
		//System.out.println("++++++++++++++++++++++");
		
	}

	private void carpmaIslemi() {
		
		System.out.println("-------- CARPMA --------");
		//System.out.println(2*3);
		//System.out.println("------------------------");
		
	}

}
