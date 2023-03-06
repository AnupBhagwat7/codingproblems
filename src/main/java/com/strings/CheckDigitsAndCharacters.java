package com.strings;

public class CheckDigitsAndCharacters {

    public static void main(String[] args) {

        String str1= "adsakjjjhdhbbbcbsc";

        System.out.println(checkIfOnlyCharacters(str1));

        String str2 = "121243434344668687987";

        System.out.println(checkIfOnlyDigits(str2));
    }

    private static boolean checkIfOnlyCharacters(String str1) {

        return !str1.chars().anyMatch(n -> Character.isDigit(n));
    }

    private static boolean checkIfOnlyDigits(String str1) {

        return str1.matches("[0-9]+");
    }
}
