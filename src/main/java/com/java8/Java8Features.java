package com.java8;

import java.util.*;
import java.util.stream.Collectors;

public class Java8Features {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        //list.forEach(i -> System.out.println(i));
        list1.stream().filter(i -> i>2).collect(Collectors.toList()).forEach(i -> System.out.println(i));

        List<Integer> t = new ArrayList<>();
        //t = null;
        Optional<List<Integer>> it= Optional.of(t);

        System.out.println(it.isPresent());

        Map<Integer,String> map = new TreeMap<>();
        map.put(1,"A");
        map.put(3,"B");
        map.put(0,"C");
        map.put(2,"B");

        map.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() +" "+ entry.getValue()) );

        map.forEach((k,v) -> System.out.println(k +" "+v));

        Queue<Integer> queue=new LinkedList<>();
        queue.add(2);
        queue.add(1);
        queue.add(0);
        queue.stream().forEach(q -> System.out.println(q));
        System.out.println(queue.remove());
        queue.stream().forEach(q -> System.out.println(q));

        System.out.println("Parallel stream");
        list.parallelStream().forEach(System.out::println);

        list.stream().forEach(System.out::println);
    }
}
