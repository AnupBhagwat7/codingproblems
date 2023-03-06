package com.other;

class Student implements Cloneable{

    int id;
    String name;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class DemoSerializable {

    public static void main(String[] args) {

        //Shallow copy
        Student student=new Student(1,"Anup");

        Student student1 = student;

        student1.id = 2;

        System.out.println("Student reference: "+ student.hashCode() +" Student1 reference: "+ student1.hashCode());

        //Deep Copy
        Student s1=new Student(1,"Anup");

        System.out.println(student.id  +"  "+ student1.id);
        try {
            Student s2 = (Student)s1.clone();

            System.out.println("S1 reference: "+ s1.hashCode() +" S2 reference: "+ s2.hashCode());

            s2.name = "Anup1";

            System.out.println(s1  +"  "+ s2);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
