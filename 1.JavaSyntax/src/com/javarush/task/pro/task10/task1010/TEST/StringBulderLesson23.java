package com.javarush.task.pro.task10.task1010.TEST;

public class StringBulderLesson23 {
    public static void main(String[] args) {
//    String y = new String("можно создавать у стринга есть обертка");
//        String x = "HelLo";
//        x.toUpperCase();
//        String z = x.toUpperCase();
//
//        System.out.println(x);
//        System.out.println(z);
//        System.out.println(x.toUpperCase());
//
//        String string1 = "hello";
//        String string2 = "my";
//        String string3 = "friend";
//        String StringAll = string1 + string2 + string3;
//        System.out.println(StringAll);
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" my");
        stringBuilder.append(" friend");
        stringBuilder.append(" my").append(" dear").append(" very").append(" sweet").append(" friend");
//        String imutablde
//                StringBuilder mutable
//        if you wante concatination take StringBuilder
        System.out.println(stringBuilder.toString());

    }


}
