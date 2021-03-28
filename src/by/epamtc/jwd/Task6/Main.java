package by.epamtc.jwd.Task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int introducedSeconds;
        String result;

        System.out.println("Enter, please, the number of seconds that have passed since the beginning of the day (it must not exceed 86400)");
        introducedSeconds = enterSeconds();
        result=HoursMinutesSecondsFromSeconds.hoursMinutesSecondsFromSeconds(introducedSeconds);
        System.out.println(result);
    }


    public static int enterSeconds(){
        Scanner scanner = new Scanner(System.in);

        int seconds,temp;
        while (true){
            if (scanner.hasNextInt()) {
                temp=scanner.nextInt();
                if (temp <= 86400 && temp >= 1) {
                    seconds=temp;
                    break;
                } else {
                    System.out.println("this is an incorrect value for the seconds in day, please try again");
                }
            }else  {
                scanner.next();
            }
        }
        return seconds;
    }
}
