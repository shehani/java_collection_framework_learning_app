package org.example.collection.list;

import java.util.LinkedList;
import java.util.Vector;


/**
 * this class is for try out LinkedList
 * @author Shehani Fernando
 */
public class LinkedListCollection {


    /**
     * This method is the main method which will be the runtime entry point for the program
     * @param args for getting usr input
     */
    public static void main(String[] args) {

        LinkedList<Integer> fuelQueue = new LinkedList<>();
        fuelQueue.add(1);
        fuelQueue.add(2);
        fuelQueue.add(3);
        System.out.println(fuelQueue);
        System.out.println("Remove Element 1  since it has taken fuel already");

        fuelQueue.removeFirst();


        System.out.println(fuelQueue);
        //take decision based on collection is having element or not.
            fuelQueue.add(1);
            System.out.println(fuelQueue);
        }


    }
