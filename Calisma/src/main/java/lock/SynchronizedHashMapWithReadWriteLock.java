package lock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SynchronizedHashMapWithReadWriteLock {

    public static void main(String[] args) {
        SynchronizedHashMapWithReadWriteLock synchronizedHashMapWithReadWriteLock = new SynchronizedHashMapWithReadWriteLock();
        synchronizedHashMapWithReadWriteLock.put("1","ramazan");
        synchronizedHashMapWithReadWriteLock.put("2","ceyhan");
        System.out.println("1 -- > " + synchronizedHashMapWithReadWriteLock.get("1"));
        System.out.println("2 contains? -- > " + synchronizedHashMapWithReadWriteLock.containsKey("2"));
    }

    Map<String,String> syncHashMap = new HashMap<>();
    ReadWriteLock lock = new ReentrantReadWriteLock();
    // ...
    Lock writeLock = lock.writeLock();

    public void put(String key, String value) {
        try {
            writeLock.lock();
            syncHashMap.put(key, value);
        } finally {
            writeLock.unlock();
        }
    }

    public String remove(String key){
        try {
            writeLock.lock();
            return syncHashMap.remove(key);
        } finally {
            writeLock.unlock();
        }
    }


    Lock readLock = lock.readLock();
    //...
    public String get(String key){
        try {
            readLock.lock();
            return syncHashMap.get(key);
        } finally {
            readLock.unlock();
        }
    }

    public boolean containsKey(String key) {
        try {
            readLock.lock();
            return syncHashMap.containsKey(key);
        } finally {
            readLock.unlock();
        }
    }
}