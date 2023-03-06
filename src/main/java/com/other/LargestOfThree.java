//Java Program to Find the Largest of three Numbers

package com.other;

import java.util.HashMap;
import java.util.Map;

public class LargestOfThree {

    Map<Integer,String> map = new HashMap<>();
    public static void main(String[] args) {

        int x = 7, y = 20, z = 56, max=0;

        if(x> max){
            max=x;
        }
        if(y> max){
            max=y;
        }
        if(z> max){
            max=z;
        }
        System.out.println("Max is:"+ max);

        LargestOfThree largestOfThree = new LargestOfThree();

        largestOfThree.map.put(1,"Anup");
        populateMap(largestOfThree.map);

        System.out.println(largestOfThree.map);
    }

    private static void populateMap(Map<Integer, String> map) {
        map.put(2,"Abhidnya");
        //map = new HashMap<>();
        map.put(3,"Archu");
        map.put(4,"Kirti");
    }
}
