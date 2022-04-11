package com.guner.core.objects;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapWithHashCode {

    class Person {

        Person(int id, String ad, String soyad) {
            this.id=id;
            this.ad=ad;
            this.soyad=soyad;
        }
        public int id;
        public String ad;
        public String soyad;
    }

    class PersonHashCode {

        PersonHashCode(int id, String ad, String soyad) {
            this.id=id;
            this.ad=ad;
            this.soyad=soyad;
        }
        public int id;
        public String ad;
        public String soyad;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PersonHashCode that = (PersonHashCode) o;
            return id == that.id && Objects.equals(ad, that.ad) && Objects.equals(soyad, that.soyad);
        }

        @Override
        public int hashCode() {
            //return Objects.hash(id, ad, soyad);
            return Objects.hash(id);
        }
    }

    public static void main(String[] args) {
        HashMapWithHashCode h = new HashMapWithHashCode();
        h.putDenemeWithPerson();
        h.putDenemeWithPersonHashCode();
    }



    private void putDenemeWithPerson() {
        Person person1 = new Person(100,"Ramazan","Güner");
        Person person2 = new Person(200,"Ceyhan","Güner");
        Person person3 = new Person(300,"Şevval","Güner");
        Person person4 = new Person(400,"Ömer Mete","Güner");
        Person person5 = new Person(100,"Ramazan5","Güner5");
        Person person6 = new Person(100,"Ramazan","Güner");

        Map<Person, String> list = new HashMap<>();
        list.put(person1, "Ramazan");
        list.put(person1, "Ramazan2");
        list.put(person2, "Ceyhan");
        list.put(person3, "Şevval");
        list.put(person4, "Ömer Mete");
        list.put(person5, "Ramazan5");
        list.put(person5, "Ramazan6");
        list.put(person6, "Ramazan7");

        System.out.println("List Size (Person) : " + list.size());
        System.out.println("list.get(person5) " + list.get(person5));
        System.out.println("list.get(person6) " + list.get(person6));
    }

    private void putDenemeWithPersonHashCode() {

        PersonHashCode person1 = new PersonHashCode(100,"Ramazan","Güner");
        PersonHashCode person2 = new PersonHashCode(200,"Ceyhan","Güner");
        PersonHashCode person3 = new PersonHashCode(300,"Şevval","Güner");
        PersonHashCode person4 = new PersonHashCode(400,"Ömer Mete","Güner");
        PersonHashCode person5 = new PersonHashCode(100,"Ramazan5","Güner5");
        PersonHashCode person6 = new PersonHashCode(100,"Ramazan","Güner");

        Map<PersonHashCode, String> list = new HashMap<>();
        list.put(person1, "Ramazan");
        list.put(person1, "Ramazan2");
        list.put(person2, "Ceyhan");
        list.put(person3, "Şevval");
        list.put(person4, "Ömer Mete");
        list.put(person5, "Ramazan5");
        list.put(person5, "Ramazan6");
        list.put(person6, "Ramazan7");

        System.out.println("List Size (PersonHashCode) : " + list.size());
        System.out.println("list.get(person5) " + list.get(person5));
        System.out.println("list.get(person6) " + list.get(person6));
    }
}
