public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b){
        int aCount = 0;
        int bCount = 0;
        int last = 0;

        if((a < 10 || a > 99) ||(b < 10 || b>99)){
            return false;
        }
        while(a!=0){
            aCount = a%10;
            while(b!=0){
                bCount = b%10;
                if (bCount == aCount) {
                    return true;
                }
                b = b/10;
            }
            a = a/10;
        }
        return false;

    }
}