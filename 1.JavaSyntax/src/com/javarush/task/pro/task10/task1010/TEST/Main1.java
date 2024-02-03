package com.javarush.task.pro.task10.task1010.TEST;
public class Main1
{
    public static void main(String[] args)
    {
        ChildClass obj = new ChildClass();
    }

    public static String print(String text)
    {
        System.out.println(text);
        return text;
    }
}

class ParentClass
{
    public String a = Main1.print("ParentClass.a");
    public String b = Main1.print("ParentClass.b");

    public ParentClass()
    {
        Main1.print("ParentClass.constructor");
    }
}

class ChildClass extends ParentClass
{
    public String c = Main1.print("ChildClass.c");
    public String d = Main1.print("ChildClass.d");

    public ChildClass()
    {
        Main1.print("ChildClass.constructor");
    }
}