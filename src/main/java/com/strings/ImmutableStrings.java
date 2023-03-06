package com.strings;

public class ImmutableStrings {

    public static void main(String[] args) {

        String s = "Anup";

        System.out.println(s.hashCode());
        String s1 = new String("Anup");
        System.out.println(s1.hashCode());

        String s3 = new String("Test");
        System.out.println(s3.hashCode());

        //s3.intern();
        String s4 = "Test";
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
    }
}
