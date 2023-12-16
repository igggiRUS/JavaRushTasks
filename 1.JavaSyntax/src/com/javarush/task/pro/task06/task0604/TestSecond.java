package com.javarush.task.pro.task06.task0604;

public class TestSecond {
    public static void main(String[] args) throws InterruptedException {
        long start = System.nanoTime();
       Thread.sleep(1);
        long finish = System.nanoTime();
        long elapsed = finish - start;
        System.out.println("time " + elapsed);
        System.out.println(System.currentTimeMillis());

    }
}
