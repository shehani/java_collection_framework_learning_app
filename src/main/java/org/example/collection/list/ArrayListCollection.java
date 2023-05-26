package org.example.collection.list;

import java.util.ArrayList;


/**
 * this class is for try out ArrayList
 * @author Shehani Fernando
 */
public class ArrayListCollection {

    /**
     * This method is the main method which will be the runtime entry point for the program
     * @param args for getting usr input
     */
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(2);
        numList.add(3);

        System.out.println(numList);
        for(int i : numList){
            System.out.println(i);
        }

        System.out.println("Remove Element 1");
        numList.remove(0);

        for(int i : numList){
            System.out.println(i);
        }

        System.out.println("size of the List is "+numList.size());

        //take decision based on collection is having element or not.
        if(!numList.contains(1)){
            numList.add(1);
            System.out.println(numList);
        }

        numList.clear();
        System.out.println("after clear() all elements,  size of the collection"+numList.size());
    }
}