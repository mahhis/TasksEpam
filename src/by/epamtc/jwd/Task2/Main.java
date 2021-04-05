package by.epamtc.jwd.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int yearNumber, monthNumber, numberOfDaysInAMonth;
        String nameOfTheYear;

        System.out.println("Enter year AD");

        yearNumber = enterYearToConsole();

        nameOfTheYear = DeterminingYearAndDays.definitionYear(yearNumber);

        System.out.println("This is " + nameOfTheYear);

        System.out.println("Enter the number of the month in your year ");

        monthNumber = enterMonthToConsole();

        numberOfDaysInAMonth = DeterminingYearAndDays.definitionDaysInMonth(monthNumber, nameOfTheYear);

        System.out.println("This month has " + numberOfDaysInAMonth+  " days");

    }
    public static int  enterYearToConsole(){

        Scanner scanner = new Scanner(System.in);

        int year,checkValue;

        while (true){
            if (scanner.hasNextInt()) {
                checkValue=scanner.nextInt();
                if (checkValue >= 0) {
                    year=checkValue;
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

        int month,checkValue;

        while (true){
            if (scanner.hasNextInt()) {
                checkValue=scanner.nextInt();
                if (checkValue <= 12 && checkValue >= 1) {
                    month=checkValue;
                    break;
                } else {
                    System.out.println("this is an incorrect value for the month, please try again");
                }
            }else  {
                System.out.println("this is an incorrect value for the month, please try again");
                scanner.next();
            }
        }
        return month;
    }
}