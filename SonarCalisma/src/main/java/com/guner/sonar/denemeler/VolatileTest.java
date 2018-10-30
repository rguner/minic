package com.guner.sonar.denemeler;
public class VolatileTest {    

    private static volatile int MY_INT = 0;
    private static int MY_INT_NOT_VOLATILE = 0;
    private static int RUN_COUNT = 50;
    private static int WAIT_TIME=100;

    public static void main(String[] args) {
        new ChangeListener().start();
        new ChangeMaker().start();
        new ChangeListenerNotVolatile().start();
        new ChangeMakerNotVolatile().start();
    }

    static class ChangeListener extends Thread {
        @Override
        public void run() {
            int local_value = MY_INT;
            while ( local_value < RUN_COUNT){
                if( local_value!= MY_INT){
                    System.out.println("Got Change for MY_INT : " + MY_INT);
                     local_value= MY_INT;
                }
            }
        }
    }

    static class ChangeMaker extends Thread{
        @Override
        public void run() {

            int local_value = MY_INT;
            while (MY_INT <RUN_COUNT){
            	System.out.println("Incrementing MY_INT to " + (local_value+1));
                MY_INT = ++local_value;
                try {
                    Thread.sleep(WAIT_TIME);
                } catch (InterruptedException e) { e.printStackTrace(); }
            }
        }
    }
    
    // outputa kırmızı yazdım farkı görelim diye.
    static class ChangeListenerNotVolatile extends Thread {
        @Override
        public void run() {
            int local_value = MY_INT_NOT_VOLATILE;
            while ( local_value < RUN_COUNT){
                if( local_value!= MY_INT_NOT_VOLATILE){
                    System.err.println("Got Change for MY_INT_NOT_VOLATILE : " + MY_INT_NOT_VOLATILE);
                     local_value= MY_INT_NOT_VOLATILE;
                }
            }
        }
    }

    // outputa kırmızı yazdım farkı görelim diye.
    static class ChangeMakerNotVolatile extends Thread{
        @Override
        public void run() {

            int local_value = MY_INT_NOT_VOLATILE;
            while (MY_INT_NOT_VOLATILE <RUN_COUNT){
            	System.err.println("Incrementing MY_INT_NOT_VOLATILE to " + (local_value+1));
            	MY_INT_NOT_VOLATILE = ++local_value;
                try {
                    Thread.sleep(WAIT_TIME);
                } catch (InterruptedException e) { e.printStackTrace(); }
            }
        }
    }
}