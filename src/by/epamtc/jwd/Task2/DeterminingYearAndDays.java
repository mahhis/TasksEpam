package by.epamtc.jwd.Task2;

public class DeterminingYearAndDays {

    public static String definitionYear(Integer integer){

        final int divisibilityBy4ToDetermineValueOfYear = 4;
        final int divisibilityBy400ToDetermineValueOfYear = 400;
        final int divisibilityBy100ToDetermineValueOfYear = 100;

        String NameOfYTheYear;

        if(integer%divisibilityBy4ToDetermineValueOfYear!=0){
            NameOfYTheYear = "normal year";
        }else
        if(integer%divisibilityBy100ToDetermineValueOfYear==0){
            if(integer%divisibilityBy400ToDetermineValueOfYear==0){
                NameOfYTheYear = "leap year";
            }else {
                NameOfYTheYear = "normal year";
            }
        } else {
            NameOfYTheYear = "leap year";
        }
        return NameOfYTheYear;
    }

    public static int definitionDaysInMonth(Integer monthNumber, String nameOfYear){

        int numberOfDays = 0;
        final int monthsWith31Days = 31;
        final int monthsWith30Days = 30;
        final int daysFebruaryInLeapYear = 29;
        final int daysFebruaryInNormalYear = 28;

        if(nameOfYear.equals("leap year")){
            switch (monthNumber){
                case 1: numberOfDays = monthsWith31Days; break;
                case 2: numberOfDays = daysFebruaryInLeapYear; break;
                case 3: numberOfDays = monthsWith31Days; break;
                case 4: numberOfDays = monthsWith30Days; break;
                case 5: numberOfDays = monthsWith31Days; break;
                case 6: numberOfDays = monthsWith30Days; break;
                case 7: numberOfDays = monthsWith31Days; break;
                case 8: numberOfDays = monthsWith31Days; break;
                case 9: numberOfDays = monthsWith30Days; break;
                case 10: numberOfDays = monthsWith31Days; break;
                case 11: numberOfDays = monthsWith30Days; break;
                case 12: numberOfDays = monthsWith31Days; break;
            }
        } else {
            switch (monthNumber){
                case 1: numberOfDays = monthsWith31Days; break;
                case 2: numberOfDays = daysFebruaryInNormalYear; break;
                case 3: numberOfDays = monthsWith31Days; break;
                case 4: numberOfDays = monthsWith30Days; break;
                case 5: numberOfDays = monthsWith31Days; break;
                case 6: numberOfDays = monthsWith30Days; break;
                case 7: numberOfDays = monthsWith31Days; break;
                case 8: numberOfDays = monthsWith31Days; break;
                case 9: numberOfDays = monthsWith30Days; break;
                case 10: numberOfDays = monthsWith31Days; break;
                case 11: numberOfDays = monthsWith30Days; break;
                case 12: numberOfDays = monthsWith31Days; break;
            }
        }
        return numberOfDays;
    }
}