package com.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraySameElements {

    public static void main(String[] args) {
        Integer[] a1 = {1,2,3,2,1,4};
        Integer[] a2 = {1,2,3};
        Integer[] a3 = {1,2,3,4};

        System.out.println(checkIfArraysContainSameElements(a1,a3));

        foo(null);
    }

    private static boolean checkIfArraysContainSameElements(Integer[] a1, Integer[] a2) {

        Set<Object> uniqueElements1 = new HashSet<>(Arrays.asList(a1));
        Set<Object> uniqueElements2 = new HashSet<>(Arrays.asList(a2));

        // if size is different, means there will be a mismatch
        if(uniqueElements1.size() != uniqueElements2.size())
            return false;

        for(Object obj : uniqueElements1) {
            // element not present in both?
            if (!uniqueElements2.contains(obj)) {
                return false;
            }
        }

        return true;
    }
    public static void foo(Object o) {
        System.out.println("Object argument");
    }
    public static void foo(String s) {

        long longWithL = 1000*60*60*24*365L;
        long longWithoutL = 1000*60*60*24*365;
        System.out.println(longWithL);
        System.out.println(longWithoutL);

        System.out.println("String argument");
    }

}
