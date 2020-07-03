package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //  A collection is an object that holds objects of specified types
        //  according to certain rules called invariants.
        //  One fundamental aspect of any collection is the iterability.
        //  This allows us to iterate over all elements.
        //  Thus, Iterable<T> is the basic interface for collections
	    Iterable<?> iterable = List.of(0, 1, 2, 3, 4, 5);

	    //  This flavour of for loop, called iterator loop or for-each loop
        //  (not to be confused with .forEach() method)
        //  was added in Java 5. It works with any implementation of Iterable<T>.
        //  As it happens, all collections implement Iterable<T>.
        for (Object el: iterable) {
            System.out.println("Type: " + el.getClass().toString() + "; value: " + el);
        }
    }
}
