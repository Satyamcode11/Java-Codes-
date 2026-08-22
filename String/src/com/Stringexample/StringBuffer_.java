package com.Stringexample;



/** String Buffer is provide us a mutable sequence of character without creating an object every time
  all methods of stringBuffer are Synchronized making it safe in multithreaded enviroments

 It is not ideal for single threaded application because
 there thread safety is unnecessary & it makes operations slower
 */
public class StringBuffer_ {
    public static void main(String_[] args) {
        StringBuffer sb = new StringBuffer("Satyam Moharana");
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
