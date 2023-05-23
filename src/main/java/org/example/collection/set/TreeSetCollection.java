package org.example.collection.set;

import java.util.*;


/**
 * this class is for try out codes
 * @author Shehani Fernando
 */
public class TreeSetCollection {


    /**
     * This method is the main method which will be the runtime entry point for the program
     * @param args for getting usr input
     */
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
//                if(o1>o2)
//                    return -1;
//                else if (o1<o2) {
//                    return 1;
//                } else if (o1==o2) {
//                    return 0;
//                }else
//                    return 0;
                return (o1>o2) ? -1 : (o1<o2) ? 1 : 0;
            }
        };
        TreeSet<Integer> treeSet = new TreeSet<>(comparator);

        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(10);
        treeSet.add(5);
        System.out.println(treeSet);
        //TreeSet<Integer> sortedSet =(TreeSet<Integer>)treeSet.descendingSet(); //Navigator
        //System.out.println(sortedSet);


    }



}