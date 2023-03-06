package com.threads;

public class BlockedState {

    public void blockedThread() throws InterruptedException {

        Thread t1 = new Thread(new SyncCode());
        Thread t2 = new Thread(new SyncCode());

        t1.start();
        Thread.sleep(2000);
        t2.start();
        Thread.sleep(2000);

        System.out.println(t1.getState()  +"  "+ t2.getState());
        System.exit(0);
    }

    public static void main(String[] args) throws InterruptedException {
        BlockedState blockedState = new BlockedState();
        blockedState.blockedThread();
    }

    private static class SyncCode implements Runnable{


        @Override
        public void run() {
            System.out.println("Thread "+Thread.currentThread().getName() +" is in run method");
            syncCode();
        }

        private synchronized void syncCode() {
            System.out.println("Thread "+Thread.currentThread().getName() +" is in sync method");
            while(true){
                //System.out.println(Thread.currentThread().getName());
            }
        }
    }
}


