package com.perscholas.java_basics;

public class arraydemoOne {
    public static void main(String[] args){
//        create an array
        int[] age = {12,4,5,2,5};
//        access each array elements
        System.out.println("Accessing Elements of an Array: ");
        System.out.println("First Element: " + age[0]);
        System.out.println("Second Element: " + age[1]);
        System.out.println("Third Element: " + age[2]);
        System.out.println("Fourth Element: " + age[3]);
        System.out.println("Fifth Element: " + age[4]);

        System.out.println("Using for Loop:");
        for(int i = 0; i < age.length; i++){
            System.out.println(age[i]);
        }


    }
}
