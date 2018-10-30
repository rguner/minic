package lab9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PerformansMT {

	public static void main(String[] args) {
		PerformansMT performansMT = new PerformansMT();
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
		for (int j = 0; j < COUNT; j++) {
			sonuc = 0;
			for (int i = 1; i < COUNT; i++) {
				sonuc = sonuc + (i > 0 ? 1 : 0);
			}
		}

		String threadName = Thread.currentThread().getName();
		System.out.println("Thread1 " + threadName + " süre " + (System.currentTimeMillis() - t1) + " " + sonuc);
	}

	private void thread2() {
		long t1 = System.currentTimeMillis();
		int sonuc = 0;
		int tmp = 0;
		for (int j = 0; j < COUNT; j++) {
			sonuc = 0;
			for (int i = 1; i < COUNT; i++) {
				tmp = (i > 0 ? 1 : 0);
				sonuc++;
			}
		}
		String threadName = Thread.currentThread().getName();
		System.out.println("Thread2 " + threadName + " süre " + (System.currentTimeMillis() - t1) + " " + sonuc);
	}

}
