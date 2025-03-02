package com.arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

        reverseArray(arr);

        Arrays.stream(arr).forEach(i -> System.out.println(i));
    }

    private static void reverseArray(int[] arr) {

        for(int i=0; i< arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length -i-1];
            arr[arr.length -i-1] = temp;
        }

    }
}
