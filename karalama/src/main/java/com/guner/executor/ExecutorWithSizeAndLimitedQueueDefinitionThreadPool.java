package com.guner.executor;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ExecutorWithSizeAndLimitedQueueDefinitionThreadPool {

    public static void main(String[] args) {
        ExecutorWithSizeAndLimitedQueueDefinitionThreadPool executor = new ExecutorWithSizeAndLimitedQueueDefinitionThreadPool();
        executor.threadPoolTest();
    }

    private void threadPoolTest() {

        BlockingQueue<Runnable> blockingQueue = new LinkedBlockingQueue<>(5);
        ThreadFactory namedThreadFactory = new NamedThreadFactory();
        ExecutorService executorService = new ThreadPoolExecutor(10, 30, 60000, TimeUnit.MILLISECONDS,
                blockingQueue, // core thread kadar iş yapar, gerisi queue'da bekler
                namedThreadFactory);

        for (int i = 0; i < 100; i++) {
            executorService.submit(() -> {
                Thread.sleep(2000);
                logThreadInformation("Task1", executorService, blockingQueue);
                return null;
            });
            executorService.submit(() -> {
                Thread.sleep(2000);
                logThreadInformation("Task2", executorService, blockingQueue);
                return null;
            });
            executorService.submit(() -> {
                Thread.sleep(2000);
                logThreadInformation("Task3", executorService, blockingQueue);
                return null;
            });
            executorService.submit(() -> {
                Thread.sleep(12000);
                logThreadInformation("Task4", executorService, blockingQueue);
                return null;
            });
            System.out.println("Queue Size :" + blockingQueue.size());
        }

        shutdownAndAwaitTermination(executorService);
    }

    private static void logThreadInformation(String taskInformation, ExecutorService executor, BlockingQueue<Runnable> blockingQueue) {
        System.out.println(taskInformation + " " + Thread.currentThread().getName() + " Queue Size :" + blockingQueue.size()
                + " Active Thread Count : " + ((ThreadPoolExecutor) executor).getActiveCount());
    }

    public static void shutdownAndAwaitTermination(ExecutorService executorService) {
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(100, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
                if (!executorService.awaitTermination(100, TimeUnit.SECONDS))
                    System.err.println("Pool did not terminate");
            }
        } catch (InterruptedException ie) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }

    public static class NamedThreadFactory implements ThreadFactory {

        private AtomicInteger counter = new AtomicInteger();
        private String name = "AsyncThread-";

        public Thread newThread(Runnable r) {

            Thread t = new Thread(r);
            t.setName(name + counter.incrementAndGet());
            t.setDaemon(false);
            return t;
        }
    }
}
