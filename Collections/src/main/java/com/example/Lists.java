package com.example;

import java.util.*;


public class Lists {
    public static void main(String[] args) {

        //I am able to  create this because
        // Arrsylist is a class who implements the List interface ...
//
//        List<String>list = new ArrayList<>();
//        list.add("Java");
//        list.add("Python");
//        list.add("C#");
//        System.out.println("The programming languages are: " + list);
//        for(String language: list){
//        System.out.println(language);
//        }

//      ArrayList<String>languages = new ArrayList<>();
//
//      //This is the add section of the array list
//      languages.add("Java");
//      languages.add("Python");
//      languages.add("c++");
//      System.out.println("The languages are: " + languages );


      //To access the array list elements
//      String str = arr.get(0);
//        System.out.println(str);

        //Change the arraylist elements
//        arr.set(2,"Kotlin");
//        System.out.println(arr);

        //To remove arraylist
//        arr.removeAll(arr);
//        System.out.println(arr);

//        arr.remove(1);
//        System.out.println(arr);

//        arr.clear();
//        System.out.println(arr);

//        System.out.println(arr.size());
//
//        arr.sort(Comparator.reverseOrder());
//        System.out.println(arr);
//        arr.sort(Comparator.reverseOrder());
//        System.out.println(arr);


        //Arraylist contains......
//        System.out.print("Is kotlin is available in the arraylist: ");
//        System.out.print(arr.contains("kotlin"));

//        ArrayList isEmpty();...........
//    System.out.println(arr.isEmpty());

//To convert the arraylist to array.........

//        String [] arr = new String[languages.size()];
//        languages.toArray(arr);
//        System.out.println("Array: ");
//        for(String lang: arr){
//            System.out.print(lang + ", ");
//        }
//        System.out.println();
//        String [] arr1 = {"Java", "Python","Kotlin"};
//        System.out.println("Array: ");
//        for(String lang1 : arr1){
//            System.out.print(lang1 + " ");
//        }
//        System.out.println();
//        ArrayList<String> languages1 = new ArrayList<>(Arrays.asList(arr1));
//        System.out.println("The ArrayList: " + languages1);

//        ArrayList <String>lang3 = new ArrayList<>(Arrays.asList("java","Python"));
//        System.out.println(lang3);
//
//        //Convert to string
//        String str = lang3.toString();
//        System.out.println(lang3);

//        ? linked list
//
//       LinkedList<String> li = new LinkedList<>();
//        li.add("Previous");
//        li.add("Now");
//        li.add("Next");
//        System.out.println(li);
//
////        li.add(3,"After Next");
////        System.out.println(li);
//
//        System.out.println(li.get(1));
//
//        li.set(2,"After NExt");
//        System.out.println(li);
//
//        String str=li.toString();
//        System.out.println(str);


//        //? Stack
//        Stack<String> st = new Stack<>();
//        st.push("Java");
//        st.push("Python");
//        st.push("C++");
//        st.push("Kotlin");
//
//        System.out.println(st);
//
//     String result= st.pop();
//      System.out.println("The remove elements are : " + result);
//
//        int result = st.search("kotlin");
//        System.out.println(result);
//        System.out.println(st.isEmpty());




//   !  ArrayList<Integer>num = new ArrayList<>(Arrays.asList(1,2,3,4,4));
//
//     int[] numbers = new int[num.size()];
//            for (int i = 0; i < num.size(); i++) {
//                    numbers[i] = num.get(i);
//
//            }
//            for (int numbers1: numbers){
//                    System.out.println(numbers1);
//            }


//iterator
       Deque<Integer> numbers = new ArrayDeque<>();

        numbers.offer(1);
        numbers.offer(2);
        numbers.offerFirst(22);
        numbers.offerLast(33);

        System.out.println(numbers);
//        System.out.println(numbers.get(2));

     Iterator<Integer> iterator = numbers.iterator();
     while(iterator.hasNext()){
        int num = iterator.next();
     }



    }
}