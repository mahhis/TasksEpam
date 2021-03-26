package Task6;

public class Main {
    public static void main(String[] args) {

        int introducedSeconds;
        String result;

        System.out.println("Enter, please, the number of seconds that have passed since the beginning of the day (it must not exceed 86400)");
        introducedSeconds = DataScanner.gettingSeconds();
        result=HoursMinutesSecondsFromSeconds.hoursMinutesSecondsFromSeconds(introducedSeconds);
        System.out.println(result);

    }
}
