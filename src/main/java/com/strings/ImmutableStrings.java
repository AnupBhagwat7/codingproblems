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

        StringBuilder sb = new StringBuilder("Anup");
        System.out.println(sb);
        System.out.println(sb.append(" Bhagwat"));

        StringBuilder sbuff = new StringBuilder("Anup");
        System.out.println(sbuff);
        System.out.println(sbuff.append(" Bhagwat"));
    }
}
