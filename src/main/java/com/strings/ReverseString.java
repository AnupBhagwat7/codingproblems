//Q #1) Write a Java Program to reverse a string without using String inbuilt function.
package com.strings;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        String s = "Anup";
        int i = s.length()-1;
        char[] chars = new char[s.length()];
        int j=0;

        while(i >=0 ){
            chars[j] = s.charAt(i);
            i--;j++;
        }

        System.out.println(new String(chars));


        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your String");
        str = in.nextLine();
        String[] token = str.split("");    //used split method to print in reverse order
        for(int k=token.length-1; k>=0; k--)
        {
            System.out.print(token[k] + "");
        }
    }
}
