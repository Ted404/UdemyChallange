public class DigitSumChallenge {
    public static int sumDigit(int number){
        int sum = 0;
        int count = 0;

    if(number<10){ return -1; }

    while(number!=0){
        count=number%10;
        sum+=count;
        number = number/10;
    }
        return sum;
    }
}
