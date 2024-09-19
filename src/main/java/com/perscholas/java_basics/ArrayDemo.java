package com.perscholas.java_basics;

public class ArrayDemo {
    public static void main(String[] args){
        int month_days[];
        month_days = new int[12]; //declaring and creating array with size
        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;
        month_days[4] = 31;
        month_days[5] = 30;
        month_days[6] = 31;
        month_days[8] = 30;
        month_days[9] = 31;
        month_days[10] = 30;
        month_days[11] = 31;
        System.out.println("April has  " + month_days[3] + " days.");
//        we can declare and initialize arrays in a single line without using new operator:
        double[] myList = {1.9, 2.9,3.4,3.5};
//        array declaration and initialization  MUST be done in a single statement
//        example of declare and initialization in one step:
//        int[] month_days = {31,28,31,30,31,30,31,30,31,30,31};
//        Array Indexing: array elements are accessed by index. AArray indexing is 0-based( ranging from 0 to arrayVar.length-1)
//        myList holds elements indexed from 0 to myList.length-1
//        arrayVar[index];
//        int size = arrayRefVar.length
        int[] values = new int[5];
        for( int i = 1; i < 5; i++){
            values[i] = i + values[i-1];
        }
        values[0] = values[1] + values[4];
//        Accessing with a for Loop
        for(int i = 1; i < 5; i++){
            values[i] = i + values[i-1];

        }
        values[0] = values[1] + values[4];
//        create an array
        int[] numbers = {3,9,5,-5};
//        for each loop
        for(int number: numbers){
            System.out.println(number);
        }




    }
}
