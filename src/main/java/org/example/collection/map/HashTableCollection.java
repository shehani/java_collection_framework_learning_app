package org.example.collection.map;

import java.util.HashMap;
import java.util.Hashtable;


/**
 * this class is for try out codes
 * @author Shehani Fernando
 */
public class HashTableCollection {


    /**
     * This method is the main method which will be the runtime entry point for the program
     * @param args for getting usr input
     */
    public static void main(String[] args) {
        //int[] num = {1,2,3};
        Hashtable<String,String> formPayload = new Hashtable();
        formPayload.put("userId","She12");
        formPayload.put("courseId","cm12");
        formPayload.put("role","instructor");//duplicate not allowed by Map therefore this entry will be removed
        //formPayload.put(null,null); can not insert null key and values NullPointerException is occurred

        System.out.println(formPayload);


        System.out.println("userId before alter: "+formPayload.get("userId"));

        formPayload.put("userId","shi1");

        System.out.println("userId after alter: "+formPayload.get("userId"));

        formPayload.remove("userId");

        System.out.println("after removing userId "+formPayload);

        formPayload.clear();
        System.out.println("after clear() all elements,  size of the collection"+formPayload.size());
    }
}