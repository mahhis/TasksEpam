package Task3;

public class Main {
    public static void main(String[] args) {

        double areaOfTheLargerSquare, areaOfTheSmallerSquare, ratio;

        areaOfTheLargerSquare=DataScanner.EnterAreaToConsole();
        System.out.println("Enter the area of the larger square ");

        areaOfTheSmallerSquare=AreaTransformations.areaOfSmallerSquare(areaOfTheLargerSquare);
        System.out.println("The area of the inscribed square is "+areaOfTheSmallerSquare);

        ratio=AreaTransformations.areaRatio(areaOfTheLargerSquare, areaOfTheSmallerSquare);
        System.out.println("The area of the described square is " +ratio+ " times larger than the inscribed");

    }
}
