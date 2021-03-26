package Task5;

import java.util.Scanner;

public class DataScanner {
    public static int  enterIntegerToConsole(){

        Scanner scanner = new Scanner(System.in);

        int integerNumber;

        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("It is not an integer, please try again ");
        }
        integerNumber=scanner.nextInt();

        return integerNumber;
    }

}
