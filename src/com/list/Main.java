// Java program to review LinkedList
package com.list;

import java.util.LinkedList;
import java.util.List;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating list to store
        List<String> list = new LinkedList<>();

        // Adding elements to list
        list.add("Book");
        list.add("Pen");
        list.add("Pencil");
        list.add("Notebook");
        list.add("Eraser");
        list.add("Magazine");
        list.add("Magazine");
        list.add("Notebook");
        list.add("Pen");

        // Printing elements of list to console
        System.out.println(list);

        // Removing duplicates
        list.remove("Magazine");
        list.remove("Notebook");
        list.remove("Pen");

        // Printing elements of redone list to console
        System.out.println(list);
    }
}