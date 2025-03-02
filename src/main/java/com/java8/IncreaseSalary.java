package com.java8;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IncreaseSalary{

    public static void main(String[] args) {
        List<Employee1> employees = new ArrayList<>();
        employees.add(new Employee1(1, "John Doe", 75000, "IT"));
        employees.add(new Employee1(2, "Jane Doe", 80000, "IT"));
        employees.add(new Employee1(3, "Jim Smith", 65000, "Marketing"));

        employees.stream().forEach(employee1 -> employee1.setSalary(employee1.getSalary()*1.2));

        employees.stream().filter(employee1 -> employee1.getName().contains("Doe")).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println(employees);

        System.out.println(employees.stream().sorted(Comparator.comparing(Employee1::getSalary).reversed()).collect(Collectors.toList()));
    }
}

class Employee1 {
    private int id;

    private int age;
    private String name;

    private String city;
    private double salary;
    private String department;

    public Employee1(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public String getCity() {
        return city;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }
}
