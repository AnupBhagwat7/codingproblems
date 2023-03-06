package com.other;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Electronics {

    int price;
    static String label;

    void displayPrice(){
        System.out.println("Price of electronic device: "+ this.price);
    }

    static void displayLabel(){
        System.out.println("Electronic device label: "+ label);
    }
}

class Tablet extends Electronics{

    @Override
    void displayPrice() {
        super.price = 100;
        super.displayPrice();
    }

    static void displayLabel(){
        Tablet.label = "Tablet";
        System.out.println("Tablet device label: ");
    }

    public static void main(String[] args) {

        Electronics electronics = new Tablet();
        electronics.displayPrice();
        electronics.displayLabel();

        List<? extends Electronics> list = new ArrayList<>();
        //list.add(electronics);

        List<String> list1 = Arrays.asList("Anup","Kirti","Akshay","Rahul","Dennis","Anup");

        List list2 = list1.stream().distinct().collect(Collectors.toList());

        List list3=list1.stream().sorted( (s1,s2)-> s2.compareTo(s1)).distinct().map(s->s.toUpperCase()).collect(Collectors.toList());

        System.out.println(list3);

        /*List<Employee1> employeeList =Arrays.asList(new Employee1("Anup", 4000),
                new Employee1("Akshay", 3000.0),
                new Employee1("Don", 5000.0),
                new Employee1("Ram", 8000.0),
                new Employee1("Kedar", 6000.0));

        List list4 =employeeList.stream().sorted((e1,e2) -> (int) (e1.getSalary() - e2.getSalary())).collect(Collectors.toList());

        System.out.println(list4);*/

        Optional optional = Optional.ofNullable(2);

        if(optional.isPresent()){
            System.out.println("not Null");
        }

        Optional of = Optional.of(12);

        if(of.isPresent()){
            System.out.println(of.get());
        }



    }
}

class Employee{

    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class MyString{
    private String val;
    MyString(String val){
        this.val = val;
    }
/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyString myString = (MyString) o;
        return Objects.equals(val, myString.val);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val);
    }*/

    public static void main(String[] args) {

        String str1 = new String("Java Opps!");
        String str2 = new String("Java Opps");
        String str5 = new String("Java Opps");
        Map<String, Integer> map1 = new HashMap<>();
        map1.put(str1, new Integer(10));
        map1.put(str2, new Integer(20));
        map1.put(str5,new Integer(30));
        System.out.println(map1.size());
        Map<MyString, Integer> map2 = new HashMap<>();
        MyString str3 = new MyString(str1);
        MyString str4 = new MyString(str2);
        MyString str6 = new MyString(str5);
        map2.put(str3, new Integer(10));
        map2.put(str4, new Integer(20));
        map2.put(str6,new Integer(30));
        System.out.println(map2.size());

        System.out.println(map1.get(str2));
        System.out.println(map2.get(str4));

        int[] arr = {3,6,9,5};
        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(arr[0]);
        arrayList.add(arr[2]);

        arrayList.set(1,arr[0]);
        arrayList.set(1,arr[1]);

        arrayList.remove(0);
        arrayList.add(arr[0]);

        System.out.println(arrayList);

        LinkedList<String> list = new LinkedList<>();
        list.add("weew");
        list.add("asdasd");
        list.add("fsdfds");

        //Collections.swap(list,1,3);

        //System.out.println(list);

        Stream<double[]> hackval = IntStream.rangeClosed(1,100).boxed().flatMap(a -> IntStream
                .rangeClosed(a,10)
                .mapToObj(
                        b -> new double[]{a,b,Math.sqrt(a*a+b*b)}
                ).filter(t -> t[2]%1==0));

        hackval.limit(5)
                .forEach(t -> System.out.println(t[0]+","+t[1]+","+t[2]));

    }


}