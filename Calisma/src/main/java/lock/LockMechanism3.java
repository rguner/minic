package lock;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LockMechanism3 {

    //private volatile Boolean authenticateUserExecuted;
    private final Map<String, Object> authenticateUserLockMap = new ConcurrentHashMap<>();
    private final Map<String, Boolean> authenticateUserExecutedMap = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        LockMechanism3 lockMechanism3 = new LockMechanism3();
        lockMechanism3.execute1();
    }

    private void execute1() {
        ExecutorService executor = Executors.newFixedThreadPool(20);
        String msisdn = "5322100234";
        authenticateUserLockMap.putIfAbsent(msisdn, new Object());
        authenticateUserExecutedMap.putIfAbsent(msisdn, false);

        for (int i = 0; i < 20; i++) {
            executor.submit(this::lockCheckMethod);
        }
        // shut down the executor manually
        executor.shutdown();

    }

    private void lockCheckMethod() {

        String msisdn = "5322100234";
        //authenticateUserExecutedMap.putIfAbsent(msisdn, new Object());

        //Object authenticateUserExecuted = authenticateUserExecutedMap.get(msisdn);
        synchronized (authenticateUserLockMap.get(msisdn)) {
            if (!authenticateUserExecutedMap.get(msisdn)) {
                // main logic
                try {
                    authenticateUserExecutedMap.put(msisdn, true);
                    System.out.println("Process started...., threadId:  " + Thread.currentThread().getId());
                    Thread.sleep(1000);
                    //System.out.println("set edildi1");
                    //System.out.println("set edildi2");
                } catch (InterruptedException e) {
                    authenticateUserExecutedMap.put(msisdn, false); // exception alınırsa authenticateUserInner tekrar çalışabilsin.
                    e.printStackTrace();
                }
            } else {
                System.out.println("authenticateUserExecuted nedeniyle gerceklestirilmedi " + Thread.currentThread().getId());
            }
        }
    }
    //System.out.println("lockCheckMethod finished, threadId : " + Thread.currentThread().getId());

}
