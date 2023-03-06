package com.interview;

public class InterfaceImplementation implements I1,I2,Runnable{

    public static void main(String[] args) {
        InterfaceImplementation i1 = new InterfaceImplementation();
        //i1.m1();
        i1.m2();

        //I2 i2 = new InterfaceImplementation();
        //i2.m1();

        i1.m3();
        Thread t = new Thread(new InterfaceImplementation());
        //t.start();


    }

    @Override
    public void m1() {
        System.out.println("Hello from I1");
    }

    @Override
    public void m2() {
        I2.super.m2();
    }

    public void m3(){
        System.out.println("Hello from I2 of static");
    }

    @Override
    public void run() {
        for (int i=0;i<8;i++){
            System.out.println(i);
        }
    }
}
