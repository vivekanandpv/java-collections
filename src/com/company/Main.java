package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //  Array is the most basic data structure that is implemented
        //  directly by the language. This as close to the machine as possible.
        //  But this is fixed in size (cannot grow and shrink). The size of the array
        //  has to be a compile-time constant. Array is non-generic

        int[] intArray = {0, 1, 2, 3, 4};

        //  We obviously want the performance of raw array, but we also want:
        //  1. dynamic size
        //  2. generic support
        //  3. convenient API for element manipulation

        //  There are two candidate data-structures: ArrayList and LinkedList
        //  ArrayList elements are in contiguous blocks in memory, hence providing
        //  faster index-based access. As the consequence right-shift and left-shift
        //  operations are inefficient. LinkedList in inefficient in random-access
        //  but efficient in addition/removal.

        //  In Java collection API, we do not program to classes, but to interfaces.
        //  Therefore, whether ArrayList or LinkedList, we use the List<E> interface.

        List<Integer> integerList1 = new ArrayList<>();
        List<Integer> integerList2 = new LinkedList<>();

        //  List<E>: https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/List.html

        //  Actions: Mutators
        integerList1.add(100);
        integerList1.remove(0);
        integerList1.addAll(List.of(1, 2, 3, 4));
        integerList1.add(2, 200);

        //  Actions: Enquirers
        int a = integerList1.get(0);    //  safe?
        int b = integerList1.indexOf(200);  //  200 is now of Integer type
        int size = integerList1.size();
        boolean contains200 = integerList1.contains(200);

        //  Actions: Iterator
        for(Integer i: integerList1) {
            System.out.println("Element: " + i);
        }
    }
}
