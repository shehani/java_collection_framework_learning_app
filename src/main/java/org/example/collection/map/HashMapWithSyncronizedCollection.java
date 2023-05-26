package org.example.collection.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * this class is for try out HashMap
 * @author Shehani Fernando
 */
public class HashMapWithSyncronizedCollection {


    /**
     * This method is the main method which will be the runtime entry point for the program
     * @param args for getting usr input
     */
    public static void main(String[] args) {
        /* synchronized hash map is necessary when
        there is a requirement, sometimes user sending null key and values into map and thread safe is also required.
         */

        Map<String,String> map = Collections.synchronizedMap(new HashMap<>());

        //doing operations in a synchronized hashMap
        synchronized (map) {
            map.put("userId", "She12");
            map.put("courseId", "cm12");
            map.put("role", "instructor");//duplicate not allowed by Map therefore this entry will be removed
            map.put("role", "student");
            map.put(null, null);
            map.put("key", null);

        }
        System.out.println(map);


        System.out.println("userId before alter: "+map.get("userId"));

        map.put("userId","shi1");

        System.out.println("userId after alter: "+map.get("userId"));

        map.remove("userId");

        System.out.println("after removing userId "+map);

        map.clear();
        System.out.println("after clear() all elements,  size of the collection"+map.size());
    }
}