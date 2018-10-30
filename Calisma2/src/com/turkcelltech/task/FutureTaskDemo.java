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
 
public class FutureTaskDemo {
 
    /**
     * Maximum amount of numbers to check
     */
    public static final int MAX_NUMBER = 2000000000;
 
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
            
            if ( i % 200000 ==0)
            	;
				//waitBiraz();
           
        }
        return amount;
    }

	private static void waitBiraz() {
		try {
			Thread.currentThread().sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
 
    /**
     * Returns the amount of numbers that can be divided by the divisor without remainder (using parallel execution).
     * @param first First number to check
     * @param last Last number to check
     * @param divisor Divisor
     * @return Amount of numbers that can be divided by the divisor without remainder
     * @throws InterruptedException
     * @throws ExecutionException
     */
    public static int amountOfDivisibleByFuture(final int first, final int last, final int divisor)
            throws InterruptedException, ExecutionException {
 
        int amount = 0;
 
        // Prepare to execute and store the Futures
        int threadNum = 2;
        ExecutorService executor = Executors.newFixedThreadPool(threadNum);
        List<FutureTask<Integer>> taskList = new ArrayList<FutureTask<Integer>>();
 
        // Start thread for the first half of the numbers
        FutureTask<Integer> futureTask_1 = new FutureTask<Integer>(new Callable<Integer>() {
            @Override
            public Integer call() {
                return FutureTaskDemo.amountOfDivisibleBy(first, last / 2, divisor);
            }
        });
        taskList.add(futureTask_1);
        executor.execute(futureTask_1);
 
        // Start thread for the second half of the numbers
        FutureTask<Integer> futureTask_2 = new FutureTask<Integer>(new Callable<Integer>() {
            @Override
            public Integer call() {
                return FutureTaskDemo.amountOfDivisibleBy(last / 2 + 1, last, divisor);
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
     * @param first First number to check
     * @param last Last number to check
     * @param divisor Divisor
     * @return Amount of numbers that can be divided by the divisor without remainder
     * @throws InterruptedException
     * @throws ExecutionException
     */
    public static int amountOfDivisibleByFuture2(final int first, final int last, final int divisor)
            throws InterruptedException, ExecutionException {
 
        int amount = 0;
 
        // Prepare to execute and store the Futures
        int threadNum = 30;
        ExecutorService executor = Executors.newFixedThreadPool(threadNum);
        Task1Impl task1Impl = new Task1Impl(first, last / 2, divisor);
        Task2Impl task2Impl = new Task2Impl(last / 2 + 1, last, divisor);
        
        List threads = new ArrayList();
        threads.add(task1Impl);
        threads.add(task2Impl);
  	  	
  	  	List<Future<Integer>> futureList = null;
  	  
  	  	futureList = executor.invokeAll(threads);

  	  	for (Future<Integer> future : futureList) 
  	  	{
  		  try {
  			  amount = amount +future.get();	
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
 
 
    	// Sequential execution
        long timeStart = Calendar.getInstance().getTimeInMillis();
        int result = FutureTaskDemo.amountOfDivisibleBy(0, MAX_NUMBER, 3);
        long timeEnd = Calendar.getInstance().getTimeInMillis();
        long timeNeeded = timeEnd - timeStart;
        System.out.println("Result         : " + result + " calculated in " + timeNeeded + " ms");

 
        // Parallel execution
        long timeStartFuture = Calendar.getInstance().getTimeInMillis();
        int resultFuture = FutureTaskDemo.amountOfDivisibleByFuture(0, MAX_NUMBER, 3);
        long timeEndFuture = Calendar.getInstance().getTimeInMillis();
        long timeNeededFuture = timeEndFuture - timeStartFuture;
        System.out.println("Result (Future): " + resultFuture + " calculated in " + timeNeededFuture + " ms");
        
        
       // Parallel execution2
        timeStartFuture = Calendar.getInstance().getTimeInMillis();
        resultFuture = FutureTaskDemo.amountOfDivisibleByFuture2(0, MAX_NUMBER, 3);
        timeEndFuture = Calendar.getInstance().getTimeInMillis();
        timeNeededFuture = timeEndFuture - timeStartFuture;
        System.out.println("Result (Future2): " + resultFuture + " calculated in " + timeNeededFuture + " ms");
        
        
    }
    
}