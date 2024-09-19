package com.perscholas.java_basics;

//import java.util.Scanner;

public class PaLoops {
    public static void main(String[] args){

//        int num = 5;
//        for(int i = 1; i <= 12; i++){
//            System.out.println(i * num);
//        }
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Input first number: ");
//        int num1 = scanner.nextInt();
//        System.out.println("Input second number: ");
//        int num2 = scanner.nextInt();
//
//        while(num2 != 0){
//            int temp = num2;
//            num2 = num1 % num2;
//            num1 = temp;
//        }
//        System.out.println(num1);
        double tuition = 10000;
        int years = 1;
        double initialTuition = tuition;
        while(tuition < (initialTuition * 2)){
            tuition = (1.07 * tuition);
            years++;
        }
        System.out.println(years + " " + tuition);
    }

}
