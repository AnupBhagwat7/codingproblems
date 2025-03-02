package com.threads;

import java.util.*;
import java.util.stream.Collectors;


// Solution to concurrent modification exception is CopyOnWriteArrayList which is
// a thread safe implementation of ArrayList
public class ConcurrentModificationDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println(Runtime.getRuntime().availableProcessors() - 1);
        // Creating a separate thread to modify the list while processing it in Stream API
        Thread modifierThread = new Thread(() -> {
            try {
                Thread.sleep(100); // Small delay to ensure stream processing starts
                numbers.add(6);  // Modifying the list concurrently
                System.out.println("Number 6 added concurrently!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        modifierThread.start();

        try {
            // Processing the list using Stream API
            List<Integer> result = numbers.stream()
                    .peek(n -> {
                        System.out.println("Processing: " + n);
                        try {
                            Thread.sleep(50); // Simulating delay in processing
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    })
                    .collect(Collectors.toList());

            System.out.println("Processed list: " + result);
        } catch (ConcurrentModificationException e) {
            System.out.println("ConcurrentModificationException caught!");
        }
    }
}

