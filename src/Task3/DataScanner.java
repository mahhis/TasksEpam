package Task3;

import java.util.Scanner;

public class DataScanner {

    public static double EnterAreaToConsole(){
        Scanner scanner = new Scanner(System.in);

        double area;

        while (!scanner.hasNextDouble()){
            scanner.next();
            System.out.println("It is not an double, please try again ");
        }
        area=scanner.nextDouble();

        return area;
    }

}

