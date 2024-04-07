package com.javarush.task.Test.listArrayLinked;

import java.util.Iterator;

public class Iterator2 {
    public static void main(String[] args) {

    }

    private static class Range implements Iterable<Integer> {
        int start;
        int end;

        public Range(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public Iterator iterator() {
            return new Iterator(start);

        }

        class Iterator implements java.util.Iterator<Integer> {

            int current;

            public Iterator(int current) {
                this.current = current;
            }

            @Override
            public boolean hasNext() {
                return current <= end;
            }

            @Override
            public Integer next() {
                return current++;
            }
        }
    }
}


