package com.guner.datastructure.sets;

import java.util.*;
  
// Main class
class TreeSetExample {
  
    // Main driver method
    public static void main(String[] args)
    {
        Set<String> ts = new TreeSet<String>();
  
        ts.add("India");
        ts.add("Australia");
        ts.add("South Africa");
        ts.add("Turkey");
        ts.add("India");

        System.out.println("All Set");
        // Displaying the TreeSet
        System.out.println(ts);
  
        ts.remove("Australia");
        System.out.println("Set after removing Australia:" + ts);
  
        // Iterating over Tree set items
        System.out.println("Iterating over set:");
        Iterator<String> i = ts.iterator();
  
        while (i.hasNext())
            System.out.println(i.next());
    }
}