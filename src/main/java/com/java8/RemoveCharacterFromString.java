package com.java8;

import java.util.stream.Collectors;

public class RemoveCharacterFromString {

    public static void main(String[] args) {

        String s = "Anup";
        System.out.println(removeCharacterFromString(s, 'p'));
    }

    private static String removeCharacterFromString(String s, char p) {

        return s.chars().filter(c -> c!= p).mapToObj(ch -> String.valueOf(Character.toChars(ch))).collect(Collectors.joining());
    }
}
