package com.turkcelltech.task;
 
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
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
 
public class FutureTaskCalisma4 {
 
    /**
     * Maximum amount of numbers to check
     */
    public static final int MAX_NUMBER = 2099900000;
    
    public static ExecutorService createThreadPoolExecutor()
    {
    	int coreThreadPoolSize=2;
    	int maxThreadPoolSize=4;
    	NamedThreadFactory namedThreadFactory = new NamedThreadFactory();
    	ExecutorService executor = new ThreadPoolExecutor(	
				coreThreadPoolSize,
				maxThreadPoolSize,
				10000,
				TimeUnit.MILLISECONDS, 
				//new SynchronousQueue<Runnable>(), direk thread olusutrulur, queue yok
				//new LinkedBlockingQueue<Runnable>(), max thread in onemi yok, core threadden fazla talep varsa queuelanýr.
				//new ArrayBlockingQueue<Runnable>(1),// max threadddan gerisi poollanir, onun countu. countu gecerse hata üretilir.
				new LinkedBlockingQueue<Runnable>(), 
				namedThreadFactory);
    	
    	return executor;
		
    }
 
       
    
    public static int amountOfDivisibleByFutureWithSyncQueueSize(final int first, final int last, final int divisor)
            throws InterruptedException, ExecutionException {
 
        int amount = 0;
 
        
        ExecutorService executor = createThreadPoolExecutor();
        
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
			System.out.println("Active Task Count=" + ((ThreadPoolExecutor) executor).getActiveCount() + " Task Count=" + ((ThreadPoolExecutor) executor).getTaskCount() + " Queue size=" +  ((ThreadPoolExecutor) executor).getQueue().size()); 
			futureList.add(executor.submit(task2Impl));
			System.out.println("2");
			System.out.println("Active Task Count=" + ((ThreadPoolExecutor) executor).getActiveCount() + " Task Count=" + ((ThreadPoolExecutor) executor).getTaskCount() + " Queue size=" +  ((ThreadPoolExecutor) executor).getQueue().size());
			futureList.add(executor.submit(task3Impl));
			System.out.println("3");
			System.out.println("Active Task Count=" + ((ThreadPoolExecutor) executor).getActiveCount() + " Task Count=" + ((ThreadPoolExecutor) executor).getTaskCount() + " Queue size=" +  ((ThreadPoolExecutor) executor).getQueue().size());
			futureList.add(executor.submit(task4Impl));
			System.out.println("4");
			System.out.println("Active Task Count=" + ((ThreadPoolExecutor) executor).getActiveCount() + " Task Count=" + ((ThreadPoolExecutor) executor).getTaskCount() + " Queue size=" +  ((ThreadPoolExecutor) executor).getQueue().size());
			futureList.add(executor.submit(task5Impl));
			System.out.println("5");
			System.out.println("Active Task Count=" + ((ThreadPoolExecutor) executor).getActiveCount() + " Task Count=" + ((ThreadPoolExecutor) executor).getTaskCount() + " Queue size=" +  ((ThreadPoolExecutor) executor).getQueue().size());
			futureList.add(executor.submit(task6Impl));
			System.out.println("6");
			System.out.println("Active Task Count=" + ((ThreadPoolExecutor) executor).getActiveCount() + " Task Count=" + ((ThreadPoolExecutor) executor).getTaskCount() + " Queue size=" +  ((ThreadPoolExecutor) executor).getQueue().size());
			futureList.add(executor.submit(task7Impl));
			System.out.println("7");
			System.out.println("Active Task Count=" + ((ThreadPoolExecutor) executor).getActiveCount() + " Task Count=" + ((ThreadPoolExecutor) executor).getTaskCount() + " Queue size=" +  ((ThreadPoolExecutor) executor).getQueue().size());
		} catch (java.util.concurrent.RejectedExecutionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
  	  	//futureList = executor.invokeAll(threads);

  	  	for (Future<Integer> future : futureList) 
  	  	{
  		  try {
  			  int sonuc=future.get(80000,TimeUnit.MILLISECONDS);
			  System.out.println("Sonuc : " + sonuc  + " Active Task Count=" + ((ThreadPoolExecutor) executor).getActiveCount() + " Task Count=" + ((ThreadPoolExecutor) executor).getTaskCount() + " Queue size=" +  ((ThreadPoolExecutor) executor).getQueue().size());
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
  	  	
  	  System.out.println("Active Task Count=" + ((ThreadPoolExecutor) executor).getActiveCount() + " Task Count=" + ((ThreadPoolExecutor) executor).getTaskCount() + " Queue size=" +  ((ThreadPoolExecutor) executor).getQueue().size());
  	  	
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

        
        timeStartFuture = Calendar.getInstance().getTimeInMillis();
        resultFuture = FutureTaskCalisma4.amountOfDivisibleByFutureWithSyncQueueSize(0, MAX_NUMBER, 3);
        timeEndFuture = Calendar.getInstance().getTimeInMillis();
        timeNeededFuture = timeEndFuture - timeStartFuture;
        System.out.println("Result (Future InvokeTimeout): " + resultFuture + " calculated in " + timeNeededFuture + " ms");
    	
    }
    
}