package lab17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class AsalSayi {

	public static void main(String[] args) {
		AsalSayi asalSayi = new AsalSayi();
		asalSayi.execute();
	}

	public static final int COUNT = 100000;

	private void execute() {

		ExecutorService executor = Executors.newFixedThreadPool(3);
		executor.submit(
				() -> {
					thread1();
				});

		executor.submit(() -> {
			thread2();
		});

		executor.submit(() -> {
			thread3();
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
			executor.shutdownNow();
			System.out.println("shutdown finished");
		}
	}

	private void thread1() {
		long t1 = System.currentTimeMillis();

		// IntStream.rangeClosed(2, COUNT)
		// .filter(i -> {
		// for (int j = 2; j < i; j++) {
		// if (i % j == 0) {
		// return false;
		// }
		// }
		// return true;
		// })
		// .sequential()
		// .forEach(i -> System.out.print(i + " "));

		long count = IntStream.rangeClosed(2, COUNT)
				.filter(i -> {
					for (int j = 2; j < i; j++) {
						if (i % j == 0) {
							return false;
						}
					}
					return true;
				})
				.sequential()
				.count();

		String threadName = Thread.currentThread().getName();
		System.out.println("Thread1 " + threadName + " süre " + (System.currentTimeMillis() - t1) + " " + count);
	}

	private void thread2() {
		long t1 = System.currentTimeMillis();

		long count = IntStream.rangeClosed(2, COUNT)
				.parallel() // burada performansı daha iyi. 27 sn
				.filter(i -> {
					for (int j = 2; j < i; j++) {
						if (i % j == 0) {
							return false;
						}
					}
					return true;
				})
				// .parallel() burada olunca performans biraz daha dusuyor. 32 sn oluyor
				.count();

		String threadName = Thread.currentThread().getName();
		System.out.println("Thread2 " + threadName + " süre " + (System.currentTimeMillis() - t1) + " " + count);
	}

	private void thread3() { // tam java8
		long t1 = System.currentTimeMillis();

		long count = IntStream.rangeClosed(2, COUNT)
				.parallel()
				.filter(i -> {
					boolean anyMatch = IntStream.rangeClosed(2, i - 1)
							// .parallel() // sureyi arttirir
							.anyMatch(j -> i % j == 0);
					return !anyMatch;
				})
				.count();

		String threadName = Thread.currentThread().getName();
		System.out.println("Thread3 " + threadName + " süre " + (System.currentTimeMillis() - t1) + " " + count);

		// IntStream.rangeClosed(2, COUNT)
		// // .parallel()
		// .filter(i -> {
		// boolean anyMatch = IntStream.rangeClosed(2, i - 1)
		// .parallel()
		// .anyMatch(j -> i % j == 0);
		// return !anyMatch;
		// })
		// .forEach(a -> System.out.println(a));
	}

}
