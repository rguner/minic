package com.guner.datastructure.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueCalisma {

    public static void main(String args[])
    {
        // Creating empty priority queue
        Queue<Integer> pQueue
                = new PriorityQueue<Integer>();

        // Adding items to the pQueue
        // using add()
        pQueue.add(30);
        pQueue.add(40);
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);
        pQueue.add(5);
        pQueue.add(70);
        pQueue.add(1);
        pQueue.add(60);

        System.out.print("Liste Boyle yazılıyor ama queue poll sıralaması farklı:  ");
        pQueue.stream().forEach(i-> {System.out.print(i + " ");});
        System.out.println ("");

        // Printing the top element of
        // the PriorityQueue
        System.out.println(pQueue.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pQueue.poll());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.poll());

        // Printing the top element again
        System.out.println(pQueue.peek());

        System.out.print("Liste Boyle yazılıyor ama queue poll sıralaması farklı:  ");
        pQueue.stream().forEach(i-> {System.out.print(i + " ");});
    }
}
