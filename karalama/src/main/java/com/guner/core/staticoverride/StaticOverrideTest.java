package com.guner.core.staticoverride;

class Base {
     
    // Static method in base class which will be hidden in subclass
    public static void display() {
        System.out.println("Static or class method from Base");
    }
     
     // Non-static method which will be overridden in derived class
     public void print()  {
         System.out.println("Non-static or Instance method from Base");
    }
}
 
// Subclass
class Derived extends Base {
     
    // This method is hidden by display() in Base
    public static void display() {
         System.out.println("Static or class method from Derived");
    }
     
    // This method overrides print() in Base
    public void print() {
         System.out.println("Non-static or Instance method from Derived");
   }
}
 
// Driver class
public class StaticOverrideTest {
    public static void main(String args[ ])  {
       Base obj1 = new Derived();
        
       // As per overriding rules this should call to class Derive's static
       // overridden method. Since static method can not be overridden, it
       // calls Base's display()
       obj1.display(); 
        
       // Here overriding works and Derive's print() is called
       obj1.print();

        // tipi derived olarak tanımlarsan Derived Class'ınını display metodunu görür. alttaki iki çağrım da aynı..
       Derived derived1= new Derived();
       derived1.display();
       Derived.display();
    }
}