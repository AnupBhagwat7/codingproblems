package com.threads;

public class TerminatedState {

    public static void main(String[] args) {

        TerminatedState terminatedState = new TerminatedState();
        try {
            terminatedState.terminateState();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void terminateState() throws InterruptedException {

        Thread t = new Thread(()-> {

        });
        t.start();
        Thread.sleep(1000);
        System.out.println(t.getState());
    }
}
