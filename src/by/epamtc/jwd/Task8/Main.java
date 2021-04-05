package by.epamtc.jwd.Task8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double valueX;

        System.out.println("Please enter a value for X");
        valueX = enterXToConsole();
        System.out.println(FunctionComputation.launchDesiredFunction(valueX));

    }
    public static double enterXToConsole() {

            Scanner scanner = new Scanner(System.in);

            double enteredNumber;

            while (!scanner.hasNextDouble()) {
                scanner.next();
                System.out.println("It is not a double, please try again ");
            }
            enteredNumber = scanner.nextDouble();

            return enteredNumber;
        }
    }
