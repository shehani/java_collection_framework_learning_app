package org.example.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;


/**
 * this class is for try out codes
 * @author Shehani Fernando
 */
public class LinkedHashSetCollection {


    /**
     * This method is the main method which will be the runtime entry point for the program
     * @param args for getting usr input
     */
    public static void main(String[] args) {
        HashSet<String> hashList = new HashSet<>();

        hashList.add("Hello");
        hashList.add("JAVA");
        hashList.add("WORLD");
        hashList.add("I Love you");
        System.out.println(hashList);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(hashList);
        linkedHashSet.add("JAVA");//this is not adding due to a duplicated object
        System.out.println(linkedHashSet);
    }



}