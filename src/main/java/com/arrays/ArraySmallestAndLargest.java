//3. How to find the largest and smallest number in an unsorted integer array? (solution)
package com.arrays;

import java.util.*;

public class ArraySmallestAndLargest {

    public static void main(String[] args) {

        Integer[] arr = new Integer[]{3, 4,5, 1, 5,  9,7 , 6};

        findSmallestAndLargestNumberFromArray(arr);

        removeDuplicates(arr);
    }

    private static void removeDuplicates(Integer[] arr) {

        List<Integer> list = Arrays.asList(arr);
        Set<Integer> s = new HashSet(list);
        System.out.println(s);
    }

    private static void findSmallestAndLargestNumberFromArray(Integer[] arr) {

        int min = arr[0];
        int max = arr[0];

        for(int i=0;i<arr.length;i++){

            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(min + "  "+ max);
    }
}
