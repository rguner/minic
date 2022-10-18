package com.guner.executor;

import java.util.concurrent.*;

public class ExecutorNewFixedThreadPool {

    public static void main(String[] args) {
        ExecutorNewFixedThreadPool executor = new ExecutorNewFixedThreadPool();
        executor.fixedThreadPool();
    }

    private void fixedThreadPool() {

        ThreadPoolExecutor executor =
                (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        executor.submit(() -> {
            Thread.sleep(2000);
            System.out.println("Task1");
            return null;
        });
        executor.submit(() -> {
            Thread.sleep(2000);
            System.out.println("Task2");
            return null;
        });
        executor.submit(() -> {
            Thread.sleep(2000);
            System.out.println("Task3");
            return null;
        });
        executor.submit(() -> {
            Thread.sleep(12000);
            System.out.println("Task4");
            return null;
        });

        shutdownAndAwaitTermination(executor);
    }

    public static void shutdownAndAwaitTermination(ExecutorService executor) {
        executor.shutdown();
        try {
            if (!executor.awaitTermination(10, TimeUnit.SECONDS)) {
                executor.shutdownNow();
                if (!executor.awaitTermination(10, TimeUnit.SECONDS))
                    System.err.println("Pool did not terminate");
            }
        } catch (InterruptedException ie) {
            executor.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }
}
