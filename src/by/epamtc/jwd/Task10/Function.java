package by.epamtc.jwd.Task10;


import java.util.HashMap;
import java.util.Map;


class Function {

    static Map <Double, Double> valueTable = new HashMap<>();


       static void calculatingFunctionValues(double step, double firstBorder, double secondBorder){
           double tangentsValue;

           for (double i = firstBorder; i<=secondBorder; i+=step){
               double valueX = i;
               tangentsValue = Math.tan(valueX);
               valueTable.put(valueX, tangentsValue);
           }

       }
}

