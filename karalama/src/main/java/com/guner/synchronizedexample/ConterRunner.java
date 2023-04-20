package com.guner.synchronizedexample;

public class ConterRunner {

    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread threadA = new CounterThread(counter);
        Thread threadB = new CounterThread(counter);
        Thread threadC = new CounterThread(counter);

        threadA.start();
        threadB.start();
        threadC.start();


        try {
            threadA.join();
            threadB.join();
            threadC.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("SONUC countSyncValue    = " + counter.countSyncValue);
        System.out.println("SONUC countNonSyncValue = " + counter.countNonSyncValue);
    }
}