package com.example;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class cwh_02_Set {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(Arrays.asList(1, 2, 3));
        System.out.println(numbers);

        Set<Integer> numbers2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));
        System.out.println(numbers2);
        numbers.addAll(numbers2);

        //To traversing elements in hashset
        Iterator<Integer> iterator = numbers2.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
