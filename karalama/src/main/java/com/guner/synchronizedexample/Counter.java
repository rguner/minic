package com.guner.synchronizedexample;

public class Counter {

    long countSyncValue = 0;
    long countNonSyncValue = 0;

    public synchronized void addSynchronized(long value) {
        //System.out.print(".");
        this.countSyncValue += value;
    }

    public void addNonSynchronized(long value) {
        //System.out.print(".");
        this.countNonSyncValue += value;
    }
}