//4. Write a Java Program to calculate xn (x to the power n) using Recursion. You can use O(N) time but can’t use any extra space apart from the Recursion Call Stack Space.

package com.other;

import java.util.Scanner;

public class XToPowerN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X: ");
        int x = scanner.nextInt();
        System.out.println("Enter N: ");
        int n = scanner.nextInt();

        System.out.println(power(x,n));
    }

    private static int power(int x, int n) {

        if(n==0){
            return 1;
        }

        int pow = power(x, n-1);

        return x * pow;
    }
}
