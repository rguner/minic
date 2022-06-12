package com.guner.core.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ListIterate {

    public static void main(String[] args) {
        ListIterate listIterate = new ListIterate();
        listIterate.execute1();
        //listIterate.execute2();
        listIterate.execute3();
        listIterate.execute4();
    }

    private void execute1() {
        List<String> fruitList = Arrays.asList("Orange", "Apple", "Pear", "Strawberry");
        List<String> fruitArrayList = fruitList.stream().collect(Collectors.toList());

        for (String fruit : fruitArrayList) {
            System.out.println("FOR-EACH An element in the list: " + fruit);
            if ("Pear".equalsIgnoreCase(fruit)) {
                fruitArrayList.remove(2);
            }
        }
    }

    private void execute2() {
        //List<String> fruitList = Arrays.asList("Orange", "Apple", "Pear", "Strawberry");
        //List<String> fruitArrayList = fruitList.stream().collect(Collectors.toList());
        List<String> fruitArrayList = new ArrayList<>();
        fruitArrayList.add("Orange");
        fruitArrayList.add("Apple");
        fruitArrayList.add("Pear");
        fruitArrayList.add("StrawBerry");
        fruitArrayList.add("Banana");
        Iterator<String> fruitIterator = fruitArrayList.iterator();
        while (fruitIterator.hasNext()) {
            String fruit = fruitIterator.next();
            System.out.println("ITERATOR An element in the list: " + fruit);
            //if(fruit.contains("Apple")){
            if ("Apple".equalsIgnoreCase(fruit)) {
                fruitArrayList.remove(fruit);
            }
        }
    }

    /**
     * Pear'ı siliyoruz, ama listelemede index bozuluyor.
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
            if(book.contains("Code")){
                listOfBooks.remove(book);
            }
        }

        System.out.println(listOfBooks.size());
    }
}
