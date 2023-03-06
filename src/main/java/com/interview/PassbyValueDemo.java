package com.interview;

import java.util.LinkedList;
import java.util.List;

public class PassbyValueDemo {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(10);
        Integer x = 5;
        show(x,list);
        System.out.println(x);
        System.out.println(list);
    }

    private static void show(Integer x, List<Integer> list) {
        x =10;
        list.add(20);
        list.add(30);
    }


}
