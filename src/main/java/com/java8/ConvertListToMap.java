package com.java8;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
//@EqualsAndHashCode
class Student{

    private int id;
    private String name;
}

public class ConvertListToMap {

    public static void main(String[] args) {

        Student s1 = new Student(10,"ASDDD");
        Student s2 = new Student(10,"ASDDD");
        System.out.println(s1.equals(s2));
        List<Student> list = new ArrayList<>();

        list.add(new Student(1, "Anup"));
        list.add(new Student(2, "Akshay"));
        list.add(new Student(3, "Kirti"));
        list.add(new Student(4, "Archu"));
        list.add(new Student(5, "Abhidnya"));
        list.add(new Student(6, "Rahul"));
        list.add(new Student(7, "Tejas"));

        System.out.println(list.stream().collect(Collectors.toMap( s -> s.getId() , s -> s.getName() )));
        System.out.println(list.stream().collect(Collectors.toMap( Student::getId , s -> s )));
        System.out.println(list.stream().collect(Collectors.toMap( Student::getId , Function.identity())));

        final Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


    }
}
