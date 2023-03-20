package com.other;

class Hello implements Cloneable{

    static int count;

    int x;

    public Hello(int x) {
        this.x = x;
        count++;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "x=" + x +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        Hello hello = new Hello(1);
        System.out.println(Hello.count);
        Hello hello1 = new Hello(1);
        Hello hello2 = new Hello(1);
        Hello hello3 = new Hello(1);

        System.out.println(Hello.count);
        System.out.println(hello.x +" "+ hello1.x+" "+ hello2.x+" "+ hello3.x);

        Hello hClone = (Hello) hello1.clone();

        hClone.x = 10;

        System.out.println(hello1 +"  "+hClone);
    }
}
public class StaticDemo {
}
