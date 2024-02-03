package com.javarush.task.pro.task10.task1010.TEST;

public class GetSetTest {
    public static void main(String[] args) {
 int x = 14;
 int y = 12;
    }

    class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}
