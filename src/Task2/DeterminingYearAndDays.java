package Task2;

public class DeterminingYearAndDays {

    public static String DefinitionYear(Integer integer){

        String NameOfYTheYear;
        if(integer%4!=0){
            NameOfYTheYear = "normal year";
        }else if(integer%100==0){
            if(integer%400==0){
                NameOfYTheYear = "leap year";
            }else {
                NameOfYTheYear = "normal year";
            }
        } else {
            NameOfYTheYear = "leap year";
        }
        return NameOfYTheYear;
    }

    public static int DefinitionDaysInMonth(Integer integer, String s){

        int NumberOfDays = 0;

        if(s.equals("leap year")){
            switch (integer){
                case 1: NumberOfDays = 31; break;
                case 2: NumberOfDays = 29; break;
                case 3: NumberOfDays = 31; break;
                case 4: NumberOfDays = 30; break;
                case 5: NumberOfDays = 31; break;
                case 6: NumberOfDays = 30; break;
                case 7: NumberOfDays = 31; break;
                case 8: NumberOfDays = 31; break;
                case 9: NumberOfDays = 30; break;
                case 10: NumberOfDays = 31; break;
                case 11: NumberOfDays = 30; break;
                case 12: NumberOfDays = 31; break;
            }
        } else {
            switch (integer){
                case 1: NumberOfDays = 31; break;
                case 2: NumberOfDays = 28; break;
                case 3: NumberOfDays = 31; break;
                case 4: NumberOfDays = 30; break;
                case 5: NumberOfDays = 31; break;
                case 6: NumberOfDays = 30; break;
                case 7: NumberOfDays = 31; break;
                case 8: NumberOfDays = 31; break;
                case 9: NumberOfDays = 30; break;
                case 10: NumberOfDays = 31; break;
                case 11: NumberOfDays = 30; break;
                case 12: NumberOfDays = 31; break;
            }
        }
        return NumberOfDays;
    }
}
