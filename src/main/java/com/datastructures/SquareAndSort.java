package com.datastructures;

import java.util.Arrays;

public class SquareAndSort {

    public static void main(String[] args) {

        int[] arr;

        arr = new int[]{-8, -3, -1, 0, 2, 5};

        int i=0,j=arr.length-1;

        while(i<j){

            if(arr[i]*arr[i] > arr[j] *arr[j] ){
                int temp = arr[i]*arr[i];
                arr[i] = arr[i+1] *arr[i+1];
                arr[i+1] = temp;
                i=i+2;
            }else{
                int temp = arr[j]*arr[j];
                arr[j] = arr[j-1]*arr[j-1];
                arr[j-1] = temp;
                j=j-2;
            }
        }

        Arrays.stream(arr).forEach(System.out::println);
    }

}
