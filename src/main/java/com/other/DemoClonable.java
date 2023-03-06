package com.other;

class Test{
    int x;
    int y;

    public Test(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Test() {

    }

    @Override
    public String toString() {
        return "Test{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}


//Shallow copy
class Test1 implements Cloneable{
    int a,b;
    Test t= new Test();

    public Test1(int a, int b,Test t) {
        this.a = a;
        this.b = b;
        this.t = t;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Test1{" +
                "a=" + a +
                ", b=" + b +
                ", t=" + t +
                '}';
    }
}

//Deep copy
class Test2 implements Cloneable{
    int a,b;
    Test t= new Test();

    public Test2(int a, int b,Test t) {
        this.a = a;
        this.b = b;
        this.t = t;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        Test2 test2 = (Test2) super.clone();

        //creating deep copy
        test2.t = new Test();
        test2.t.x = t.x;
        test2.t.y = t.y;

        return test2;
    }

    @Override
    public String toString() {
        return "Test1{" +
                "a=" + a +
                ", b=" + b +
                ", t=" + t +
                '}';
    }
}

public class DemoClonable {

    public static void main(String[] args) {

        Test1 t1 = new Test1(10,20, new Test(30,40));

        try {
            Test1 t2 = (Test1)t1.clone();

            t2.a = 100;
            t2.t.x = 300;
            System.out.println(t1.hashCode());
            System.out.println(t2.hashCode());
            System.out.println(t1);
            System.out.println(t2);

            //Deep copy
            Test2 t3 = new Test2(10,20, new Test(30,40));
            Test2 t4 = (Test2)t3.clone();

            t4.a = 100;
            t4.t.x = 300;
            System.out.println(t3.hashCode());
            System.out.println(t4.hashCode());
            System.out.println(t3);
            System.out.println(t4);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
