package genel;

import java.util.PriorityQueue;

public class Home {
   public static void main(String[] args) {
      String[] things = {"*  chair  *", "*desk*", "*1cup*", "*Roll*", "*board*"};
      PriorityQueue<String> p = new PriorityQueue<String>();
      for (String s : things) p.offer(s);
      while(p.size()>0) System.out.print(p.poll() + " ");
      
      while(true)
      {
    	  try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      }
   }
}