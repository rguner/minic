package lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter{

  public static void main(String[] args) {
    Counter counter = new Counter();
    int result = counter.incWithSynchronized();
    result = counter.incWithLock();
    System.out.println("Sonuç: " + result);
  }
  private int count = 0;

  public int incWithSynchronized(){
    synchronized(this){
      return ++count;
    }
  }

  ReentrantLock lock = new ReentrantLock();
  public int incWithLock() {
    lock.lock();
    try {
      // Critical section here
      return ++count;
    } finally {
      lock.unlock();
    }
  }

}