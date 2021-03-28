package by.epamtc.jwd.Task10;

import java.util.Scanner;

 class Main {
     static void main(String[] args) {

        System.out.println("Enter the step value");
        double step = Main.enterDataForFunction();

        System.out.println("Enter the value of the first border");
        double firstBorder = Main.enterDataForFunction();

        System.out.println("Enter the value of the second border");
        double secondBorder =  Main.enterDataForFunction();;


        do {
            if (secondBorder > firstBorder){
                break;
            } else {
                System.out.println("The first border must be less than the second, set new values : ");
                System.out.println("First border");
                firstBorder = Main.enterDataForFunction();
                System.out.println("Second border");
                secondBorder = Main.enterDataForFunction();
            }
        }while ( secondBorder > firstBorder );

        FunctionOperations.calculatingFunctionValues(step, firstBorder, secondBorder);

    }

    static double  enterDataForFunction(){

        Scanner scanner = new Scanner(System.in);

        double a;

        while (!scanner.hasNextDouble()){
            scanner.next();
            System.out.println("It is not an double, please try again ");
        }
        a=scanner.nextDouble();

        return a;
    }

}
