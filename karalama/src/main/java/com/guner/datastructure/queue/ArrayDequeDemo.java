package com.guner.datastructure.queue;

import java.util.*;
public class ArrayDequeDemo {
    public static void main(String[] args)
    {
        // Initializing an deque
        Deque<String> dq
            = new ArrayDeque<String>();
 
        // add() method to insert
        dq.add("For");
        dq.addFirst("Geeks1");
        dq.addLast("Geeks2");
        dq.add("Merhaba");
 
        System.out.println(dq);

        iterate(dq);

    }

    private static void iterate(Deque<String> dq) {

        System.out.println("Iterate -- ");
        for (Iterator itr = dq.iterator();
             itr.hasNext();) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();

        System.out.println("Iterate descending-- ");
        for (Iterator itr = dq.descendingIterator();
             itr.hasNext();) {
            System.out.print(itr.next() + " ");
        }
    }
}