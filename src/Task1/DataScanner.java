package Task1;

import java.util.Scanner;

public class DataScanner {
    public static int  enterIntegerToConsole(){

        Scanner scanner = new Scanner(System.in);

        int a;

        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("It is not an integer, please try again ");
        }
        a=scanner.nextInt();

        return a;
    }
}
