package by.epamtc.jwd.Task8;

public class FunctionComputation {

    // f(x) = -(x)^2 + 3*x + 9
    public static double firstFunction(double x){

        final int firstCoefficientInFunction = 3;
        final int secondCoefficientInFunction = 2;
        double Y = (-(x*x)) + (firstCoefficientInFunction*x) + secondCoefficientInFunction;
        System.out.println("f(x) = " + Y +" if X equals " + x);
        return Y;
    }
    // f(x) = 1/(x^3 - 6)
    public static double secondFunction(double x){

        final int powerX = 3;
        final int firstCoefficientInFunction = 6;
        double Y = 1/(Math.pow(x, powerX) - firstCoefficientInFunction);
        System.out.println("f(x) = " + Y +" if X equals " + x);
        return Y;
    }

    public static void whichFunctionWorks(double x){
        if (x>=3){
            firstFunction(x);
        } else {
            secondFunction(x);
        }
    }
}
