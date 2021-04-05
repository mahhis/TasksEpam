package by.epamtc.jwd.Task5;

public class DeterminingNumber {
    public static boolean isPerfectNumberOrNot(int integer){
        int sum =0;
        for(int i=1;i<integer;i++) {
            if(integer%i==0){
                sum+=i;
            }
        }
        if(sum==integer) {
            return true;
        }
        else {
            return false;
        }
    }
}
