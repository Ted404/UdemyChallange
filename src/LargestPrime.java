public class LargestPrime {

    // write your code here
    public static int getLargestPrime(int number){

        int division = 2;

        if (number <= 1) {
            return -1;
        } else {

            while (division < number){
                if (number % division != 0) {
                    division++;
                }else{
                    number = number / division;
                    division = 2;
                }
            }
            return number;
        }
    }
}