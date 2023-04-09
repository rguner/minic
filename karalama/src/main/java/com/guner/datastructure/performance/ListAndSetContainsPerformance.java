package com.guner.datastructure.performance;

import java.util.*;
import java.util.stream.IntStream;

public class ListAndSetContainsPerformance {
    public static void main(String[] args) {
        ListAndSetContainsPerformance h = new ListAndSetContainsPerformance();
        h.doItWithHashSet();
        h.doItWithTreeSet();
        h.doItWithArrayList();
    }

    private final int PROCESS_COUNT = 800000;

    private void doItWithArrayList() {

        long t1 = System.currentTimeMillis();

        List<String> list = new ArrayList<>();

        IntStream.rangeClosed(0, 5000).forEach(i -> {
            list.add("RamazanGuner" + i);
        });

        boolean found = false;
        for (int i = 0; i < PROCESS_COUNT; i++) {
            found = list.contains("searchItem");
        }

        System.out.println("ArrayList bitti : " + (System.currentTimeMillis() - t1) + " Found: " + found);

    }

    private void doItWithHashSet() {

        long t1 = System.currentTimeMillis();

        Set<String> hashSet = new HashSet<>();
        IntStream.rangeClosed(0, 5000).forEach(i -> {
            hashSet.add("RamazanGuner" + i);
        });

        boolean found = false;
        for (int i = 0; i < PROCESS_COUNT; i++) {
            found = hashSet.contains("searchItem");
        }

        System.out.println("HashSet bitti : " + (System.currentTimeMillis() - t1) + " Found: " + found);
    }

    private void doItWithTreeSet() {

        long t1 = System.currentTimeMillis();

        Set<String> treeSet = new TreeSet<>();
        IntStream.rangeClosed(0, 5000).forEach(i -> {
            treeSet.add("RamazanGuner" + i);
        });

        boolean found = false;
        for (int i = 0; i < PROCESS_COUNT; i++) {
            found = treeSet.contains("searchItem");
        }

        System.out.println("TreeSet bitti : " + (System.currentTimeMillis() - t1) + " Found: " + found);
    }
}
