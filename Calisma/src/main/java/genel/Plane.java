package genel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Plane {
   private String name;
   private Integer tailNumber;

   public Plane(String n, Integer t) {
      name = n;
      tailNumber = t;
   }

   public String toString() {
      return name + tailNumber + " ";
   }

   public static void main(String[] args) {
      List<Plane> pList = new ArrayList<Plane>();
      pList.add(new Plane("Malatya", 44));
      pList.add(new Plane("Ankara", 06));
      pList.add(new Plane("Antalya", 07));
      //Collections.sort(pList);
      System.out.println(pList);

      System.out.println("ba�la");
      for (int i = Integer.MIN_VALUE; i <= Integer.MAX_VALUE; i++)
        //System.out.println(i);
    	  ;

      
   }
}