package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        //  Problems with concurrency
        //  A collection is basically an data structure in memory.
        //  At certain junctures, when the allocated size exceeds,
        //  a new map has to be created with twice the size (generally)
        //  and the old data has to be copied.
        //  This means the put operation is not always atomic.
        //  If we keep on adding pairs to the map by several threads
        //  while some are writing and some are reading, during such resize
        //  operations either we get inconsistent data or outright exceptions

        //  Ways to resolve the thread-safety issue:
        //      1. synchronize the object
        //      2. synchronize the write operations

        //  We can synchronize the object with monitors or locks,
        //  but this is inefficient.

        //  Some helper methods from Collections:
        //      Collections.synchronizedList()
        //      Collections.synchronizedSet()
        //      Collections.synchronizedMap()
        //  More: https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Collections.html

        //  Special note: for maps, use: ConcurrentMap: https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/concurrent/ConcurrentMap.html

        //  One of the primary thread-safety issue is the inconsistent state caused by data-race
        //  We demonstrate it by producer-consumer problem

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        //  This list is not synchronized. Neither is it thread-safe.
        //  At some point in execution, the inconsistent state (list.size())
        //  ensues. Program stops executing, but doesn't exit.
        List<Integer> list = new ArrayList<>();

        executorService.submit(() -> {
            while (true) {
                if (list.size() == 0) {
                    System.out.println("Produce: 100");
                    list.add(100);
                }
            }
        });

        executorService.submit(() -> {
            while (true) {
                if (list.size() > 0) {
                    int size = list.size();
                    for (int i = 0; i < size; ++i) {
                        System.out.println("Consume: " + list.get(i));
                        list.remove(i);
                    }
                }
            }
        });

        //  Resolve this issue by using concurrency-optimized list
        //  List<Integer> list = Collections.synchronizedList(new ArrayList<>());
    }
}
