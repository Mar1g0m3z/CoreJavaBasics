package com.perscholas.java_basics;

import java.util.Scanner;

public class insertElements {
    public static void main(String[] args){
      int i, element;
      int[] arr = new int[11];
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter 10 numbers: ");
      for(i=0; i <10; i++){
          arr[i] = scan.nextInt();
      }
      System.out.println("Enter an element to insert: ");
      element = scan.nextInt();
      arr[i] = element;

      System.out.println("\n Now the new array is: ");
      for(i=0; i<arr.length; i++){
          System.out.print(arr[i]+ " ");
      }
    }

}
