public class LastDigitChecker {
    public static boolean hasSameLastDigit(int first, int second, int third){
        int firstLast = first%10;
        int secondLast = second%10;
        int thirdLast = third%10;
        if((first<10 || first>1000) || (second<10 || second>1000)||(third<10 || third>1000)){
            return false;
        }
        return ((firstLast == secondLast || firstLast == thirdLast) || (secondLast==thirdLast));
    }

    public static boolean isValid(int number){
        if(number<10 || number>1000){
            return false;
        }
        return true;
    }
}
