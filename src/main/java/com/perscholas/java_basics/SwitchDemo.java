package com.perscholas.java_basics;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args){
//        Switch aka Case statement

        String dayOfTheWeek, instruction;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter day of the week: ");
        dayOfTheWeek = in.nextLine();

        switch(dayOfTheWeek){
            case "Sunday":
                instruction = "Make all the beds";
                break;
            case "Monday":
                instruction = "Do school work";
                break;
            case "Tuesday":
                instruction = "Wash the dishes";
                break;
            case "Wednesday":
                instruction = "Throw trash away";
                break;
            case "Thursday":
                instruction = "Walk dog";
                break;
            case "Friday":
                instruction = "Do Laundry";
                break;
            case "Saturday":
                instruction = "Rest...";
                break;
            default:
                instruction = "insert actual day of the week";
                break;
//                Switch statements have limitations, you cannot do complex comparisons with them like you can if statements
        }
        System.out.println(instruction);
    }
}
