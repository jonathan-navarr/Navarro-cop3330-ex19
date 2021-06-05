package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Navarro
 */
public class BMICalculator {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        double weight, height;
        double BMI;
        System.out.print("What is your weight in pounds? ");
        weight = scnr.nextDouble();
        System.out.print("What is your height in inches? ");
        height = scnr.nextDouble();
        BMI = (weight/(height*height))*703.0;
        String strBMI = String.format("%.2f", BMI);
        if(BMI >= 18.5 && BMI <= 25){
            System.out.print("Your BMI is " + strBMI + "\nYou are within the ideal weight range.");
        }
        else if(BMI<18.5){
            System.out.print("Your BMI is " + strBMI + "\nYou are underweight. You should see a doctor");
        }
        else{
            System.out.print("Your BMI is " + strBMI + "\nYou are overweight. You should see your doctor");
        }
;    }
}
