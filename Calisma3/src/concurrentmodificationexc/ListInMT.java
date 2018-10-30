package concurrentmodificationexc;

import java.util.ArrayList;
import java.util.List;

public class ListInMT {

	public static void main(String[] args) {
		ListInMT listInMT = new ListInMT();
		listInMT.execute();

	}

	private void execute() {

		long t = System.currentTimeMillis();
		System.out.println(t);

		List<String> list = new ArrayList<String>();
		for (int i = 0; i < 1000; i++)
			list.add("ramazan" + i);

		AThread aThread = new AThread(list);
		aThread.start();

		BThread bThread = new BThread(list);
		bThread.start();

	}

	private class AThread extends Thread
	{

		List<String> list;

		public AThread(List<String> list)
		{
			this.list = list;
		}

		public void run()
		{
			try {
				for (String s : list)
					System.out.println(s);
			} catch (Exception e)
			{
				System.out.println("hata1");
				e.printStackTrace();
				System.out.println("hata2");
			}
		}
	}

	private class BThread extends Thread
	{

		List<String> list;

		public BThread(List<String> list)
		{
			this.list = list;
		}

		public void run()
		{
			for (int i = 0; i < 1000; i++)
				list.add("selam" + i);
		}
	}

}
