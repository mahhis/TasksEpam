package by.epamtc.jwd.Task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double pointX1, pointY1, pointX2, pointY2, distanceFirstPointToOrigin, distanceSecondPointToOrigin;

        System.out.println("Enter the value of coordinates");
        System.out.println("X1 = ");
        pointX1 = enterValueCoordinates();
        System.out.println("Y1 = ");
        pointY1 = enterValueCoordinates();
        System.out.println("X2 = ");
        pointX2 = enterValueCoordinates();
        System.out.println("Y2 = ");
        pointY2 = enterValueCoordinates();

        distanceFirstPointToOrigin = DeterminingDistanceAndDifference.distanceToOrigin(pointX1, pointY1);
        System.out.println("Distance of the first point to the origin is " + distanceFirstPointToOrigin);

        distanceSecondPointToOrigin = DeterminingDistanceAndDifference.distanceToOrigin(pointX2, pointY2);
        System.out.println("Distance of the second point to the origin is " + distanceSecondPointToOrigin);

        DeterminingDistanceAndDifference.whoIsCloserToTheOrigin(distanceFirstPointToOrigin, distanceSecondPointToOrigin);

    }
    public static double enterValueCoordinates(){
        Scanner scanner = new Scanner(System.in);

        double value;

        while (!scanner.hasNextDouble()){
            scanner.next();
            System.out.println("It is not an integer, please try again ");
        }
        value=scanner.nextDouble();

        return value;
    }
}
