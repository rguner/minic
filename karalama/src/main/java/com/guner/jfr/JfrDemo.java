package com.guner.jfr;

import java.util.*;
import java.util.stream.IntStream;

public class JfrDemo {

    private static final int ITEM_COUNT= 10000;

    public static void main(String[] args) {
        JfrDemo jfrDemo = new JfrDemo();
        jfrDemo.process();
    }

    private void process() {
        Runnable rHashMap = () -> hashMap();
        rHashMap.run();

        Runnable rArrayList = () -> arrayList();
        rArrayList.run();

        Runnable rLinkedHashSet = () -> linkedHashSet();
        rLinkedHashSet.run();

        Runnable rTreeSet = () -> treeSet();
        rTreeSet.run();

    }

    private void treeSet() {

        TreeSet<String> set = new TreeSet<>();
        set.add("Adana");
        set.add("Bursa");
        set.add("Ceyhan");
        set.add("Denizli");
        set.add("Edirne");

        IntStream.range(0,ITEM_COUNT).forEach(i -> set.add("TreeSetItem"+i));

        System.out.println("TreeSet Floor : " + set.floor("TreeSetItem9900").toString());
    }

    private void linkedHashSet() {
        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Türkiye");
        linkedHashSet.add("Australia");
        linkedHashSet.add("South Africa");

        IntStream.range(0,ITEM_COUNT).forEach(i -> linkedHashSet.add("LinkedHashSetItem"+i));

        System.out.println("linkedHashSet size : " + linkedHashSet.size());
    }

    private void arrayList() {
        List<String> list = new ArrayList<>();
        list.add("Türkçe");
        list.add("İngilizce");
        list.add("Almanca");
        list.add("Fransızca");

        IntStream.range(0,ITEM_COUNT).forEach(i -> list.add("ArrayListItem"+i));
        System.out.println("ArrayList : " + list.get(100));
    }

    private void hashMap() {

        Map<Integer, String> hmap = new HashMap<>();

        /* Adding elements to HashMap */
        hmap.put(1120, "Ramazan");
        hmap.put(1200, "Erkan");
        hmap.put(1700, "Rıdvan");
        hmap.put(1490, "Ömer Mete");
        hmap.put(1300, "Şevval");

        IntStream.range(0,ITEM_COUNT).forEach(i -> hmap.put(i, "HashMapItem"+i));

        System.out.println("HashMap : " + hmap.get(100));
    }
}
