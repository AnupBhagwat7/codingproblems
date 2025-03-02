package com.threads;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

/*
How Many Threads Are Used in a Parallel Stream?
By default, Java's parallel stream uses the ForkJoinPool.commonPool, which typically has a number of threads equal to the number of available processor cores.

The default number of threads in the common pool is Runtime.getRuntime().availableProcessors() - 1.
If the system has 8 CPU cores, then the parallel stream will use 7 threads.
The ForkJoinPool ensures that multiple tasks execute in parallel, distributing the work efficiently.
How Parallel Stream Works Internally?
Parallel streams work by dividing the data source into multiple chunks and processing them concurrently using the Fork/Join framework.

1. Splitting Phase (Spliterator)
The data source (List, Set, Array, etc.) is divided into subtasks.
Uses Spliterator to break the data into smaller pieces.
2. Parallel Execution (ForkJoinPool)
Subtasks are distributed across multiple threads.
Each thread processes a portion of the data.
Uses work-stealing to ensure that idle threads pick up remaining tasks.
3. Merging Phase
Processed results from different threads are combined.
If a terminal operation like collect() is used, the results are merged before returning.
 */

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D", "E", "F");

        list.parallelStream().forEach(s -> {
            System.out.println(Thread.currentThread().getName() + " - Processing: " + s);
        });
    }
}

//    Customizing Parallel Stream Threads

class CustomParallelStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        ForkJoinPool customPool = new ForkJoinPool(3); // Limit to 3 threads

        customPool.submit(() ->
                numbers.parallelStream().forEach(n ->
                        System.out.println(Thread.currentThread().getName() + " - " + n)
                )
        ).join();

        customPool.shutdown();
    }
}
