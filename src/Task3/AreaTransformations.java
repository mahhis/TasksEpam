package Task3;

public class AreaTransformations {
    public static double areaOfSmallerSquare(double d){

        double circleRadius, sideOfLargerSquare, sideOfSmallerSquare, areaOfSmallerSquare;

        sideOfLargerSquare = Math.sqrt(d);

        circleRadius = sideOfLargerSquare/2;

        sideOfSmallerSquare =  (circleRadius*2)/(Math.sqrt(2));

        areaOfSmallerSquare = sideOfSmallerSquare*sideOfSmallerSquare;

        return areaOfSmallerSquare;

    }
    public static double areaRatio (Double areaOfTheLargerSquare, Double areaOfTheSmallerSquare){
        double ratio;

        ratio = areaOfTheLargerSquare/areaOfTheSmallerSquare;

        return ratio;
    }


}
