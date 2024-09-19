package com.perscholas.java_basics;

import java.util.*;

public class ArrayManipulationPractice {
    public static void main(String[] args){
        boolean[] boolArr = new boolean[] {true,true,false,true};
        int[] intArr = new int[] {1,2,3,4,5};
        char[] charArr = new char[] {'g','e','e','g'};

//        toString method is used to portray a STRING representation of the object (all objects inherit toString from the Object class)
//        it is not used to print the elements (arrays contain elements but not all objects do)
        System.out.println(Arrays.toString(boolArr));
        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(charArr));

//        Array.fill()
        double[] dValues = new double[100];
        Arrays.fill(dValues, 50.0);

        long[]lValues = new long[500];
        Arrays.fill(lValues, 2057);

        Arrays.fill(dValues,6);
        for(double num : dValues){
            System.out.println(num);
        }

        int arr[] = {2,2,2,2,2,2,2,2};
        Arrays.fill(arr, 1,5,10);
        System.out.print(Arrays.toString(arr));

        double[] numbers = {6.04,4.4,1.9,22.1,0.5};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        char[] chars = {'a','A','4','F','D','p'};
        Arrays.sort(chars);
        System.out.print(Arrays.toString(chars));
    }
}
