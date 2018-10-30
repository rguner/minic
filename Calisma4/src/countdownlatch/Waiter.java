package countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Waiter implements Runnable {

	CountDownLatch latch = null;

	public Waiter(CountDownLatch latch) {
		this.latch = latch;
	}

	public void run() {
		try {
			latch.await();
			// latch.await(1000, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Waiter Released");
	}
}
