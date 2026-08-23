package com.ExceptionHamdling;


public class Try_Catch {
    public static void main(String[] args) {
      //Example : 1 (Without try catch Block)
//      int divideResult = 5/0;
//        System.out.println(divideResult);// Exception: ArithmeticException / by zero

        //Example : 2 (With try/Catch Block)
        try{
            int divideResult2 = 6/0;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage()); //Exception Catch here.
        }
        System.out.println("After exception Handling Message ");

    }
}