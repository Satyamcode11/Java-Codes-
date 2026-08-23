package com.example;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPrac {
    public static void main(String[] args) {
//        Set<Integer> numbers = new HashSet<>(Arrays.asList(1,2,3));
//        System.out.println(numbers);
//        System.out.println();
//       Set<Integer>numbers2 = new HashSet<>(Arrays.asList(4,5,6,7,8));
//        System.out.println(numbers2);
//        System.out.println();
//
//        numbers.addAll(numbers2);
//        System.out.println(numbers);


        HashSet<Integer> points = new HashSet<>(Arrays.asList(1,2,4,5));
        System.out.println(points);

          //Union all
//        HashSet<Integer> points2 = new HashSet<>();
//        points2.addAll(points);
//        points2.add(3);
//        System.out.println(points2);

        //To accessing the elements in hashset
//        Iterator<Integer> iterator = points.iterator();
//       while (iterator.hasNext()){
//           System.out.print(iterator.next() + ", ");
//
//        }

        //Intersection
        HashSet<Integer> points2 = new HashSet<>(Arrays.asList(1,33,44,2,5,6,7,8));
        System.out.println(points2);

        points2.retainAll(points);
        System.out.println(points2);








    }
}
