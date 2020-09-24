public class EvenDigitSum {

    public static int sumEvenDigitSum(int number){
        int count = 0;
        int even = 0;

        if(number<0){
            return -1;
        }
        while(number!=0){
            count = number%10;
            if(count%2==0){
                even = even+count;
            }
            number = number/10;
        }
        return even;
    }
}
