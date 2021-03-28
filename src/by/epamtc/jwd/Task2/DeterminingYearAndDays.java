package by.epamtc.jwd.Task2;

public class DeterminingYearAndDays {

    public static String DefinitionYear(Integer integer){

        final int divisibilityBy4ToDetermineValueOfYear = 4;
        final int divisibilityBy400ToDetermineValueOfYear = 400;
        final int divisibilityBy100ToDetermineValueOfYear = 100;

        String NameOfYTheYear;
        if(integer%divisibilityBy4ToDetermineValueOfYear!=0){
            NameOfYTheYear = "normal year";
        }else if(integer%divisibilityBy100ToDetermineValueOfYear==0){
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

    public static int DefinitionDaysInMonth(Integer monthNumber, String nameOfYear){

        int NumberOfDays = 0;
        final int monthsWith31Days = 31;
        final int monthsWith30Days = 30;
        final int daysFebruaryInLeapYear = 29;
        final int daysFebruaryInNormalYear = 28;

        if(nameOfYear.equals("leap year")){
            switch (monthNumber){
                case 1: NumberOfDays = monthsWith31Days; break;
                case 2: NumberOfDays = daysFebruaryInLeapYear; break;
                case 3: NumberOfDays = monthsWith31Days; break;
                case 4: NumberOfDays = monthsWith30Days; break;
                case 5: NumberOfDays = monthsWith31Days; break;
                case 6: NumberOfDays = monthsWith30Days; break;
                case 7: NumberOfDays = monthsWith31Days; break;
                case 8: NumberOfDays = monthsWith31Days; break;
                case 9: NumberOfDays = monthsWith30Days; break;
                case 10: NumberOfDays = monthsWith31Days; break;
                case 11: NumberOfDays = monthsWith30Days; break;
                case 12: NumberOfDays = monthsWith31Days; break;
            }
        } else {
            switch (monthNumber){
                case 1: NumberOfDays = monthsWith31Days; break;
                case 2: NumberOfDays = daysFebruaryInNormalYear; break;
                case 3: NumberOfDays = monthsWith31Days; break;
                case 4: NumberOfDays = monthsWith30Days; break;
                case 5: NumberOfDays = monthsWith31Days; break;
                case 6: NumberOfDays = monthsWith30Days; break;
                case 7: NumberOfDays = monthsWith31Days; break;
                case 8: NumberOfDays = monthsWith31Days; break;
                case 9: NumberOfDays = monthsWith30Days; break;
                case 10: NumberOfDays = monthsWith31Days; break;
                case 11: NumberOfDays = monthsWith30Days; break;
                case 12: NumberOfDays = monthsWith31Days; break;
            }
        }
        return NumberOfDays;
    }
}
