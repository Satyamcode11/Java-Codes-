package com.example;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Iterator;

public class cwh_04_Deque {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        //Offer Method
        deque.offer("Java");
        deque.offerLast("Kotlin");
        deque.offerFirst("Python");
        System.out.println(deque);

        //Add Method
        deque.addLast("C++");
        System.out.println(deque);

        //Poll First & Last method
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());

        //To traversing an elements
        Iterator<String> iterator = deque.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //peek & poll method
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        deque.removeAll(deque);
        System.out.println(deque);

        System.out.println(deque.peek()); // If deque is empty then it give us null.
        System.out.println(deque.getFirst());// If deque is empty then it give us an exception called NoSuchElementException
      System.out.println(deque.contains("Java"));
      System.out.println(deque.isEmpty());

    }
}
