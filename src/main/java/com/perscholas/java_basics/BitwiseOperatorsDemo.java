package com.perscholas.java_basics;

public class BitwiseOperatorsDemo {
    public static void main(String[] args){
        int x = 58; //11010
        int y = 13; //1101
//        the bitwise AND & compares each bit of both variables, if both is 1 it results in one
//        x: 0011 1010
//        y: 0000 1101
//  results: 0000 1000
        System.out.println("x & y: " + (x & y)); // returns 8 = 100

//         the bitwise OR | compares each bit, if at least one of the bits is 1, it results in one
//        x: 0011 1010
//        y: 0000 1101
//  results: 0011 1111
        System.out.println("x | y : " + (x | y)); // 63 = 111111

//        the bitwise XOR ^ compares each bit. if the bits are different, the results are 1, else its 0
//        x: 0011 1010
//        y: 0000 1101
//  results: 0011 0111
        System.out.println("x ^ y :" + (x ^ y)); // 55 = 11011

//        ~ the bitwise NOT operator, inverts all the bits of x.
//        x = 0011 1010
//        ~x= 1100 0101
        System.out.println("~x:"+(~x)); //-59

//        The Left Shift << shifts the bits of the x to the left by the number of positions specified by u
//        for each shift to the left, the binary representation is moved to the left by one position
//        and a 0 is added on the right
//        y is 13, shifts the bits of x to the left 13 positions:
//        x = 0011 1010
//        x<13 = 0011 1010 0000 0000 0000 0000
        System.out.println("x << y: "+(x << y));

//        >> Right shift, shifts the number by the number of the position specidied by y.
//        for each shift to the right, the binary is moved to the right by one of the position and the leftmost is filled based on the sign bit (0 for positive, 1 for negative
//        x = 0011 1010
//        x >>13 = 0 because all bits moveed out of range
        System.out.println("x >> y: " + (x >> y));
//        another example of  << LEFT
//        a = 5 = 0000 0101
//        a <<1 = 0000 1010
//        a = 3 = 0000 0011
//        a << 2= 0000 1100

//        example of >> RIGHT
//        b = 8 = 0000 1000
//        b>>1 =  0000 0100
//        b = 19= 0001 0011
//        b >>2 = 0000 0100
    }
}
