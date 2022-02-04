package com.guner.java8calisma;

import com.guner.java8calisma.model.EnumExampleType;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

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
        s.execute8();
        s.execute9();
        s.execute10();
        s.execute11();
        s.execute12();
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

        System.out.println("---------------------------------------------------------------------------------------");

        List names = Arrays.asList("Ali", "Veli", "Selami", "Cem");

        Stream<String> stream = names.stream();
        Stream upperStream = stream.map(name -> name.toUpperCase());
        upperStream.forEach(System.out::println);
        //List upperNames = (List) upperStream.collect(Collectors.toList());
        //upperNames.forEach(System.out::println);
    }

    private void execute7() {

        System.out.println("---------------------------------------------------------------------------------------");
        IntStream
                .rangeClosed(1, 5)
                .map(n -> n * n)
                .forEach(System.out::println);
        ;
    }

    private void execute8() {
        System.out.println("---------------------------------------------------------------------------------------");

        int result = IntStream
                .of(1, 2, 3, 4, 5)
                .reduce(0, (once, sonra) -> {
                    System.out.format("%d , %d  --> %d%n", once, sonra, (once + sonra));
                    return once + sonra;
                });
        System.out.println(result);
    }

    private void execute9() {
        System.out.println("---------------------------------------------------------------------------------------");

        int result = IntStream
                .of(1, 2, 3, 4, 5)
                .reduce(1, Math::multiplyExact);
        System.out.println(result);
    }

    private void execute10() {
        System.out.println("---------------------------------------------------------------------------------------");

        List<Integer> ints = Arrays.asList(1, 5, 3, 7, 11, 9, 15, 13);

        ints.parallelStream() // Paralel Stream
                .filter(Objects::nonNull) // null değilse
                .filter(n -> n > 0) // pozitif sayı ise
                .sorted() // sırala
                .forEach(System.out::println); // çıktıla
    }

    private void execute11() {
        System.out.println("---------------------------------------------------------------------------------------");

        List<Integer> names = Arrays.asList(1, 2, 3, 6, 7, 8, 9, null);

        // lazy
        Stream stream = names
                .stream()
                .filter(Objects::nonNull)
                .filter(n -> n % 2 == 1)
                .map(n -> n * 2);
        //Örneğin yukarıdaki liste üzerinde yapılmak istenen 2 filter ve 1 map işlemi Lazy işlemlerdir. Kod parçası bu haliyle çalıştırıldığında ne bir filtreleme ne de bir dönüştürme işlemi yapılacaktır. Burada yapılan sadece Stream nesnesini hazırlamaktır. Lazy işlemler gerekmedikçe işleme konulmamaktadır.

        List<Integer> names2 = Arrays.asList(1, 2, 3, 6, 7, 8, 9, null);

        //lazy
        Stream stream2 = names2
                .stream()
                .filter(Objects::nonNull)
                .filter(n -> n % 2 == 1)
                .map(n -> n * 2);

        // eager
        stream2.forEach(System.out::println); // Fakat bu hazırlanan Stream nesnesi, yukarıdaki gibi bir Eager operasyonla karşılaşırsa, önceki zincirlerde biriken Lazy işlemleri de harekete geçirecektir. Yani bu işlem, yukarıdak işlemleri tetikler
    }

    private void execute12() {

        System.out.println("---------------------------------------------------------------------------------------");

        List<EnumExampleType> names = Arrays.asList(EnumExampleType.CAMPAIGN, EnumExampleType.SERVICE, EnumExampleType.DEVICE);


        String collect = names.stream().map(String::valueOf).collect(Collectors.joining("|"));

        System.out.println(collect);

    }
}


