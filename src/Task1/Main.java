package Task1;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int OurNumber, Result;

        System.out.println("Enter your INTEGER number ");

        OurNumber = DataScanner.enterIntegerToConsole();

        Result = SquareOfOurNumber.LastDigit(OurNumber);

        System.out.println("The square of the last digit of your number is " + Result);
    }

}