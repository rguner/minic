public class TestVolatile extends Thread {

	volatile boolean keepRunning = true;

	// boolean keepRunning = true;

	public void run() {
		long count = 0;
		while (keepRunning) {
			count++;
			// System.out.println(".");
		}

		System.out.println("Thread terminated." + count);
	}

	public static void main(String[] args) throws InterruptedException {
		TestVolatile t = new TestVolatile();
		t.start();
		Thread.sleep(1000);
		t.keepRunning = false;
		System.out.println("keepRunning set to false.");
	}
}
