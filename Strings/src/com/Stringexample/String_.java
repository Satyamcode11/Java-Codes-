package com.Stringexample;

import java.util.Arrays;

public class String_ {
    public static void main(java.lang.String[] args) {
        String string1 = "Hello!"; // Here directly providing the value of the string
        String string2 = "Hello!"; // These are string literals.

//        In java JVM maintains a string pool to share all of its strings inside the memory.
        System.out.println(string1.length());
        boolean result = string1.equals(string2) ;
        System.out.println(result);

        String str1 = new String("Hello");
        String str2 = new String("Hello");// New objects are created even through one same
        // content are present inside the memrory pool

        boolean result1 = str1==str2; //check the references of the  objects are equal or not
        boolean result2 = str1.equals(str2);// Check content of the string objects are equal or not
        System.out.println(result2);

       // To use all String Methods .............
       String str3 = new String("HELLO");
       String str4 = new String("WORLD");
       System.out.println(str3.contains("M")); //To check whether a substring are present or not.

       System.out.println(str4.substring(2,4)); //o/p : LL //Return substring from starting index
//      System.out.println(str.substring(12));//StringIndexOutOfBoundsException
//
        String joinresult = String.join(" * " , str3,str4);
        System.out.println(joinresult);//join String
//
        System.out.println(str3.charAt(1));// To check which char are present in this index

        //* getbyte();// to covert the string into an arrays of bytes.
        byte[] byteArray;
        byteArray = str3.getBytes();
        System.out.println(byteArray);// o/p is [B@7b23ec81 here array directly does not show content
        System.out.println(Arrays.toString(byteArray));//Array is convert to string to show content

//        byte[] bytearray = str2.getBytes();
//        System.out.println(Arrays.toString(bytearray));
//
        System.out.println(str4.indexOf("E"));//characters present in index
        String str5 = new String("   HELLO");
        System.out.println(str5.trim());
//
        String str6 = new String("HELLO world , how are you?");
        //Split(); //Breaks the string into an array of strings
        String[]str7 = str6.split(" ");
        for (String result3 : str7){
            System.out.print(result + ", ");
        }
        System.out.println();
        System.out.println(str4.toLowerCase());
        System.out.println(str4.toUpperCase());
        System.out.println(str4.hashCode());
        System.out.println(str4.hashCode());

        //Reverse the string.........
        //Using for loops
        String string = new String("Satyam");
        for (int i=string.length()-1; i>=0; i--){
            System.out.print(string.charAt(i)+ " ");
        }
        System.out.println();

        //using While loop
        int x = string.length()-1;
        while(x>=0){
            System.out.print(string.charAt(x)+ ", ");
            x--;
        }


    }
}