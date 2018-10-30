package com.turkcell.eclipse.hotdeployment;

public class HotDeploymentDenemeleri {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HotDeploymentDenemeleri hotDeploymentDenemeleri = new HotDeploymentDenemeleri();
		for ( int i=0;i<100;i++)
		{
			hotDeploymentDenemeleri.carpmaIslemi();
			hotDeploymentDenemeleri.toplamaIslemi();
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
		System.out.println("13133");
		//System.out.println(2+3);
		//System.out.println("++++++++++++++++++++++");
		
	}

	private void carpmaIslemi() {
		
		System.out.println("-------- CARPMA --------");
		//System.out.println(2*3);
		//System.out.println("------------------------");
		
	}

}
