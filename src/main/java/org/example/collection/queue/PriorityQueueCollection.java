package org.example.collection.queue;

import java.util.ArrayList;
import java.util.PriorityQueue;


/**
 * this class is for try out PriorityQueue
 * @author Shehani Fernando
 */
public class PriorityQueueCollection {

    /**
     * This method is the main method which will be the runtime entry point for the program
     * @param args for getting usr input
     */
    public static void main(String[] args) {
        //FIFO
        PriorityQueue<String> queue = new PriorityQueue();
        queue.add("Shehani");
        queue.add("Shehan");
        queue.add("Malshani");

        System.out.println(queue);


        System.out.println("who will get the service from queue: "+queue.peek());

        //once after service received from shop behaviour
        queue.poll();

        System.out.println("once after service received from shop queue contains : "+queue);
        //end

    }
}