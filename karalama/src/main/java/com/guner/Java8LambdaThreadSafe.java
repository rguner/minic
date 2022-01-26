package com.guner;

import java.util.stream.Stream;

public class Java8LambdaThreadSafe {

    public static void main(String[] args) {
        Java8LambdaThreadSafe java8LambdaThreadSafe = new Java8LambdaThreadSafe();
        java8LambdaThreadSafe.execute1();
        //java8LambdaThreadSafe.execute2();

    }

    /*
    This code is legal, as total variable remains “effectively final,” but will the object it references have the same state after execution of the lambda? No!

    Keep this example as a reminder to avoid code that can cause unexpected mutations.
     */
    private void execute1() {
        Stream<String> stringStream = Stream.of("Ramazan", "Ceyhan");
        //stringStream.forEach(System.out::println);
        int[] total = new int[1];
        stringStream.forEach(s-> total[0]++);
        System.out.println(total[0]);
    }

    /*
    private void execute2() {
        Stream<String> stringStream = Stream.of("Ramazan", "Ceyhan");
        int total=0;
        stringStream.forEach(s-> total++);
        System.out.println(total);
    }
     */
}
