package Task4;

public class DeterminingTheNumber {
    public static boolean evenOrOdd(int a, int b, int c, int d){

        int counter = 0;
        boolean moreOrLessThanTwo;

        if (a%2==0){
            counter++;
        }
        if (b%2==0){
            counter++;
        }
        if (c%2==0){
            counter++;
        }
        if (d%2==0){
            counter++;
        }

        if(counter>=2){
            moreOrLessThanTwo=true;
        }else {
            moreOrLessThanTwo = false;
        }


        return moreOrLessThanTwo;
    }
}
