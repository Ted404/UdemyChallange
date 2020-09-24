public class PrimeNumber {

    static int counter = 0;

    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int primeCounter(int number){

        for(int i = 1; i<number; i++){
            if(isPrime(i)){
                counter++;
            }
        }
        return counter;
    }
}
