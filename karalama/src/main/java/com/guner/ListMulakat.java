package com.guner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMulakat {

    public static void main(String[] args) {
        // Arrays.asList, mevcut objeyi kullanarak list yapar, set işlemi arrayi değiştirir.
        String[] stringArray = new String[] {"A","B","C","D"};
        List<String> stringList = Arrays.asList(stringArray);
        stringList.set(0,"E");
        stringList.forEach(f-> System.out.println(f));
        System.out.println("------------------------------------------");
        for (String s : stringArray) {
            System.out.println(s);
        }

        // Arrays.asList, mevcut objeyi kullanarak list yapar, set işlemi arrayi değiştirir. bu nedenle new ArrayList faydalı olabilir.
        System.out.println("#######################################################");
        String[] stringArray2 = new String[] {"A","B","C","D"};
        List<String> stringList2 = new ArrayList<>(Arrays.asList(stringArray));
        stringList2.set(0,"E");
        stringList2.forEach(f-> System.out.println(f));
        System.out.println("------------------------------------------");
        for (String s : stringArray2) {
            System.out.println(s);
        }


    }
}
