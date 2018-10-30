package concurrent;

import java.util.HashMap;




public class SynchronizedHashMapTest 
{
	
	public static void main(String[] args) 
	{
		SynchronizedHashMapTest synchronizedHashMapTest = new SynchronizedHashMapTest();
		
		
	}
	
	public SynchronizedHashMapTest()
	{
		HashMap<String,String> hashMap= new HashMap<String, String>();
		
		AThread aThread = new AThread(hashMap);
		aThread.start();
		
		//AThread aThread2 = new AThread(hashMap);
		//aThread2.start();

		
		
		BThread bThread = new BThread(hashMap);
		bThread.start();
		
		//BThread bThread2 = new BThread(hashMap);
		//bThread2.start();
	}
	
	
	
	private class AThread extends Thread 
	{
		private HashMap<String,String> hashMap;
		
		public AThread(HashMap<String,String> hashMap)
		{
			this.hashMap=hashMap;
		}
		
		public void run() 
		{
			int i=0;
			long t=System.currentTimeMillis();
			while (i<2000)
			{
				hashMap.put("keyA"+i, "keyA"+i);
				System.out.println("A " + "keyA"+i);
				i++;
			}
			
			System.out.println("Bitti A " + (System.currentTimeMillis()-t) + "  Adet: " + hashMap.size());
		}
	}
	
	private class BThread extends Thread 
	{
		private HashMap<String,String> hashMap;
		
		public BThread(HashMap<String,String> hashMap)
		{
			this.hashMap=hashMap;
		}
		
		public void run() 
		{
			int j=0;
			long t=System.currentTimeMillis();
			while (j<2000)
			{
				hashMap.put("keyB"+j, "keyB"+j);
				System.out.println("B " + "keyB"+j);
				j++;
			}
			System.out.println("Bitti B " + (System.currentTimeMillis()-t) + "  Adet: " + hashMap.size());
		}
	}

}
