package lock;

import java.util.concurrent.*;

public class LockMechanism {

    private volatile Boolean authenticateUserExecuted;

    public static void main(String[] args) {
        LockMechanism lockMechanism = new LockMechanism();
        lockMechanism.execute1();
    }

    private void execute1() {
        ExecutorService executor = Executors.newFixedThreadPool(15);

        for (int i = 0; i < 15; i++) {
            executor.submit(this::lockCheckMethod);
        }
        // shut down the executor manually
        executor.shutdown();

    }

    private void lockCheckMethod() {

        if (authenticateUserExecuted == null) {
            synchronized (this) {
                if (authenticateUserExecuted == null) { // double check, yukarıddaki if syncronized blokta olmadıgı için
                    authenticateUserExecuted = true;
                    // main logic
                    try {
                        System.out.println("Process started...., threadId:  " + Thread.currentThread().getId());
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                } else {
                    System.out.println("authenticateUserExecuted nedeniyle gerceklestirilmedi " +  + Thread.currentThread().getId());
                }
            }
        } else {
            System.out.println("authenticateUserExecuted nedeniyle gerceklestirilmedi2 " +  + Thread.currentThread().getId() );
        }
        //System.out.println("lockCheckMethod finished, threadId : " + Thread.currentThread().getId());

    }


}
