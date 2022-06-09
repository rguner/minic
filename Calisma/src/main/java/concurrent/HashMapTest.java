package concurrent;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapTest {

    public static void main(String[] args) {
        HashMapTest hashMapTest = new HashMapTest();
        hashMapTest.changeInLoopForConcurrentHashMap();
        hashMapTest.changeInLoopForSyncronizedMap();
    }

    private void changeInLoopForSyncronizedMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "baeldung");
        map.put(2, "HashMap");
        Map<Integer, String> synchronizedMap = Collections.synchronizedMap(map);
        Iterator<Map.Entry<Integer, String>> iterator = synchronizedMap.entrySet().iterator();
        while (iterator.hasNext()) {
            synchronizedMap.put(3, "Modification");
            iterator.next();
        }
    }

    private void changeInLoopForConcurrentHashMap() {
        Map<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "baeldung");
        map.put(2, "HashMap");

        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            map.put(3, "Modification");
            iterator.next();
        }
        System.out.println("3 --> " + map.get(3));
    }
}
