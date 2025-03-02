package com.threads;

class Test implements Runnable{

    private int num ;

    public Test(int num) {
        this.num = num;
    }

    public synchronized boolean test(){

        while(true){

        boolean flag = true;
        for(int i=2;i<num;i++){
            if(num%i == 0){
                flag = false;
            }
        }
        return true;
        }
    }

    @Override
    public void run() {
        test();
    }
}
public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new Test(777777));
        Thread t2 = new Thread(new Test(2));

        Thread.sleep(9000);
        t1.start();
        System.out.println("T1 is in "+ t1.getState());

        t2.start();
        System.out.println("T2 is in "+ t2.getState());
    }
}
