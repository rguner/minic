package lock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LockMechanism2 {

    //private volatile Boolean authenticateUserExecuted;
    private final Map<String, Boolean> authenticeUserExecuted = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        LockMechanism2 lockMechanism2 = new LockMechanism2();
        lockMechanism2.execute1();
    }

    private void execute1() {
        ExecutorService executor = Executors.newFixedThreadPool(15);

        for (int i = 0; i < 15; i++) {
            executor.submit(this::lockCheckMethod);
        }

        executor.shutdown();

    }

    private void lockCheckMethod() {

        String msisdn="5322100234";
        if (authenticeUserExecuted.get(msisdn) == null) {
            synchronized (this) {
                if (authenticeUserExecuted.get(msisdn) == null) { // double check, yukarıddaki if syncronized blokta olmadıgı için
                    authenticeUserExecuted.put(msisdn, true);
                    // main logic
                    try {
                        System.out.println("Process started...., threadId:  " + Thread.currentThread().getId());
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                } else {
                    System.out.println("authenticateUserExecuted nedeniyle gerceklestirilmedi " +  Thread.currentThread().getId());
                }
            }
        } else {
            System.out.println("authenticateUserExecuted nedeniyle gerceklestirilmedi2 " +  Thread.currentThread().getId() );
        }
        //System.out.println("lockCheckMethod finished, threadId : " + Thread.currentThread().getId());

    }


}
