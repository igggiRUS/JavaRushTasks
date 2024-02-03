package com.javarush.task.pro.task10.task1010.TEST.Ob;

    class User extends Object {
        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

//        public String toString() {
//            return "my name is " + name + " i am " + age + " years old ";
//        }
    }

    public class MainUsers1 {
        public static void main(String[] args) {
            User user = new User("Julia", 36);
            System.out.println(user.toString());

            User user1 = new User("Julia", 36);
            System.out.println(user1.toString());

            System.out.println(user.equals(user1));
        }

    }
