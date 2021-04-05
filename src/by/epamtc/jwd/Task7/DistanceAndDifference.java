package by.epamtc.jwd.Task7;

public class DistanceAndDifference {
    public static double calculatingDistanceToOrigin(double valueX, double valueY){

        double distanceToOrigin;

        distanceToOrigin = Math.sqrt((valueX*valueX) + (valueY*valueY));

        return distanceToOrigin;
    }
    public static void whoIsCloserToTheOrigin(double firstDistance, double secondDistance){

        double difference;

        difference = firstDistance - secondDistance;

        if (difference < 0){
            System.out.println("The first point is closer to the origin than the second");
        } else if(difference > 0){
            System.out.println("The second point is closer to the origin than the first");
        } else if (difference == 0){
            System.out.println("Points are at the same distance from the center");
        }
    }
}
