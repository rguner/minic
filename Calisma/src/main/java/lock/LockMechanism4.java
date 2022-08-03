package lock;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LockMechanism4 {

    private Boolean authenticateUserExecuted;
    private final Map<String, Object> authenticateUserLockMap = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        LockMechanism4 lockMechanism4 = new LockMechanism4();
        lockMechanism4.execute1();
    }

    private void execute1() {
        ExecutorService executor = Executors.newFixedThreadPool(20);
        String msisdn = "5322100234";
        authenticateUserLockMap.putIfAbsent(msisdn, new Object());
        authenticateUserExecuted = false;

        for (int i = 0; i < 20; i++) {
            executor.submit(this::lockCheckMethod);
        }
        executor.shutdown();

    }

    private void lockCheckMethod() {

        String msisdn = "5322100234";

        synchronized (authenticateUserLockMap.get(msisdn)) {
            if (!authenticateUserExecuted) {
                // main logic
                try {
                    authenticateUserExecuted = true;
                    System.out.println("Process started...., threadId:  " + Thread.currentThread().getId());
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    authenticateUserExecuted = false; // exception alınırsa authenticateUserInner tekrar çalışabilsin.
                    e.printStackTrace();
                }
            } else {
                System.out.println("authenticateUserExecuted nedeniyle gerceklestirilmedi " + Thread.currentThread().getId());
            }
        }
    }
    //System.out.println("lockCheckMethod finished, threadId : " + Thread.currentThread().getId());

}
