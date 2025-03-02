package com.java8;

public class CheckStringForOnlyDigits {

    public static void main(String[] args) {

        String s = "3213123A";
        System.out.println(isStringContainsOnlyDigits(s));
    }

    private static boolean isStringContainsOnlyDigits(String s) {

        return !s.chars().anyMatch(Character::isAlphabetic);
    }
}
