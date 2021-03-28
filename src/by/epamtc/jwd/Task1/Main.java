package by.epamtc.jwd.Task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int OurNumber, Result;

        System.out.println("Enter your INTEGER number ");

        OurNumber = enterIntegerToConsole();

        Result = SquareOfOurNumber.LastDigit(OurNumber);

        System.out.println("The square of the last digit of your number is " + Result);
    }
    public static int  enterIntegerToConsole(){

        Scanner scanner = new Scanner(System.in);

        int integer;

        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("It is not an integer, please try again ");
        }
        integer=scanner.nextInt();

        return integer;
    }

}