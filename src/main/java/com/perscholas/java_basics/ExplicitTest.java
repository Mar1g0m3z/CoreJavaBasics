package com.perscholas.java_basics;

public class ExplicitTest {
    public static void main(String[] args){
//      convert larger data types to a smaller one.
//      implicit:  the process of converting lower data types into higher data types is called widening or narrowing conversion
        double d = 100.04; //double type
//        explicit type casting
//        manually converting larger types to smaller (double to int) which can lead to data loss

        long l = (long)d; //double to long (manual conversion)
        int i = (int)l; //long to int
        System.out.println("Double value: " + d); //100.04
        System.out.println("Long value: " + l); //100
        System.out.println("Int value: " + i);//100

        byte b;
        int z = 275;
        double dou = 323.142;
        System.out.println("Conversion of in to byte");
        b = (byte) z; //int to byte
        System.out.println("z = " +z + "b = " + b); //z = 275, b = 19
//        b, the byte now only has a range of -128 to 127 which is a span of 256 values.
//        java does overflow: result = intvalue % 256
//        275%256 = 19
//        275 - 256 = 19 and thus the byte value is 19.
        System.out.println("Coversion of double to in.");
        z = (int) dou;//double t0 intÎ
        System.out.println("dou = " + dou + " b = " + z);

        System.out.println("Conversion of double to byte");
        b = (byte) dou; //double to byte
        System.out.println("dou = " + dou + " b = " + b);
    }
}
