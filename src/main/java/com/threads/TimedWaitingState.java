package com.threads;

public class TimedWaitingState {

    public void timedWatingThread() throws InterruptedException {

        Thread t = new Thread(() -> {
            try {
                Thread.sleep(9000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t.start();

        //Thread.sleep(300);

        System.out.println("Thread t is in : "+ Thread.currentThread().getState());
    }

    public static void main(String[] args) throws InterruptedException {
        TimedWaitingState timedWaitingState = new TimedWaitingState();
        timedWaitingState.timedWatingThread();
    }
}
