package synchronizedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncListExample2 {
    public static void main(String[] args) {


        List<String> syncList = Collections.synchronizedList(new ArrayList<>());

        // While individual operations are thread-safe, iteration requires external synchronization:
        syncList.add("Apple");
        syncList.add("Banana");

        // When iterating, you must manually synchronize:
        synchronized (syncList) {
            for (String item : syncList) {
                System.out.println(item);
            }
        }
    }
}
