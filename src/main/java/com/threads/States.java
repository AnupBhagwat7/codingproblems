package com.threads;

public class States {

    public static void main(String[] args) {
        //New state
        newThread();

        //Runnable state
        runnableThread();

    }

    public static void newThread(){

        Thread newT = new Thread(() -> {});

        System.out.println("Thread in new state "+ newT.getState());

    }

    public static void runnableThread(){

        Thread runnableT = new Thread(() -> {});
        runnableT.start();

        System.out.println("Thread in new state "+ runnableT.getState());

    }
}
