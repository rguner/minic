package com.guner.hashcode;

import java.util.Arrays;
import java.util.List;

public class HashCode {

   public void contains() {
       List<String> words = Arrays.asList("Welcome", "to", "Baeldung");
       if (words.contains("Baeldung")) {
           System.out.println("Baeldung is in the list");
       }
   }

   public void getHashCode() {
       System.out.println("HashCode : " + this.hashCode());
   }

}
