package com.perscholas.java_basics;

public class LogicalOperatorsDemo {
    public static void main(String[] args){
        boolean x = true;
        boolean y = false;
        System.out.println("x & y :"+(x & y)); //bitwise checks both values
        System.out.println("x && y :"+(x && y));
        System.out.println("x | y :" +(x | y)); //bitwise checks both values
        System.out.println("x || y :"+(x ||y));
        System.out.println("x ^ y :"+(x ^ y)); //bitwise XOR only true if only ONE is true
        System.out.println("!x :" +(!x));
    }
}
