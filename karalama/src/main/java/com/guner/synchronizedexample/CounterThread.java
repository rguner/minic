package com.guner.synchronizedexample;

public class CounterThread extends Thread {

    protected Counter counter = null;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {

        for (int i = 0; i < 1000; i++) {
            counter.addSynchronized(i);
        }

        for (int i = 0; i < 1000; i++) {
            counter.addNonSynchronized(i);
        }
    }
}