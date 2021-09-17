package com.guner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListMulakat {

    public static void main(String[] args) {

        ListMulakat listMulakat = new ListMulakat();
        listMulakat.asList1();
        listMulakat.asList2();
        listMulakat.removeItemInIterator();



    }

    private void asList1() {
        // Arrays.asList, mevcut objeyi kullanarak list yapar, set işlemi arrayi değiştirir.
        String[] stringArray = new String[] {"A","B","C","D"};
        List<String> stringList = Arrays.asList(stringArray);
        stringList.set(0,"E");
        stringList.forEach(f-> System.out.println(f));
        System.out.println("------------------------------------------");
        for (String s : stringArray) {
            System.out.println(s);
        }
    }

    private void asList2() {
        // Arrays.asList, mevcut objeyi kullanarak list yapar, set işlemi arrayi değiştirir. bu nedenle new ArrayList faydalı olabilir.
        System.out.println("#######################################################");
        String[] stringArray = new String[] {"A","B","C","D"};
        String[] stringArray2 = new String[] {"A","B","C","D"};
        List<String> stringList2 = new ArrayList<>(Arrays.asList(stringArray));
        stringList2.set(0,"E");
        stringList2.forEach(f-> System.out.println(f));
        System.out.println("------------------------------------------");
        for (String s : stringArray2) {
            System.out.println(s);
        }
    }

    private void removeItemInIterator() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer value = it.next();
            /*
            if (value==3) {
                list.remove(3);
            }
            */
            list.remove(4);

            System.out.println(value);
        }
    }
}
