package com.javarush.task.pro.task14.task1415;

import java.util.LinkedList;
import java.util.List;

/* 
Стек в домашних условиях
*/

public class MyStack {

    private final List<String> storage = new LinkedList<>();

    public void push(String s) {
        storage.add(0, s);
    }

    public String pop() {
        String result = storage.get(0);
        storage.remove(0);
        return result;
    }

    public String peek() {
        return storage.get(1);
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    public int search(String s) {
        for (int i = 0; i < storage.size(); i++) {
            if (storage.get(i).equals(s)) {
                return i;
            }
        }
        return -1;
    }
}
