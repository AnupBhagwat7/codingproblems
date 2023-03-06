package com.other;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(checkEvenOdd(num));
    }

    private static String checkEvenOdd(int num) {

        if(num % 2 == 0){
            return "EVEN";
        }else{
            return "ODD";
        }
    }


}
