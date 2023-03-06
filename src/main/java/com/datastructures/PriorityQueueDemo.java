package com.datastructures;


import lombok.*;

import java.util.PriorityQueue;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@ToString
class Student implements Comparable<Student>{

    private int id;
    private String name;
    private double marks;


    @Override
    public int compareTo(Student student) {

        if(this.getMarks() < student.getMarks()){
            return 1;
        }else if(this.getMarks() > student.getMarks()){
            return -1;
        }else {
            return 0;
        }
    }
}

public class PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(new Student(1,"Anup",75.6));
        priorityQueue.add(new Student(1,"Anup",78.9));
        //priorityQueue.add(null);


        priorityQueue.stream().forEach(System.out::println);
    }
}
