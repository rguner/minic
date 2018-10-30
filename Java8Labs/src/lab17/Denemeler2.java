package lab17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Denemeler2 {

	public static void main(String[] args) {
		Denemeler2 denemeler2 = new Denemeler2();
		denemeler2.execute();
	}

	private void execute() {

		int processorCount = Runtime.getRuntime().availableProcessors();
		System.out.println("Islemci sayisi --> " + processorCount);

		ExecutorService executor = Executors.newFixedThreadPool(3);
		executor.submit(
				() -> {
					thread1();
				});

		executor.submit(() -> {
			thread2();
		});

		// executor.submit(() -> {
		// thread3();
		// });

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
			executor.shutdownNow();
			System.out.println("shutdown finished");
		}

	}

	public static final int COUNT = Integer.MAX_VALUE;

	private void thread1() {
		long t1 = System.currentTimeMillis();

		int toplam = IntStream.rangeClosed(1, COUNT)
				.sequential()
				.reduce(0, (sum, element) -> sum + element);

		String threadName = Thread.currentThread().getName();
		System.out.println("Thread1 " + threadName + " süre " + (System.currentTimeMillis() - t1) + " " + toplam);
	}

	private void thread2() {
		long t1 = System.currentTimeMillis();

		int toplam = IntStream.rangeClosed(1, COUNT)
				.parallel()
				.reduce(0, (sum, element) -> sum + element);

		String threadName = Thread.currentThread().getName();
		System.out.println("Thread2 " + threadName + " süre " + (System.currentTimeMillis() - t1) + " " + toplam);
	}

	private void thread3() {
		long t1 = System.currentTimeMillis();

		int toplam = IntStream.rangeClosed(1, COUNT)
				.parallel()
				.reduce(0, (sum, element) -> sum + element);

		String threadName = Thread.currentThread().getName();
		System.out.println("Thread3 " + threadName + " süre " + (System.currentTimeMillis() - t1) + " " + toplam);
	}
}
