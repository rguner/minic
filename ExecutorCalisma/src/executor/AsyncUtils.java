package executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class AsyncUtils {

	private static ExecutorService executorService = null;

	public static ExecutorService getExecutorService() {
		return executorService;
	}

	public static void shutdownAndAwaitTermination() {
		executorService.shutdown(); // Disable new tasks from being submitted
		try {
			// Wait a while for existing tasks to terminate
			if (!executorService.awaitTermination(60, TimeUnit.SECONDS)) {
				executorService.shutdownNow(); // Cancel currently executing tasks
				// Wait a while for tasks to respond to being cancelled
				if (!executorService.awaitTermination(60, TimeUnit.SECONDS))
					System.err.println("Pool did not terminate");
			}
		} catch (InterruptedException ie) {
			// (Re-)Cancel if current thread also interrupted
			executorService.shutdownNow();
			// Preserve interrupt status
			Thread.currentThread().interrupt();
		}
	}

	public static BlockingQueue<Runnable> q1;

	public static ExecutorService createThreadPoolExecutor() {
		int coreThreadPoolSize = 10;
		int maxThreadPoolSize = 50;
		int threadCountShrinkTime = 60000;

		// try {
		// coreThreadPoolSize = Integer.parseInt(UserContainer.getCommonProperty("async.executor.core.thread.pool.size"));
		// maxThreadPoolSize = Integer.parseInt(UserContainer.getCommonProperty("async.executor.max.thread.pool.size"));
		// threadCountShrinkTime = Integer.parseInt(UserContainer.getCommonProperty("async.executor.thread.count.shrink.time"));
		// } catch (NumberFormatException e) {
		// logger.debug("async.executor parametreleri tanimsiz..");
		// }

		BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();
		q1 = queue;
		ThreadFactory namedThreadFactory = new AsyncUtils.NamedThreadFactory();
		executorService = new ThreadPoolExecutor(
				coreThreadPoolSize,
				maxThreadPoolSize,
				threadCountShrinkTime,
				TimeUnit.MILLISECONDS,
				queue, // core thread kadar iş yapar, gerisi queue'da bekler
				// new SynchronousQueue<Runnable>(), // boşta thread varsa çalışır, size'ı 0dır. max threade gelince yeni task alamaz.
				namedThreadFactory);

		return executorService;

	}

	public static class NamedThreadFactory implements ThreadFactory {

		private AtomicInteger counter = new AtomicInteger();
		private String name = "Calisma Async Task Thread - ";

		public Thread newThread(Runnable r) {

			Thread t = new Thread(r);
			t.setName(name + counter.incrementAndGet());
			t.setDaemon(false);
			return t;
		}
	}

	public static Double getUnbilledAmountOfProductsAsync(List<String> msisdnList, List<ProductAmount> productAmountList) throws Exception {
		List<GetUnbilledAmountTask> threads = new ArrayList<GetUnbilledAmountTask>();
		Double totalProductAmount = 0d;
		List<Future<ProductAmount>> futureList = null;
		int i = 0;

		int concurrentTaskInvokeCount = 5;
		int taskInvokeTimeOut = 30000;
		// try {
		// concurrentTaskInvokeCount = Integer.parseInt(UserContainer.getCommonProperty("async.executor.concurrent.task.invoce.count"));
		// taskInvokeTimeOut = Integer.parseInt(UserContainer.getCommonProperty("async.executor.task.invoke.timeout"));
		// } catch (NumberFormatException e) {
		// logger.debug("async concurrentTaskInvokeCount ve taskInvokeTimeOut parametreleri tanimsiz..");
		// }

		int freeThreadCount = ((ThreadPoolExecutor) getExecutorService()).getMaximumPoolSize() - ((ThreadPoolExecutor) getExecutorService()).getActiveCount();
		if (concurrentTaskInvokeCount > freeThreadCount) // mesela, 3 thread bosta sadece, 5 paralel calismasi imkansiz. 3 thread ile calismasini saglar.
			concurrentTaskInvokeCount = freeThreadCount;
		if (concurrentTaskInvokeCount <= 0) {
			System.out.println(("Guncel Fatura Tutari Sorgulama Islemi free thread olmadigi icin yapilamiyor. Free Thread Count = "
					+ freeThreadCount + "."));
			throw new Exception("Maximum  thread size a ulasildi");
		}

		System.out.println("---------- Guncel Fatura Tutari Sorgulama Islemi " + concurrentTaskInvokeCount
				+ " paralel thread ile yapilacak. Free Thread Count = " + freeThreadCount + ".");

		for (String msisdn : msisdnList) {

			GetUnbilledAmountTask getUnbilledAmountTask = new GetUnbilledAmountTask(msisdn);
			threads.add(getUnbilledAmountTask);

			if ((++i % concurrentTaskInvokeCount == 0 || i == msisdnList.size()) && threads.size() > 0) {
				futureList = AsyncUtils.getExecutorService().invokeAll(threads, taskInvokeTimeOut, TimeUnit.MILLISECONDS);

				for (Future<ProductAmount> future : futureList) {
					try {
						ProductAmount productAmount = future.get();
						System.out.println(Thread.currentThread().getName() + " Guncel Fatura Tutari Sorgulama Islemi Basariyla Gerceklestirildi," + msisdn);
						totalProductAmount += productAmount.getAmount().doubleValue();
						productAmountList.add(productAmount);

					} catch (CancellationException ex) {
						System.out.println(
								"CancellationException ocured in getUnbilledAmountOfProductsAsync while calling GetUnbilledAmountTask. Active Task Count="
										+ ((ThreadPoolExecutor) getExecutorService()).getActiveCount()
										+ " Queue size=" + ((ThreadPoolExecutor) getExecutorService()).getQueue().size());
						throw ex; // throw edilirse, tum sirket icin sonuc gosterilmez, edilmeyebilir istenirse, sadece hata alan hatlar gosterilmez.
					} catch (ExecutionException ex) {
						System.out.println(
								"ExecutionException ocured in getUnbilledAmountOfProductsAsync while calling GetUnbilledAmountTask. Active Task Count="
										+ ((ThreadPoolExecutor) getExecutorService()).getActiveCount()
										+ " Queue size=" + ((ThreadPoolExecutor) getExecutorService()).getQueue().size());
						throw ex; // throw edilirse, tum sirket icin sonuc gosterilmez, edilmeyebilir istenirse, sadece hata alan hatlar gosterilmez.
					} finally {
					}
				}
				threads.clear();
			}

		}
		return totalProductAmount;
	}

	public static Double getUnbilledAmountOfProductsAsync2(List<String> msisdnList) throws Exception {
		List<GetUnbilledAmountTask> threads = new ArrayList<GetUnbilledAmountTask>();
		Double totalProductAmount = 0d;
		List<Future<ProductAmount>> futureList = null;
		int i = 0;

		int taskInvokeTimeOut = 30000;

		System.out.println("------------------Guncel Fatura Tutari Sorgulama Islemi tüm threadlerle paralel thread ile yapilacak.");

		for (String msisdn : msisdnList) {

			GetUnbilledAmountTask getUnbilledAmountTask = new GetUnbilledAmountTask(msisdn);
			threads.add(getUnbilledAmountTask);
		}

		futureList = AsyncUtils.getExecutorService().invokeAll(threads, taskInvokeTimeOut, TimeUnit.MILLISECONDS);

		System.out.println("queue size " + AsyncUtils.q1.size());

		for (Future<ProductAmount> future : futureList) {
			try {
				ProductAmount productAmount = future.get();
				System.out.println(Thread.currentThread().getName() + " Guncel Fatura Tutari Sorgulama Islemi Basariyla Gerceklestirildi");
				totalProductAmount += productAmount.getAmount().doubleValue();

			} catch (CancellationException ex) {
				System.out.println(
						"CancellationException ocured in getUnbilledAmountOfProductsAsync while calling GetUnbilledAmountTask. Active Task Count="
								+ ((ThreadPoolExecutor) getExecutorService()).getActiveCount()
								+ " Queue size=" + ((ThreadPoolExecutor) getExecutorService()).getQueue().size());
				throw ex; // throw edilirse, tum sirket icin sonuc gosterilmez, edilmeyebilir istenirse, sadece hata alan hatlar gosterilmez.
			} catch (ExecutionException ex) {
				System.out.println(
						"ExecutionException ocured in getUnbilledAmountOfProductsAsync while calling GetUnbilledAmountTask. Active Task Count="
								+ ((ThreadPoolExecutor) getExecutorService()).getActiveCount()
								+ " Queue size=" + ((ThreadPoolExecutor) getExecutorService()).getQueue().size());
				throw ex; // throw edilirse, tum sirket icin sonuc gosterilmez, edilmeyebilir istenirse, sadece hata alan hatlar gosterilmez.
			} finally {
			}
		}

		return totalProductAmount;
	}

	public static Double getUnbilledAmountOfProductsAsync3(List<String> msisdnList) throws Exception {
		Double totalProductAmount = 0d;
		List<Future<ProductAmount>> futureList = new ArrayList<Future<ProductAmount>>();
		int i = 0;

		System.out.println("--------------------Guncel Fatura Tutari Sorgulama Islemi tüm threadlerle paralel thread ile yapilacak.");

		for (String msisdn : msisdnList) {

			GetUnbilledAmountTask getUnbilledAmountTask = new GetUnbilledAmountTask(msisdn);
			futureList.add(AsyncUtils.getExecutorService().submit(getUnbilledAmountTask));
		}

		System.out.println("queue size " + AsyncUtils.q1.size());

		for (Future<ProductAmount> future : futureList) {
			try {
				ProductAmount productAmount = future.get(200, TimeUnit.MILLISECONDS);
				System.out.println(Thread.currentThread().getName() + " Guncel Fatura Tutari Sorgulama Islemi Basariyla Gerceklestirildi");
				totalProductAmount += productAmount.getAmount().doubleValue();

			} catch (CancellationException ex) {
				System.out.println(
						"CancellationException ocured in getUnbilledAmountOfProductsAsync while calling GetUnbilledAmountTask. Active Task Count="
								+ ((ThreadPoolExecutor) getExecutorService()).getActiveCount()
								+ " Queue size=" + ((ThreadPoolExecutor) getExecutorService()).getQueue().size());
				throw ex; // throw edilirse, tum sirket icin sonuc gosterilmez, edilmeyebilir istenirse, sadece hata alan hatlar gosterilmez.
			} catch (ExecutionException ex) {
				System.out.println(
						"ExecutionException ocured in getUnbilledAmountOfProductsAsync while calling GetUnbilledAmountTask. Active Task Count="
								+ ((ThreadPoolExecutor) getExecutorService()).getActiveCount()
								+ " Queue size=" + ((ThreadPoolExecutor) getExecutorService()).getQueue().size());
				throw ex; // throw edilirse, tum sirket icin sonuc gosterilmez, edilmeyebilir istenirse, sadece hata alan hatlar gosterilmez.
			} finally {
			}
		}

		return totalProductAmount;
	}

}
