package com.guner.java8calisma;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamCalisma {

    public static void main(String[] args) {
        StreamCalisma s = new StreamCalisma();
        s.execute1();
        s.execute2();
        s.execute3();
        s.execute4();
        s.execute5();
        s.execute6();
        s.execute7();
    }

    private void execute1() {
        System.out.println("---------------------------------------------------------------------------------------");
        IntStream stream = IntStream.of(1, 1, 2, 3, 5, 8, 13, 13, 8);
        stream.distinct()
                .forEach(System.out::println);
    }

    private void execute2() {
        System.out.println("---------------------------------------------------------------------------------------");
        IntStream stream = IntStream.of(13, 1, 3, 5, 8, 1, 13, 2, 8);
        stream.sorted()
                .forEach(System.out::println);
    }

    private void execute3() {
        System.out.println("---------------------------------------------------------------------------------------");
        LongStream range = LongStream.range(1, 10000);
        range.limit(10)
                .forEach(System.out::println);

    }

    private void execute4() {
        System.out.println("---------------------------------------------------------------------------------------");
        IntStream range = IntStream.range(1, 10);
        IntStream rangeClosed = IntStream.rangeClosed(1, 10);

        System.out.println(range.count());
        System.out.println(rangeClosed.count());

    }

    private void execute5() {

        System.out.println("---------------------------------------------------------------------------------------");

        List<String> names = Arrays.asList("Ali", "Veli", "Selami", "Veli", "Selami", "Can", "Hüseyin");

        List list = names.stream().collect(Collectors.toList());

        Set set = names.stream().collect(Collectors.toSet());

        Long count = names.stream().collect(Collectors.counting());

        String collect = names.stream().collect(Collectors.joining(" - "));

        System.out.println(collect);

        Map<Integer, List<String>> integerListMap = names.stream().collect(Collectors.groupingBy(name -> name.length()));

        System.out.println(integerListMap);
    }

    private void execute6() {
    }

    private void execute7() {
    }
}


