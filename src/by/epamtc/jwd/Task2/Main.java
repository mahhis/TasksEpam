package by.epamtc.jwd.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int YearNumber, MonthNumber, NumberOfDaysInAMonth;
        String NameOfTheYear;

        System.out.println("Enter the year from 0 to 2021 in the correct form");

        YearNumber = enterYearToConsole();

        NameOfTheYear = DeterminingYearAndDays.DefinitionYear(YearNumber);

        System.out.println("This is " + NameOfTheYear);

        System.out.println("Enter the number of the month in your year ");

        MonthNumber = enterMonthToConsole();

        NumberOfDaysInAMonth = DeterminingYearAndDays.DefinitionDaysInMonth(MonthNumber, NameOfTheYear);

        System.out.println("This month has " + NumberOfDaysInAMonth+  " days");

    }
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
