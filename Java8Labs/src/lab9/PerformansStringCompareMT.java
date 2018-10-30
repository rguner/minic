package lab9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PerformansStringCompareMT {

	public static void main(String[] args) {
		PerformansStringCompareMT performansMT = new PerformansStringCompareMT();
		performansMT.execute();
	}

	public static final int COUNT = Integer.MAX_VALUE;

	private void execute() {

		ExecutorService executor = Executors.newFixedThreadPool(3);
		executor.submit(
				() -> {
					thread1();
				});

		executor.submit(() -> {
			thread2();
		});

		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println("attempt to shutdown executor");
			executor.shutdown();
			// executor.awaitTermination(5, TimeUnit.SECONDS);
			// } catch (InterruptedException e) {
			// System.err.println("tasks interrupted");
		} finally {
			if (!executor.isTerminated()) {
				System.err.println("cancel non-finished tasks");
			}
			// executor.shutdownNow();
			// System.out.println("shutdown finished");
		}

	}

	private void thread1() {
		long t1 = System.currentTimeMillis();
		int sonuc = 0;
		String c1 = "9";
		for (int i = 1; i < COUNT; i++) {
			if (c1.equals("1") || c1.equals("2") || c1.equals("3") || c1.equals("4") || c1.equals("5") || c1.equals("6") || c1.equals("7") || c1.equals("8")) {
				;
			}
		}

		String threadName = Thread.currentThread().getName();
		System.out.println("Thread1 " + threadName + " süre " + (System.currentTimeMillis() - t1) + " " + sonuc);
	}

	private void thread2() {
		long t1 = System.currentTimeMillis();
		int sonuc = 0;
		String c1 = "9";
		int cInt = Integer.parseInt(c1);
		for (int i = 1; i < COUNT; i++) {
			if (cInt == 1 || cInt == 2 || cInt == 3 || cInt == 4 || cInt == 5 || cInt == 6 || cInt == 7 || cInt == 8) {
				;
			}
		}
		String threadName = Thread.currentThread().getName();
		System.out.println("Thread2 " + threadName + " süre " + (System.currentTimeMillis() - t1) + " " + sonuc);
	}

}
