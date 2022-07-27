package com.guner.datastructure.sets;

import java.util.*;

class SetsExample {

    // Main driver method
    public static void main(String[] args) {

        SetsExample setsExample = new SetsExample();
        setsExample.hashSet1();
        setsExample.hashSetFromCollection();
        setsExample.unionIntersection();
        setsExample.treeSet1();
        setsExample.treeSetFromCollection();
    }


    private void hashSet1() {
        // Creating a HashSet object of string type
        HashSet<String> hset = new HashSet<>();

        // Adding elements to HashSet
        // using add() method
        hset.add("geeks");
        hset.add("for");
        hset.add("practice");
        hset.add("contribute");

        // Duplicate removed
        hset.add("geeks");
        hset.add("for");
        hset.add(null);
        boolean isAdded = hset.add("geeks");
        System.out.println("isAdded: " + isAdded);

        System.out.println("hashSet1 ------------------------");

        // Printing HashSet elements using for each loop

        // Display message only
        System.out.println("HashSet contains: ");

        // Iterating over hashSet using for-each loop
        for (String temp : hset) {

            // Printing all elements inside above hashSet
            System.out.println(temp);
        }
    }


    private void hashSetFromCollection() {

        ArrayList<String> ll = new ArrayList<>();

        // Adding elements to ArrayList
        ll.add("Computer");
        ll.add("Science");

        // Creating HashSet object of string type
        HashSet<String> hs = new HashSet(ll);
        hs.add("Portal");
        hs.add("GFG");

        System.out.println("hashSetFromCollection ------------------------");

        // Iterating via iterators
        Iterator<String> iter = hs.iterator();

        // Condition holds true till there is single element
        // in th List
        while (iter.hasNext()) {

            // Printing all elements inside objects
            System.out.println(iter.next());
        }
    }

    private void treeSet1() {

        // Create an empty TreeSet
        TreeSet<String> tset = new TreeSet<>();

        // Adding elements to HashSet
        // using add() method
        tset.add("geeks");
        tset.add("for");
        tset.add("practice");
        tset.add("contribute");

        // Duplicate elements being removed
        tset.add("geeks");

        // tset.add(null); Exception in thread "main" java.lang.NullPointerException
        //	at java.base/java.util.TreeMap.put(TreeMap.java:561)

        System.out.println("treeSet1 ------------------------");

        // Displaying TreeSet elements
        System.out.println("TreeSet contains: ");

        for (String temp : tset) {
            System.out.println(temp);
        }
    }

    private void treeSetFromCollection() {
        // Creating list of string
        ArrayList<String> ll = new ArrayList<>();

        // Adding elements to ArrayList
        // using add() method
        ll.add("Computer");
        ll.add("Science");

        // Creating TreeSet object of string type
        TreeSet<String> ts = new TreeSet(ll);

        // Adding elements to above TreeSet
        ts.add("Portal");
        ts.add("GFG");

        System.out.println("treeSetFromCollection ------------------------");

        // Iterating via iterators
        Iterator<String> iter = ts.iterator();

        // Condition that holds true till
        // there is single element in th List
        while (iter.hasNext()) {

            // Printing all elements inside objects
            System.out.println(iter.next());
        }
    }

    private void unionIntersection() {
        {
            Set<Integer> aSet = new HashSet<Integer>();

            aSet.addAll(Arrays.asList(
                    new Integer[]{1, 3, 2, 4, 8, 9, 0}));

            Set<Integer> bSet = new HashSet<Integer>();

            bSet.addAll(Arrays.asList(
                    new Integer[]{1, 3, 7, 5, 4, 0, 7, 5}));

            System.out.println("unionIntersection ------------------------");

            // To find union
            Set<Integer> union = new HashSet<Integer>(aSet);
            union.addAll(bSet);
            System.out.print("Union of the two Set");
            System.out.println(union);

            // To find intersection
            Set<Integer> intersection = new HashSet<Integer>(aSet);
            intersection.retainAll(bSet);
            System.out.print("Intersection of the two Set");
            System.out.println(intersection);

            // To find the symmetric difference
            Set<Integer> difference = new HashSet<Integer>(aSet);
            difference.removeAll(bSet);
            System.out.print("Difference of the two Set");
            System.out.println(difference);
        }
    }
}