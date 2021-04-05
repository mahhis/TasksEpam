package by.epamtc.jwd.Task8;

public class FunctionComputation {

    // f(x) = -(x)^2 + 3*x + 9
    public static double calculatingFirstFunction(double x){

        final int firstCoefficientInFunction = 3;
        final int secondCoefficientInFunction = 2;
        double Y = (-(x*x)) + (firstCoefficientInFunction*x) + secondCoefficientInFunction;
        return Y;
    }
    // f(x) = 1/(x^3 - 6)
    public static double calculatingSecondFunction(double x){

        final int powerX = 3;
        final int firstCoefficientInFunction = 6;
        double Y = 1/(Math.pow(x, powerX) - firstCoefficientInFunction);
        return Y;
    }

    public static double launchDesiredFunction(double x){
        if (x>=3){
            return calculatingFirstFunction(x);
        } else {
            return calculatingSecondFunction(x);
        }
    }
}
