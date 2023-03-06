package com.other;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Employee1 implements Comparable<Employee1>{
    int id;
    String name;

    public Employee1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee1 employee) {

        if(this.id > employee.id){
            return 1;
        }else if(this.id < employee.id){
            return -1;
        }else{
            return 0;
        }
    }
}

public class General {

    public static void main(String[] args) {

        Set<Integer> set= new LinkedHashSet<>();
/*        set.add("D");
        set.add("S");
        set.add("A");
        set.add("F");
        set.add("H");
        set.add("T");*/

        for(int i=0;i<100000;i++){
            set.add(i*3);
        }

        long start_time = System.nanoTime();
        set.add(-1);
        set.add(2);
        set.add(22);
        set.add(4);
        set.add(83);
        set.remove(36);
        set.remove(60);
        long end_time = System.nanoTime();

        System.out.println( (end_time - start_time));

        System.out.println(set);

        Set<Employee1> employees= new TreeSet<>();
        employees.add(new Employee1(1,"Anup"));
        employees.add(new Employee1(3,"Akshay"));
        employees.add(new Employee1(2,"Archu"));
        employees.add(new Employee1(6,"Kirti"));
        employees.add(new Employee1(5,"Abhidnya"));

        System.out.println(employees);


        List<String> list = new ArrayList();
        list.add("Anup");
        list.add("Mohan");
        list.add("Rahul");
        list.add("Don");
        list.add("Ram");
        list.add("Rohan");

        Predicate<String> startsWithR = (s) -> s.startsWith("R");
        Predicate<String> endsWithN = (s) -> s.endsWith("n");

        List<String> filteredList = list.stream().filter(startsWithR.and(endsWithN)).collect(Collectors.toList());

        System.out.println(filteredList);

        List<Integer> list1 = new ArrayList();
        list1.add(4);
        list1.add(4);
        list1.add(6);
        list1.add(4);list1.add(9);list1.add(5);list1.add(8);list1.add(5);

        IntSummaryStatistics intSummaryStatistics = list1.stream().mapToInt((x)-> x).summaryStatistics();// sorted().collect(Collectors.toList()));

        System.out.println(intSummaryStatistics.getSum());
        System.out.println(intSummaryStatistics.getAverage());
        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getCount());

        System.out.println(employees.stream().sorted().collect(Collectors.toList()));

        Predicate<Employee1> employeePredicate = e -> e.getName().startsWith("A");
        System.out.println(employees.stream().findAny().orElse(null));
    }
}
