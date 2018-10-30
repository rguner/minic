package threadlocal;

public class ThreadLocalExample {

	public static class MyRunnable implements Runnable {

		// threadlocal farklı threadlerde ezilmezken, otherDegisken eziliyor..
		private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();
		private Integer otherDegisken;

		@Override
		public void run() {
			threadLocal.set(Integer.valueOf(Thread.currentThread().getId() + ""));
			otherDegisken = Integer.valueOf(Thread.currentThread().getId() + "");

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}

			System.out.println(Thread.currentThread().getId() + " --> " + threadLocal.get() + " " + otherDegisken);
		}
	}

	public static void main(String[] args) {
		MyRunnable sharedRunnableInstance = new MyRunnable();

		Thread thread1 = new Thread(sharedRunnableInstance);
		Thread thread2 = new Thread(sharedRunnableInstance);

		thread1.start();
		thread2.start();

		try {
			thread1.join(); // wait for thread 1 to terminate
			thread2.join(); // wait for thread 2 to terminate
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
