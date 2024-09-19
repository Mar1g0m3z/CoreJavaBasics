package com.perscholas.java_basics;

import java.util.Arrays;

public class CopyingArraysPractice {
    public static void main(String[] args){
int[] sourceArrays = {2,3,4,5,10};
int[] targetArrays = new int[sourceArrays.length];
for(int i = 0; i < sourceArrays.length; i++){
    targetArrays[i] = sourceArrays[i];
}
//these two are different objects
//   what if we COMPARE by using the == sign?
System.out.println(sourceArrays == targetArrays);
//it is false
//        btw an instance is an object
targetArrays[targetArrays.length-1] = 500;
System.out.println(Arrays.toString(sourceArrays));
System.out.println(Arrays.toString(targetArrays));

//Object.clone() - Object class is the SUPERCLASS of all classes
        int[] sourceArray = {1,2,3};
        int[] targetArray = sourceArray.clone();
        System.out.println(Arrays.toString(sourceArray));
        System.out.println(Arrays.toString(targetArray));
        sourceArray[2] = 500;
        System.out.println(Arrays.toString(sourceArray));
        System.out.println(Arrays.toString(targetArray));
//System - arrayCopy method
        int [] targetArray2 = new int[2];
//        you can indicate WHERE you wanna copy
      System.arraycopy(sourceArray,2, targetArray2,1, 1);
      System.out.println(Arrays.toString(targetArray2));
//      java gives default values: 0..

//        copyOf method:
        int[] targetArray3 = Arrays.copyOf(targetArray2, 1);
        System.out.println(Arrays.toString(targetArray3));

//        using (=) in copying arrays, it will have the same reference and changes will be made to both
    }
}
