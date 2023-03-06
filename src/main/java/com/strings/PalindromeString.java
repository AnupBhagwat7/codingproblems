//Q #8) Write a Java Program to find whether a string or number is palindrome or not.
package com.strings;

public class PalindromeString {

    public static void main(String[] args) {

        String s = "dada";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s){

        boolean flag =true;
        int len = s.length();
        for(int i=0; i<len/2; i++){

            if(s.charAt(i) != s.charAt(len-i-1)){
                flag = false;
            }
        }

        return flag;

    }
}
