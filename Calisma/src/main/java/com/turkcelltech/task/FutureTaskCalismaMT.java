package com.turkcelltech.task;
 
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
 
public class FutureTaskCalismaMT {
 
	
	private static ExecutorService executor = null;
	
	public static ExecutorService getExecutor(){
		if(executor==null){
			//executor = Executors.newCachedThreadPool();
			executor = Executors.newFixedThreadPool(15);
		}
		
		return executor;
	}
    /**
     * Maximum amount of numbers to check
     */
    public static final int MAX_NUMBER = 200000000;
 
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
 
    
    public static int amountOfDivisibleByFutureWithInvokeTimeout(final int first, final int last, final int divisor)
            throws InterruptedException, ExecutionException {
 
        int amount = 0;
        
        // Prepare to execute and store the Futures
        //int threadNum = 5;
        //ExecutorService executor = Executors.newFixedThreadPool(threadNum);
      
        	getExecutor(); // MT cagrimi problem olabilir..
	  	 
	  	  	Thread t1 = new Thread(new Runnable() {
				
				@Override
				public void run() {
				   
					for (int i=0;i<40;i++)
						invoke5Thread(first, last, divisor);
				}

				private void invoke5Thread(final int first, final int last, final int divisor) {
					try{	
						Task4Impl task1Impl = new Task4Impl("t1_5", first +  (50), last / 2 +  (500), divisor);
						Task4Impl task2Impl = new Task4Impl("t1_6", first + (60), last / 2 +  (600), divisor);
						Task4Impl task3Impl = new Task4Impl("t1_7", first + (70), last / 2 +  (700), divisor);
						Task4Impl task4Impl = new Task4Impl("t1_8", first + (80), last / 2 +  (800), divisor);
						Task4Impl task5Impl = new Task4Impl("t1_9", first + (90), last / 2 +  (900), divisor);
					        
					        List threads = new ArrayList();
					        threads.add(task1Impl);
					        threads.add(task2Impl);
					        threads.add(task3Impl);
					        threads.add(task4Impl);
					        threads.add(task5Impl);
					    	List<Future<String>> futureList = null;
					        
					    	futureList = getExecutor().invokeAll(threads,50000,TimeUnit.MILLISECONDS);
					    	
					    	for (Future<String> future : futureList) 
					  	  	{
					  		  try {
					  			  String sonuc=future.get();
								  System.out.println("Thread1 Sonuc: " + sonuc);
								  if (sonuc.charAt(3)!=sonuc.charAt(3))
									  System.err.println( sonuc.charAt(3) + " Thread1 " + sonuc  + " ----------------------------------- ");
					  			  	
					  		  } catch (CancellationException ex) {
					  			   System.out.println(
					  					"Error ocured while calling invoke" + ex);
					  			  //throw ex;
					  		   } catch (ExecutionException ex) {
					  			 System.out.println(
					  					"Error ocured while calling invoke" + ex);
					  			  throw ex;
					  		   } finally {
					  		 }
					  	  	}
					  	  	
					}
					catch(Exception ex){
						ex.printStackTrace();
					}
				}
			});
	  	  	
	  	  	
	  	  Thread t2 = new Thread(new Runnable() {
				
				@Override
				public void run() {
						for (int i=0;i<40;i++)
							invoke4Thread(first, last, divisor);
					}

				private void invoke4Thread(final int first, final int last, final int divisor) {
					try{	
						Task4Impl task1Impl = new Task4Impl("t2_1", first +  (10), last / 2 +  (100), divisor);
						Task4Impl task2Impl = new Task4Impl("t2_2", first + (20), last / 2 +  (200), divisor);
						Task4Impl task3Impl = new Task4Impl("t2_3", first + (30), last / 2 +  (300), divisor);
						Task4Impl task4Impl = new Task4Impl("t2_4", first + (40), last / 2 +  (400), divisor);
					     
					        
					        List threads = new ArrayList();
					        threads.add(task1Impl);
					        threads.add(task2Impl);
					        threads.add(task3Impl);
					        threads.add(task4Impl);
					        List<Future<String>> futureList = null;
					        
					    	futureList = getExecutor().invokeAll(threads,50000,TimeUnit.MILLISECONDS);
					    	
					    	for (Future<String> future : futureList) 
					  	  	{
					  		  try {
					  			  String sonuc=future.get();
								  System.out.println("Thread2 Sonuc: " + sonuc);
								  if (sonuc.charAt(3)!=sonuc.charAt(3))
									  System.err.println( sonuc.charAt(3) + " Thread2 " + sonuc  + " ----------------------------------- ");
					  			  	
					  		  } catch (CancellationException ex) {
					  			   System.out.println(
					  					"Error ocured while calling invoke" + ex);
					  			  //throw ex;
					  		   } catch (ExecutionException ex) {
					  			 System.out.println(
					  					"Error ocured while calling invoke" + ex);
					  			  throw ex;
					  		   } finally {
					  		 }
					  	  	}
					  	  	
					}
					catch(Exception ex){
						ex.printStackTrace();
					}
				}
			});
	  	  	
	  	  
	  	  t1.start();
	  	  t2.start();
	 
 
        return 0 ;
 
    }
 
 
    /**
     * Executing the example.
     * @param args Command line arguments
     * @throws ExecutionException
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException, ExecutionException {
 
    	
    	long timeStartFuture = Calendar.getInstance().getTimeInMillis();
        int resultFuture = FutureTaskCalismaMT.amountOfDivisibleByFutureWithInvokeTimeout(0, MAX_NUMBER, 3);
        long timeEndFuture = Calendar.getInstance().getTimeInMillis();
        long timeNeededFuture = timeEndFuture - timeStartFuture;
        System.out.println("Result (Future InvokeTimeout): " + resultFuture + " calculated in " + timeNeededFuture + " ms");
        
    }
    
}