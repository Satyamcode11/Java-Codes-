package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class cwh_05_Map {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        System.out.println("Languages are: ");
        map.put(1,"Java");
        map.put(2,"Python");
        map.put(3,"Kotlin");
        System.out.println(map);

        //Traversing using Iterator
//        Iterator<Integer> iterator = map.keySet().iterator();//using KeySet.
//        Iterator<String> iterator = map.values().iterator();//Using Value.
        Iterator<Map.Entry<Integer,String>>iterator = map.entrySet().iterator(); //Using Both Key, Value pair.

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(map.get(3)); //Accessing an elements
        System.out.println(map.get(20)); //If there is no elements are present here then we got a null not an exception like in deque.
        System.out.println(map.hashCode());//Hashcode

    }
}
