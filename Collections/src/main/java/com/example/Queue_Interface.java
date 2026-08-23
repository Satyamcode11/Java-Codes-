package com.example;

import java.sql.SQLOutput;
import java.util.*;

public class Queue_Interface {
    public static void main(String[] args) {
//        Queue<String> queue = new LinkedList<>();
//        Queue<String> queue1 = new ArrayDeque<>();
//        Queue<String> queue2 = new PriorityQueue<>();
//
//
//        queue.add("Java");
//        queue.add("Python");
//        queue.add("Kotlin");
//
//
//        System.out.println(queue.peek());//here peek() return the head elements
////        System.out.println(queue.poll());//here poll() is remove java
//
//        System.out.println(queue.remove());
//        System.out.println(queue);
//        System.out.println(queue.contains("Kotlin"));
//        System.out.println(queue.isEmpty());
//
//        queue1.offer("Satyam");
//        queue1.offer("middle Name");
//        queue1.offer("Moharana");
//        System.out.println(queue1.peek());//here peek() return the head elements
////        System.out.println(queue.poll());//here poll() is remove java
//
//        System.out.println(queue1.remove());
//        System.out.println(queue1);
//        System.out.println(queue1.contains("Kotlin"));
//        System.out.println(queue1.isEmpty());





//        ? Dequeue in java
//
        Deque<Integer> deque = new LinkedList<>();
        Deque<Integer> dequeInteger = new ArrayDeque<>();

        deque.add(0);
        deque.addFirst(1);
        deque.addLast(2);

        System.out.println(deque);
//        System.out.println(deque.peekFirst());
//        System.out.println(deque.peekLast());
//        deque.getFirst();
        System.out.println(deque.getLast());



        dequeInteger.offer(10);
        dequeInteger.offerFirst(20);
        dequeInteger.offerLast(30);

        System.out.println(dequeInteger);
//        System.out.println(dequeInteger.peekFirst());
//        System.out.println(dequeInteger.peekLast());

//        System.out.println(dequeInteger.pollFirst());
//        System.out.println(dequeInteger.pollLast());
//        System.out.println(dequeInteger.poll());
        System.out.println(dequeInteger);
        System.out.println(dequeInteger.isEmpty());
        System.out.println(dequeInteger.getFirst());

    }
}
