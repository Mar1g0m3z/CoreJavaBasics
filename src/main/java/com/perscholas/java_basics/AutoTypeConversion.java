package com.perscholas.java_basics;

public class AutoTypeConversion {
    public static void main(String[] args){
        int x = 20;
        double y = 40.5;
        long p = 30;
        float q = 10.60f;
//        int z = x + y;(1) Error, cannot convert from double to int
        double z = x + y;  //can convert int to double
        System.out.println("Sum of two numbers: " + z);

//        Long r = p -q Error, cannot convert from float to long
        float r = p - q; //can convert long to float
System.out.println("Sub of two numbers " + r);
// java auto converts smaller data types (int, long, float) to larger data types (like double) in expressions.
//        hierachy byte- short- int- long - float -double
        int a = 10;
        double b = 5.5;
        double result = a + b; // `a` is promoted to `double` automatically
        System.out.println("Result: " + result); // Output: Result: 15.5
    }
}
