package by.epamtc.jwd.Task9;

public class LengthAndArea {

    static double Pi = 3.14;

    public static double calculationLenght(double radius){

        double lenghtCircumference;
        final int coefficientForFormula = 2;
        lenghtCircumference = coefficientForFormula*Pi*radius;

        return lenghtCircumference;
    }

    public static double calculationArea(double radius){

        double areaCircle;
        final int degreeOfRadiusForFormula = 2;
        areaCircle = Pi*Math.pow(radius, degreeOfRadiusForFormula);

        return  areaCircle;
    }


}
