package Task2;

public class Main {
    public static void main(String[] args) {

        int YearNumber, MonthNumber, NumberOfDaysInAMonth;
        String NameOfTheYear;

        System.out.println("Enter the year from 0 to 2021 in the correct form");

        YearNumber = DataScanner.enterYearToConsole();

        NameOfTheYear = DeterminingYearAndDays.DefinitionYear(YearNumber);

        System.out.println("This is " + NameOfTheYear);

        System.out.println("Enter the number of the month in your year ");

        MonthNumber = DataScanner.enterMonthToConsole();

        NumberOfDaysInAMonth = DeterminingYearAndDays.DefinitionDaysInMonth(MonthNumber, NameOfTheYear);

        System.out.println("This month has " + NumberOfDaysInAMonth+  " days");

    }
}
