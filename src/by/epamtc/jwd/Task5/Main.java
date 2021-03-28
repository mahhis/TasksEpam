package by.epamtc.jwd.Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int enteredNumber;
        boolean result;

        System.out.println("Enter your integers");

        enteredNumber = enterIntegerToConsole();

        result = DeterminingTheNumber.isPerfectNumberOrNot(enteredNumber);

        System.out.println(result);
    }

    public static int  enterIntegerToConsole() {

        Scanner scanner = new Scanner(System.in);

        int integerNumber;

        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("It is not an integer, please try again ");
        }
        integerNumber = scanner.nextInt();

        return integerNumber;
    }
}
