package com.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountDuplicateCharacters {

    public static void main(String[] args) {

        String s = "Who are you , all good at your end?";
        System.out.println(countDuplicateCharacters(s));
    }

    private static Map<Character, Long> countDuplicateCharacters(String s) {

        s.chars().mapToObj(c -> (char) c).forEach(System.out::println);
        return s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }
}
