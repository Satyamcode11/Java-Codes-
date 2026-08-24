package com.example;

import java.util.*;


public class cwh_01_List {
    public static void main(String[] args) {

        //I am able to  create this because
        // Arraylist is a class who implements the List interface ...

        List<String>list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");
        System.out.println("The programming languages are: " + list);

        //Accessing using Enhanced for loop
        for(String language: list){
        System.out.println(language);
        }

      //Accessing an elements using get().
        System.out.println(list.get(1));

        //Change the arraylist elements
        list.set(2,"Kotlin");
        System.out.println(list);

        //To know the size
        System.out.println(list.size());

         //Provides a comparator that sorts elements in reverse of their natural ordering.
        list.sort(Comparator.reverseOrder());
        System.out.println(list);

        //ArrayList isEmpty();...........
        System.out.println(list.isEmpty());

        //To convert the arraylist to array.........

        String [] arr = new String[list.size()];
        list.toArray(arr);
        System.out.print("Array: ");

        for(String lang: arr){
            System.out.print(lang + ", ");
        }
        System.out.println();

        //To convert Array to ArrayList
        String [] str = {"Java", "Python","Kotlin"};

        ArrayList<String> languages = new ArrayList<>(Arrays.asList(str));
        System.out.println("The ArrayList: " + languages);

        //! linked list

         LinkedList<String> li = new LinkedList<>();
         li.add("Previous");
         li.add("Now");
         li.add("Next");
         System.out.println(li);

         li.add(3,"After Next");
         System.out.println(li);

         System.out.println(li.get(1));

          li.set(2,"JAVA");
          System.out.println(li);

       // ! Stack
         Stack<String> st = new Stack<>();
         st.push("Java");
         st.push("Python");
         st.push("C++");
         st.push("Kotlin");

         System.out.println(st);

         String result= st.pop();
         System.out.println("The remove elements are : " + result); // Kotlin

         int result1 = st.search("kotlin"); // -1 we get
         System.out.println(result1);
         System.out.println(st.isEmpty()); //false
         System.out.println(st.get(2)); //C++
    }
}