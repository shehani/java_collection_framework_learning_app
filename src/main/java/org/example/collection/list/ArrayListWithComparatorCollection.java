package org.example.collection.list;

import java.util.*;


/**
 * this class is for try out to change the order of a array list to ascending order
 * @author Shehani Fernando
 */
public class ArrayListWithComparatorCollection {


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

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(2);
        arrayList.add(10);
        arrayList.add(5);

        System.out.println(arrayList);

        Collections.sort(arrayList,comparator);

        System.out.println("sorted list to ascending order: "+arrayList);


        arrayList.remove(0);
        System.out.println("once after removing 1st element from the ArrayList : "+arrayList);
        //end

    }
}