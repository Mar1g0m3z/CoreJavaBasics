package com.perscholas.java_basics;

public class NestedArr {
    public static void main(String[] args){
        int [][] matrix = new int[2][2];

        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = (int)(Math.random() * 1000);
                System.out.println(matrix[row][column]);
            }
        }
    }
}
