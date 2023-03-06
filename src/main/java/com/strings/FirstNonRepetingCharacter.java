package com.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepetingCharacter {

    public static void main(String[] args) {
        String s = "swiss";

        findFirstNonRepeatingCharacter(s);
    }

    private static void findFirstNonRepeatingCharacter(String s) {

        Map<Character, Integer> result = new LinkedHashMap<>();

        for(int i=0;i<s.length();i++){

            if(result.containsKey(s.charAt(i))){
                result.put(s.charAt(i), result.get(s.charAt(i))+1);
            }else {
                result.put(s.charAt(i), 1);
            }
        }
        System.out.println(result);

        System.out.println(result.keySet().stream().filter(key -> result.get(key).intValue()==1).findFirst().get());
    }
}
