package com.example;

import java.util.*;

public class cwh_03_Queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
//        Queue<String> queue1 = new ArrayDeque<>();
//        Queue<String> queue2 = new PriorityQueue<>();
//
        queue.add("Java");
        queue.add("Python");
        queue.add("Kotlin");

        System.out.println(queue.peek());//here peek() return the head elements
        System.out.println(queue.poll());//here poll() is remove java

        System.out.println(queue);
        System.out.println(queue.contains("Kotlin"));
        System.out.println(queue.isEmpty());
//
//        queue1.offer("Satyam");
//        queue1.offer("middle Name");
//        queue1.offer("Moharana");
//        System.out.println(queue1.peek());//here peek() return the head elements
//        System.out.println(queue.poll());//here poll() is remove java
//
//        System.out.println(queue1.remove());
//        System.out.println(queue1);
//        System.out.println(queue1.contains("Kotlin"));
//        System.out.println(queue1.isEmpty());

    }
}
