package com.guner.datastructure.lists;

import java.util.*;
import java.util.stream.Collectors;

public class ListIterate {

    public static void main(String[] args) {
        ListIterate listIterate = new ListIterate();
        //listIterate.execute1();
        //listIterate.execute2();
        //listIterate.execute3();
        //listIterate.execute4();
        listIterate.sort();
        listIterate.sortIntegerList();
    }

    private void sortIntegerList() {
        List<Integer> list = Arrays.asList(20,40,100,5,1,200);
        //list.sort(Comparator.comparing(Integer::valueOf));
        list.sort(Comparator.comparingInt(Integer::valueOf));
        System.out.println(list);
    }


    /*
    Exception in thread "main" java.util.ConcurrentModificationException
    Sondan bir önceki elemandan sonra bir silme yaparsan hata oluşmaz, ama doğru da yapmaz, son elemanı görmez.
    Apple/Strawberry farklı
     */
    private void execute1() {
        List<String> fruitList = Arrays.asList("Orange", "Apple", "Pear", "Strawberry", "Banana");
        List<String> fruitArrayList = fruitList.stream().collect(Collectors.toList());

        for (String fruit : fruitArrayList) {
            System.out.println("FOR-EACH An element in the list: " + fruit);
            if ("Apple".equalsIgnoreCase(fruit)) {
                //if ("Strawberry".equalsIgnoreCase(fruit)) {
                fruitArrayList.remove(3);
            }
        }
    }

    /*
    Exception in thread "main" java.util.ConcurrentModificationException
    Sondan bir önceki elemandan sonra bir silme yaparsan hata oluşmaz, ama doğru da yapmaz, son elemanı görmez.
    Apple/Strawberry farklı
     */
    private void execute2() {
        List<String> fruitList = Arrays.asList("Orange", "Apple", "Pear", "Strawberry", "Banana");
        List<String> fruitArrayList = fruitList.stream().collect(Collectors.toList());
        Iterator<String> fruitIterator = fruitArrayList.iterator();
        while (fruitIterator.hasNext()) {
            String fruit = fruitIterator.next();
            System.out.println("ITERATOR An element in the list: " + fruit);
            if ("Apple".equalsIgnoreCase(fruit)) {
                //if ("Strawberry".equalsIgnoreCase(fruit)) {
                fruitArrayList.remove(fruit);
            }
        }
    }

    /**
     * Pear'ı siliyoruz, exception oluşmnaz, ama listelemede index bozuluyor.
     */
    private void execute3() {
        //List<String> fruitList = Arrays.asList("Orange", "Apple", "Pear", "Strawberry");
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Orange");
        fruitList.add("Apple");
        fruitList.add("Pear");
        fruitList.add("StrawBerry");
        fruitList.add("Banana");
        for (int i = 0; i < fruitList.size(); i++) {
            String fruit = fruitList.get(i);
            System.out.println("FOR An element in the list: " + fruit);
            if ("Pear".equalsIgnoreCase(fruit)) {
                fruitList.remove("Pear");
            }
        }
    }

    private void execute4() {
        List<String> listOfBooks = new ArrayList<>();
        listOfBooks.add("Programming Pearls");
        listOfBooks.add("Clean Code");
        listOfBooks.add("Effective Java");
        listOfBooks.add("Code Complete");


        /*
        for(String book: listOfBooks){
            if(book.contains("Code"));{
                listOfBooks.remove(book);
            }
        }

         */


        Iterator<String> bookIterator = listOfBooks.iterator();
        while (bookIterator.hasNext()) {
            String book = bookIterator.next();
            System.out.println("ITERATOR An element in the list: " + book);
            if (book.contains("Code")) {
                listOfBooks.remove(book);
            }
        }

        System.out.println(listOfBooks.size());
    }


    private void sort() {

        List<String> listOfBooks = new ArrayList<>();
        listOfBooks.add("Programming Pearls");
        listOfBooks.add("Clean Code");
        listOfBooks.add("Effective Java");
        listOfBooks.add("Code Complete");
        listOfBooks.add("Code Complete2");
        listOfBooks.add("Code Complete3");

        // bu metodlar sort yapar, mevcut listenin üstüne yazar.
        // listOfBooks.sort((o1, o2) -> o1.compareTo(o2));
        // listOfBooks.sort(Comparator.naturalOrder());
        // listOfBooks.sort(String::compareTo);

        listOfBooks = listOfBooks.stream().sorted(String::compareTo).collect(Collectors.toList());
        System.out.println(listOfBooks);
    }
}
