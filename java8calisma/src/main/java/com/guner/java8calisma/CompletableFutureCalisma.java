package com.guner.java8calisma;

import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompletableFutureCalisma {
    public static void main(String[] args) {
        CompletableFutureCalisma completableFutureCalisma = new CompletableFutureCalisma();
        completableFutureCalisma.execute1();
        completableFutureCalisma.execute2();
        completableFutureCalisma.execute3();
        completableFutureCalisma.execute4();
        completableFutureCalisma.execute5();
        completableFutureCalisma.execute6();
        completableFutureCalisma.execute7();
        completableFutureCalisma.execute8();
        completableFutureCalisma.runParallel();
    }

    private void execute1() {
        Future<String> stringFuture = calculate1();
        try {
            String result = stringFuture.get();
            System.out.println("Sonuç: " + result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    private Future<String> calculate1() {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(() -> {
            Thread.sleep(500);
            completableFuture.complete("Hello1");
            return null;
        });

        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(800, TimeUnit.MILLISECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }

        return completableFuture;

    }

    private void execute2() {
        CompletableFuture<String> future
                = CompletableFuture.supplyAsync(() -> "Hello2");
        try {
            String result= future.get();
            System.out.println("Sonuç: " + result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    private void execute3() {
        CompletableFuture<String> completableFuture
                = CompletableFuture.supplyAsync(() -> "Hello3");

        CompletableFuture<String> future = completableFuture
                .thenApply(s -> s + " World3");

        try {
            String result = future.get();
            System.out.println("Sonuç: " + result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    private void execute4() {
        CompletableFuture<String> completableFuture
                = CompletableFuture.supplyAsync(() -> "Hello4");

        CompletableFuture<Void> future = completableFuture
                .thenAccept(s -> System.out.println("Computation returned: " + s));

        /*
        try {
            future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

         */
    }

    private void execute5() {
        CompletableFuture<String> completableFuture
                = CompletableFuture.supplyAsync(() -> "Hello5");

        CompletableFuture<Void> future = completableFuture
                .thenRun(() -> System.out.println("Computation finished 5."));

        try {
            future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    private void execute6() {
        CompletableFuture<String> completableFuture
                = CompletableFuture.supplyAsync(() -> "Hello6")
                .thenCompose(s -> CompletableFuture.supplyAsync(() -> s + " World6"));

        try {
            String result = completableFuture.get();
            System.out.println("Sonuç: " + result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    private void execute7() {
        CompletableFuture<Void> completableFuture
                = CompletableFuture.supplyAsync(() -> "Hello7")
                .thenCompose(s -> CompletableFuture.supplyAsync(() -> s + " World7"))
                .thenAccept(s -> System.out.println("Computation finished 7. Sonuç: " + s));
    }


    private void execute8() {
        CompletableFuture<String> completableFuture
                = CompletableFuture.supplyAsync(() -> "Hello8")
                .thenCombine(CompletableFuture.supplyAsync(
                        () -> " World8"), (s1, s2) -> s1 + s2);
        try {
            String result = completableFuture.get();
            System.out.println("Sonuç: " + result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    private void runParallel() {
        CompletableFuture<String> future1
                = CompletableFuture.supplyAsync(() -> "Hello9");
        CompletableFuture<String> future2
                = CompletableFuture.supplyAsync(() -> "Beautiful9");
        CompletableFuture<String> future3
                = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "World9"; } );

        CompletableFuture<Void> combinedFuture
                = CompletableFuture.allOf(future1, future2, future3);

        String combined = Stream.of(future1, future2, future3)
                .map(CompletableFuture::join)
                .collect(Collectors.joining(" "));

        System.out.println("Sonuç: " + combined);
    }



}
