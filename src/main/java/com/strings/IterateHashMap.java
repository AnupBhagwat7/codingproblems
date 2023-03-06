//Q #6) Write a Java Program to iterate HashMap using While and advance for loop.
package com.strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class IterateHashMap {

    public static void main(String[] args) {

        Map<Integer,String> map = new ConcurrentHashMap<Integer, String>() ;

        map.put(1,"Anup");
        map.put(2,"Akshay");
        map.put(2,"Archu");
        map.put(3,"Abhidnya");
        map.put(4,"Kirti");
        map.put(5,"Akshara");
        //map.put(null,"");

        //map.forEach((k,v) -> System.out.println(k +" "+v));

        Iterator itr = map.entrySet().iterator();
        while(itr.hasNext()) {
            Map.Entry me = (Map.Entry) itr.next();
            //map.remove(1);
            map.put(1,"Anup");
            System.out.println("Key is " + me.getKey() + " Value is " + me.getValue());

        }
    }
}
