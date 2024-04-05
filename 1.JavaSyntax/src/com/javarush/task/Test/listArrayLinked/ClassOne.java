package com.javarush.task.Test.listArrayLinked;

import java.util.ArrayList;
import java.util.Collections;

public class ClassOne {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("One");
        list1.add("Two");
        list1.add("Three");

        ArrayList<String> list2 = new ArrayList<>();
        copy(list1, list2);
        System.out.println("List 2 after copying: " + list2);


        ArrayList<String> list = new ArrayList<>();
        addAll(list, "One", "Two", "Three");
        System.out.println("List after adding elements: " + list);

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("One");
        list3.add("Two");
        list3.add("Three");

        replaceAll(list3, "Two", "New Two");

        System.out.println("List after replacing elements: " + list);

    }
    public static void copy(ArrayList<String> source, ArrayList<String> destination) {
        Collections.copy(destination, source);
    }

    public static void addAll(ArrayList<String> list, String... elements) {
        Collections.addAll(list, elements);
    }
    public static void replaceAll(ArrayList<String> list, String oldValue, String newValue) {
        Collections.replaceAll(list, oldValue, newValue);
    }
}
