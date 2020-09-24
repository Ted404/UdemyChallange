public class NumberPalindrome {

    public static boolean isPalindrome(int number){
        int reverse = 0;
        int lastNumber = 0;
        int original = number;

        while(number!=0){
            lastNumber = number%10;
            reverse = reverse*10;
            reverse = reverse+lastNumber;
            number = number/10;
        }
        return reverse==original;
    }
}
