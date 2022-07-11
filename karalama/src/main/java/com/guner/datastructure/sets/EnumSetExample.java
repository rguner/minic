package com.guner.datastructure.sets;

import java.util.*;
  
enum EnumValues { CODE, LEARN, CONTRIBUTE, QUIZ, MCQ }
;
  
public class EnumSetExample {
  
    public static void main(String[] args)
    {
        // Creating a set
        Set<EnumValues> set1;
  
        // Adding the elements
        set1 = EnumSet.of(EnumValues.QUIZ, EnumValues.CONTRIBUTE,
                EnumValues.LEARN, EnumValues.CODE);
  
        System.out.println("Set 1: " + set1);
    }
}