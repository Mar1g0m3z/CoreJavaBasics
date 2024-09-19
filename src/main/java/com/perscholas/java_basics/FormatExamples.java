package com.perscholas.java_basics;

public class FormatExamples {
    public static void main(String[] args){
//        Format method from the System class:
        int i = 1024;
        byte b = 127;
        double d = 1.232, tiny = d /1000000.0;
        boolean bool = true;

        System.out.format("This is an integer: %d and this is a byte: %d.\r\n", i,b);
//        when you want to format an integer/whole number: %d.
        System.out.format("This is a double: %.4f and this is tiny: %4e.\r\n",d,tiny);
//        this is for decimals: .4 we want 4 decimal places
//        .4e = e is exponential, 4 as the limit
        System.out.format("And this is a string: %s","this is a string. \r\n");
//        after the %s: is the string you want to put in the placeholder

//        %n: a new line character
//        %08d%n = we want 8 characters and then new character


//printf() method:
        System.out.printf("hello, %s","Micheal");
        System.out.printf("hello, %s","jim");
        System.out.printf("hello, %s%n","Dwight");
        System.out.printf("hello, %s%n","jim");
        System.out.printf("hello,%s%n","Micharl");

//        String formal() method:
//        the objects to be used during formatiting
        String s = "Oer Scholas;";
        float n1 = 74.47f;
        String str1 = String.format("Company name is %s",s);
        String.format("my age is %.8f",n1);
    }
}
