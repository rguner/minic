package genel;

public class SynchronizedCounterTest
{

	public static void main(String[] args)
	{
		SynchronizedCounterTest synchronizedCounterTest = new SynchronizedCounterTest();

	}

	public SynchronizedCounterTest()
	{
		SynchronizedCounter sc = new SynchronizedCounter();

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
			this.sc = sc;
		}

		public void run()
		{
			synchronizedMethod1();
			synchronizedMethod2();
			staticSynchronizedMethod();
			while (true)
			{
				sc.increment();
				System.out.println("A " + sc.value());
			}
		}
	}

	private class BThread extends Thread
	{

		private SynchronizedCounter sc;

		public BThread(SynchronizedCounter sc)
		{
			this.sc = sc;
		}

		public void run()
		{
			synchronizedMethod1();
			synchronizedMethod2();
			staticSynchronizedMethod();
			while (true)
			{
				sc.decrement();
				System.out.println("B " + sc.value());

			}
		}
	}

	/**
	 * static synchronized metod, class'ı lock'lar..
	 * 
	 * sadece synchronized metod object'i locklar..
	 */
	private static synchronized void staticSynchronizedMethod()
	{
		System.out.println("staticSynchronizedMethod  method...");
	}

	private synchronized void synchronizedMethod1()
	{
		System.out.println("synchronizedMethod1  method...");
	}

	private synchronized void synchronizedMethod2()
	{
		System.out.println("synchronizedMethod2  method...");
	}

}
