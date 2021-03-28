package by.epamtc.jwd.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double areaOfTheLargerSquare, areaOfTheSmallerSquare, areaDifference;

        areaOfTheLargerSquare=enterAreaToConsole();
        System.out.println("Enter the area of the larger square ");

        areaOfTheSmallerSquare=AreaTransformations.areaOfSmallerSquare(areaOfTheLargerSquare);
        System.out.println("The area of the inscribed square is "+areaOfTheSmallerSquare);

        areaDifference=AreaTransformations.areaDifference(areaOfTheLargerSquare, areaOfTheSmallerSquare);
        System.out.println("The area of the described square is " +areaDifference+ " times larger than the inscribed");
    }

    public static double enterAreaToConsole(){
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
