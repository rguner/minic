package com.guner.passionate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task {

    public static void main(String[] args) {

        Task task = new Task();
        task.process();
    }

    private void process() {
        List<Integer> list = Arrays.asList(6, 1, 2, 7, 3, 4, 5);
        System.out.println(isConsecutive1(list));
        System.out.println(isConsecutive2(list));
    }

    private boolean isConsecutive1(List<Integer> list) {

        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());

        int current = sortedList.get(0);
        for (int i = 1; i < sortedList.size(); i++) {
            if (sortedList.get(i) - current > 1) {
                return false;
            }
            current = sortedList.get(i);
        }
        return true;
    }

    private boolean isConsecutive2(List<Integer> list) {

        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());

        int head = sortedList.get(0);
        int tail = sortedList.get(sortedList.size()-1);
        System.out.println((tail - head) / sortedList.size());
        return false;
    }
}
