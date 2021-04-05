package by.epamtc.jwd.Task4;

public class DeterminingNumber {
    public static boolean isMoreThanToEvenNumbers(int a, int b, int c, int d){

        int counter = 0;
        final int valueForDeterminingEvennessNumber = 2;
        boolean moreOrLessThanTwo;

        if (a%valueForDeterminingEvennessNumber==0){
            counter++;
        }
        if (b%valueForDeterminingEvennessNumber==0){
            counter++;
        }
        if (c%valueForDeterminingEvennessNumber==0){
            counter++;
        }
        if (d%valueForDeterminingEvennessNumber==0){
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
