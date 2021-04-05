package by.epamtc.jwd.Task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int introducedSeconds, hours, minutes, seconds;


        System.out.println("Enter, please, the number of seconds that have passed since the beginning of the day (it must not exceed 86400)");
        introducedSeconds = enterSeconds();
        hours=TimeTransformation.conversionFromSecondsToHours(introducedSeconds);
        minutes=TimeTransformation.conversionFromSecondsToMinutes(introducedSeconds);
        seconds=TimeTransformation.calculatingRemainderOfSeconds(introducedSeconds);

        System.out.println("In " +introducedSeconds+ " seconds " +hours+ " hours " + minutes+" minutes and " + seconds + " seconds");
    }


    public static int enterSeconds(){
        Scanner scanner = new Scanner(System.in);

        int seconds,checkValue;
        while (true){
            if (scanner.hasNextInt()) {
                checkValue=scanner.nextInt();
                if (checkValue <= 86400 && checkValue >= 1) {
                    seconds=checkValue;
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
