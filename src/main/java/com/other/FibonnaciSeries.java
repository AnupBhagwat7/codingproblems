package com.other;

import java.util.Scanner;

public class FibonnaciSeries {

    public static void main(String[] args) {

        int a =0;
        int b=1;

        Scanner scanner= new Scanner(System.in);
        //System.out.println("Enter number of elements: ");
        //int n = scanner.nextInt();
        //printFibonacci(a,b,n);

        System.out.println("====================================================Recursion");
        System.out.println(fib(5));

        System.out.println("====================================================Dynamic programming");
        dynamicApproach(6);
    }

    private static void dynamicApproach(int n) {

        int[] arr = new int[n+2];

        arr[0] = 0;
        arr[1] = 1;

        for(int i=2;i<n;i++){
            arr[i] = arr[i-1] + arr[i-2];
            System.out.println(arr[i]);
        }
    }

    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    private static void printFibonacci(int a, int b, int n) {

        int c=0;
        for(int i=2;i<n;i++){
            c = a+b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}
