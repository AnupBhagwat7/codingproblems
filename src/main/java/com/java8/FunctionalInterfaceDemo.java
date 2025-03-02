package com.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Supplier;

@FunctionalInterface
interface MyInterface{
    void sayHello();
}
public class FunctionalInterfaceDemo {

    public static void main(String[] args) {

        MyInterface myInterface = () -> System.out.println("Hello world");
        myInterface.sayHello();

        // 1.Reference to a Static Method
        Function<Integer, Double> sqrtLambda = (num) -> Math.sqrt(num);
        System.out.println(sqrtLambda.apply(16));  // Output: 4.0

        Function<Integer, Double> sqrtMethodRef = Math::sqrt;
        System.out.println(sqrtMethodRef.apply(16));  // Output: 4.0

        //2. Reference to an Instance Method
        Consumer<String> printLambda = (message) -> System.out.println(message);
        printLambda.accept("Hello!");

        Consumer<String> printMethodRef = System.out::println;
        printMethodRef.accept("Hello!");

        //3. Reference to an Instance Method of an Arbitrary Object
        Function<String, Integer> lengthLambda = (str) -> str.length();
        System.out.println(lengthLambda.apply("Java"));  // Output: 4

        Function<String, Integer> lengthMethodRef = String::length;
        System.out.println(lengthMethodRef.apply("Java"));

        //4.  Reference to a Constructor
        Supplier<List<String>> listLambda = () -> new ArrayList<>();
        List<String> list1 = listLambda.get();

        Supplier<List<String>> listMethodRef = ArrayList::new;
        List<String> list2 = listMethodRef.get();
    }
}
