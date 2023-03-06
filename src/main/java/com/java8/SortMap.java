package com.java8;

import java.util.*;
import java.util.stream.Collectors;

public class SortMap {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();

        map.put(3,"Anup");
        map.put(2,"Akshay");
        map.put(1,"Kirti");
        map.put(5,"Archu");
        map.put(4,"Ziva");
        map.put(6,null);

       /* System.out.println(map.entrySet().stream().
                sorted(Map.Entry.<Integer,String>comparingByValue()).
                collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()
                )));*/

        List<Number> list = new LinkedList<>();

        list.add(1.0);
        list.add(2);

        System.out.println(list);

        try{
            int n = 10/0;
        }catch (NumberFormatException | ArithmeticException ex){
            System.out.println(ex.getClass());
        }
    }
}
