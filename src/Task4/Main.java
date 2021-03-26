package Task4;

public class Main {
    public static void main(String[] args) {

        int numberA, numberB, numberC, numberD;

        System.out.println("Enter 4 integers");

        numberA=DataScanner.enterIntegerToConsole();
        numberB=DataScanner.enterIntegerToConsole();
        numberC=DataScanner.enterIntegerToConsole();
        numberD=DataScanner.enterIntegerToConsole();

        System.out.println(DeterminingTheNumber.evenOrOdd(numberA,numberB, numberC, numberD));




    }
}
