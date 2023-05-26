package org.example.collection.set;

import java.util.HashSet;


/**
 * this class is for try out HashSet
 * @author Shehani Fernando
 */
public class HashSetCollection {


    /**
     * This method is the main method which will be the runtime entry point for the program
     * @param args for getting usr input
     */
    public static void main(String[] args) {
        HashSet<String> studentList = new HashSet<>();

        studentList.add("studentA");
        studentList.add("studentB");
        studentList.add("studentC");
        studentList.add("studentC"); //only one umali will be stored since set is not allowing duplication of objects :)
        System.out.println(studentList);


        System.out.println("Remove studentC object");
        studentList.remove("studentC");

        for(String i : studentList){
            System.out.println(i);
        }

        System.out.println("size of the List is "+studentList.size());
        //take decision based on collection is having element or not.
        if(!studentList.contains("studentC")){
            studentList.add("studentC");
            System.out.println("Added studentC");
            System.out.println(studentList);
        }

        studentList.clear();
        System.out.println("after clear() all elements,  size of the collection"+studentList.size());
    }
}