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
    }

    private void mapExample() {
        List<String> stringList = new ArrayList<String>();

        stringList.add("ONE");
        stringList.add("TWO");
        stringList.add("THREE");

        Stream<String> stream = stringList.stream();

        Stream<String> stringStream =
                stream.map((value) -> { return value.toLowerCase(); });
    }

    private void distinctExample() {
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
