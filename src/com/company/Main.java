package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //  Map is also known as associated array or dictionary or hash-table
        //  In Java, Map<K, V> doesn't belong to Collection<E> interface family
        //  Nor does it belong to Iterable<E> family either
        //  A map cannot contain duplicate keys; each key can map to at most one value
        //  The Map interface provides three collection views,
        //  which allow a map's contents to be viewed as a set of keys,
        //  collection of values, or set of key-value mappings
        //  More info: https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Map.html

        //  Primary implementations:
        //      HashMap, LinkedHashMap, TreeMap

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new LinkedHashMap<>();
        Map<String, Integer> map3 = new TreeMap<>();


        //  The order of a map is defined as the order in which the iterators
        //  on the map's collection views return their elements.
        //  Some map implementations, like the TreeMap class,
        //  make specific guarantees as to their order;
        //  others, like the HashMap class, do not.

        //  Care must be exercised if mutable objects are used as map keys.
        //  The behavior of a map is not specified if the value of an
        //  object is changed in a manner that affects equals comparisons
        //  while the object is a key in the map.

        //  Actions: Mutators
        map1.put("one", 1);
        map1.remove("two");   // what do you think?
        map1.putAll(Map.of("a", 100,"b", 200));

        //  Actions: Enquirers
        int size = map1.size();
        boolean containsKeyOne = map1.containsKey("one");
        boolean containsValue100 = map1.containsValue(100);
        boolean isEmpty = map1.isEmpty();

        //  Getting keys and values separately
        Collection<Integer> valuesCollection = map1.values();
        Collection<String> keysCollection = map1.keySet();

        //  Actions: Iterator
        //  Do not write code that is dependent on the order (except TreeSet as implementation)
        for(String key: map1.keySet()) {
            System.out.println("Key: " + key +", Value: " + map1.get(key));
        }
    }
}
