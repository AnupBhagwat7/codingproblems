package com.datastructures;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
ConcurrentHashMap - Thread-Safe Alternative to HashMap
📌 Scenario:
You are building a real-time analytics system where multiple threads update a shared data store.
Solution: Use ConcurrentHashMap, which allows safe concurrent modifications without explicit synchronization.

✅ Why ConcurrentHashMap?
Thread-Safe: Multiple threads can modify it without explicit locks.
Better Performance: Uses segment-level locking instead of a global lock.
Methods like computeIfAbsent(), merge(), and putIfAbsent() make atomic updates easier.
 */
public class ConcurrentHashMapExample {

    private static ConcurrentHashMap<String, Integer> loginCount = new ConcurrentHashMap<>();
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Runnable task = () -> {
            for (int i=0;i<5;i++){
                incrementCount("user123");
            }
        };

        executorService.execute(task);
        executorService.execute(task);
        executorService.execute(task);

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.SECONDS);

        System.out.println("Final Login Count: " + loginCount);
    }

    private static void incrementCount(String user) {
        loginCount.merge(user, 1, Integer::sum);
    }
}
