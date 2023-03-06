//2. Write a program in Java to count the digits in a number.

package com.other;

import java.util.Scanner;

public class CountDigitsInNumber {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();

        int count  =0;
        while(n>0){
            int temp = n%10;
            n = n/10;
            count++;
        }

        System.out.println(count);
    }
}
