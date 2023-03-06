package com.other;

public class Factorial {

    public static void main(String[] args) {
        long n =25;

        System.out.println(factorial(n));
    }

    private static long factorial(long n) {

            if(n == 1){
                return 1;
            }else{
                return n * factorial(n-1);
            }
    }


}
