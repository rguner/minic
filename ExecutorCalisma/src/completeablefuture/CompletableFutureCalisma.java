package completeablefuture;

import executor.ProductAmount;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompletableFutureCalisma {

    public static void main(String[] args) {
        CompletableFutureCalisma completableFutureCalisma = new CompletableFutureCalisma();
        //completableFutureCalisma.execute1();
        //completableFutureCalisma.execute2();
        //completableFutureCalisma.completedFuture();
        //completableFutureCalisma.supplyAsync();
        //completableFutureCalisma.supplyAsyncWithSleep();
        completableFutureCalisma.supplyAsyncThenApply();
        //completableFutureCalisma.supplyAsyncThenAccept();
        //completableFutureCalisma.supplyAsyncThenRun();
        // completableFutureCalisma.supplyAsyncThenCompose();
        //completableFutureCalisma.supplyAsyncThenCombine();
        //completableFutureCalisma.supplyAsyncThenComposeWithSleep();
        //completableFutureCalisma.supplyAsyncThenAcceptBoth();
        //completableFutureCalisma.allOf();
        //completableFutureCalisma.handlingError();
        //completableFutureCalisma.supplyAsyncThenApplyAsync();
        completableFutureCalisma.supplyAsyncThenApplies();
    }

    private void supplyAsyncThenApplies() {

        CompletableFuture completableFuture = CompletableFuture.supplyAsync(() -> "Hello from " + Thread.currentThread().getName())
                .thenApply(s -> s + " World from " + Thread.currentThread().getName())
                .thenApply(s -> s + " Merhaba " + Thread.currentThread().getName())
                .thenApplyAsync(s -> s + " Nasılsın " + Thread.currentThread().getName())
                .thenAccept(System.out::println);


        try {
            Object s = completableFuture.get();
            System.out.println("supplyAsyncThenApplies : " + s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    /*
        Async Methods
        Most methods of the fluent API in CompletableFuture class have two additional variants with the Async postfix. These methods are usually intended for running a corresponding step of execution in another thread.

        The methods without the Async postfix run the next execution stage using a calling thread. In contrast, the Async method without the Executor argument runs a step using the common fork/join pool implementation of Executor that is accessed with the ForkJoinPool.commonPool() method. Finally, the Async method with an Executor argument runs a step using the passed Executor.

        Here's a modified example that processes the result of a computation with a Function instance. The only visible difference is the thenApplyAsync method, but under the hood the application of a function is wrapped into a ForkJoinTask instance (for more information on the fork/join framework, see the article “Guide to the Fork/Join Framework in Java”). This allows us to parallelize our computation even more and use system resources more efficiently:

        döngüler, thenApplyAsync işleminin ayrı threadde çalıştığını ispatlamak için
        thenApply kullanırsan aynı threadde devam eder.
     */

    private void supplyAsyncThenApplyAsync() {
        List<CompletableFuture<String>> completableFutureList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {

            CompletableFuture<String> completableFutureMain = CompletableFuture.supplyAsync(() -> {
                CompletableFuture<String> completableFuture
                        = CompletableFuture.supplyAsync(() -> {
                    sleep();
                    return "Hello from " + Thread.currentThread().getName();
                });

                CompletableFuture<String> future = completableFuture
                        .thenApplyAsync(s -> s + " World from " + Thread.currentThread().getName());

                try {
                    String s = future.get();
                    System.out.println("supplyAsyncThenApplyAsync : " + s);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
                return "bitti";
            });
            completableFutureList.add(completableFutureMain);
        }

        for (int i = 0; i < 100; i++) {
            try {
                Object s = completableFutureList.get(i).get();
                System.out.println("supplyAsyncThenApplyAsyncList-" + i + " : " + s);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }

    private void handlingError() {
        String name = null;
        CompletableFuture<String> completableFuture
                = CompletableFuture.supplyAsync(() -> {
            if (name == null) {
                throw new RuntimeException("Computation error!");
            }
            return "Hello, " + name;
        }).handle((s, t) -> s != null ? s : "Hello, Stranger! you got " + t.getMessage());

        try {
            Object s = completableFuture.get();
            System.out.println("handlingError : " + s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }


    private void allOf() {

        CompletableFuture<String> future1
                = CompletableFuture.supplyAsync(() -> "Hello- " + Thread.currentThread().getName());
        CompletableFuture<String> future2
                = CompletableFuture.supplyAsync(() -> "Beautiful- " + Thread.currentThread().getName());
        CompletableFuture<String> future3
                = CompletableFuture.supplyAsync(() -> "World-" + Thread.currentThread().getName());

        CompletableFuture<Void> combinedFuture
                = CompletableFuture.allOf(future1, future2, future3);

        try {
            combinedFuture.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        String combined = Stream.of(future1, future2, future3)
                .map(CompletableFuture::join)
                .collect(Collectors.joining(" "));
        System.out.println(combined);

    }


    private void supplyAsyncThenAcceptBoth() {

        CompletableFuture completableFuture = CompletableFuture.supplyAsync(() -> "Hello from " + Thread.currentThread().getName())
                .thenAcceptBoth(CompletableFuture.supplyAsync(() -> " World from " + Thread.currentThread().getName()),
                        (s1, s2) -> System.out.println(s1 + s2));

        try {
            Object s = completableFuture.get();
            System.out.println("supplyAsyncThenAcceptBoth : " + s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }


    private void supplyAsyncThenCombine() {

        CompletableFuture<String> completableFuture
                = CompletableFuture.supplyAsync(() -> "Hello from " + Thread.currentThread().getName())
                .thenCombine(CompletableFuture.supplyAsync(
                        () -> " World from " + Thread.currentThread().getName()), (s1, s2) -> s1 + s2);

        try {
            String s = completableFuture.get();
            System.out.println("supplyAsyncThenCombine : " + s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    private void supplyAsyncThenCombineWithSleep() {

        CompletableFuture<String> completableFuture
                = CompletableFuture.supplyAsync(() -> {
            sleep();
            System.out.println("Hello from " + Thread.currentThread().getName());
            return "Hello from " + Thread.currentThread().getName();
        })
                .thenCombine(CompletableFuture.supplyAsync(() -> {
                    sleep5();
                    System.out.println("World from " + Thread.currentThread().getName());
                    return " World from " + Thread.currentThread().getName();
                }), (s1, s2) -> s1 + s2);

        try {
            String s = completableFuture.get();
            System.out.println("supplyAsyncThenCombineWithSleep : " + s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    private void sleep5() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    private void supplyAsyncThenCompose() {

        CompletableFuture<String> completableFuture
                = CompletableFuture.supplyAsync(() -> {
            sleep();
            System.out.println("Hello from " + Thread.currentThread().getName());
            return "Hello from " + Thread.currentThread().getName();
        })
                .thenCompose(s -> CompletableFuture.supplyAsync(() -> s + " World from " + Thread.currentThread().getName()));

        try {
            String s = completableFuture.get();
            System.out.println("supplyAsyncThenCompose : " + s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    // önce ilk job, bitince diğer job yapılır
    private void supplyAsyncThenComposeWithSleep() {

        CompletableFuture<String> completableFuture
                = CompletableFuture.supplyAsync(() -> {
            sleep();
            System.out.println("Hello from " + Thread.currentThread().getName());
            return "Hello from " + Thread.currentThread().getName();
        })
                .thenCompose(s -> CompletableFuture.supplyAsync(() -> {
                    sleep5();
                    return s + " World from " + Thread.currentThread().getName();
                }));

        try {
            String s = completableFuture.get();
            System.out.println("supplyAsyncThenComposeWithSleep : " + s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    private void supplyAsyncThenRun() {

        CompletableFuture<String> completableFuture
                = CompletableFuture.supplyAsync(() -> {
            sleep();
            System.out.println("Hello from " + Thread.currentThread().getName());
            return "Hello from " + Thread.currentThread().getName();
        });

        CompletableFuture<Void> future = completableFuture
                .thenRun(() -> System.out.println("World from " + Thread.currentThread().getName()));

        // asagidaki blok anlamlı değil, void olduğu için. zaten accepte gereken işlem yapıldı çünkü.
        try {
            Void s = future.get();
            System.out.println("supplyAsyncThenRun : " + s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    private void supplyAsyncThenAccept() {

        CompletableFuture<String> completableFuture
                = CompletableFuture.supplyAsync(() -> {
            sleep();
            return "Hello from " + Thread.currentThread().getName();
        });

        CompletableFuture<Void> future = completableFuture
                .thenAccept(s -> System.out.println(s + " World from " + Thread.currentThread().getName()));

        // asagidaki blok anlamlı değil, void olduğu için. zaten accepte gereken işlem yapıldı çünkü.
        try {
            Void s = future.get();
            System.out.println("supplyAsyncThenAccept : " + s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    /*
        thenApply()
        We can use this method to work with a result of the previous call. However, a key point to remember is that the return type will be combined of all calls.
    */
    private void supplyAsyncThenApply() {
        CompletableFuture<String> completableFuture
                = CompletableFuture.supplyAsync(() -> {
            sleep();
            return "Hello from " + Thread.currentThread().getName();
        });

        CompletableFuture<String> future = completableFuture
                .thenApply(s -> s + " World from " + Thread.currentThread().getName());

        try {
            String s = future.get();
            System.out.println("supplyAsyncThenApply : " + s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    private void supplyAsyncWithSleep() {

        CompletableFuture<String> future
                = CompletableFuture.supplyAsync(() -> {
            sleep();
            return "Hello from " + Thread.currentThread().getName();
        });

        try {
            String s = future.get();
            System.out.println("supplyAsyncWithSleep : " + s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

    private void supplyAsync() {

        CompletableFuture<String> future
                = CompletableFuture.supplyAsync(() -> "Hello from " + Thread.currentThread().getName());

        try {
            String s = future.get();
            System.out.println("supplyAsync : " + s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

    private void completedFuture() {
        Future<String> completableFuture =
                CompletableFuture.completedFuture("Hello");
        try {
            String s = completableFuture.get();
            System.out.println("completedFuture : " + s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    private void execute1() {
        try {
            Future<String> future = calculateAsync();
            String sonuc = future.get();
            System.out.println(Thread.currentThread().getName() + " Async islem calisti : " + sonuc);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (CancellationException ex) {
            System.out.println("CancellationException occured");
            ex.printStackTrace();
        } catch (ExecutionException ex) {
            System.out.println("ExecutionException occured");
            ex.printStackTrace();
        }
    }

    private void execute2() {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        try {
            List<Future<String>> futureList = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                futureList.add(calculateAsyncWithExecutorService(executorService));
            }

            for (Future<String> future : futureList) {
                String sonuc = future.get();
                System.out.println(Thread.currentThread().getName() + " Async islem calisti : " + sonuc);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (CancellationException ex) {
            System.out.println("CancellationException occured");
            ex.printStackTrace();
        } catch (ExecutionException ex) {
            System.out.println("ExecutionException occured");
            ex.printStackTrace();
        }

        executorService.shutdown();
    }

    public Future<String> calculateAsync() throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        CompletableFuture<String> completableFuture = new CompletableFuture<>();

        executorService.submit(() -> {
            Thread.sleep(500);
            completableFuture.complete("Hello from " + Thread.currentThread().getName());
            return null;
        });

        executorService.shutdown();

        return completableFuture;
    }

    public Future<String> calculateAsyncWithExecutorService(ExecutorService executorService) throws
            InterruptedException {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();

        executorService.submit(() -> {
            Thread.sleep(500);
            completableFuture.complete("Hello from " + Thread.currentThread().getName());
            return null;
        });

        return completableFuture;
    }
}
