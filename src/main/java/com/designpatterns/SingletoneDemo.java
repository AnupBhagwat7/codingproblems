package com.designpatterns;

public class SingletoneDemo {

    private static final SingletoneDemo singletoneInstance = new SingletoneDemo();

    private SingletoneDemo(){

    }

    public static SingletoneDemo getSingletoneInstance(){

        return singletoneInstance;
    }

    public static void main(String[] args) {

        SingletoneDemo singletoneDemo1 = getSingletoneInstance();

        SingletoneDemo singletoneDemo2 = getSingletoneInstance();

        System.out.println(singletoneDemo1.hashCode());
        System.out.println(singletoneDemo2.hashCode());
    }
}
