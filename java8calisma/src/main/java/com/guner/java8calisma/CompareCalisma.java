package com.guner.java8calisma;

import com.guner.java8calisma.model.Human;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CompareCalisma {

    List<Human> humans;

    CompareCalisma() {
        humans = Arrays.asList(
                new Human("Sarah", 10),
                new Human("Jack", 12),
                new Human("Ramazan", 46),
                new Human("Ceyhan", 43),
                new Human("Ceylin", 55)
        );

    }

    public static void main(String[] args) {
        CompareCalisma c = new CompareCalisma();
        c.execute1();
        c.execute2();
        c.execute3();
        c.execute4();
        c.execute5();
    }


    private void execute1() {
        System.out.println("-----------------------------------------------------");
        humans.sort((h1, h2) -> h1.getName().compareTo(h2.getName()));
        humans.forEach(System.out::println);
    }

    private void execute2() {
        System.out.println("-----------------------------------------------------");
        humans.sort(Comparator.comparing(Human::getName));
        humans.forEach(System.out::println);
    }

    private void execute3() {
        System.out.println("-----------------------------------------------------");
        humans.sort(Comparator.comparing(Human::getAge).reversed());
        humans.forEach(System.out::println);
    }

    private void execute4() {
        System.out.println("-----------------------------------------------------");
        humans.sort(
                Comparator.comparing(Human::getName).thenComparing(Human::getAge)
        );
        humans.forEach(System.out::println);
    }

    private void execute5() {
        System.out.println("-----------------------------------------------------");
        humans.sort((h1, h2) -> {
            if (h1.getAge() > h2.getAge()) {
                return 1;
            } else return -1;
        });
        humans.forEach(System.out::println);
    }


}
