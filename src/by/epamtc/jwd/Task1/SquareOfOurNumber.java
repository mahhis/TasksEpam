package by.epamtc.jwd.Task1;

public class SquareOfOurNumber {

    public static  int LastDigit (Integer number){

        final int valueToDetermineTheLastNumber = 10;

        int integer = number%valueToDetermineTheLastNumber;

        integer=integer*integer;

        return integer;
    }
}
