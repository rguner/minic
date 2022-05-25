package com.guner.java8calisma;

import java.util.Optional;

public class OptinalCalisma {

    public static void main(String[] args) {
        OptinalCalisma optinalCalisma = new OptinalCalisma();
        optinalCalisma.execute1();
        optinalCalisma.execute2();
        optinalCalisma.execute3();
        optinalCalisma.execute4();
        optinalCalisma.execute5();
        optinalCalisma.execute6();
        optinalCalisma.execute7();
        optinalCalisma.execute8();
        optinalCalisma.execute9();
    }


    private void execute1() {
        Optional<String> opt = Optional.of("Ramazan");
        System.out.println("Optional.isEmpty : " + opt.isEmpty());
        System.out.println("Optional.isPresent : " + opt.isPresent());
        opt.ifPresent(s-> System.out.println("Optinal Value : " + s));
        opt.ifPresent(System.out::println);
    }

    private void execute2() {
    }

    private void execute3() {
    }

    private void execute4() {
    }

    private void execute5() {
    }

    private void execute6() {
    }

    private void execute7() {
    }

    private void execute8() {
    }

    private void execute9() {
    }

}
