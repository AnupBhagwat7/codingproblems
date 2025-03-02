package com.threads;

import java.util.concurrent.*;

public class ThreadPoolMonitor {
    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                2, 4, 10, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(2),
                new ThreadPoolExecutor.AbortPolicy()  // Rejection handler
        );

        Runnable task = () -> {
            try {
                System.out.println(Thread.currentThread().getName() + " is executing.");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        for (int i = 0; i < 6; i++) {
            try {
                executor.execute(task);
            } catch (RejectedExecutionException e) {
                System.out.println("Task Rejected: " + i);
            }
        }

        Thread.sleep(1000); // Wait a bit before checking

        System.out.println("Active Threads: " + executor.getActiveCount());
        System.out.println("Total Threads in Pool: " + executor.getPoolSize());
        System.out.println("Is Shutdown: " + executor.isShutdown());
        System.out.println("Is Terminated: " + executor.isTerminated());

        executor.shutdown(); // Graceful shutdown
    }
}

