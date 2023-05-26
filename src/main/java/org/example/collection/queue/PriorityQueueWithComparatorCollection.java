package org.example.collection.queue;

import java.util.Comparator;
import java.util.PriorityQueue;


/**
 * this class is for try out with Comparator class to change the order of saving elements
 * @author Shehani Fernando
 */
public class PriorityQueueWithComparatorCollection {


    /**
     * This method is the main method which will be the runtime entry point for the program
     * @param args for getting usr input
     */
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        //FIFO
        PriorityQueue<Integer> queue = new PriorityQueue((comparator));
        queue.add(10);
        queue.add(2);
        queue.add(10);
        queue.add(5);

        System.out.println(queue);


        System.out.println("who will get the service from queue: "+queue.peek());

        //once after service received from shop behaviour
        queue.poll();
        System.out.println("once after service received from shop queue contains : "+queue);


    }
}