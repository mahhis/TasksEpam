package by.epamtc.jwd.Task6;

public class HoursMinutesSecondsFromSeconds {
    public static String hoursMinutesSecondsFromSeconds(int sec){

        String hoursMinutesSeconds;

        int hours, minutes, seconds;
        final int secondsPerHour = 3600;
        final int minutesPerHour = 60;
        final int secondsPerMinute = 60;

        hours = sec/secondsPerHour;
        minutes = (sec%secondsPerHour)/minutesPerHour;
        seconds = ((sec%secondsPerHour)%minutesPerHour)%secondsPerMinute;

        hoursMinutesSeconds = ("In " +sec+ " seconds " +hours+ " hours " + minutes+" minutes and " + seconds + " seconds");

        return hoursMinutesSeconds;
    }
}
