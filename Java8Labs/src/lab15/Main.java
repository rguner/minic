package lab15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		// Setup Executor
		ExecutorService es = Executors.newCachedThreadPool();
		// ExecutorService es = Executors.newFixedThreadPool(2);

		for (int i = 0; i < 3000; i++) {
			// Submit Runnable
			es.submit(new CountRunnable(2000, "A"));
			es.submit(new CountRunnable(2000, "B"));
			es.submit(new CountRunnable(2000, "C"));
		}
		// Showndown ExectuorService
		es.shutdown();
	}
}
