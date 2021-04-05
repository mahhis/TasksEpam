package by.epamtc.jwd.Task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int ourNumber, result;

        System.out.println("Enter your INTEGER number ");

        ourNumber = enterIntegerToConsole();

        result = SquareOfOurNumber.squaring(ourNumber);

        System.out.println("The square of the last digit of your number is " + result);
    }
    public static int  enterIntegerToConsole(){

        Scanner scanner = new Scanner(System.in);

        int enteredNumber;

        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("It is not an integer, please try again ");
        }
        enteredNumber=scanner.nextInt();

        return enteredNumber;
    }

}