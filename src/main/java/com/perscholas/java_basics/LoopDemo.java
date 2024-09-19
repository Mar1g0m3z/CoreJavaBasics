package com.perscholas.java_basics;

public class LoopDemo {
    public static void main(String[] args){
// for loop
        for(int i = 0; i < 2; i++){
            System.out.println("Welcome to Guava");

        }
        System.out.println("Goodbye!");
//        Nested LOOPS: placement of one loop inside the body of another
//        the outer loop takes control of the nmber of repititions of the inner loop
//        any type of loop may be nested
//        --outer loop--
        for(int i = 1; i <=5; i++){
            System.out.println("Outer loop: " + i);
//            -- inner loop --
            for(int j = 1; j <=2; j ++){
                System.out.println("Inner Loop: " + j);

            }
        }
//        Enhanced for Loops:  for iterating through arrays and collections classes.any class implementing the iterable interface
//        for(dataType item : array){ statment ...}
    }
}
