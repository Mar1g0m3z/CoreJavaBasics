package com.perscholas.java_basics;

public class AssignmentOperatorsDemo {
public static void main(String[] args){
//    assigning Primitive Values
    int j,k;
    j = 10; //j is value of 10
    j = 5; // j ia noq rgw value 5, the previous value overwritten
    k = j; //k gets the value of 5
    System.out.println("j is : " + j);
    System.out.println("k is : " + k);

//    Multiple Assignment
    k = j = 10; // (k = (j=10)
    System.out.println("j is : " + j);
    System.out.println("k is : " + k);
}
}
