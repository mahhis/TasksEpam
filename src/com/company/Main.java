package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int OurNumber, Result;

        System.out.println("Enter your number ");

        OurNumber = DataScanner.enterIntegerFromConsole();

        Result = SquareOfOurNumber.LastDigit(OurNumber);

        System.out.println("The square of the last digit of your number is " + Result);
    }

}