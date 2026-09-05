package com.Practice;

import java.util.Scanner;

public class Elite_Practice {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int number = scanner.nextInt();


//        !Q1 :   System.out.println(number + " is no even or odd please enter number except zero");
//        if (number == 0){
//            System.out.println(number + " is no even or odd please enter number except zero");
//        } else if (number % 2 ==0) {
//
//            System.out.println(number + " is even");
//
//        }else System.out.println(number + " is odd ");

        //By using nested ternary operator
//        System.out.println(number  == 0 ? number + " is no even or odd please enter number except zero"
//                : number%2==0 ? number + " is even" : number + " is odd");


//       ! Q2 : check number is positive, negative or zero

//        using nested ternary operator
//        System.out.println(number > 0 ? number + " is positive" : number == 0 ? number + " is zero"
//                : number + " is negative");
//

//        !Q3 : Reverse a number
//        int reverse =0;
//        while (number !=0){
//            int digits = number%10;
//            reverse = reverse*10+digits;
//            number = number/10;
//
//        }
//        System.out.println(reverse);


//        !Q4: count digits

//        int count = 0;
//        while(number!=0){
//            count++;
//            number = number/10;
//        }
//        System.out.println("The digits are: " + count);

//      ! Q5: sum numbers
//        int sum =0;
//        while(number!=0){
//            int digit = number %10;
//            sum+=digit;
//            number /=10;
//        }
//        System.out.println("The total number is: " + sum);

//       ! Q6: Swap two numbers
//        System.out.print("Enter second number: " );
//        int number2  = scanner.nextInt();

//       int temp = number;
//       number = number2;
//       number2= temp;
//        System.out.println("The number1: " + number);
//        System.out.println("The number2 is: " + number2);


        //without using temp
//        number = number + number2;
//        number2 = number - number2;
//        number = number - number2;
//        System.out.println("The number1: " + number);
//        System.out.println("The number2: " + number2);

//      !  Q7 : Find Factorial

        int factorial = 1;
//        for (int i=1; i<=number;i++){
//            factorial *=i;
//        }
//        System.out.println("The factorial is: " + factorial);

//        using whille
//        int i=1;
//        while(i<=number){
//            factorial*=i;
//            i++;
//        }
//        System.out.println("The factorial is: " + factorial);

//        !Q8: check all the even number from 1 to 100;
//        for (int i = 0; i<=100;i++){
//            if (i%2==0){
//                System.out.println(i);
//
//            }
//        }

//        !Q9: check number is an Armstrong number or not
//        int number = 153;
//        int original = number;
//        int count = 0;
//        int sum = 0;

        //count number of digits
//        int temp = number;
//        while (temp > 0) {
//            count++;
//            temp /= 10;
//        }
//        System.out.println(count);

        //find the sum of the digits
//        temp = number;
//        while (temp > 0) {
//            int digits = temp % 10;
//            sum = sum + (int) Math.pow(digits, count);
//            temp /= 10;
//        }
//        System.out.println(sum);
//
//        if (sum== original){
//            System.out.println( original + " is an Armstrong number");
//        }else System.out.println( original + " is not an Armstrong number");




//        Approach : 2
//        while (number>0){
//            int digits = number%10;
//            sum += (digits * digits * digits);
//            number/=10;
//        }
//        if (sum== original){
//            System.out.println( original + " is Armstrong number");
//        }else System.out.println(original + " is not Armstrong");


//        !Q10: check number is palindrome number or not
//        int number = 1221;
//        int original = number;
//        int reverse =0;
//
//        while(number!=0){
//            int digits = number % 10;
//            reverse = reverse * 10 + digits;
//            number/=10;
//
//        }
//        if (reverse == original) {
//            System.out.println(reverse + " is a palindrome number");
//
//        }else System.out.println(reverse + " is not palindrome");


        //        !Q10: check number is prime number or not




    }

}
