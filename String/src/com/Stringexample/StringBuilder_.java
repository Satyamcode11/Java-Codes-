package com.Stringexample;


/** String Builder provide us a mutable sequence of character
//It is allow modification of sequence of character without creating a new objects,
// Making memory efficent and faster for frequent string operation.

// String Builder is not Synchronized, so it perform better in single threaded applications.
// It provides similar functionality of String Buffer,but without thread safety.
//That's Why it's prefer over string Buffer.*/

public class StringBuilder_ {
    public static void main(String_[] args) {
       StringBuilder sb = new StringBuilder("Satyam");
       sb.append(" Moharana");//append add after the string
        System.out.println(sb);

        sb.insert(0,"Mr.");// Insert in offset string is Mr.
        System.out.println("After insert: " + sb);

//      System.out.println("After Reverse: " + sb.reverse());Reverse the string

        System.out.println(sb.capacity());// Default capacity is 16.
        System.out.println(sb.length());// How many character are in the string.

        System.out.println(sb.charAt(5));//find which character is in index 5

        sb.setCharAt(5,'D');//set character at index 5 and the substring is D
        System.out.println(sb);


        System.out.println(sb.substring(6,11)); //Start index 6 to go 11 character
        System.out.println(sb.indexOf("m")); //Find the character in which index

        System.out.println(sb.toString());// convert to string








    }
}
