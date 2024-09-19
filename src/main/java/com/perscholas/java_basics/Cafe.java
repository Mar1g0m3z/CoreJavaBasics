package com.perscholas.java_basics;

public class Cafe {
    public static void main(String[] args){
        double coffee = 5.78;
        double chaiTeaLatte = 7.55;
        double matchaFrappacino = 6.34;
        double subTotal;
        double totalSale;
        double orderOne = coffee * 3;
        double orderTwo = chaiTeaLatte * 4;
        double orderThree = matchaFrappacino * 2;

        subTotal = orderOne + orderTwo + orderThree;
        final double SALES_TAX = 0.07;

        totalSale = subTotal + (subTotal * SALES_TAX);

        System.out.println(totalSale);

    }
}
