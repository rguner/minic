package genel;


public class SynchronizedCounterAtomicTest 
{
	
	public static void main(String[] args) 
	{
		SynchronizedCounterAtomicTest synchronizedCounterTest = new SynchronizedCounterAtomicTest();
		
		
	}
	
	public SynchronizedCounterAtomicTest()
	{
		SynchronizedCounter sc= new SynchronizedCounter();
		
		
		
		AThread aThread = new AThread(sc);
		aThread.start();
		
		
		BThread bThread = new BThread(sc);
		bThread.start();
	}
	
	
	
	private class AThread extends Thread 
	{
		private SynchronizedCounter sc;
		
		public AThread(SynchronizedCounter sc)
		{
			this.sc=sc;
		}
		
		public void run() 
		{
			while (true)
			{
				sc.incrementAtomic();
				System.out.println("A " + sc.valueAtomic());
			}
		}
	}
	
	private class BThread extends Thread 
	{
		private SynchronizedCounter sc;
		
		public BThread(SynchronizedCounter sc)
		{
			this.sc=sc;
		}
		
		public void run() 
		{
			while (true)
			{
				sc.decrementAtomic();
				System.out.println("B " + sc.valueAtomic());			
				
				
			}
		}
	}

}
