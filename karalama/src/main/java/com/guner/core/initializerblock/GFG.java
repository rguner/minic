package com.guner.core.initializerblock;

import java.io.*;

public class GFG {
    // Initializer block starts..
    {
        // This code is executed before every constructor.
        System.out.println("Common part of constructors invoked !!");
    }
    // Initializer block ends

    public GFG() {
        System.out.println("Default Constructor invoked");
    }

    public GFG(int x) {
        System.out.println("Parameterized constructor invoked");
    }

    public static void main(String arr[]) {
        System.out.println("Uygulama başladı");
        GFG obj1, obj2;
        obj1 = new GFG();
        obj2 = new GFG(0);
    }
}
