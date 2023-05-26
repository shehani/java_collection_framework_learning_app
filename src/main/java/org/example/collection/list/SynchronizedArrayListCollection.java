package org.example.collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


/**
 * this class is for try out Collections.synchronizedList method to avoid race condition in ArrayList
 * @author Shehani Fernando
 */
public class SynchronizedArrayListCollection {

    /**
     * This method is the main method which will be the runtime entry point for the program
     * @param args for getting usr input
     */
    public static void main(String[] args) {

        List<Integer> numList = Collections.synchronizedList(new ArrayList<>());
        numList.add(1);
        numList.add(2);
        numList.add(3);

        System.out.println(numList);

        //synchronized (numList) {
            for (int i : numList) {
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
       // }


    }
}