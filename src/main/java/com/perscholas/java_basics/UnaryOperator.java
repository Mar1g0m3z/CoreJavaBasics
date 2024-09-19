package com.perscholas.java_basics;

public class UnaryOperator {
    public static void main(String[] args){
        int sum = +1;
//        sum is now 1
        System.out.println(sum);

        sum--;
//        sum is now 0;
        System.out.println(sum);

        sum++;
//        sum is now 1
        System.out.println(sum);

        sum = -sum;
//        sum is now -1
        System.out.println(sum);
        boolean result = false;

        System.out.println(result); //false

        System.out.println(!result); //true
        int a = 1,b = 10, c = 0;
//
        c= ++b;
        System.out.println(c);
        System.out.println(b);

    }
}
