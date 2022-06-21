package com.guner.datastructure.hashmap;

import java.util.*;

public class LinkedHashMapExample {

    public static void main(String args[]) {

        HashMap<Integer, String> hMap = new HashMap<Integer, String>();

        hMap.put(12, "Ramazan");
        hMap.put(2, "Ceyhan");
        hMap.put(7, "Şevval");
        hMap.put(49, "Ömer");
        hMap.put(3, "Güner");

        System.out.println("HashMap:");
        hMap.forEach((k, v) -> System.out.println("Key : " + k + " Value : " + v));

        // insert edildiği sırada listelenir.
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

        linkedHashMap.put(12, "Ramazan");
        linkedHashMap.put(2, "Ceyhan");
        linkedHashMap.put(7, "Şevval");
        linkedHashMap.put(49, "Ömer");
        linkedHashMap.put(3, "Güner");

        System.out.println("LinkedHashMap:");
        linkedHashMap.forEach((k, v) -> System.out.println("Key : " + k + " Value : " + v));


    }
}
