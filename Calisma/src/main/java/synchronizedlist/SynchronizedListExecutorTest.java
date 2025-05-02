package synchronizedlist;

import java.util.*;
import java.util.concurrent.*;

public class SynchronizedListExecutorTest {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> syncList = Collections.synchronizedList(new ArrayList<>());
        // List<Integer> syncList = new ArrayList<>(); it fails with this type of list
        int numThreads = 10;
        int itemsPerThread = 1000;

        ExecutorService executor = Executors.newFixedThreadPool(numThreads);

        Runnable task = () -> {
            for (int i = 0; i < itemsPerThread; i++) {
                syncList.add(i);
            }
        };

        // Submit tasks
        for (int i = 0; i < numThreads; i++) {
            executor.submit(task);
        }

        // Shutdown executor and wait for all tasks to finish
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);

        // Expected size: numThreads * itemsPerThread
        int expectedSize = numThreads * itemsPerThread;
        System.out.println("Expected size: " + expectedSize);
        System.out.println("Actual size: " + syncList.size());
    }
}
