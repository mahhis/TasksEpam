package Task5;

public class Main {
    public static void main(String[] args) {

        int enteredNumber;
        boolean result;

        System.out.println("Enter your integers");

        enteredNumber = DataScanner.enterIntegerToConsole();

        result = DeterminingTheNumber.perfectNumberOrNot(enteredNumber);

        System.out.println(result);




    }
}
