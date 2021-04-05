package by.epamtc.jwd.Task10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Main {
    static  double step, firstBorder, secondBorder;
    public static void main(String[] args) {



        System.out.println("step value");
        step = Main.enterDataForFunction();

        checkValue(firstBorder, secondBorder);

        Function.calculatingFunctionValues(step, firstBorder, secondBorder);

        printTable((HashMap) Function.valueTable);
    }

    public static void checkValue (Double firstBorder, Double secondBorder) {
        do {
            if (secondBorder > firstBorder) {
                break;
            } else {
                System.out.println("The first border must be less than the second, set new values : ");
                System.out.println("First border");
                firstBorder = Main.enterDataForFunction();
                System.out.println("Second border");
                secondBorder = Main.enterDataForFunction();
            }
        } while (secondBorder < firstBorder);
        Main.firstBorder = firstBorder;
        Main.secondBorder = secondBorder;
    }



    public static void printTable (HashMap valueTable){
        Set<Map.Entry<Double, Double>> temporaryList = valueTable.entrySet();
        for (Map.Entry<Double, Double> entry : temporaryList){
            System.out.println(entry.getKey() +"  "+ entry.getValue());
        }
    }

    static double  enterDataForFunction(){

        Scanner scanner = new Scanner(System.in);

        double data;

        while (!scanner.hasNextDouble()){
            scanner.next();
            System.out.println("It is not an double, please try again ");
        }
        data=scanner.nextDouble();

        return data;
    }

}
