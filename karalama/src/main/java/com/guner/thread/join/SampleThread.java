package com.guner.thread.join;

public class SampleThread extends Thread {
    public int processingCount = 0;

    public static void main(String[] args) {
        Thread t2 = new SampleThread(3);
        t2.start();
        System.out.println("Invoking join");
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Returned from join");
    }
 
    SampleThread(int processingCount) {
        this.processingCount = processingCount;
        System.out.println("Thread Created");
    }
 
    @Override
    public void run() {
        System.out.println("Thread " + this.getName() + " started");
        while (processingCount > 0) {
            try {
                System.out.println("Sleeping...");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Thread " + this.getName() + " interrupted");
            }
            processingCount--;
        }
        System.out.println("Thread " + this.getName() + " exiting");
    }
}