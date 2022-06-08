package countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Decrementer implements Runnable {

	CountDownLatch latch = null;

	public Decrementer(CountDownLatch latch) {
		this.latch = latch;
	}

	public void run() {

		try {
			Thread.sleep(2000);
			this.latch.countDown();
			System.out.println("Latch countDown yapıldı");

			Thread.sleep(2000);
			this.latch.countDown();
			System.out.println("Latch countDown yapıldı");

			Thread.sleep(2000);
			this.latch.countDown();
			System.out.println("Latch countDown yapıldı");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
