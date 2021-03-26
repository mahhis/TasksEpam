package Task6;

import java.util.Scanner;

public class DataScanner {
    public static int gettingSeconds(){
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
