package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        //  Utility static methods: since Java 9
        //  Immutable (unmodifiable) list of up to 10 items
        List<Integer> integerList = List.of(0, 10, 8, 7, 11, 12, 5, 4, 25);

        //  Immutable (unmodifiable) set of up to 10 items
        Set<Integer> integerSet = Set.of(0, 10, 8, 7, 11, 12, 5, 4, 25);

        //  Immutable (unmodifiable) map of up to 10 pairs
        Map<String, Double> map = Map.of("pi", 3.1415, "e", 2.71828);

        //  Sorting
        //  1. Using Java 8 Stream API
        List<Integer> sortedList = integerList
                .stream()   //  create stream
                .sorted()   //  sort
                .collect(Collectors.toList());  //  collect

        System.out.println("----------- Natural Sort -----------");
        for(Integer i: sortedList) {
            System.out.println(i);
        }

        //  2. Customizing sort order using stream API
        List<Integer> reverseSortedList = integerList
                .stream()   //  create stream
                .sorted((a, b) -> b - a)   //  sort
                .collect(Collectors.toList());  //  collect

        System.out.println("----------- Reverse Sort -----------");
        for(Integer i: reverseSortedList) {
            System.out.println(i);
        }

        //  3. Using algorithms from Collections API
        Collections.sort(reverseSortedList);
        System.out.println("----------- Natural Sort (of reversed) -----------");
        for(Integer i: reverseSortedList) {
            System.out.println(i);
        }

        //  4. Customizing the Collections API algorithm
        Collections.sort(sortedList, Collections.reverseOrder());
        System.out.println("----------- Reverse Sort - Algorithm (of sorted) -----------");
        for(Integer i: sortedList) {
            System.out.println(i);
        }

        //  4. Customizing the Collections API algorithm using custom comparator
        Collections.sort(sortedList, (a, b) -> a.compareTo(b));
        System.out.println("----------- Natural Sort - Custom (of reverse sorted) -----------");
        for(Integer i: sortedList) {
            System.out.println(i);
        }

        //  5. List<E> sort
        sortedList.sort((a, b) -> b.compareTo(a));
        System.out.println("----------- Reverse Sort - List.sort -----------");
        for(Integer i: sortedList) {
            System.out.println(i);
        }

        //  Search
        System.out.println("----------- Search -----------");
        int indexOf10 = sortedList.indexOf(10); //  -1 if not found
        System.out.println("10 is found at: " + indexOf10);

    }
}
