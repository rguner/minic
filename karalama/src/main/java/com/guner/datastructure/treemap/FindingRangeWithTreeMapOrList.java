package com.guner.datastructure.treemap;

import java.util.*;
import java.util.stream.IntStream;

public class FindingRangeWithTreeMapOrList {
    public static void main(String[] args) {
        FindingRangeWithTreeMapOrList findingRangeWithTreeMapOrList = new FindingRangeWithTreeMapOrList();
        findingRangeWithTreeMapOrList.withTreeMap();
        findingRangeWithTreeMapOrList.withArrayList();
    }

    public class Range {


        private int lower;
        private int upper;
        private String value;

        Range(int lower, int upper, String value) {
            this.lower = lower;
            this.upper = upper;
            this.value = value;
        }

        public int getLower() {
            return lower;
        }

        public int getUpper() {
            return upper;
        }

        public String getValue() {
            return value;
        }
    }

    private void withTreeMap() {
        NavigableMap<Integer, Range> map = getIntegerRangeNavigableMap();

        // To do a lookup for some value in 'key'
        int key = 50000;
        String result = null;
        Map.Entry<Integer, Range> entry = map.floorEntry(key);
        if (entry == null) {
            // too small
        } else if (key <= entry.getValue().upper) {
            result = entry.getValue().value;
        } else {
            // too large or in a hole
        }

        System.out.println("Sonuç: " + result);
    }

    private void withArrayList() {
        List<Range> list = getIntegerRangeNavigableArray();

        // To do a lookup for some value in 'key'
        int key = 50000;
        String result = null;
        Optional<Range> optionalRange = list.stream().filter(r -> r.lower <= key && r.upper >= key).findAny();
        if (optionalRange.isPresent()) {
            result = optionalRange.get().getValue();
        }
        System.out.println("Sonuç: " + result);
    }

    private NavigableMap<Integer, Range> getIntegerRangeNavigableMap() {
        NavigableMap<Integer, Range> map = new TreeMap<Integer, Range>();
        /*
        map.put(0, new Range(0, 3, "0"));       // 0..3     => 0
        map.put(5, new Range(5, 10, "1"));      // 5..10    => 1
        map.put(100, new Range(100, 200, "2"));   // 100..200 => 2
         */
        // 10, 15, "10"
        // 20, 25, "20"
        IntStream.rangeClosed(1, 10000).forEach(i -> {
            map.put(i * 10, new Range(i * 10, i * 10 + 5, "map" + String.valueOf(i * 10)));
        });
        return map;
    }

    private List<Range> getIntegerRangeNavigableArray() {
        List<Range> list = new ArrayList<>();
        /*
        list.add(new Range(0, 3, "0"));       // 0..3     => 0
        list.add(new Range(5, 10, "1"));      // 5..10    => 1
        list.add(new Range(100, 200, "2"));   // 100..200 => 2
         */
        IntStream.rangeClosed(1, 10000).forEach(i -> {
            list.add(new Range(i * 10, i * 10 + 5, "list" + String.valueOf(i * 10)));
        });
        return list;
    }


}
