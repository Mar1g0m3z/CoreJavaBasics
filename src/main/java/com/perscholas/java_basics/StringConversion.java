package com.perscholas.java_basics;

public class StringConversion {
    public static void main(String[] args){
        String intString = "1";
        int intValue = Integer.parseInt(intString); // converts string int primitive data
        System.out.println(intValue);

        Integer IntWrapper = Integer.valueOf(intString); //valueOf() converts string into non primitive
        System.out.println(IntWrapper);

        String doubleString = "1.0";
        double doubleValue = Double.parseDouble(doubleString);
        System.out.println(doubleValue);

        Float fwrapper = Float.valueOf(doubleString);
        System.out.println(fwrapper);
    }
}
