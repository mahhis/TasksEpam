package Task5;

public class DeterminingTheNumber {
    public static boolean perfectNumberOrNot(int integer){
        int summa =0;
        for(int i=1;i<integer;i++) {
            if(integer%i==0){
                summa+=i;
            }
        }
        if(summa==integer) {
            return true;
        }
        else {
            return false;
        }
    }
}
