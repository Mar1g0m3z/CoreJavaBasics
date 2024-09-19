package com.perscholas.java_basics;

import java.util.Scanner;

public class ControlDecisionDemo {
    public static void main(String[] args){
//        control flow statments: if , if ... else, if...else if...else, switch

//        int num1, num2;
//        num1 = 100;
//        num2 = 200;
//        if(num1 == num2){ //two equal signs for comparison
//            System.out.println(num1 + "is equal to " + num2);
//        } else {
//            System.out.println("No they are not the same");
//        }

//        Multiway if statement:
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter an integer: ");
//        num1 = sc.nextInt();
//        if(num1%2 == 0){
//            System.out.println("even");
//        } else {
//            System.out.println("odd");
//        }
//        if(num1 < 0){
//            System.out.println("less than 0");
//        } else if(num1 > 0){
//            System.out.println("greter than 0");
//        } else{
//            System.out.println("is equal to 0");
//        }

//        nested decision statements:
//        check age: if <18 the price is 5 dollars
//        if <= 18 20 dollars
//          if 65 >= they get 5% discount

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = sc.nextInt();
        double price = 0, discount = 0.05;
        if(age < 18){
            price = 5.00;
        } else {
            price = 10.00;
            if(age >= 65){
                price = price - (price * discount);
            }
        }
    }
}
