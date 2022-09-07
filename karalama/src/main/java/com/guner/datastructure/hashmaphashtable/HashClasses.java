package com.guner.datastructure.hashmaphashtable;

import java.util.*;
import java.lang.*;

// Name of the class has to be "Main"
// only if the class is public
class HashClasses
{
    /*
    Hashmap vs Hashtable

    HashMap is non-synchronized. It is not thread-safe and can’t be shared between many threads without proper synchronization
    code whereas Hashtable is synchronized. It is thread-safe and can be shared with many threads.

    HashMap allows one null key and multiple null values whereas Hashtable doesn’t allow any null key or value.

    HashMap is generally preferred over HashTable if thread synchronization is not needed.
     */
    public static void main(String args[])
    {
        //----------hashtable -------------------------
        Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
        ht.put(101," ajay");
        ht.put(101,"Vijay");
        ht.put(102,"Ravi");
        ht.put(103,"Rahul");
        // ht.put(null,"deneme"); Exception in thread "main" java.lang.NullPointerException
        // ht.put(105, null); Exception in thread "main" java.lang.NullPointerException
        System.out.println("-------------Hash table--------------");
        for (Map.Entry m:ht.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
 
        //----------------hashmap--------------------------------
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(100,"Amit");
        hm.put(104,"Amit"); 
        hm.put(101,"Vijay");
        hm.put(102,"Rahul");
        hm.put(null, "deneme");
        hm.put(105, null);
        System.out.println("-----------Hash map-----------");
        for (Map.Entry m:hm.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }

        System.out.println("Stream ile yazdırma 1:");
        hm.entrySet().stream().forEach(e -> System.out.print(e.getKey() + ":" + e.getValue() + " | "));
        System.out.println("\nForEach ile yazdırma");
        hm.forEach((k, v ) -> System.out.print(k + ":" + v + " | "));
    }
}