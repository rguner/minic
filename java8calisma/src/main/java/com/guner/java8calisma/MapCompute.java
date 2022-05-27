package com.guner.java8calisma;

import java.util.HashMap;
import java.util.Map;

public class MapCompute {

    public static void main(String[] args) {
        MapCompute mapCompute = new MapCompute();
        mapCompute.execute1();
        mapCompute.execute2();
        mapCompute.execute3();
    }

    private void execute1() {
        Map<String, String> map = new HashMap<>();
        map.put("Name", "Aman");
        map.put("Address", "Kolkata");

        // Print the map
        System.out.println("Map: " + map);

        // remap the values using compute() method
        map.compute("Name", (key, val) -> val.concat(" Singh"));
        map.compute("Address", (key, val) -> val.concat(" West-Bengal"));

        // print new mapping
        System.out.println("New Map: " + map);
    }

    private void execute2() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Key1", 12);
        map.put("Key2", 15);

        // print map details
        System.out.println("Map: " + map);

        // remap the values
        // using compute method
        map.compute("Key1", (key, val)
                -> (val == null)
                ? 1
                : val + 1);
        map.compute("Key2", (key, val)
                -> (val == null)
                ? 1
                : val + 5);

        // print new mapping
        System.out.println("New Map: " + map);
    }

    private void execute3() {
        // create a Map and add some values
        Map<String, Integer> map = new HashMap<>();
        map.put("Key1", 12);
        map.put("Key2", 15);

        // print map details
        System.out.println("Map: " + map);

        try {

            // remap the values using compute() method
            // passing null value will throw exception
            map.compute(null, (key, value)
                    -> value + 3);
            System.out.println("New Map: " + map);
        }
        catch (NullPointerException e) {

            System.out.println("Exception: " + e);
        }
    }

}
