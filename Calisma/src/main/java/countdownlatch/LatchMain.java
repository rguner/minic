package countdownlatch;

import java.util.concurrent.CountDownLatch;

//Deneme

public class LatchMain {

	public static void main(String[] args) {
		LatchMain latchMain = new LatchMain();
		latchMain.execute();

	}

	private void execute() {
		CountDownLatch latch = new CountDownLatch(3);

		Waiter waiter = new Waiter(latch);
		Decrementer decrementer = new Decrementer(latch);

		new Thread(waiter).start();
		new Thread(decrementer).start();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
