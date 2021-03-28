package by.epamtc.jwd.Task9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double radius;
        System.out.println("Please enter the radius");
        radius= enterRadiusToConsole();
        LengthAndArea.calculationArea(radius);
        LengthAndArea.calculationLenght(radius);
    }

    public static double enterRadiusToConsole(){

        Scanner scanner = new Scanner(System.in);

        double radius, temp;

        while (true){
            if (scanner.hasNextInt()) {
                temp=scanner.nextInt();
                if ( temp >0) {
                    radius=temp;
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
