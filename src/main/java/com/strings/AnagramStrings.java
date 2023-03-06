//12. How to check if two Strings are anagrams of each other? (solution)

package com.strings;

import java.util.Arrays;

public class AnagramStrings {

    public static void main(String[] args) {

        String str1 = "Race".toLowerCase();
        String str2 = "Care".toLowerCase();

        checkAnagram(str1,str2);
    }

    private static void checkAnagram(String str1, String str2) {

        if(str1.length() != str2.length())
            return;

        char[] str1Chars = str1.toCharArray();
        char[] str2Chars = str2.toCharArray();

        Arrays.sort(str1Chars);
        Arrays.sort(str2Chars);

        if(Arrays.equals(str1Chars,str2Chars)){
            System.out.println("Anagrams");
        }else {
            System.out.println("No Anagrams");
        }
    }
}
