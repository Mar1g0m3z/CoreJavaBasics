package com.perscholas.java_basics;

public class MathDemo {
    public static void main(String[] args){
        System.out.println(Math.PI);
        System.out.println(Math.E); //base for the logarithmic functions

        int a = 10, b = -20;
        System.out.println(Math.abs(a)); //how far a number is from 0
        System.out.println(Math.abs(b)); //20
        System.out.println(Math.max(a,b)); //10
        System.out.println(Math.min(a,b));//-20
        double x = 20;
        double y = 4;
        System.out.println(Math.sqrt(y));
        System.out.println("Power of x and y is:" );
//        Math.ceil it returns the duble and rounds up to nearest integer
//        Math.floor doubles and rounds down
//        Math.rint returns double but finds the closest interger for these
//        Math.round() ysed to round of the decimal number to the nearest value
//        Math.random() generate integer number between 1 to 100
        int n1 = (int) (Math.random()* 100);
        int n2 = (int) (Math.random()* 100);

        System.out.println(n1);
        System.out.println(n2);

        int min = 100;
        int max = 1000;
        int range = (max-min) + 1;
//        generate floating-point number b/w 100 to 1000
        double d1 = Math.random()*range + min;
        int n3 = (int)(Math.random() * range + min);
        System.out.println(d1);
        System.out.println(n3);

     }
}
