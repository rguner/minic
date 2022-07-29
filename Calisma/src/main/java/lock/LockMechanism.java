package lock;

import java.util.concurrent.*;

public class LockMechanism {

    Boolean authenticateUserExecuted;

    public static void main(String[] args) {
        LockMechanism lockMechanism = new LockMechanism();
        lockMechanism.execute1();
    }

    private void execute1() {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Runnable, return void, nothing, submit and run the task async
        executor.submit(() -> lockCheckMethod());
        executor.submit(() -> lockCheckMethod());
        executor.submit(() -> lockCheckMethod());
        executor.submit(() -> lockCheckMethod());
        executor.submit(() -> lockCheckMethod());
        // shut down the executor manually
        executor.shutdown();

    }

    private void lockCheckMethod() {

        if (authenticateUserExecuted == null) {
            synchronized (this) {
                if (authenticateUserExecuted == null) // double check, yukarıddaki if syncronized blokta olmadıgı için
                {
                    authenticateUserExecuted = true;
                    // main logic
                    try {
                        System.out.println("Process started...., threadId:  "+ Thread.currentThread().getId() );
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                } else {
                    System.out.println("authenticateUserExecuted nedeniyle gerceklestirilmedi");
                }
            }
        } else {
            System.out.println("authenticateUserExecuted nedeniyle gerceklestirilmedi2");
        }
        System.out.println("lockCheckMethod finished, threadId : " + Thread.currentThread().getId() );

    }


}
