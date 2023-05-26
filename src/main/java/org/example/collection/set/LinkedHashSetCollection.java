package org.example.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


/**
 * this class is for try out LinkedHashSet
 * @author Shehani Fernando
 */
public class LinkedHashSetCollection {


    /**
     * This method is the main method which will be the runtime entry point for the program
     * @param args for getting usr input
     */
    public static void main(String[] args) {
        Set<String> linkedHashList = new LinkedHashSet<>();

        linkedHashList.add("Hello");
        linkedHashList.add("JAVA");
        linkedHashList.add("WORLD");
        linkedHashList.add("I Love you");
        System.out.println(linkedHashList);

        linkedHashList.add("JAVA");//this is not adding due to a duplicated object

        System.out.println(linkedHashList);
    }



}