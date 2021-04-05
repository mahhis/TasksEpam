package by.epamtc.jwd.Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numberA, numberB, numberC, numberD;

        System.out.println("Enter 4 integers");

        numberA=enterIntegerToConsole();
        numberB=enterIntegerToConsole();
        numberC=enterIntegerToConsole();
        numberD=enterIntegerToConsole();

        System.out.println(DeterminingNumber.isMoreThanToEvenNumbers(numberA,numberB, numberC, numberD));
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
