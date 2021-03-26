package Task7;

public class DeterminingDistanceAndDifference {
    public static double distanceToOrigin(double X, double Y){

        double distance;

        distance = Math.sqrt((X*X) + (Y*Y));

        return distance;
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
