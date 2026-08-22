package com.Stringexample;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class String_ {
    public static void main(java.lang.String[] args) {
//        String string = "Hello!"; // Here directly providing the value of the string
//        String string1 = "Hello!"; // These are string literals.

//        In java JVM maintains a string pool to share all of its strings inside the memory.
        //
//        System.out.println(string.length());
//        boolean result = string.equals(string1) ;
//        System.out.println(result);

//        String str = new String("Hello");
//        String str2 = new String("Hello");// New objects are created even through one same
        // content are present inside the memrory pool

//        boolean result1 = str==str2; //check the references of the  objects are equal or not
//        boolean result1 = str.equals(str2);// Check content of the string objects are equal or not
//        System.out.println(result1);

       // To use all String Methods .............
//        java.lang.String str = new java.lang.String("HELLO");
//        java.lang.String str2 = new java.lang.String("WORLD");
//        System.out.println(str.contains("M")); //To check whether a substring are present or not.
//
//        System.out.println(str.substring(2,4)); //o/p : LL //Return substring from starting index
////        System.out.println(str.substring(12));//StringIndexOutOfBoundsException
//
//        java.lang.String joinresult = java.lang.String.join(" * " , str,str2);
//        System.out.println(joinresult);//join String str * str 2;
//
//        System.out.println(str.charAt(1));// To check which char are present in this index

        //* getbyte();// to covert the string into an arrays of bytes.
//        byte[] byteArray;
//        byteArray = str.getBytes();
//        System.out.println(byteArray);// o/p is [B@7b23ec81 here array directly doesnot show content
//        System.out.println(Arrays.toString(byteArray));//Array is convert to string to show content


//        byte[] bytearray = str2.getBytes();
//        System.out.println(Arrays.toString(bytearray));
//
//        System.out.println(str.indexOf("E"));//characters present in index
//        java.lang.String str3 = new java.lang.String("   HELLO");
//        System.out.println(str3.trim());
//
//        java.lang.String str4 = new java.lang.String("HELLO world , how are you?");
//        //Split() //Breaks the string into an array of strings
//        java.lang.String[]str5 = str4.split(" ");
//        for (java.lang.String result : str5){
//            System.out.print(result + ", ");
//        }
//        System.out.println();
//        System.out.println(str.toLowerCase());
//        System.out.println(str4.toUpperCase());
//        System.out.println(str.hashCode());
//        System.out.println(str3.hashCode());

//! Q - What is the difference between String, StringBuffer & StringBuilder....


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