package org.example.collection.list;

import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;


/**
 * this class is for try out Stack
 * @author Shehani Fernando
 */
public class StackCollection {

    /**
     * This method is the main method which will be the runtime entry point for the program
     * @param args for getting usr input
     */
    public static void main(String[] args) {

        //Stack to use it's own fuctions to achieving LIFO

        Stack<String> bookList = new Stack<>();
        bookList.push("Mayakari");
        bookList.push("Dedunukumari");
        bookList.push("Amba yaluwo");
        bookList.push("Wisekari");

        if(bookList.contains("Mayakari")) {
            int size = bookList.size();
            for (int i =1;i<=size;i++) {
                System.out.println(bookList.peek());
                bookList.pop();
                System.out.println("remaining books to rack " + bookList);
            }
        }
//        Iterator list = bookList.listIterator();
//        if(bookList.contains("Mayakari")) {
//            int size = bookList.size();
//            for (int i =1;i<=size;i++) {
//                if(list.hasNext()) {
//                    System.out.println(bookList.peek());
//                    bookList.pop();
//                    System.out.println("remaining books to rack " + bookList);
//                }
//            }
//        }


        /* end */

        /* stack using vector parent inherited functions */

        Stack<Integer> numList = new Stack<>();
        numList.add(1);
        numList.add(2);
        numList.add(3);
        System.out.println(numList);
        for(int i : numList){
            System.out.println(i);
        }

        System.out.println("Remove Element 1");
        numList.remove(0);

        for(int i : numList){
            System.out.println(i);
        }

        System.out.println("size of the List is "+numList.size());
        //take decision based on collection is having element or not.
        if(!numList.contains(1)){
            numList.add(1);
            System.out.println(numList);
        }

        numList.clear();

        System.out.println("after clear() all elements,  size of the collection"+numList.size());

        /* end */

    }
}