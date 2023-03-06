//Q #3) Write a Java Program to swap two numbers using the third variable.

/*
Input:  x = 10 , y =20
Output: x=20  , y =10
*/
package com.strings;

import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x = sc.nextInt();
        System.out.println("Enter second number: ");
        int y = sc.nextInt();
        System.out.println("Before swap: x="+ x +"y= "+y);

        int temp = y;
        y= x;
        x=temp;

        System.out.println("After swap: x="+ x +"y= "+y);


        //without using third variable
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println();
    }
}
