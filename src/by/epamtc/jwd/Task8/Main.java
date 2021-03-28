package by.epamtc.jwd.Task8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double X;

        System.out.println("Please enter a value for X");
        X = enterXToConsole();
        FunctionComputation.whichFunctionWorks(X);

    }
    public static double enterXToConsole() {

        Scanner scanner = new Scanner(System.in);

        double X, temp;

        while (true) {
            if (scanner.hasNextInt()) {
                temp = scanner.nextInt();
                if (temp != Math.pow(6, (1 / 3))) {
                    X = temp;
                    break;
                } else {
                    System.out.println("Can't divide by zero");
                }
            } else {
                scanner.next();
            }
        }
        return X;
    }
}
