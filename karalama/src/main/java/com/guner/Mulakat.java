package com.guner;

import java.util.*;
import java.util.stream.Collectors;

public class Mulakat {

    public static void main(String[] args) {
        Mulakat m = new Mulakat();
        m.integerCompare();
        m.stringCompare();
        m.streamMap();
        m.streamFilter();
        m.callFoo();
    }

    private void integerCompare() {

        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println("127 ---> " + (i1 == i2));

        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println("128 ---> " + (i3 == i4));
    }

    private void stringCompare() {

        String s1 = "s";
        String s2 = "s";
        System.out.println("s --> " + (s1 == s2));

        String s3 = "ramazan guner";
        String s4 = "ramazan guner";
        System.out.println("ramazan guner --> " + (s3 == s4));

        String s5 = new String("Sevval");
        String s6 = new String("Sevval");
        System.out.println("Sevval --> " + (s5 == s6));
        System.out.println("Sevval Equals--> " + (s5.equals(s6)));

        System.out.println("---------------------------------------------------------------------------------------");

    }

    // SORU1
    private void streamMap() {

        Integer integer = 20;
        String string = "stringvalue";
        HashMap<String, String> hashMap = new HashMap();
        hashMap.put("key", "value");
        List<Object> list = Arrays.asList("Sonuç", new Integer(20), string, hashMap);
        String resultString = list.stream().map(String::valueOf).collect(Collectors.joining("|"));
        System.out.println(resultString);
        System.out.println("---------------------------------------------------------------------------------------");
    }

    // SORU2
    public class Person {

        private String name;
        private int age;

        public Person(String name, int age) {
            this.setName(name);
            this.setAge(age);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person [name=" + name + ", age=" + age + "]";
        }
    }

    private void streamFilter() {
        List<Person> persons = Arrays.asList(
                new Person("Ahmet", 30),
                new Person("Mehmet", 20),
                new Person("Murat", 40));

        Person result1 = persons.stream()
                .filter(x -> "Mehmet".equals(x.getName()))
                .findAny()
                .orElse(null);

        System.out.println(result1);

        Person result2 = persons.stream()
                .filter(x -> "Ayşe".equals(x.getName()))
                .findAny()
                .orElse(null);

        System.out.println(result2);

        System.out.println("---------------------------------------------------------------------------------------");

    }


    // SORU3

    public class Futbolcu {

        private String name;

        Futbolcu(String name) {
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Futbolcu :" + name;
        }
    }

    public void method1(Futbolcu futbolcu) {
        Futbolcu futbolcuAli = new Futbolcu("Ali");
        futbolcu = futbolcuAli;
    }

    public void method2(Futbolcu futbolcu) {
        futbolcu.setName("Feyyaz");
    }

    private void callFoo() {
        Futbolcu futbolcuMetin = new Futbolcu("Metin");
        method1(futbolcuMetin);
        System.out.println(futbolcuMetin);

        Futbolcu futbolcuMehmet = new Futbolcu("Mehmet");
        method2(futbolcuMehmet);
        System.out.println(futbolcuMehmet);

        System.out.println("---------------------------------------------------------------------------------------");

    }
}
