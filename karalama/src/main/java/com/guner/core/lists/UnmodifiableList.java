package com.guner.core.lists;

import java.util.*;
  
public class UnmodifiableList {
    public static void main(String[] argv)
        throws Exception
    {
        try {
  
            // creating object of ArrayList<Character>
            List<Character> list = new ArrayList<Character>();
  
            // populate the list
            list.add('X');
            list.add('Y');
  
            // printing the list
            System.out.println("Initial list: " + list);
  
            // getting unmodifiable list
            // using unmodifiableList() method
            List<Character> immutablelist = Collections
                                                .unmodifiableList(list);
  
            // printing the list
            System.out.println("Unmodifiable list: "
                               + immutablelist);

            list.add('R');
            System.out.println("Initial list, added R: " + list);
            System.out.println("Unmodifiable list after added R to originalList: " + immutablelist);

            // exception oluşur.
            immutablelist.add('Z');

        } catch (UnsupportedOperationException e) {
            System.out.println("Exception thrown : " + e);
        }
    }
}