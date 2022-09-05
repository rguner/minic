package com.guner.datastructure.hashtable;

import java.util.*;
  
public class HashTableDemo {
    public static void main(String[] args)
    {
  
        // Creating an empty Hashtable
        Hashtable<Integer, String> hash_table = 
                           new Hashtable<Integer, String>();
  
        // Inserting values into the table
        hash_table.put(10, "Geeks");
        hash_table.put(15, "4");
        hash_table.put(20, "Geeks");
        hash_table.put(25, "Welcomes");
        hash_table.put(30, "You");
        hash_table.put(90, "Ramazan");

        // Displaying the Hashtable
        System.out.println("Initial table is: " + hash_table);
  
        // Inserting existing key along with new value
        String returned_value = (String)hash_table.put(20, "All");
  
        // Verifying the returned value
        System.out.println("Returned value for key 20 is: " + returned_value);

        returned_value = (String)hash_table.put(50, "All");

        // Verifying the returned value
        System.out.println("Returned value for key 50 is: " + returned_value);

        // Removing the existing key mapping
        returned_value = (String)hash_table.remove(90);

        // Verifying the returned value
        System.out.println("Returned value is: " + returned_value);
  
        // Displaying the new table
        System.out.println("New table is: " + hash_table);
    }
}