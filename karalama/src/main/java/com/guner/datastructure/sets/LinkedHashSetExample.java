package com.guner.datastructure.sets;

import java.util.*;
  
class LinkedHashSetExample {
  
    public static void main(String[] args)
    {
        Set<String> linkedHashSet = new LinkedHashSet<String>();
  
        linkedHashSet.add("India");
        linkedHashSet.add("Australia");
        linkedHashSet.add("South Africa");
  
        // Adding the duplicate
        // element
        linkedHashSet.add("India");
  
        System.out.println(linkedHashSet);
  
        linkedHashSet.remove("Australia");
        System.out.println("Set after removing "
                           + "Australia:" + linkedHashSet);
  
        System.out.println("Iterating over set:");
        Iterator<String> i = linkedHashSet.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}