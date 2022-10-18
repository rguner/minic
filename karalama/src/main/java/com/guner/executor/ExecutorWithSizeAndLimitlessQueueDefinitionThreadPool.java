package com.guner.executor;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ExecutorWithSizeAndLimitlessQueueDefinitionThreadPool {

    public static void main(String[] args) {
        ExecutorWithSizeAndLimitlessQueueDefinitionThreadPool executor = new ExecutorWithSizeAndLimitlessQueueDefinitionThreadPool();
        executor.threadPoolTest();
    }

    private void threadPoolTest() {
        BlockingQueue<Runnable> blockingQueue = new LinkedBlockingQueue<>();
        ThreadFactory namedThreadFactory = new NamedThreadFactory();
        ExecutorService executorService = new ThreadPoolExecutor(10, 30, 60000, TimeUnit.MILLISECONDS,
                blockingQueue,
                namedThreadFactory);

        for (int i = 0; i < 100; i++) {
            executorService.submit(() -> {
                Thread.sleep(2000);
                System.out.println("Task1 " + Thread.currentThread().getName() + " Queue Size :" + blockingQueue.size());
                return null;
            });
            executorService.submit(() -> {
                Thread.sleep(2000);
                System.out.println("Task2 " + Thread.currentThread().getName() + " Queue Size :" + blockingQueue.size());
                return null;
            });
            executorService.submit(() -> {
                Thread.sleep(2000);
                System.out.println("Task3 " + Thread.currentThread().getName() + " Queue Size :" + blockingQueue.size());
                return null;
            });
            executorService.submit(() -> {
                Thread.sleep(12000);
                System.out.println("Task4 " + Thread.currentThread().getName() + " Queue Size :" + blockingQueue.size());
                return null;
            });
            System.out.println("Queue Size :" +  blockingQueue.size());
        }

        shutdownAndAwaitTermination(executorService);
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
