package com.company;

import java.util.Scanner;

public class DataScanner {
    public static int  enterIntegerFromConsole(){

        Scanner scanner = new Scanner(System.in);

        int a;

        while (!scanner.hasNextInt()){
            scanner.next();
        }
        a=scanner.nextInt();

        return a;
    }
}
