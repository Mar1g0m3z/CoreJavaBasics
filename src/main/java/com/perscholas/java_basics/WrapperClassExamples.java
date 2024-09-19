package com.perscholas.java_basics;

public class WrapperClassExamples {
    public static void main(String[] args){
        byte b = 100; //primitive
        Byte bb = 100; //object type
        short s = 100;
        Short ss = 100;
        int i = 100;
        Integer ii = 100;
//        Integer iii = Integer.valueOf(1000);
        long l = 100L;
        Long ll = 100L;
        float f = 100.0f;
        Float ff = 21.24f;
        double d = 100.01;
        Double dd =  434.224;
        char ch = 'a';
        Character cha = 'a';
        boolean bo = true;
        Boolean boo = true;

//        autoboxing
        int a = 20; //a variable using an inbuilt primitive type
        Integer convertIntoInteger = a; //integer object
        char c = 'A';
        Character convertIntoCharacter = c;

        double ddd = 562.23;
        Double convertIntDouble = ddd;

//        unboxing: object to primitive
        Integer i2 = 56;
        int ii2 = i2;
        Character c2 = 'a';
        char ch2 = c2;

        Double d2 = 2563.32;
        double dd2 = d2;

    }
}
