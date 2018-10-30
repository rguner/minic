package com.guner.sonar.denemeler;

import com.guner.sonar.denemeler.PaketlerimUtils.GetPacketListByMsisdnInput;
import com.guner.sonar.denemeler.PaketlerimUtils.GetPacketListByMsisdnOutput;
import static com.guner.sonar.denemeler.PaketlerimUtils.getCategoryListByMsisdn;

public class PaketlerimUtilsUsage {
	
	public static void main(String[] args) {
		PaketlerimUtilsUsage paketlerimUtilsUsage = new PaketlerimUtilsUsage();
		//paketlerimUtilsUsage.execute();
		paketlerimUtilsUsage.executeMT();
	}

	private void execute() 
	{
		
		GetPacketListByMsisdnInput input = new GetPacketListByMsisdnInput("1");
		GetPacketListByMsisdnOutput getPacketListByMsisdnOutput = PaketlerimUtils.getCategoryListByMsisdn(input);
		System.out.println("paremetre --> " + input.toString() + "  "+ input.getMsisdn() + ", sonuc --> " + getPacketListByMsisdnOutput.toString() + " " + getPacketListByMsisdnOutput.getMsisdn());
		
		GetPacketListByMsisdnInput input2 = new GetPacketListByMsisdnInput("2");
		GetPacketListByMsisdnOutput getPacketListByMsisdnOutput2 = PaketlerimUtils.getCategoryListByMsisdn(input2);
		System.out.println("paremetre --> " + input2.toString() + "  "+ input2.getMsisdn() + ", sonuc --> " + getPacketListByMsisdnOutput2.toString() + " " + getPacketListByMsisdnOutput2.getMsisdn());
		
	}
	
	private void executeMT() {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				   
				try{						
					GetPacketListByMsisdnInput input = new GetPacketListByMsisdnInput("1");
					//GetPacketListByMsisdnOutput getPacketListByMsisdnOutput = PaketlerimUtils.getCategoryListByMsisdn(input);
					GetPacketListByMsisdnOutput getPacketListByMsisdnOutput = getCategoryListByMsisdn(input); // yukaridaki ile aynı, import static sayesinde.
					System.out.println("THREAD1 paremetre --> " + input.toString() + "  "+ input.getMsisdn() + ", sonuc --> " + getPacketListByMsisdnOutput.toString() + " " + getPacketListByMsisdnOutput.getMsisdn());				  	  	
				}
				catch(Exception ex){
					ex.printStackTrace();
				}
				}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				   
				try{						
					GetPacketListByMsisdnInput input = new GetPacketListByMsisdnInput("2");
					GetPacketListByMsisdnOutput getPacketListByMsisdnOutput = PaketlerimUtils.getCategoryListByMsisdn(input);
					System.out.println("THREAD2 paremetre --> " + input.toString() + "  "+ input.getMsisdn() + ", sonuc --> " + getPacketListByMsisdnOutput.toString() + " " + getPacketListByMsisdnOutput.getMsisdn());				  	  	
				}
				catch(Exception ex){
					ex.printStackTrace();
				}
				}
		});
		
		t1.start();
	  	t2.start();
  	  	
		
	}



	
}