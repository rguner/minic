package com.guner.sonar.denemeler;

public final class SwitchCase {
	
	private SwitchCase() {		
	}

	
	public static void main(String[] args) {
		SwitchCase switchCase = new SwitchCase();
		switchCase.execute1();
		

	}

	private void execute1() {
		String actionKey="tariff.compare";
		//String actionKey=null; NPE..
		Boolean action_key = false;
		switch (actionKey) {
			case "tariff.compare" :                               
			case "creditcard.tl.yukle" :                                
			case "creditcard.nar.yukle" :                               
			case "creditcard.cepten.internet.yukle" :                                 
			case "creditcard.bilg.internet.yukle" :                            
			case "loginsiz.query.invoice.by.gsm" :                             
			case "loginsiz.pay.invoice" :                               
			case "loginsiz.query.invoice.by.name" :
			case "login.normal" :
			       action_key = true;
			       break;
			default: 
			       action_key = false;
			       break;
		}
	    System.out.println(action_key);
		
	}

}
