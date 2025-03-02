package com.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountVowelsAndConsonants {

    public static void main(String[] args) {

        String s = "Anup Bhagwat";
        countVowels(s);
        countConsonants(s);
    }

    private static void countVowels(String s) {

        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e','i','o','u','A','E','I','O','U'));
        System.out.println(s.chars().filter(c -> vowels.contains((char)c)).count());
    }

    private static void countConsonants(String s) {

        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        System.out.println(s.chars().filter(c -> !vowels.contains((char) c)).
                filter(ch -> (((char) ch >= 'a' && (char) ch <= 'z') || ( (char) ch >= 'A' && (char) ch <= 'Z'))).count());
    }
}
