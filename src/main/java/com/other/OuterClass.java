package com.other;

public class OuterClass {

    int i =10;

    static int j = 20;

    static class InnerClass{

        int i = 90;
        public static void main(String[] args) {
            InnerClass innerClass = new InnerClass();
            System.out.println(innerClass.i);
        }
    }

    public static void main(String[] args) {

        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();

        System.out.println(innerClass.i);
    }
}
