package com.interview;

public interface I1 {

    void m1();

    default void m2(){
        System.out.println("Hello from I1");
    }

    static void m3(){
        System.out.println("Hello from static I1");
    }
}
