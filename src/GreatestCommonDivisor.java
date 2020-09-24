public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second){
        int checking = 0;
        if(first<10 || second<10){
            return -1;
        }
        for(int i = 1; i <=first;i++){
            if(first%i==0){
                for(int j = 1; j <=second; j++){
                    if(second%j==0){
                        if(j == i){
                            checking = j;
                        }
                    }
                }
            }
        }
        return checking;
    }

    public static int getGreatestCommonDivisors(int first, int second) {
        if ((first >= 10) && (second >= 10)) { // validation
            for (int i = (first<second) ? first : second; i > 1; i--) { // optimized to use start i using smaller number
                if ((first % i) == 0 && (second % i) == 0) {
                    return i;
                }
            }
        }
        return -1;
    }
    //the best way so far
    public static int gettingGreatestCommonDivisor(int numb1, int numb2) {
        if ((numb1 < 10) || (numb2 < 10)) { // validation
            return -1;
        }

        for (int i = numb1; i > 1; i--) {
            if ((numb1 % i) == 0 && (numb2 % i) == 0) { //so fucking logical
                return i;
            }
        }
        return -1; // functionally obsolete but still required a return statement...can be return -1 or any number you choose
    }
}
