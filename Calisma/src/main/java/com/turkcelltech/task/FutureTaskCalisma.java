package com.turkcelltech.task;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FutureTaskCalisma {

	/**
	 * Maximum amount of numbers to check
	 */
	public static final int MAX_NUMBER = 2000000000;

	/**
	 * Returns the amount of numbers that can be divided by the divisor without remainder.
	 * 
	 * @param first First number to check
	 * @param last Last number to check
	 * @param divisor Divisor
	 * @return Amount of numbers that can be divided by the divisor without remainder
	 */
	public static int amountOfDivisibleBy(int first, int last, int divisor) {

		int amount = 0;
		for (int i = first; i <= last; i++) {
			if (i % divisor == 0) {
				amount++;
			}
		}
		return amount;
	}

	/**
	 * Returns the amount of numbers that can be divided by the divisor without remainder (using parallel execution).
	 * 
	 * @param first First number to check
	 * @param last Last number to check
	 * @param divisor Divisor
	 * @return Amount of numbers that can be divided by the divisor without remainder
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	public static int amountOfDivisibleByFuture(final int first, final int last, final int divisor) throws InterruptedException, ExecutionException {

		int amount = 0;

		// Prepare to execute and store the Futures
		int threadNum = 2;
		ExecutorService executor = Executors.newFixedThreadPool(threadNum);
		List<FutureTask<Integer>> taskList = new ArrayList<FutureTask<Integer>>();

		// Start thread for the first half of the numbers
		FutureTask<Integer> futureTask_1 = new FutureTask<Integer>(new Callable<Integer>() {

			public Integer call() {
				return FutureTaskCalisma.amountOfDivisibleBy(first, last / 2, divisor);
			}
		});
		taskList.add(futureTask_1);
		executor.execute(futureTask_1);

		// Start thread for the second half of the numbers
		FutureTask<Integer> futureTask_2 = new FutureTask<Integer>(new Callable<Integer>() {

			public Integer call() {
				return FutureTaskCalisma.amountOfDivisibleBy(last / 2 + 1, last, divisor);
			}
		});
		taskList.add(futureTask_2);
		executor.execute(futureTask_2);

		// Wait until all results are available and combine them at the same time
		for (int j = 0; j < threadNum; j++) {
			FutureTask<Integer> futureTask = taskList.get(j);
			amount += futureTask.get();
		}

		executor.shutdown();

		return amount;
	}

	/**
	 * Returns the amount of numbers that can be divided by the divisor without remainder (using parallel execution).
	 * 
	 * @param first First number to check
	 * @param last Last number to check
	 * @param divisor Divisor
	 * @return Amount of numbers that can be divided by the divisor without remainder
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	public static int amountOfDivisibleByFuture2(final int first, final int last, final int divisor) throws InterruptedException, ExecutionException {

		int amount = 0;

		// Prepare to execute and store the Futures
		int threadNum = 5;
		ExecutorService executor = Executors.newFixedThreadPool(threadNum);
		Task1Impl task1Impl = new Task1Impl(first, last / 2, divisor);
		Task2Impl task2Impl = new Task2Impl(last / 2 + 1, last, divisor);

		List threads = new ArrayList();
		threads.add(task1Impl);
		threads.add(task2Impl);

		List<Future<Integer>> futureList = null;

		futureList = executor.invokeAll(threads);

		for (Future<Integer> future : futureList) {
			try {
				int sonuc = future.get();
				System.out.println("Sonuc1: " + sonuc);
				amount = amount + sonuc;
			} catch (CancellationException ex) {
				System.out.println(
						"Error ocured while calling invoke" + ex);
				throw ex;
			} catch (ExecutionException ex) {
				System.out.println(
						"Error ocured while calling invoke" + ex);
				throw ex;
			} finally {
			}
		}

		Task1Impl task1Impl_kucuk = new Task1Impl(0, MAX_NUMBER, 3);
		threads.add(task1Impl_kucuk);
		Task1Impl task1Impl_kucuk2 = new Task1Impl(0, MAX_NUMBER, 3);
		threads.add(task1Impl_kucuk2);
		Task1Impl task1Impl_kucuk3 = new Task1Impl(0, MAX_NUMBER, 3);
		threads.add(task1Impl_kucuk3);
		futureList = executor.invokeAll(threads);
		for (Future<Integer> future : futureList) {
			try {
				int sonuc = future.get();
				System.out.println("Sonuc2: " + sonuc);
			} catch (CancellationException ex) {
				System.out.println(
						"Error ocured while calling invoke" + ex);
				throw ex;
			} catch (ExecutionException ex) {
				System.out.println(
						"Error ocured while calling invoke" + ex);
				throw ex;
			} finally {
			}
		}

		executor.shutdown();

		return amount;

	}

	public static int amountOfDivisibleByFutureWithTimeout(final int first, final int last, final int divisor) throws InterruptedException, ExecutionException {

		int amount = 0;

		// Prepare to execute and store the Futures
		int threadNum = 2;
		ExecutorService executor = Executors.newFixedThreadPool(threadNum);
		Task1Impl task1Impl = new Task1Impl(first, last / 2, divisor);
		Task2Impl task2Impl = new Task2Impl(last / 2 + 1, last, divisor);
		Task3Impl task3Impl = new Task3Impl(last / 2 + 10, last, divisor);

		List<Future<Integer>> futureList = new ArrayList<Future<Integer>>();

		futureList.add(executor.submit(task1Impl));
		futureList.add(executor.submit(task2Impl));
		futureList.add(executor.submit(task3Impl));
		// futureList = executor.invokeAll(threads);

		for (Future<Integer> future : futureList) {
			try {
				int sonuc = future.get(8000, TimeUnit.MILLISECONDS);
				System.out.println("Sonuc1: " + sonuc);
				amount = amount + sonuc;
			} catch (CancellationException ex) {
				System.out.println(
						"Error ocured while calling invoke" + ex);
				throw ex;
			} catch (ExecutionException ex) {
				System.out.println(
						"Error ocured while calling invoke" + ex);
				throw ex;
			} catch (TimeoutException e) {
				System.out.println(
						"TIMEOOUT Error ocured while calling invoke" + e);
				e.printStackTrace();
			} finally {
			}
		}

		return amount;

	}

	public static int amountOfDivisibleByFutureWithInvokeTimeout(final int first, final int last, final int divisor) throws InterruptedException, ExecutionException {

		int amount = 0;

		// Prepare to execute and store the Futures
		// int threadNum = 5;
		// ExecutorService executor = Executors.newFixedThreadPool(threadNum);
		// ExecutorService executor = Executors.newCachedThreadPool();

		int threadNum = 1;
		ExecutorService executor = new ThreadPoolExecutor(threadNum, threadNum + 2, 0L, TimeUnit.MILLISECONDS, new SynchronousQueue());

		for (int i = 0; i < 1; i++) {
			Task1Impl task1Impl = new Task1Impl(first + (i * 10), last / 2, divisor);
			Task3Impl task3Impl = new Task3Impl(last / 2 + 1 + (i * 10), last, divisor);
			Task1Impl task1Impl_2 = new Task1Impl(first + (i * 10), last / 2, divisor);
			Task1Impl task1Impl_3 = new Task1Impl(first + (i * 10), last / 2, divisor);

			List threads = new ArrayList();
			threads.add(task1Impl);
			threads.add(task3Impl);
			threads.add(task1Impl_2);
			threads.add(task1Impl_3);

			List<Future<Integer>> futureList = null;

			futureList = executor.invokeAll(threads, 5000, TimeUnit.MILLISECONDS);

			for (Future<Integer> future : futureList) {
				try {
					int sonuc = future.get();
					System.out.println("Sonuc1: " + sonuc);
					amount = amount + sonuc;
				} catch (CancellationException ex) {
					System.out.println(
							"Error ocured while calling invoke, timeout nedeniyle cancel oldu islem " + ex);
					// throw ex;
				} catch (ExecutionException ex) {
					System.out.println(
							"ExecutionException Error ocured while calling invoke " + ex);
					throw ex;
				} finally {
				}
			}

			System.out.println("Bitti");
		}

		executor.shutdownNow();

		return amount;

	}

	/**
	 * Executing the example.
	 * 
	 * @param args Command line arguments
	 * @throws ExecutionException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		long timeStartFuture;
		int resultFuture;
		long timeEndFuture;
		long timeNeededFuture;

		/*
		 * // Parallel execution timeStartFuture = Calendar.getInstance().getTimeInMillis(); resultFuture = FutureTaskCalisma.amountOfDivisibleByFuture(0,
		 * MAX_NUMBER, 3); timeEndFuture = Calendar.getInstance().getTimeInMillis(); timeNeededFuture = timeEndFuture - timeStartFuture;
		 * System.out.println("Result (Future): " + resultFuture + " calculated in " + timeNeededFuture + " ms");
		 */

		/*
		 * // Parallel execution2 amountOfDivisibleByFuture2 testi...... timeStartFuture = Calendar.getInstance().getTimeInMillis(); resultFuture =
		 * FutureTaskCalisma.amountOfDivisibleByFuture2(0, MAX_NUMBER, 3); timeEndFuture = Calendar.getInstance().getTimeInMillis(); timeNeededFuture =
		 * timeEndFuture - timeStartFuture; System.out.println("Result (Future2): " + resultFuture + " calculated in " + timeNeededFuture + " ms");
		 */

		/*
		 * timeStartFuture = Calendar.getInstance().getTimeInMillis(); resultFuture = FutureTaskCalisma.amountOfDivisibleByFutureWithTimeout(0, MAX_NUMBER, 3);
		 * timeEndFuture = Calendar.getInstance().getTimeInMillis(); timeNeededFuture = timeEndFuture - timeStartFuture;
		 * System.out.println("Result (FutureTimeout): " + resultFuture + " calculated in " + timeNeededFuture + " ms");
		 */

		timeStartFuture = Calendar.getInstance().getTimeInMillis();
		resultFuture = FutureTaskCalisma.amountOfDivisibleByFutureWithInvokeTimeout(0, MAX_NUMBER, 3);
		// resultFuture = FutureTaskCalisma.amountOfDivisibleByFutureWithTimeout(0, MAX_NUMBER, 3);
		// resultFuture = FutureTaskCalisma.amountOfDivisibleByFuture2(0, MAX_NUMBER, 3);

		timeEndFuture = Calendar.getInstance().getTimeInMillis();
		timeNeededFuture = timeEndFuture - timeStartFuture;
		System.out.println("Result (Future InvokeTimeout): " + resultFuture + " calculated in " + timeNeededFuture + " ms");

	}

}
