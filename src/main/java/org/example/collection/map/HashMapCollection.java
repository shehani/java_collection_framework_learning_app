package org.example.collection.map;

import java.util.HashMap;


/**
 * this class is for try out HashMap
 * @author Shehani Fernando
 */
public class HashMapCollection {


    /**
     * This method is the main method which will be the runtime entry point for the program
     * @param args for getting usr input
     */
    public static void main(String[] args) {

        HashMap<String,String> formPayload = new HashMap();
        formPayload.put("userId","She12");
        formPayload.put("courseId","cm12");
        formPayload.put("role","instructor");//duplicate not allowed by Map therefore this entry will be removed
        formPayload.put("role","student");
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