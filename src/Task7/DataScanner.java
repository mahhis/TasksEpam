package Task7;

import java.util.Scanner;

public class DataScanner {
    public static double enterPointCoordinates(){
        Scanner scanner = new Scanner(System.in);

        double point;

        while (!scanner.hasNextDouble()){
            scanner.next();
            System.out.println("It is not an integer, please try again ");
        }
        point=scanner.nextDouble();

        return point;

    }
}
