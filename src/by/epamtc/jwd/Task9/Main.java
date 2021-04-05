package by.epamtc.jwd.Task9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double radius;
        System.out.println("Please enter the radius");
        radius= enterRadiusToConsole();
        System.out.println("the length of the circumference is " +   LengthAndArea.calculationLenght(radius));
        System.out.println("area of a circle is " + LengthAndArea.calculationArea(radius));

    }

    public static double enterRadiusToConsole(){

        Scanner scanner = new Scanner(System.in);

        double radius, checkValue;

        while (true){
            if (scanner.hasNextInt()) {
                checkValue=scanner.nextInt();
                if ( checkValue >0) {
                    radius=checkValue;
                    break;
                } else {
                    System.out.println("Radius can't be negative");
                }
            }else  {
                scanner.next();
            }
        }
        return radius;
 }
}
