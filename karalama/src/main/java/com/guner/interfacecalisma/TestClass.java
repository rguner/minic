package com.guner.interfacecalisma;

class TestClass implements TestInterface
{
    // implementation of square abstract method
    @Override
    public void square(int a) {
        System.out.println(a*a);
    }

    /*
    @Override
    public void show() {
        System.out.println("Implemented Show Method Executed");
    }
     */


  
    public static void main(String args[])
    {
        TestClass d = new TestClass();
        d.square(4);
  
        // default method executed
        d.show();
    }

}