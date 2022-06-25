package com.guner.datastructure.performance;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapAndListPerformance {
    public static void main(String[] args) {
        HashMapAndListPerformance h = new HashMapAndListPerformance();
        h.doItWithHashMap();
        h.doItWithArrayList();
    }

    private final int PROCESS_COUNT = 800000;

    private void doItWithArrayList() {

        long t1 = System.currentTimeMillis();

        List<String> list = Arrays.asList("Ramazan Güner0", "Ramazan Güner1", "Ramazan Güner2", "Ramazan Güner3", "Ramazan Güner4", "Ramazan Güner5");

        for (int i = 0; i < PROCESS_COUNT; i++) {
            for (int j = 0; j < list.size(); j++) {
                String b = list.get(j);
            }
        }

        System.out.println("ArrayList bitti : " + (System.currentTimeMillis() - t1));

    }

    private void doItWithHashMap() {

        long t1 = System.currentTimeMillis();

        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 6; i++) {
            map.put(i, "Ramazan Güner" + i);
        }

        for (int i = 0; i < PROCESS_COUNT; i++) {
            for (int j = 0; j < map.size(); j++) {
                String b = map.get(j);
            }
        }

        System.out.println("HashMap bitti : " + (System.currentTimeMillis() - t1));
    }
}
