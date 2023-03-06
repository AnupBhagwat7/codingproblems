//Q #5) Write a Java Program to count the number of words in a string using HashMap.
package com.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountWordsInString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = scanner.nextLine();

        String[] splitStr = str.split(" ");

        Map<String , Integer> map = new TreeMap<String, Integer>();

        for(int i=0;i<splitStr.length;i++){

            if(map.containsKey(splitStr[i])){
                map.put(splitStr[i], map.get(splitStr[i])+1);
            }else{
                map.put(splitStr[i], 1);
            }
        }

        System.out.println(map);
    }
}
