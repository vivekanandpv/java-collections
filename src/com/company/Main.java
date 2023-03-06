package com.company;

import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Deque<Integer> stack = new LinkedList<>();

        //  stack api
        stack.push(1);
        stack.push(2);
        stack.push(3);

        //  LIFO
        for (int v : stack) {
            System.out.println("Stack: " + v);
        }

        //  3, because of LIFO
        int pop = stack.pop();

        Deque<Integer> queue = new LinkedList<>();

        //  queue api
        queue.add(1);
        queue.add(2);
        queue.add(3);

        //  FIFO
        for (int v : queue) {
            System.out.println("Queue " + v);
        }

        //  1, because of FIFO
        int element = queue.remove();
    }
}
