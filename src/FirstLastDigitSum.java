public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        int firstNumber = 0;
        int lastNumber = number%10;
        int count = 0;

        if(number<0){
            return -1;
        }
        while(number!=0){
            count = number%10;
            firstNumber = count;
            number = number/10;
        }
        return lastNumber+firstNumber;
    }
}
