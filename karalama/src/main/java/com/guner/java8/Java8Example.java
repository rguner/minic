package com.guner.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Example {
    public static void main(String[] args) {
        Java8Example java8Example = new Java8Example();
        java8Example.mapExample();
        java8Example.distinctExample();
        java8Example.limitExample();
        java8Example.peekExample();
        java8Example.anyMatchExample();
        java8Example.collectExample();
    }

    private void collectExample() {
        System.out.println("-----------collect----------------");
        List<String> stringList = new ArrayList<String>();

        stringList.add("One flew over the cuckoo's nest");
        stringList.add("To kill a muckingbird");
        stringList.add("Gone with the wind");

        Stream<String> stream = stringList.stream();

        List<String> stringsAsUppercaseList = stream
                .map(value -> value.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(stringsAsUppercaseList);
    }

    private void anyMatchExample() {
        System.out.println("-----------anyMaych----------------");
        List<String> stringList = new ArrayList<String>();

        stringList.add("One flew over the cuckoo's nest");
        stringList.add("To kill a muckingbird");
        stringList.add("Gone with the wind");

        Stream<String> stream = stringList.stream();

        boolean anyMatch = stream.anyMatch((value) -> { return value.startsWith("One"); });
        System.out.println(anyMatch);
    }

    private void peekExample() {
        System.out.println("-----------peek----------------");
        List<String> stringList = new ArrayList<String>();

        stringList.add("abc");
        stringList.add("def");

        Stream<String> stream = stringList.stream();

        Stream<String> streamPeeked = stream.peek((value) -> {
            System.out.println("value");
        });

        streamPeeked.forEach(System.out::println);
    }

    private void limitExample() {
        System.out.println("-----------limit----------------");
        List<String> stringList = new ArrayList<String>();

        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("one");

        Stream<String> stream = stringList.stream();
        stream
                .limit(2)
                .forEach( element -> { System.out.println(element); });
    }

    private void mapExample() {
        System.out.println("-----------map----------------");
        List<String> stringList = new ArrayList<String>();

        stringList.add("ONE");
        stringList.add("TWO");
        stringList.add("THREE");

        Stream<String> stream = stringList.stream();

        Stream<String> stringStream =
                stream.map((value) -> { return value.toLowerCase(); });
    }

    private void distinctExample() {
        System.out.println("-----------distinct----------------");
        List<String> stringList = new ArrayList<String>();

        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("one");

        Stream<String> stream = stringList.stream();

        List<String> distinctStrings = stream
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distinctStrings);
    }


}
