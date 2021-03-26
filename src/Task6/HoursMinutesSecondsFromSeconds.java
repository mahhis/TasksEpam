package Task6;

public class HoursMinutesSecondsFromSeconds {
    public static String hoursMinutesSecondsFromSeconds(int sec){

        String hoursMinutesSeconds;

        int hours, minutes, seconds;


        hours = sec/3600;
        minutes = (sec%3600)/60;
        seconds = ((sec%3600)%60)%60;

        hoursMinutesSeconds = ("In " +sec+ " seconds " +hours+ " hours " + minutes+" minutes and " + seconds + " seconds");

        return hoursMinutesSeconds;



    }
}
