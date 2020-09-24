import java.math.BigDecimal;
import java.math.RoundingMode;

public class DecimalComparator {

    public static boolean compareNumbers(double a, double b){
        a = a*1000;
        b = b*1000;
        return ((int)a == (int)b);
    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
        String aa = String.valueOf(a);
        String bb = String.valueOf(b);
        BigDecimal i = new BigDecimal(aa).setScale(3, RoundingMode.DOWN);
        BigDecimal e = new BigDecimal(bb).setScale(3, RoundingMode.DOWN);

        if(i.equals(e)){
            return true;
        }else{
            return false;
        }

    }
}
