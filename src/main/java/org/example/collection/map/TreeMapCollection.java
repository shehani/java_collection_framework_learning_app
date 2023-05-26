package org.example.collection.map;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.TreeMap;


/**
 * this class is for try out TreeMap
 * @author Shehani Fernando
 */
public class TreeMapCollection {


    /**
     * This method is the main method which will be the runtime entry point for the program
     * @param args for getting usr input
     */
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o1>o2) ? -1 : (o1<o2) ? 1 : 0;
            }
        };
        TreeMap<Integer,String> formPayload = new TreeMap(comparator);
        formPayload.put(10,"She12");
        formPayload.put(1,"cm12");
        formPayload.put(2,"instructor");//duplicate not allowed by Map therefore this entry will be removed
        formPayload.put(3,null);
        System.out.println(formPayload);


        System.out.println("userId before alter: "+formPayload.get(10));

        formPayload.put(10,"shi1");

        System.out.println("userId after alter: "+formPayload.get(1));

        formPayload.remove(10);

        System.out.println("after removing userId "+formPayload);

        formPayload.clear();
        System.out.println("after clear() all elements,  size of the collection"+formPayload.size());
    }
}