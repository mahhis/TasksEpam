package Task7;

public class Main {
    public static void main(String[] args) {

        double pointX1, pointY1, pointX2, pointY2, distanceFirstPointToOrigin, distanceSecondPointToOrigin;

        System.out.println("Enter the value of coordinates");
        System.out.println("X1 = ");
        pointX1 = DataScanner.enterPointCoordinates();
        System.out.println("Y1 = ");
        pointY1 = DataScanner.enterPointCoordinates();
        System.out.println("X2 = ");
        pointX2 = DataScanner.enterPointCoordinates();
        System.out.println("Y2 = ");
        pointY2 = DataScanner.enterPointCoordinates();

        distanceFirstPointToOrigin = DeterminingDistanceAndDifference.distanceToOrigin(pointX1, pointY1);
        System.out.println("Distance of the first point to the origin is " + distanceFirstPointToOrigin);

        distanceSecondPointToOrigin = DeterminingDistanceAndDifference.distanceToOrigin(pointX2, pointY2);
        System.out.println("Distance of the second point to the origin is " + distanceSecondPointToOrigin);

        DeterminingDistanceAndDifference.whoIsCloserToTheOrigin(distanceFirstPointToOrigin, distanceSecondPointToOrigin);





    }
}
