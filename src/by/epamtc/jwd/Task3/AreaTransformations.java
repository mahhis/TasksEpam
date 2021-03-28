package by.epamtc.jwd.Task3;

public class AreaTransformations {
    public static double areaOfSmallerSquare(double d){

        double circleRadius, sideOfLargerSquare, sideOfSmallerSquare, areaOfSmallerSquare;

        final int valueForWorkingWithRadius = 2;
        final int degreeOfRadiusForFormula = 2;

        sideOfLargerSquare = Math.sqrt(d);

        circleRadius = sideOfLargerSquare/valueForWorkingWithRadius;

        sideOfSmallerSquare =  (circleRadius*valueForWorkingWithRadius)/(Math.sqrt(degreeOfRadiusForFormula));

        areaOfSmallerSquare = sideOfSmallerSquare*sideOfSmallerSquare;

        return areaOfSmallerSquare;

    }
    public static double areaDifference (Double areaOfTheLargerSquare, Double areaOfTheSmallerSquare){
        double areaDifference;

        areaDifference = areaOfTheLargerSquare/areaOfTheSmallerSquare;

        return areaDifference;
    }


}
