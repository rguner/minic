package com.guner.java8calisma;

import java.sql.ClientInfoStatus;
import java.util.Arrays;
import java.util.List;
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
        System.out.println("----------------------");
        Optional<String> opt = Optional.of("Ramazan");
        System.out.println("Optional.isEmpty : " + opt.isEmpty());
        System.out.println("Optional.isPresent : " + opt.isPresent());
        opt.ifPresent(s-> System.out.println("Optinal Value : " + s));
        opt.ifPresent(System.out::println);
    }

    private void execute2() {
        System.out.println("----------------------");
        String nullName = null;
        String name = Optional.ofNullable(nullName).orElse("john");
        System.out.println(name);
    }

    private void execute3() {
        System.out.println("----------------------");
        String nullName = null;
        String name = Optional.ofNullable(nullName).orElseGet(() -> "john");
        System.out.println(name);
    }

    private void execute4() {
        System.out.println("----------------------");
        try {
            String nullName = null;
            String name = Optional.ofNullable(nullName).orElseThrow(
                    IllegalArgumentException::new);
        } catch (IllegalArgumentException ie) {
            System.out.println(ie);
        }
    }

    private void execute5() {
        System.out.println("----------------------");
        try {
            String nullName = null;
            String name = Optional.ofNullable(nullName).orElseThrow();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void execute6() {
        System.out.println("----------------------");
        Integer year = 2016;
        Optional<Integer> yearOptional = Optional.of(year);
        boolean is2016 = yearOptional.filter(y -> y == 2016).isPresent();
        System.out.println("is 2016 ? : " + is2016 );
        boolean is2017 = yearOptional.filter(y -> y == 2017).isPresent();
        System.out.println("is 2017 ? : " + is2017 );
    }

    private void execute7() {
        System.out.println("----------------------");
        /* refactoring with optional

        boolean isInRange = false;

        if (modem != null && modem.getPrice() != null
                && (modem.getPrice() >= 10
                && modem.getPrice() <= 15)) {

            isInRange = true;
        }
        return isInRange;

        */

        Modem modem = new Modem(102D);
        boolean isPresent = Optional.ofNullable(modem)
                .map(Modem::getPrice)
                .filter(p -> p >= 10)
                .filter(p -> p <= 15)
                .isPresent();
        System.out.println("Modem price is betwwen 10 and 15 : " + isPresent);
    }

    private void execute8() {
        System.out.println("----------------------");
        List<String> companyNames = Arrays.asList(
                "paypal", "oracle", "", "microsoft", "", "apple");
        Optional<List<String>> listOptional = Optional.of(companyNames);

        int size = listOptional
                .map(List::size)
                .orElse(0);
        System.out.println("List size : " + size);
    }

    private void execute9() {
        System.out.println("----------------------");
        Optional<String> passOpt = Optional.of(" password");
        boolean correctPassword = passOpt.filter(
                pass -> pass.equals("password")).isPresent();
        System.out.println("is Correct Password : " + correctPassword);

        correctPassword = passOpt
                .map(String::trim)
                .filter(pass -> pass.equals("password"))
                .isPresent();
        System.out.println("is Correct Password : " + correctPassword);
    }

    public class Modem {
        private Double price;

        public Modem(Double price) {
            this.price = price;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }
    }

}
