package com.perscholas.java_basics;
import java.text.DecimalFormat;
public class DecimalFormatting {
    public static void main(String[]  args){

        String pattern = "####,####.##";
        double number = 123456123.123;

        DecimalFormat numberFormat = new DecimalFormat(pattern);
        System.out.println(number);
        System.out.println(numberFormat.format(number));
    }
}
