import java.io.Serializable;

public class ThreadLocalExample3 implements Serializable {

	private static final long serialVersionUID = -2920700405299343293L;

	public static final ThreadLocal<ThreadLocalObject> threadLocal = new ThreadLocal<>();
	public ThreadLocalOlmayanObject threadLocalOlmayanObject;

	public static class Threadci extends Thread {

		ThreadLocalObject threadLocalObject;
		ThreadLocalOlmayanObject threadLocalOlmayanObject;

		public Threadci(ThreadLocalObject threadLocalObject, ThreadLocalOlmayanObject threadLocalOlmayanObject) {
			this.threadLocalObject = threadLocalObject;
			this.threadLocalOlmayanObject = threadLocalOlmayanObject;

		}

		public void run() {

			threadLocal.set(this.threadLocalObject);
			for (int i = 0; i < 10; i++) {
				threadLocalObject.threadLocalObjectUser.userId *= 2;
				threadLocal.set(this.threadLocalObject);
				System.out.println("userId -->" + threadLocal.get().threadLocalObjectUser.userId);
				threadLocalOlmayanObject.id *= 2;
				System.out.println("threadLocalOlmayanObject -->" + threadLocalOlmayanObject.id);

				// System.out.println(threadLocal.get().ad);
				try {
					Thread.currentThread().sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		ThreadLocalExample3 threadLocalExample3 = new ThreadLocalExample3();
		threadLocalExample3.execute();

	}

	private void execute() {
		ThreadLocalObject threadLocalObject = new ThreadLocalObject();
		threadLocalObject.ad = "ramazan";
		threadLocalObject.soyad = "guner";
		threadLocalObject.number = 100;

		threadLocalOlmayanObject = new ThreadLocalOlmayanObject();
		threadLocalOlmayanObject.id = 1;

		Threadci t1 = new Threadci(threadLocalObject, threadLocalOlmayanObject);
		t1.start();
		Threadci t2 = new Threadci(threadLocalObject, threadLocalOlmayanObject);
		t2.start();

	}
}
