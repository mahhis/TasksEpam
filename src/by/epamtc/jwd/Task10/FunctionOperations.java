package by.epamtc.jwd.Task10;

import java.math.BigDecimal;
import java.math.RoundingMode;

 class FunctionOperations {

       static void calculatingFunctionValues(double step, double firstBorder, double secondBorder){
           double tangentsValue;
           System.out.println(" F(x)   |    x ");
           System.out.println(" -----------------");

           for (double i = firstBorder; i<=secondBorder; i+=step){
               double x = i;
               tangentsValue = Math.tan(x);
               System.out.println(" "+round(tangentsValue, 4)+ " | " + x + " ");
               System.out.println(" -----------------");

           }

       }
     static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

 }

