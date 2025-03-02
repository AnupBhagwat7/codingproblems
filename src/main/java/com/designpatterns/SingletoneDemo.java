package com.designpatterns;

public class SingletoneDemo {

    private static final SingletoneDemo singletoneInstance = new SingletoneDemo();

    private static SingletoneDemo singletoneInstance1;
    private SingletoneDemo(){

    }

    //Way 1
    public static SingletoneDemo getSingletoneInstance(){

        return singletoneInstance;
    }

    //Way 2
    public static SingletoneDemo getSingletoneInstance1(){

        if(singletoneInstance1 == null){

            synchronized (SingletoneDemo.class){
                if(singletoneInstance1 == null){
                    singletoneInstance1 = new SingletoneDemo();
                }
            }

        }
        return singletoneInstance1;
    }
    public static void main(String[] args) {

        SingletoneDemo singletoneDemo1 = getSingletoneInstance();

        SingletoneDemo singletoneDemo2 = getSingletoneInstance();

        System.out.println(singletoneDemo1.hashCode());
        System.out.println(singletoneDemo2.hashCode());

        singletoneInstance1 = getSingletoneInstance1();
        System.out.println(singletoneInstance1.hashCode());
        singletoneInstance1 = getSingletoneInstance1();
        System.out.println(singletoneInstance1.hashCode());
    }
}
