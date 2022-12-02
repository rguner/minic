package com.guner.datastructure.performance;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntegerValueOfAndRegexControlPerformance {
    public static void main(String[] args) {
        IntegerValueOfAndRegexControlPerformance h = new IntegerValueOfAndRegexControlPerformance();
        h.doItWithIntegerValueOf();
        h.doItWithRegexCheck();
    }

    private final int PROCESS_COUNT = 800000;
    List<String> list = Arrays.asList("123456", "643333", "123", "12,2", "13_3", "122323XYZ");
    //List<String> list = Arrays.asList(Integer.MAX_VALUE+"3");

    private void doItWithRegexCheck() {
        long t1 = System.currentTimeMillis();

        for (int i = 0; i < PROCESS_COUNT; i++) {
            for (int j = 0; j < list.size(); j++) {
                String b = list.get(j);
                if (isNumber(b)) {
                    int result = Integer.valueOf(b);
                }
            }
        }

        System.out.println("doItWithRegexCheck bitti : " + (System.currentTimeMillis() - t1));
    }

    private void doItWithIntegerValueOf() {

        long t1 = System.currentTimeMillis();

        for (int i = 0; i < PROCESS_COUNT; i++) {
            for (int j = 0; j < list.size(); j++) {
                String b = list.get(j);
                try {
                    int result = Integer.valueOf(b);
                } catch (NumberFormatException nfe) {
                    //System.out.println(nfe);
                }
            }
        }

        System.out.println("doItWithIntegerValueOf bitti : " + (System.currentTimeMillis() - t1));

    }

    public static boolean isNumber(String a) {
        if (a == null || a.isEmpty()) {
            return false;
        }
        return a.matches("[0-9]*");
    }


}
