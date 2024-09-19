package com.perscholas.java_basics;

public class MeanSDArray {
    public static void main(String[] args){
//  means and standard deviation
        int[] marks = {74,43,58,60,90,64,70};
        int sum = 0;
        int sumSq = 0;
        double mean,stdDev;

//        compute the sum and square sum using loop
        for(int number:marks){
            sum += number;
            sumSq += number * number;
        }
        mean = (double)sum/marks.length;
        stdDev = Math.sqrt((double)sumSq / marks.length - mean * mean);
        System.out.printf("Mean is: %.2f%n",mean);
        System.out.printf("Standard deviation is: %.2f%n", stdDev);
    }
}
