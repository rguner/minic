package com.guner.datastructure.treeset;

import java.util.*;

class TreeSet4 {
    public static void main(String args[]) {
        TreeSet<String> set = new TreeSet<String>();
        set.add("Adana");
        set.add("Bursa");
        set.add("Ceyhan");
        set.add("Denizli");
        set.add("Edirne");
        System.out.println("Initial Set: " + set);

        System.out.println("Reverse Set: " + set.descendingSet());

        System.out.println("Head Set C: " + set.headSet("C", true));

        System.out.println("SubSet A-E: " + set.subSet("A", false, "E", true));

        System.out.println("TailSet C : " + set.tailSet("C", false));
    }
}  