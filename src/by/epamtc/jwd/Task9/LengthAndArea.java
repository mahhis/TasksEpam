package by.epamtc.jwd.Task9;

public class LengthAndArea {

    static double Pi = 3.14;

    public static void calculationLenght(double radius){

        double lenghtCircumference;
        final int coefficientForFormula = 2;
        lenghtCircumference = coefficientForFormula*Pi*radius;
        System.out.println("the length of the circumference is " + lenghtCircumference);
    }

    public static void calculationArea(double radius){

        double AreaCircle;
        final int degreeOfRadiusForFormula = 2;
        AreaCircle = Pi*Math.pow(radius, degreeOfRadiusForFormula);
        System.out.println("area of a circle is " + AreaCircle);
    }


}
