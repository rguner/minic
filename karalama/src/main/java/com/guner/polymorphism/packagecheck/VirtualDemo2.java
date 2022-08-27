package com.guner.polymorphism.packagecheck;

import com.guner.polymorphism.Employee;
import com.guner.polymorphism.Salary;

public class VirtualDemo2 {

   public static void main(String [] args) {
      Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
      Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
      Employee e2 = new Employee("Ramazan Güner", "Boston, MA", 2);
      System.out.println("\n Call mailCheck using Salary reference --");
      s.mailCheck();
      System.out.println("\n Call mailCheck using Employee reference--");
      e.mailCheck();
      System.out.println("\n Call mailCheck using Employee reference 2--");
      e2.mailCheck();

      // package-private test
      //s.name = "selam";
   }
}