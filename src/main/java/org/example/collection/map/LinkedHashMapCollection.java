package org.example.collection.map;

import java.util.Hashtable;
import java.util.LinkedHashMap;


/**
 * this class is for try out codes
 * @author Shehani Fernando
 */
public class LinkedHashMapCollection {


    /**
     * This method is the main method which will be the runtime entry point for the program
     * @param args for getting usr input
     */
    public static void main(String[] args) {

        LinkedHashMap<String,String> formPayload = new LinkedHashMap();
        formPayload.put("userId","She12");
        formPayload.put("courseId","cm12");
        formPayload.put("role","instructor");//duplicate not allowed by Map therefore this entry will be removed
        formPayload.put(null,null);
        formPayload.put("key",null);
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