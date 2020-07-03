package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    //  Collection<E> is the mother of all collections except for Map
        //  Documentation: https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Collection.html
        //  Popular subinterfaces:
        //      List<E>, Set<E>, Queue<E>, etc.
        //  Popular implementations:
        //      ArrayList<E>, LinkedList<E>, HashSet<E>, etc.

        Collection<Integer> integerArrayList = new ArrayList<>();
        Collection<Integer> integerLinkedList = new LinkedList<Integer>();
        Collection<Integer> integerHashSet = new HashSet<>();
        Collection<Integer> integerQueue = new PriorityQueue<>();

        //  Some methods on Collection<E> may not be supported by the underlying type
        //  Collection<Integer> integerImmutableList = List.of(0, 1, 2, 3, 4);  //  this utility creates an immutable list
        //  integerImmutableList.add(100);  //  throws UnsupportedOperationException
    }
}
