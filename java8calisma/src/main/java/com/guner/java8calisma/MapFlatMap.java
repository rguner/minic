package com.guner.java8calisma;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapFlatMap {

    public static void main(String[] args) {
        MapFlatMap m= new MapFlatMap();
        m.map1();
        m.flatMap1();
        m.flatMap2();
    }

    private void flatMap2() {

        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(7,8,9);

        List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);

        List<Integer> listOfAllIntegers = listOfLists.stream()
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());

        System.out.println(listOfAllIntegers);

    }

    private void flatMap1() {
        List<List<String>> list = Arrays.asList(
                Arrays.asList("a","1","2","3"),
                Arrays.asList("b","4","5","6"));
        System.out.println(list);

        Stream<String> stringStream= list.stream()
                .flatMap(Collection::stream);
        System.out.print("Flat Map Stream -->");
        stringStream.forEach(s-> System.out.print(s));
        System.out.println("");

        System.out.println(list
                .stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList()));
    }



    private void map1() {

        List<String> myList = Stream.of("a", "b")
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(myList);
    }


}
