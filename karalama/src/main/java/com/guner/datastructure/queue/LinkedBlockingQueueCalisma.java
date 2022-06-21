package com.guner.datastructure.queue;

import java.util.AbstractQueue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

class LinkedBlockingQueueCalisma {
 
    public static void main(String args[])
    {
        // Creating empty LinkedList
        AbstractQueue<Integer> ll
            = new LinkedBlockingQueue<>();
 
        // Adding items to the ll
        // using add()
        ll.add(10);
        ll.add(20);
        ll.add(15);
        ll.add(5);
        ll.add(1);

        System.out.print("Liste :  ");
        ll.stream().forEach(i-> {System.out.print(i + " ");});
        System.out.println ("");
 
        // Printing the top element of
        // the LinkedList
        System.out.println(ll.peek());
 
        // Printing the top element and removing it
        // from the LinkedList container
        System.out.println(ll.poll());
 
        // Printing the top element again
        System.out.println(ll.peek());

        System.out.print("Liste :  ");
        ll.stream().forEach(i-> {System.out.print(i + " ");});
    }
}