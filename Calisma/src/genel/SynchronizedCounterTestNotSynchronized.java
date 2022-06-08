package genel;


public class SynchronizedCounterTestNotSynchronized 
{
	
	public static void main(String[] args) 
	{
		SynchronizedCounterTestNotSynchronized synchronizedCounterTest = new SynchronizedCounterTestNotSynchronized();
		
		
	}
	
	public SynchronizedCounterTestNotSynchronized()
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
			int i=1;
			while (true)
			{
				sc.incrementNotSynchronized();
				System.out.println("A " + sc.valueNotSynchronized() + " ---- " + i);
				//System.out.println("A " + sc.d + " ----" + i);
				i++;
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
				System.out.println("B " + sc.valueNotSynchronized());
				//System.out.println("B " + sc.d);
			}
		}
	}

}
