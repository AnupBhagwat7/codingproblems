//Q #7) Write a Java Program to find whether a number is prime or not.
package com.strings;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        PrimeNumber pn = new PrimeNumber();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");

        Integer num = scanner.nextInt();
        System.out.println(pn.isPrime(num));
    }

    public boolean isPrime(Integer num) {

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                System.out.println("Not prime"+i);
                return false;
            }
        }
        return true;
    }
}