package com.guner.sonar.denemeler;
import java.util.HashMap;
import java.util.Map;


public class KeysetOrEntrySet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		KeysetOrEntrySet keysetOrEntrySet = new KeysetOrEntrySet();
		keysetOrEntrySet.method();

	}

	private void method() {
		
		HashMap<String,String> filters = new HashMap<String, String>();
		for (int i=0;i<90000;i++)
		{
			filters.put("RamazanKey"+i, "RamazanValue");
			filters.put("CeyhanKey"+i, "CeyhanValue");
			filters.put("SevvalKey"+i, "SevvalValue");
			filters.put("OmerKey"+i, "OmerValue");
		}
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		keysetYontemi(filters);
		
		entrysetYontemi(filters);

		
	}
	
	private void keysetYontemi(HashMap<String, String> filters) {
		
	   //Performance - Inefficient use of keySet iterator instead of entrySet iterator       Open         
	   //com.guner.sonar.denemeler.KeysetOrEntrySet.keysetYontemi(HashMap) makes inefficient use of keySet iterator instead of entrySet iterator
	    // hem döngü var, hem get var o zaman bu hata oluşuyor.
		   
		for(String filter:filters.keySet())
		{
			System.out.println(filter + " --> " + filters.get(filter));
		}
	}

	private void entrysetYontemi(HashMap<String, String> filters) {
		for(Map.Entry<String, String> entry:filters.entrySet())
		{
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}
	}

	

}
