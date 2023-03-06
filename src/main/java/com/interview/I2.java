package com.interview;

public interface I2 {

    void m1();

    default void m2(){
        System.out.println("Hello from I2");
    }

    static void m3(){
        System.out.println("Hello from static I2");
    }
}
