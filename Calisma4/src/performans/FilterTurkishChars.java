package performans;

import java.text.Normalizer;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FilterTurkishChars {

	public static void main(String[] args) {
		FilterTurkishChars filterTurkishChars = new FilterTurkishChars();
		filterTurkishChars.execute();
	}

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

	public static final int COUNT = 99999;

	private void thread1() {
		long t1 = System.currentTimeMillis();
		String message = "IIIIİİİİııııbbbb ŞşıİüÜçÇöÖğĞ aaaa cccc ŞİĞÜÇÖLŞÖUIğüiişiçöşiğğ,işıııı";
		message = message + message;
		for (int i = 0; i < COUNT; i++) {
			message = message.replace("ş", "s").replace("Ş", "S").replace("ü", "u").replace("Ü", "U").replace("ç", "c").replace("Ç", "C").replace("ö", "o")
					.replace("Ö", "O").replace("ğ", "g").replace("Ğ", "G").replace("ı", "i").replace("İ", "I");
			// System.out.println("Thread 1 Hello " + message);
		}
		String threadName = Thread.currentThread().getName();
		System.out.println("Thread1 " + threadName + " süre " + (System.currentTimeMillis() - t1) + " " + message);
	}

	private void thread2() {
		long t1 = System.currentTimeMillis();
		String message = "IIIIİİİİııııbbbb ŞşıİüÜçÇöÖğĞ aaaa cccc ŞİĞÜÇÖLŞÖUIğüiişiçöşiğğ,işıııı";
		message = message + message;
		for (int i = 0; i < COUNT; i++) {
			message = Normalizer.normalize(message, Normalizer.Form.NFD).replaceAll("\\p{Mn}", "").replace('ı', 'i');
		}
		String threadName = Thread.currentThread().getName();
		System.out.println("Thread2 " + threadName + " süre " + (System.currentTimeMillis() - t1) + " " + message);
	}

	private void thread3() {
		long t1 = System.currentTimeMillis();
		String message = "IIIIİİİİııııbbbb ŞşıİüÜçÇöÖğĞ aaaa cccc ŞİĞÜÇÖLŞÖUIğüiişiçöşiğğ,işıııı";
		message = message + message;
		for (int i = 0; i < COUNT; i++) {
			Locale locale = new Locale("tr");
			message = Normalizer.normalize(message, Normalizer.Form.NFD).replaceAll("\\p{Mn}", "").replace('ı', 'i').toLowerCase(locale);
		}
		String threadName = Thread.currentThread().getName();
		System.out.println("Thread2 " + threadName + " süre " + (System.currentTimeMillis() - t1) + " " + message);
	}
}
