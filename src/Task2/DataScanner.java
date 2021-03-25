package Task2;

import java.util.Scanner;

public class DataScanner {
    public static int  enterYearToConsole(){

        Scanner scanner = new Scanner(System.in);

        int year,temp;


        while (true){
            if (scanner.hasNextInt()) {
                temp=scanner.nextInt();
                if (temp <= 2021 && temp >= 0) {
                    year=temp;
                    break;
                } else {
                    System.out.println("this is an incorrect value for the year, please try again");
                }
            }else  {
                System.out.println("this is an incorrect value for the year, please try again");
                scanner.next();
            }
        }
        return year;
    }
    public static int  enterMonthToConsole(){

        Scanner scanner = new Scanner(System.in);

        int month,temp;


        while (true){
            if (scanner.hasNextInt()) {
                temp=scanner.nextInt();
                if (temp <= 12 && temp >= 1) {
                    month=temp;
                    break;
                } else {
                    System.out.println("this is an incorrect value for the month, please try again");
                }
            }else  {
                scanner.next();
            }
        }
        return month;

    }


}

