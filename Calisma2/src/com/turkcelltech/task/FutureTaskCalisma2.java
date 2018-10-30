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
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
 
public class FutureTaskCalisma2 {
 
    /**
     * Maximum amount of numbers to check
     */
    public static final int MAX_NUMBER = 2099900000;
 
    /**
     * Returns the amount of numbers that can be divided by the divisor without remainder.
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
    
    public static int amountOfDivisibleByFutureWithTimeout(final int first, final int last, final int divisor)
            throws InterruptedException, ExecutionException {
 
        int amount = 0;
 
        // Prepare to execute and store the Futures
        int threadNum = 2;
        ExecutorService executor = Executors.newFixedThreadPool(threadNum);
        TaskImpl task1Impl = new TaskImpl(first, last / 2, divisor);
        TaskImpl task2Impl = new TaskImpl(last / 2 + 1, last, divisor);
        TaskImpl task3Impl = new TaskImpl(last / 2 + 1, last, divisor);
        TaskImpl task4Impl = new TaskImpl(last / 2 + 1, last, divisor);
        TaskImpl task5Impl = new TaskImpl(last / 2 + 1, last, divisor);
        TaskImpl task6Impl = new TaskImpl(last / 2 + 1, last, divisor);
        TaskImpl task7Impl = new TaskImpl(last / 2 + 1, last, divisor);
        
  	  	List<Future<Integer>> futureList = new ArrayList<Future<Integer>>();
  	  
  	  	futureList.add(executor.submit(task1Impl));
  	  	System.out.println("1");
  	  	futureList.add(executor.submit(task2Impl));
  	  	System.out.println("2");
  	  	futureList.add(executor.submit(task3Impl));
  	  	System.out.println("3");
  	    futureList.add(executor.submit(task4Impl));
	  	System.out.println("4");
	  	futureList.add(executor.submit(task5Impl));
  	  	System.out.println("5");
  	    futureList.add(executor.submit(task6Impl));
	  	System.out.println("6");
	  	futureList.add(executor.submit(task7Impl));
  	  	System.out.println("7");
  	  	//futureList = executor.invokeAll(threads);

  	  	for (Future<Integer> future : futureList) 
  	  	{
  		  try {
  			  int sonuc=future.get(80000,TimeUnit.MILLISECONDS);
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
  		   } catch (TimeoutException e) 
  		   {
  			 System.out.println(
   					"TIMEOOUT Error ocured while calling invoke" + e);
			e.printStackTrace();
		} finally {
  		 }
  	  	}
  	  	
  	  executor.shutdown();
  	  	
        return amount;
 
    }
    
    public static int amountOfDivisibleByFutureWithSyncQueueSize(final int first, final int last, final int divisor)
            throws InterruptedException, ExecutionException {
 
        int amount = 0;
 
        // Prepare to execute and store the Futures
        int threadNum = 2;
        
        ExecutorService executor = new ThreadPoolExecutor(threadNum, threadNum+1, 0L, TimeUnit.MILLISECONDS, new SynchronousQueue());
        
        TaskImpl task1Impl = new TaskImpl(first, last / 2, divisor);
        TaskImpl task2Impl = new TaskImpl(last / 2 + 1, last, divisor);
        TaskImpl task3Impl = new TaskImpl(last / 2 + 1, last, divisor);
        TaskImpl task4Impl = new TaskImpl(last / 2 + 1, last, divisor);
        TaskImpl task5Impl = new TaskImpl(last / 2 + 1, last, divisor);
        TaskImpl task6Impl = new TaskImpl(last / 2 + 1, last, divisor);
        TaskImpl task7Impl = new TaskImpl(last / 2 + 1, last, divisor);
        
  	  	List<Future<Integer>> futureList = new ArrayList<Future<Integer>>();
  	  
  	  	try {
			futureList.add(executor.submit(task1Impl));
			System.out.println("1");
			System.out.println("Active Task Count=" + ((ThreadPoolExecutor) executor).getActiveCount() + " Task Count=" + ((ThreadPoolExecutor) executor).getTaskCount()); 
			futureList.add(executor.submit(task2Impl));
			System.out.println("2");
			System.out.println("Active Task Count=" + ((ThreadPoolExecutor) executor).getActiveCount() + " Task Count=" + ((ThreadPoolExecutor) executor).getTaskCount());
			futureList.add(executor.submit(task3Impl));
			System.out.println("3");
			System.out.println("Active Task Count=" + ((ThreadPoolExecutor) executor).getActiveCount() + " Task Count=" + ((ThreadPoolExecutor) executor).getTaskCount());
			futureList.add(executor.submit(task4Impl));
			System.out.println("4");
			System.out.println("Active Task Count=" + ((ThreadPoolExecutor) executor).getActiveCount() + " Task Count=" + ((ThreadPoolExecutor) executor).getTaskCount());
			futureList.add(executor.submit(task5Impl));
			System.out.println("5");
			System.out.println("Active Task Count=" + ((ThreadPoolExecutor) executor).getActiveCount() + " Task Count=" + ((ThreadPoolExecutor) executor).getTaskCount());
			futureList.add(executor.submit(task6Impl));
			System.out.println("6");
			System.out.println("Active Task Count=" + ((ThreadPoolExecutor) executor).getActiveCount() + " Task Count=" + ((ThreadPoolExecutor) executor).getTaskCount());
			futureList.add(executor.submit(task7Impl));
			System.out.println("7");
			System.out.println("Active Task Count=" + ((ThreadPoolExecutor) executor).getActiveCount() + " Task Count=" + ((ThreadPoolExecutor) executor).getTaskCount());
		} catch (java.util.concurrent.RejectedExecutionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
  	  	//futureList = executor.invokeAll(threads);

  	  	for (Future<Integer> future : futureList) 
  	  	{
  		  try {
  			  int sonuc=future.get(80000,TimeUnit.MILLISECONDS);
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
  		   } catch (TimeoutException e) 
  		   {
  			 System.out.println(
   					"TIMEOOUT Error ocured while calling invoke" + e);
			e.printStackTrace();
		} finally {
  		 }
  	  	}
  	  	
  	  System.out.println("Active Task Count=" + ((ThreadPoolExecutor) executor).getActiveCount() + " Task Count=" + ((ThreadPoolExecutor) executor).getTaskCount());
  	  	
  	  executor.shutdown();
  	  	
        return amount;
 
    }
    
    public static int amountOfDivisibleByFutureWithSyncQueueSizeWithSleep(final int first, final int last, final int divisor)
            throws InterruptedException, ExecutionException {
 
        int amount = 0;
 
        // Prepare to execute and store the Futures
        int threadNum = 11;
        
        ExecutorService executor = new ThreadPoolExecutor(threadNum, threadNum+2, 0L, TimeUnit.MILLISECONDS, new SynchronousQueue());
        
        TaskImpl taskImpl = new TaskImpl(first, last / 2, divisor);
        executor.submit(taskImpl);
        TaskImpl taskImpl2 = new TaskImpl(first, last / 2, divisor);
        executor.submit(taskImpl2);
        TaskImpl taskImpl3 = new TaskImpl(first, last / 2, divisor);
        executor.submit(taskImpl3);
        
        for(int i=0;i<10;i++)
        {
        	TaskWithSleepImpl task1Impl = new TaskWithSleepImpl(first, last / 2, divisor);
          	  
	  	  	try {
				executor.submit(task1Impl);
				System.out.println("1");
				System.out.println("Active Task Count=" + ((ThreadPoolExecutor) executor).getActiveCount() + " Task Count=" + ((ThreadPoolExecutor) executor).getTaskCount()); 
			} catch (java.util.concurrent.RejectedExecutionException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
        
        System.out.println("Active Task Count=" + ((ThreadPoolExecutor) executor).getActiveCount() + " Task Count=" + ((ThreadPoolExecutor) executor).getTaskCount());
  	  	
  	  	//executor.shutdown();
  	  	
        return amount;
 
    }
    
    public static int amountOfDivisibleByFutureWithQueueSize(final int first, final int last, final int divisor)
            throws InterruptedException, ExecutionException {
 
        int amount = 0;
 
        // Prepare to execute and store the Futures
        int threadNum = 2;
        int workQueueSize=1;
        //ExecutorService executor = Executors.newFixedThreadPool(threadNum);
        
        ExecutorService executor = new ThreadPoolExecutor(threadNum, threadNum+1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(workQueueSize));
        
        TaskImpl task1Impl = new TaskImpl(first, last / 2, divisor);
        TaskImpl task2Impl = new TaskImpl(last / 2 + 1, last, divisor);
        TaskImpl task3Impl = new TaskImpl(last / 2 + 1, last, divisor);
        TaskImpl task4Impl = new TaskImpl(last / 2 + 1, last, divisor);
        TaskImpl task5Impl = new TaskImpl(last / 2 + 1, last, divisor);
        TaskImpl task6Impl = new TaskImpl(last / 2 + 1, last, divisor);
        TaskImpl task7Impl = new TaskImpl(last / 2 + 1, last, divisor);
        
  	  	List<Future<Integer>> futureList = new ArrayList<Future<Integer>>();
  	  
  	  	try
  	  	{
	  	  	futureList.add(executor.submit(task1Impl));
	  	  	System.out.println("1");
	  	  	futureList.add(executor.submit(task2Impl));
	  	  	System.out.println("2");
	  	  	futureList.add(executor.submit(task3Impl));
	  	  	System.out.println("3");
	  	    futureList.add(executor.submit(task4Impl));
		  	System.out.println("4");
		  	futureList.add(executor.submit(task5Impl));
	  	  	System.out.println("5");
	  	    futureList.add(executor.submit(task6Impl));
		  	System.out.println("6");
		  	futureList.add(executor.submit(task7Impl));
	  	  	System.out.println("7");
	  	  	//futureList = executor.invokeAll(threads);
  	  	}
  	  	catch (java.util.concurrent.RejectedExecutionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

  	  	for (Future<Integer> future : futureList) 
  	  	{
  		  try {
  			  int sonuc=future.get(80000,TimeUnit.MILLISECONDS);
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
  		   } catch (TimeoutException e) 
  		   {
  			 System.out.println(
   					"TIMEOOUT Error ocured while calling invoke" + e);
			e.printStackTrace();
		} finally {
  		 }
  	  	}
  	  	
  	  executor.shutdown();
  	  	
        return amount;
 
    }
    
 
    public static int amountOfDivisibleByFuture(final int first, final int last, final int divisor)
            throws InterruptedException, ExecutionException {
 
        int amount = 0;
 
        // Prepare to execute and store the Futures
        int threadNumber = 5;
        ExecutorService executor = Executors.newFixedThreadPool(threadNumber);
        TaskImpl task1Impl = new TaskImpl(first, last / 2, divisor);
        TaskImpl task2Impl = new TaskImpl(last / 2 + 1, last, divisor);
        
        List threads = new ArrayList();
        threads.add(task1Impl);
        threads.add(task2Impl);
  	  	
  	  	List<Future<Integer>> futureList = null;
  	  
  	  	futureList = executor.invokeAll(threads);

  	  	for (Future<Integer> future : futureList) 
  	  	{
  		  try {
  			  int sonuc=future.get();
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
  	  	
  	  	executor.shutdown();
 
        return amount;
 
    }
     
 
    /**
     * Executing the example.
     * @param args Command line arguments
     * @throws ExecutionException
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException, ExecutionException {
 
    	long timeStartFuture;
    	int resultFuture;
    	long timeEndFuture;
    	long timeNeededFuture;

//    	timeStartFuture = Calendar.getInstance().getTimeInMillis();
//        resultFuture = FutureTaskCalisma.amountOfDivisibleByFuture(0, MAX_NUMBER, 3);
//        timeEndFuture = Calendar.getInstance().getTimeInMillis();
//        timeNeededFuture = timeEndFuture - timeStartFuture;
//        System.out.println("Result (Future): " + resultFuture + " calculated in " + timeNeededFuture + " ms");
        
        
//    	timeStartFuture = Calendar.getInstance().getTimeInMillis();
//        resultFuture = FutureTaskCalisma.amountOfDivisibleByFutureWithTimeout(0, MAX_NUMBER, 3);
//        timeEndFuture = Calendar.getInstance().getTimeInMillis();
//        timeNeededFuture = timeEndFuture - timeStartFuture;
//        System.out.println("Result (Future InvokeTimeout): " + resultFuture + " calculated in " + timeNeededFuture + " ms");
        
//        timeStartFuture = Calendar.getInstance().getTimeInMillis();
//        resultFuture = FutureTaskCalisma.amountOfDivisibleByFutureWithQueueSize(0, MAX_NUMBER, 3);
//        timeEndFuture = Calendar.getInstance().getTimeInMillis();
//        timeNeededFuture = timeEndFuture - timeStartFuture;
//        System.out.println("Result (Future InvokeTimeout): " + resultFuture + " calculated in " + timeNeededFuture + " ms");
//        
        
        timeStartFuture = Calendar.getInstance().getTimeInMillis();
        resultFuture = FutureTaskCalisma2.amountOfDivisibleByFutureWithSyncQueueSize(0, MAX_NUMBER, 3);
        timeEndFuture = Calendar.getInstance().getTimeInMillis();
        timeNeededFuture = timeEndFuture - timeStartFuture;
        System.out.println("Result (Future InvokeTimeout): " + resultFuture + " calculated in " + timeNeededFuture + " ms");
    	
//    	timeStartFuture = Calendar.getInstance().getTimeInMillis();
//    	resultFuture = FutureTaskCalisma2.amountOfDivisibleByFutureWithSyncQueueSizeWithSleep(0, MAX_NUMBER, 3);
//      	timeEndFuture = Calendar.getInstance().getTimeInMillis();
//      	timeNeededFuture = timeEndFuture - timeStartFuture;
//      	System.out.println("Result (Future InvokeTimeout): " + resultFuture + " calculated in " + timeNeededFuture + " ms");
    	
       
    }
    
}