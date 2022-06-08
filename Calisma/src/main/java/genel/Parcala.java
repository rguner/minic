package genel;

import java.util.ArrayList;
import java.util.List;


public class Parcala {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcala p = new Parcala();
		p.parcala();
		p.deneme();

	}
	
	public void parcala() {
		List msisdnList = new ArrayList();
		msisdnList.add("a1");
		msisdnList.add("a2");
		msisdnList.add("a3");
		msisdnList.add("a4");
		msisdnList.add("a5");
		msisdnList.add("a6");
		msisdnList.add("a7");
		msisdnList.add("a8");
		msisdnList.add("a9");
		msisdnList.add("a10");
		msisdnList.add("a11");
		msisdnList.add("a12");
		msisdnList.add("a13");
		msisdnList.add("a14");
		msisdnList.add("a15");
		//msisdnList.add("a16");
		
		
		if (msisdnList.size() > 5) 
		{
			int i = 0;
			List partialMsisdnList = null;
			while (i < msisdnList.size()) 
			{
				if (i % 5 == 0) {
					if (partialMsisdnList != null) // 0. eleman hari� bfm e
													// g�nder
						System.out.println(partialMsisdnList);

					partialMsisdnList = new ArrayList();
					partialMsisdnList.add(msisdnList.get(i));

				} else
					partialMsisdnList.add(msisdnList.get(i));

				i++;
			}
			System.out.println("SSS" + partialMsisdnList);

		}
	}
	
	public void deneme()
	{
		String reason="372";
		
		if (reason.equalsIgnoreCase("370")) // Vodafone 3 tur
			System.out.println("370");
		else if (reason.equalsIgnoreCase("371")) // Avea 2 dir
			System.out.println("371");
		else
			System.out.println("diger");
		
		Exception t = new Exception("hata olustu");
		System.out.println("hata2 "+  t.toString() + "hata3 " + t.getMessage());
	}

}
