package by.epamtc.jwd.Task3;

public class Area {
    public static double obtainingSquareInscribedCircle(double d){

        double circleRadius, sideOfLargerSquare, sideOfSmallerSquare, areaOfSmallerSquare;

        final int valueForWorkingWithRadius = 2;
        final int degreeOfRadiusForFormula = 2;

        sideOfLargerSquare = Math.sqrt(d);

        circleRadius = sideOfLargerSquare/valueForWorkingWithRadius;

        sideOfSmallerSquare =  (circleRadius*valueForWorkingWithRadius)/(Math.sqrt(degreeOfRadiusForFormula));

        areaOfSmallerSquare = sideOfSmallerSquare*sideOfSmallerSquare;

        return areaOfSmallerSquare;

    }
    public static double calculatingAreaDifference (Double areaOfTheLargerSquare, Double areaOfTheSmallerSquare){
        double areaDifference;

        areaDifference = areaOfTheLargerSquare/areaOfTheSmallerSquare;

        return areaDifference;
    }


}
