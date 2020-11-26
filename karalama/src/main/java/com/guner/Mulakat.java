package com.guner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Mulakat {

    public static void main(String[] args) {
        Mulakat m = new Mulakat();
        m.integerCompare();
        m.stringCompare();
        m.removeItemInIterator();
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

    }

}
