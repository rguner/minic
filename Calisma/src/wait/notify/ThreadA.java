package wait.notify;
public class ThreadA {
    public static void main(String[] args){
        ThreadB b = new ThreadB();
        b.start();
        
        // bu blok varsa problem, aşağıdaki kod wait'de kalır.
        /*
        try {
			Thread.currentThread().sleep(100);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

         */


 
        synchronized(b){
            try{
                System.out.println("Waiting for b to complete...");
                b.wait(); // syncronized lock ı geri verir ve bekler. böylece işlem sırası ThreadB'ye geçer
            }catch(InterruptedException e){
                e.printStackTrace();
            }
 
            System.out.println("Total is: " + b.total);
        }
    }
}