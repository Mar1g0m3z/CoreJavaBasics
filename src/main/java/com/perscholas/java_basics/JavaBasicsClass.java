package com.perscholas.java_basics;

public class JavaBasicsClass {
    public static void main (String[] args){


    int oneNumber = 5;
    int twoNumber = 9;
    int total = oneNumber + twoNumber;
    System.out.println(total);

    double decimalOne = 3.14;
    double decimalTwo = 99.99;

    double totalDecimal = decimalOne + decimalTwo;
    System.out.println(totalDecimal);

    double decimalNum = 2.2;
    int integerNum = 321;
    double sumOfBoth = decimalNum + integerNum;
    System.out.println(sumOfBoth);
// the sum printed was 323.2, does that mean it is a double?
    int divideSum = twoNumber / oneNumber;
    System.out.println(divideSum);

    int divideDouble = (int)decimalTwo / twoNumber;
    System.out.println(divideDouble);
//you can make the sum variable  a double for explicit casting
//or just cast lol
    double doubleSum = decimalTwo/decimalOne;
    System.out.println(doubleSum);
    System.out.println((int)doubleSum);

    final  int NUMBER_VAR = 55;
    int contMultiply = NUMBER_VAR * 5;
    System.out.println(contMultiply);

    int x = 5;
    int y = 6;
    int q = y/x;

    System.out.println(q);

    double qDouble =  y;
    System.out.print(qDouble/x);





//wtf
    }



}
