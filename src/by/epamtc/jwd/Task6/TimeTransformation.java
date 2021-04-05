package by.epamtc.jwd.Task6;

public class TimeTransformation {
    public static int conversionFromSecondsToHours(int sec){

        int hours;
        final int secondsPerHour = 3600;
        hours = sec/secondsPerHour;

        return hours;
    }
    public static int conversionFromSecondsToMinutes(int sec){

        int minutes;
        final int secondsPerHour = 3600;
        final int minutesPerHour = 60;

        minutes = (sec%secondsPerHour)/minutesPerHour;

        return minutes;
    }

    public static int calculatingRemainderOfSeconds(int sec){
        int seconds;
        final int secondsPerHour = 3600;
        final int minutesPerHour = 60;
        final int secondsPerMinute = 60;

        seconds = ((sec%secondsPerHour)%minutesPerHour)%secondsPerMinute;
        return seconds;
    }
    }

