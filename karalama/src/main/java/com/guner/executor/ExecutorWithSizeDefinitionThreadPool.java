package com.guner.executor;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ExecutorWithSizeDefinitionThreadPool {

    public static void main(String[] args) {
        ExecutorWithSizeDefinitionThreadPool executor = new ExecutorWithSizeDefinitionThreadPool();
        executor.threadPoolTest();
    }

    private void threadPoolTest() {

        BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();
        ThreadFactory namedThreadFactory = new NamedThreadFactory();
        ExecutorService executorService = new ThreadPoolExecutor(30, 60,60000, TimeUnit.MILLISECONDS,
                queue, // core thread kadar iş yapar, gerisi queue'da bekler
                namedThreadFactory);

        executorService.submit(() -> {
            Thread.sleep(2000);
            System.out.println("Task1");
            return null;
        });
        executorService.submit(() -> {
            Thread.sleep(2000);
            System.out.println("Task2");
            return null;
        });
        executorService.submit(() -> {
            Thread.sleep(2000);
            System.out.println("Task3");
            return null;
        });
        executorService.submit(() -> {
            Thread.sleep(12000);
            System.out.println("Task4");
            return null;
        });

        shutdownAndAwaitTermination(executorService);
    }

    public static void shutdownAndAwaitTermination(ExecutorService executorService) {
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(10, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
                if (!executorService.awaitTermination(10, TimeUnit.SECONDS))
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
