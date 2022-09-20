package com.guner.jfr;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.stream.IntStream;

public class JfrDemo {

    private static final int ITEM_COUNT = 100_000;

    public static void main(String[] args) {
        JfrDemo jfrDemo = new JfrDemo();
        jfrDemo.process();
    }

    private void process() {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        while (true) {

            Runnable rHashMap = () -> hashMap();
            executorService.submit(rHashMap);

            Runnable rArrayList = () -> arrayList();
            executorService.submit(rArrayList);

            Runnable rLinkedHashSet = () -> linkedHashSet();
            executorService.submit(rLinkedHashSet);

            Runnable rTreeSet = () -> treeSet();
            executorService.submit(rTreeSet);

            sleep();
        }

    }

    private void treeSet() {

        TreeSet<String> set = new TreeSet<>();
        set.add("Adana");
        set.add("Bursa");
        set.add("Ceyhan");
        set.add("Denizli");
        set.add("Edirne");

        IntStream.range(0, ITEM_COUNT).forEach(i -> set.add("TreeSetItem" + i));

        System.out.println(Thread.currentThread().getName() + " TreeSet Floor : " + set.floor("TreeSetItem9900").toString());
    }


    private void linkedHashSet() {
        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Türkiye");
        linkedHashSet.add("Australia");
        linkedHashSet.add("South Africa");

        IntStream.range(0, ITEM_COUNT).forEach(i -> linkedHashSet.add("LinkedHashSetItem" + i));

        System.out.println(Thread.currentThread().getName() + " linkedHashSet size : " + linkedHashSet.size());

    }

    private void arrayList() {
        List<String> list = new ArrayList<>();
        list.add("Türkçe");
        list.add("İngilizce");
        list.add("Almanca");
        list.add("Fransızca");

        IntStream.range(0, ITEM_COUNT).forEach(i -> list.add("ArrayListItem" + i));
        System.out.println(Thread.currentThread().getName() + " ArrayList : " + list.get(100));
    }

    private void hashMap() {

        Map<Integer, String> hmap = new HashMap<>();

        /* Adding elements to HashMap */
        hmap.put(1120, "Ramazan");
        hmap.put(1200, "Erkan");
        hmap.put(1700, "Rıdvan");
        hmap.put(1490, "Ömer Mete");
        hmap.put(1300, "Şevval");

        IntStream.range(0, ITEM_COUNT).forEach(i -> hmap.put(i, "HashMapItem" + i));

        System.out.println(Thread.currentThread().getName() + " HashMap : " + hmap.get(100));
    }

    private void sleep() {
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
