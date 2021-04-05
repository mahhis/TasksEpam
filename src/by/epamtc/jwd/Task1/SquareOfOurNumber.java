package by.epamtc.jwd.Task1;

public class SquareOfOurNumber {

    public static  int squaring (Integer number){

        final int valueToDetermineLastNumber = 10;

        int lastNumber = number%valueToDetermineLastNumber;

        int lastNumberSquare = lastNumber * lastNumber;

        return lastNumberSquare;
    }
}
