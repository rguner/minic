package genel;

import java.util.concurrent.atomic.AtomicLong;

public class SynchronizedCounter 
{
    private int c = 0;
    public int d = 0;
    private final AtomicLong count = new AtomicLong(0);

    public synchronized void increment() {
        c++;
        System.out.println(Thread.currentThread().getName() + " " + c);
    }

    public synchronized void decrement() {
        c--;
        System.out.println(Thread.currentThread().getName() + " " + c);
    }

    public synchronized int value() {
        return c;
    }
    
    public void incrementNotSynchronized() {
        d++;
        //System.out.println(Thread.currentThread().getName() + " " + d);
    }
    
    public int valueNotSynchronized() {
        return d;
    }
    
    public void incrementAtomic() {
    	count.incrementAndGet();
        System.out.println(Thread.currentThread().getName() + " " + count);
    }

    public void decrementAtomic() {
    	count.decrementAndGet();
        System.out.println(Thread.currentThread().getName() + " " + count);
    }
    
    public long valueAtomic() {
    	return count.get();
    }
    
    
}
