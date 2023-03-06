package com.threads;

public class WaitState {

    public void WaitingThread(){

        new Thread( () -> {

            Thread t1 = Thread.currentThread();

            Thread t2 = new Thread(()-> {

                try {
                    Thread.sleep(2000);
                    System.out.println("Waiting thread t1: "+ t1.getState());


                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            t2.start();
            try {
                t2.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }

    public static void main(String[] args) {
        WaitState waitState = new WaitState();
        waitState.WaitingThread();;
    }
}
