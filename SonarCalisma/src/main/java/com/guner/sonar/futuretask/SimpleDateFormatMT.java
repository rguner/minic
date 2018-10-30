package com.guner.sonar.futuretask;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class SimpleDateFormatMT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleDateFormatMT simpleDateFormatMT = new SimpleDateFormatMT();
		simpleDateFormatMT.execute();

	}

	private void execute() {
		int amount = 0;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		SimpleDateFormat sdfSyncronized = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		int threadNum = 20;
		//ExecutorService executor = new ThreadPoolExecutor(threadNum, threadNum + 2, 0L, TimeUnit.MILLISECONDS,	new SynchronousQueue());
		ExecutorService executor = Executors.newFixedThreadPool(threadNum);

		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			
			List<Future<String>> futureList = new ArrayList<Future<String>>();
			// syncronized testinin anlamlı olması için 2 şer defa task ekledim.. yoksa tek threadde syncronized zaten bekletmiyor...
			for (int j=0;j<3;j++)
			{
	
				TaskImplSdfOneInstance taskImplSdfOneInstance = new TaskImplSdfOneInstance(sdf);
				TaskImplSdfCreateForEveryProcess taskImplSdfCreateForEveryProcess = new TaskImplSdfCreateForEveryProcess();
				TaskImplSdfOneInstanceSyncronized taskImplSdfOneInstanceSyncronized = new TaskImplSdfOneInstanceSyncronized(sdfSyncronized);
				TaskImplSdfThreadLocal taskImplSdfThreadLocal = new TaskImplSdfThreadLocal();
				TaskImplJoda taskImplJoda = new TaskImplJoda();
					
				futureList.add(executor.submit(taskImplSdfOneInstance));
				futureList.add(executor.submit(taskImplSdfCreateForEveryProcess));
				futureList.add(executor.submit(taskImplSdfOneInstanceSyncronized));
				futureList.add(executor.submit(taskImplSdfThreadLocal));
				futureList.add(executor.submit(taskImplJoda));
			}
			
			for (Future<String> future : futureList) {
				try {
					String sonuc = future.get();
					//System.out.println("Sonuc: " + sonuc);
				} catch (CancellationException ex) {
					System.out
							.println("Error ocured while calling invoke" + ex);
				} catch (ExecutionException ex) {
					System.out
							.println("Error ocured while calling invoke" + ex);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
				}
			}
		}

		System.out.println("Bitti");

		executor.shutdownNow();

	}

}
