package com.guner.java8calisma;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

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

        Executors.newCachedThreadPool().submit(() -> {
            Thread.sleep(500);
            completableFuture.complete("Hello1");
            return null;
        });
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
}
