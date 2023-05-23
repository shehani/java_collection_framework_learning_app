package org.example.collection.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;


/**
 * this class is for try out codes
 * @author Shehani Fernando
 */
public class ArrayDequeueCollection {

    /**
     * This method is the main method which will be the runtime entry point for the program
     * @param args for getting usr input
     */
    public static void main(String[] args) {
        System.out.println("Starting FIFO element manage");
        //FIFO
        ArrayDeque<String> queue = new ArrayDeque<>();
        queue.add("Shehani");
        queue.add("Shehan");
        queue.add("Malshani");

        System.out.println(queue);


        System.out.println("who will get the service from queue: "+queue.peek());

        //once after service received from shop behaviour
        queue.poll();
        System.out.println("once after service received from shop queue contains : "+queue);
        //end

        //LIFO
        //FIFO
        System.out.println("Starting LIFO element manage");
        ArrayDeque<String> queue2 = new ArrayDeque<>();
        queue2.add("Shehani");
        queue2.add("Shehan");
        queue2.add("Malshani");

        System.out.println(queue2);


        System.out.println("who will get the service from queue: "+queue2.peekLast());

        //once after service received from shop behaviour
        queue2.pollLast();
        System.out.println("once after service received from shop queue contains : "+queue2);
        //end

    }
}