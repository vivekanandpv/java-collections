package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //  A Set is an unordered collection of unique elements
        //  Set<E> is the interface for set data structures
        //  There are 3 primary implementations:
        //      HashSet, LinkedHashSet, TreeSet

        Set<Integer> integerSet = new HashSet<>();
        Set<Integer> integerSet1 = new LinkedHashSet<>();
        Set<Integer> integerSet2 = new TreeSet<>();

        //  Set<E>: https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Set.html

        //  Index based operations are not supported
        //  But see the TreeSet<E>: https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/TreeSet.html

        //  Actions: Mutators
        integerSet.add(100);
        integerSet.remove(0);   // 0 here is an object
        integerSet.addAll(List.of(1, 2, 3, 4));

        //  Actions: Enquirers
        int size = integerSet.size();
        boolean contains200 = integerSet.contains(200);
        boolean isEmpty = integerSet.isEmpty();

        //  Actions: Iterator
        //  Do not write code that is dependent on the order (except TreeSet as implementation)
        for(Integer i: integerSet) {
            System.out.println("Element: " + i);
        }
    }
}
