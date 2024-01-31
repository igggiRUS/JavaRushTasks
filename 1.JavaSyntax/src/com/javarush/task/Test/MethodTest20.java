package com.javarush.task.Test;

public class MethodTest20 {
    int summ(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }
}

class Test21 {
    public static void main(String[] args) {
        MethodTest20 t = new MethodTest20();
        int summTreeNumbers = t.summ(12, 20, 46);
        System.out.println(summTreeNumbers);
    }
}

