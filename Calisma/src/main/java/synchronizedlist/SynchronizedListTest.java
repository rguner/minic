package synchronizedlist;

import java.util.*;

public class SynchronizedListTest {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> syncList = Collections.synchronizedList(new ArrayList<>());

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                syncList.add(i);
            }
        };

        // Create multiple threads
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        // Start threads
        t1.start();
        t2.start();
        t3.start();

        // Wait for threads to finish
        t1.join();
        t2.join();
        t3.join();

        // Expected size: 1000 * 3 = 3000
        System.out.println("Expected size: 3000");
        System.out.println("Actual size: " + syncList.size());
    }
}
