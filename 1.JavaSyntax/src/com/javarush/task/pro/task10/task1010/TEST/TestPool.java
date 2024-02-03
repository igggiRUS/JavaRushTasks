package com.javarush.task.pro.task10.task1010.TEST;

public class TestPool {
    public static void main(String[] args) {
        String[] arrayString = {"helo", "bye"};
        String a = arrayString[0];
        String b = arrayString[0];
        String c = arrayString[1];

        String d = new String("Привет");
        String e = new String("Привет");
        System.out.println(d == e);
        System.out.println(d.equals(e));
        String interD = d.intern();
        String interE = e.intern();
        System.out.println(interD == interE);

//        System.out.println(a == b);
    }
}
